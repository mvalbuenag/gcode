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

coordinates: (NUM TKN_X)? (NUM TKN_Y)? (NUM TKN_Z)?;
coordinates2: (NUM TKN_A)? (NUM TKN_B)? (NUM TKN_C)?;

distances: (NUM TKN_I)? (NUM TKN_J)? (NUM TKN_K)?;

travel: 'travel' type ('to' coordinates coordinates2)? 'at' NUM;   //ES NECESARIO VÁLIDAR QUE 'at' RECIBA UN PARÁMETRO ENTRE 0 Y 1
type: 'fast'
    | ('linear' ('arc' NUM)?)
    | (clock (('away' distances) | ('radius' NUM)) (NUM 'laps')?);
clock: 'clock' | 'counterclock';
// En el caso clock de la regla travel, se debe tener
// en cuenta unicamente el valor de number A si se declara.

pause: 'pause' NUM time_unit;
time_unit: ('s'|'ms');
stop: 'stop';

offset: 'offset' (set    | 'not'    | 'left'    | 'right'    | 'plus'    | 'less'    | 'zero');
set: 'set' 'offset' NUM 'type' NUM ('axes' coordinates coordinates2)? ('value' NUM)?;

world: 'world' world2;
world2: TKN_CARTESIAN
    | TKN_POLAR
    | TKN_ROTATE coordinates ('angle' NUM)?
    | TKN_UNROTATE
    | TKN_O positioning coordinates
    | TKN_WORKING;
positioning: 'relative' | 'absolute';

plane: 'plane' plane2;
plane2: 'XY' | 'ZX' | 'YZ';

unit: 'unit' unit2;
unit2: 'in' | 'mm';

park: 'park' 'elevation' NUM;

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
spell: 'spell' spell2 'cast';
spell2: (GCOMANDS GPARAMS*)*;

TKN_X : 'X';
TKN_Y : 'Y';
TKN_Z : 'Z';
TKN_A : 'A';
TKN_B : 'B';
TKN_C : 'C';
TKN_I : 'I';
TKN_J : 'J';
TKN_K : 'K';
TKN_NOT: 'not';
TKN_PLUS: 'plus';
TKN_LESS: 'less';
TKN_ZERO: 'zero';
TKN_LEFT: 'left';
TKN_RIGHT: 'right';
TKN_FAST : 'fast';
TKN_LINEAR : 'linear';
TKN_AWAY : 'away';
TKN_RADIUS : 'radius';
TKN_AT : 'at';
TKN_TO : 'to';
TKN_ARC : 'arc';
TKN_LAPS : 'laps';
TKN_RETRACT : 'retract';
TKN_STAY : 'stay';
TKN_FORWARD : 'forward';
TKN_REPEAT : 'repeat';
TKN_ANGLE : 'angle';
TKN_ITIME : 'itime';
TKN_UPM : 'upm';
TKN_UPR : 'upr';
TKN_SET : 'set';
TKN_UNSET : 'unset';
TKN_CARTESIAN: 'cartesian';
TKN_POLAR: 'polar';
TKN_ROTATE: 'rotate';
TKN_UNROTATE: 'unrotate';
TKN_O: 'o';
TKN_WORKING: 'working';
TKN_VALUE: 'value';

GCOMANDS:  'G' [0-9]+;
GPARAMS: ([A-Z][0-9]*);

COMENTARIO : ';'(~[\n])* -> skip;
ESP : [ \t\r\n]+ -> skip ;


//ID : [a-zA-ZÑñÁÉÍÓÚáéíóúÜüÇç]([a-zA-ZÑñÁÉÍÓÚáéíóúÜüÇç_0-9]*);
NUM : ([0-9]+('.'[0-9]*)?);
