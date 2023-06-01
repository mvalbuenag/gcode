grammar gcode;

s : comandos*;

comandos : travel
    | pause
    | stop
    | offset
    | world
    | plane
    | unit
    | park
    | visit
    | tourist
    | scale
    | point
    | screw
    | cycle
    | break
    | feed
    | surfspeed
    | backto
    | spell;

coordinates: (NUM 'X')? (NUM 'Y')? (NUM 'Z')?;
coordinates2: (NUM 'A')? (NUM 'B')? (NUM 'C')?;

distances: (NUM 'I')? (NUM 'J')? (NUM 'K')?;

travel: 'travel' ('to' coordinates)? 'at' NUM type;   //ES NECESARIO VÁLIDAR QUE 'at' RECIBA UN PARÁMETRO ENTRE 0 Y 1
type: 'fast'
    | ('linear' ('extrude' NUM)? ('recover' NUM)? ('hit' NUM)? ('power' NUM)?) // Validar que flag sea o 0 o 1
    | (clock (('away' distances) | ('radius' NUM)) (NUM 'laps')?);
clock: 'clock' | 'counterclock';
// En el caso clock de la regla travel, se debe tener
// en cuenta unicamente el valor de number A si se declara.

pause: 'pause' NUM time_unit;
time_unit: ('s'|'ms');
stop: 'stop';

offset: 'offset' (set
    | 'not'
    | 'left'
    | 'right'
    | 'plus'
    | 'less'
    | 'zero');
set: 'set' 'offset' NUM 'type' NUM ('axes' coordinates coordinates2)? ('value' NUM)?;

world: 'world' world2;
world2: 'cartesian'
    | 'polar'
    | 'rotate' coordinates ('angle' NUM)?
    | 'unrotate'
    | 'o' positioning coordinates
    | 'working';
positioning: 'relative' | 'absolute';

plane: 'plane' plane2;
plane2: 'XY' | 'ZX' | 'YZ';

unit: 'unit' unit2;
unit2: 'in' | 'mm';

park: 'park' 'elevation' NUM; // VALIDAR LOS VALORES DE ELEVATION EN TRADUCCION

visit: 'visit' coordinates;
tourist: 'tourist' coordinates;
scale: 'scale' scale2;
scale2: 'not'
    | coordinates 'by' NUM;

point: 'point' NUM coordinates; // validar opciones de punto en traduccion

screw: 'screw' 'radius' NUM ('angle' NUM)? 'nholes' NUM;

cycle: 'cycle' cycle2 ('in' coordinates)? ('retract' NUM)? ('stay' NUM)? 'forward' NUM ('repeat' NUM)?;
cycle2: 'hspd'
    | 'invtap'
    | 'fineboring'
    | 'backbore'
    | 'drill'
    | 'spodtrill'
    | 'npdrill'
    | 'tap'
    | 'boreinout'
    | 'borenstop'
    | 'boreinwellout';

break: 'break';

feed: 'feed' feed2;
feed2: 'itime' NUM 'bpm'
    | 'upm' NUM 'inpm'
    | 'upr' NUM 'inpr';

surfspeed: 'surfspeed' setspeed;
setspeed: 'set' NUM 'rpm' | 'unset';
backto: 'backto' backto2;
backto2: 'point' | 'plane';
spell: 'spell' (GCOMANDS GPARAMS)* 'cast';

GCOMANDS:  'g' [0-9]+;
GPARAMS: ([a-z][0-9]*)*;


COMENTARIO : ';'(~[\n])* -> skip;
ESP : [ \t\r\n]+ -> skip ;


//ID : [a-zA-ZÑñÁÉÍÓÚáéíóúÜüÇç]([a-zA-ZÑñÁÉÍÓÚáéíóúÜüÇç_0-9]*);
NUM : ([0-9]+('.'[0-9]*)?);
