import java.io.*;
import java.io.IOException;
import java.util.Scanner;
public class mygcode extends gcodeBaseListener {
    boolean isFast = false;
    boolean isClock = false;
    boolean isG51 = false;
    boolean isG96 = false;
    boolean isG41 = false;
    boolean isG42 = false;
    boolean isG43 = false;
    boolean isG44 = false;

    boolean cleanOutput = true;

    public void writeOutput(String text){
        BufferedWriter bw = null;
        FileWriter fw = null;

        try {
            File file = new File("./output/output.txt");
            if(cleanOutput){
                file.delete();
                cleanOutput = false;
            }
            // Si el archivo no existe, se crea!
            if (!file.exists()) {
                file.createNewFile();
            }
            // flag true, indica adjuntar información al archivo.
            fw = new FileWriter(file.getAbsoluteFile(), true);
            bw = new BufferedWriter(fw);
            if(text.contains("G")){
                bw.write("\n" + text);
                //bw.write(text);
            }else{
                bw.write(text);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                //Cierra instancias de FileWriter y BufferedWriter
                if (bw != null)
                    bw.close();
                if (fw != null)
                    fw.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }
    @Override
    public void enterCoordinates(gcodeParser.CoordinatesContext ctx) {
        String coordinates = "";
        int counter = 0;
        if(ctx.TKN_X() != null){
            coordinates += ctx.TKN_X().getText() + ctx.NUM(counter) + " ";
            counter++;
        }
        if(ctx.TKN_Y() != null){
            coordinates += ctx.TKN_Y().getText() + ctx.NUM(counter) + " ";
            counter++;
        }
        if(ctx.TKN_Z() != null){
            coordinates += ctx.TKN_Z().getText() + ctx.NUM(counter) + " ";
        }
        writeOutput(coordinates);
        //System.out.print(coordinates);
    }

    @Override
    public void enterCoordinates2(gcodeParser.Coordinates2Context ctx) {
        String coordinates = "";
        int counter = 0;
        if(isClock){
            if(ctx.TKN_B() != null || ctx.TKN_C() != null){
                writeOutput("Error semantico, clock o counterclock no permiten parámetros de coordenadas en b o c, se esperaba a"+"\n");
                //System.err.printf("Error semantico, clock o counterclock no permiten parámetros de coordenadas en b o c, se esperaba a");
                //System.exit(-1);
            }else{
                isClock = false;
            }
        }else{
            if(ctx.TKN_A() != null){
                coordinates += ctx.TKN_A().getText() + ctx.NUM(counter) + " ";
                counter++;
            }
            if(ctx.TKN_B() != null){
                coordinates += ctx.TKN_B().getText() + ctx.NUM(counter) + " ";
                counter++;
            }
            if(ctx.TKN_C() != null){
                coordinates += ctx.TKN_C().getText() + ctx.NUM(counter) + " ";
            }
            writeOutput(coordinates);
            //System.out.print(coordinates);
        }
    }

    @Override
    public void enterDistances(gcodeParser.DistancesContext ctx) {
        String coordinates = "";
        int counter = 0;
        if(ctx.TKN_I() != null){
            coordinates += ctx.TKN_I().getText() + ctx.NUM(counter) + " ";
            counter++;
        }
        if(ctx.TKN_J() != null){
            coordinates += ctx.TKN_J().getText() + ctx.NUM(counter) + " ";
            counter++;
        }
        if(ctx.TKN_K() != null){
            coordinates += ctx.TKN_K().getText() + ctx.NUM(counter) + " ";
        }
        writeOutput(coordinates);
        //System.out.print(coordinates);
    }

    @Override
    public void enterType(gcodeParser.TypeContext ctx) {
        if(ctx.TKN_FAST() != null) {
            isFast = true;
            writeOutput("G0 ");
            //System.out.print("G0 ");
        }else if(ctx.TKN_LINEAR() != null){
            if(ctx.TKN_ARC() != null){
                writeOutput("G1 R" + ctx.NUM(0).getText() + " ");
                //System.out.print("G1 R" + ctx.NUM(0).getText() + " ");
            }else{
                writeOutput("G1 ");
                //System.out.print("G1 ");
            }
        }else if(ctx.clock() != null){
            isClock = true;
            int counter = 0;
            if(ctx.getText() != null){
                if(ctx.clock().getText().equals("clock")) {
                    writeOutput("G2 ");
                    //System.out.print("G2 ");
                }
                if(ctx.clock().getText().equals("counterclock")){
                    writeOutput("G3 ");
                    //System.out.print("G3 ");
                }
            }
            if(ctx.TKN_RADIUS() != null){
                writeOutput("R" + ctx.NUM(counter).getText() + " ");
                //System.out.print("R" + ctx.NUM(counter).getText() + " ");
                counter++;
            }
            if(ctx.TKN_LAPS() != null){
                writeOutput("P" + ctx.NUM(counter).getText() + " ");
                //System.out.print("P" + ctx.NUM(counter).getText() + " ");
            }
        }
    }

    @Override
    public void exitTravel(gcodeParser.TravelContext ctx) {
        if(isFast){
            if(Double.parseDouble(ctx.NUM().getText())>=0 && Double.parseDouble(ctx.NUM().getText())<=1){
                writeOutput("E" + ctx.NUM());
                //System.out.println("E" + ctx.NUM());
                isFast = false;
            }else{
                writeOutput("Error semantico, se esperaba un valor de 'at' entre 0 y 1"+"\n");
            }
        }else{
            writeOutput("E" + ctx.NUM());
            //System.out.println("E" + ctx.NUM());
        }
    }

    @Override
    public void enterPause(gcodeParser.PauseContext ctx) {
        writeOutput("G4 " + ctx.NUM().getText() + " ");
        //System.out.print("G4 " + ctx.NUM().getText() + " ");
    }

    @Override
    public void enterTime_unit(gcodeParser.Time_unitContext ctx) {
        writeOutput(ctx.getText());
        //System.out.println(ctx.getText());
    }

    @Override
    public void enterStop(gcodeParser.StopContext ctx) {
        writeOutput("G9");
        //System.out.println("G9");
    }

    @Override
    public void enterPlane2(gcodeParser.Plane2Context ctx) {
        if(ctx.getText() != null){
            if(ctx.getText().equals("XY")){
                writeOutput("G17");
                //System.out.println("G17");
            }
            if(ctx.getText().equals("ZX")){
                writeOutput("G18");
                //System.out.println("G18");
            }
            if(ctx.getText().equals("YZ")){
                writeOutput("G19");
                //System.out.println("G19");
            }
        }
    }

    @Override
    public void enterUnit2(gcodeParser.Unit2Context ctx) {
        if(ctx.getText() != null){
            if(ctx.getText().equals("in")){
                writeOutput("G20");
                //System.out.println("G20");
            }
            if(ctx.getText().equals("mm")){
                writeOutput("G21");
                //System.out.println("G21");
            }
        }
    }

    @Override
    public void enterPark(gcodeParser.ParkContext ctx) {
        if(ctx.NUM() != null){
            if(Integer.parseInt(ctx.NUM().getText() ) == 0 || Integer.parseInt(ctx.NUM().getText() ) == 1 || Integer.parseInt(ctx.NUM().getText() ) == 2){
                writeOutput("G27 P" + ctx.NUM().getText());
                //System.out.println("G27 P" + ctx.NUM().getText());
            }else{
                writeOutput("Error semantico, se esperaba en elevation un valor de 0, 1 o 2"+"\n");
            }
        }
    }

    @Override
    public void enterVisit(gcodeParser.VisitContext ctx) {
        writeOutput("G28 ");
        //System.out.print("G28 ");
    }

    @Override
    public void enterTourist(gcodeParser.TouristContext ctx) {
        writeOutput("G29 ");
        //System.out.print("G29 ");
    }

    @Override
    public void enterScale2(gcodeParser.Scale2Context ctx) {
        if(ctx.getText() != null){
            if(ctx.getText().equals("not")){
                if(isG51){
                    writeOutput("G50");
                    //System.out.println("G50");
                    isG51 = false;
                }else{
                    writeOutput("G50");
                    //System.out.println("G50");
                    isG51 = false;
                    writeOutput("; WARNING -> Está usando el codigo 'scale not' sin antes haber especificado 'scale'"+"\n");
                    //System.out.println("WARNING -> Está usando el codigo 'scale not' sin antes haber especificado 'scale'");
                }
            }else{
                if(Double.parseDouble(ctx.NUM().getText())>=0.001 && Double.parseDouble(ctx.NUM().getText())<=999.999){
                    isG51 = true;
                    writeOutput("G51 P" + ctx.NUM().getText());
                    //System.out.println("G51 P" + ctx.NUM().getText());
                }else{
                    //writeOutput("Error semantico, se esperaba en by un número entre 0,001 y 999,999");
                }
            }
        }
    }

    @Override
    public void exitCycle(gcodeParser.CycleContext ctx) {
        int counter = 0;
        if(ctx.TKN_RETRACT() != null){
            writeOutput("R"+ctx.NUM(counter).getText()+" ");
            //System.out.print("R"+ctx.NUM(counter).getText()+" ");
            counter++;
        }
        if(ctx.TKN_STAY() != null){
            writeOutput("P"+ctx.NUM(counter).getText()+" ");
            //System.out.print("P"+ctx.NUM(counter).getText()+" ");
            counter++;
        }
        if(ctx.TKN_FORWARD() != null){
            writeOutput("F"+ctx.NUM(counter).getText()+" ");
            //System.out.print("F"+ctx.NUM(counter).getText()+" ");
            counter++;
        }
        if(ctx.TKN_REPEAT() != null){
            writeOutput("L"+ctx.NUM(counter).getText()+" ");
            //System.out.print("L"+ctx.NUM(counter).getText()+" ");
        }
    }

    @Override
    public void enterCycle2(gcodeParser.Cycle2Context ctx) {
        if(ctx.getText() != null){
            switch (ctx.getText()){
                case "hspd":
                    writeOutput("G73 ");
                    //System.out.print("G73 ");
                    break;
                case "invtap":
                    writeOutput("G74 ");
                    //System.out.print("G74 ");
                    break;
                case "fineboring":
                    writeOutput("G76 ");
                    //System.out.print("G76 ");
                    break;
                case "backbore":
                    writeOutput("G77 ");
                    //System.out.print("G77 ");
                    break;
                case "drill":
                    writeOutput("G81 ");
                    //System.out.print("G81 ");
                    break;
                case "spodtrill":
                    writeOutput("G82 ");
                    //System.out.print("G82 ");
                    break;
                case "npdrill":
                    writeOutput("G83 ");
                    //System.out.print("G83 ");
                    break;
                case "tap":
                    writeOutput("G84 ");
                    //System.out.print("G84 ");
                    break;
                case "boreinout":
                    writeOutput("G85 ");
                    //System.out.print("G85 ");
                    break;
                case "borenstop":
                    writeOutput("G86 ");
                    //System.out.print("G86 ");
                    break;
                case "boreinwellout":
                    writeOutput("G89 ");
                    //System.out.print("G89 ");
                    break;
            }
        }
    }

    @Override
    public void enterPoint(gcodeParser.PointContext ctx){
        if (ctx.NUM() != null){
            int n = Integer.parseInt(ctx.NUM().getText());
            if (n < 0 || n > 5){
                writeOutput("Error semantico, el rango de valores para un punto es [0, 5]"+"\n");
            } else {
                int gnum = 54;
                writeOutput("G" + (gnum + (n - 1)) + " ");
                //System.out.print("G" + (gnum + n) + " ");
                enterCoordinates(ctx.coordinates());
            }

        }
    }

    @Override
    public void enterWorld2(gcodeParser.World2Context ctx) {
        if(ctx.getText() != null ){
           if (ctx.TKN_CARTESIAN() != null){
               writeOutput("G15 ");
               //System.out.print("G15");
           }

           if (ctx.TKN_POLAR() != null){
               writeOutput("G16 ");
               //System.out.print("G16 ");
           }
           if (ctx.TKN_ROTATE() != null){
               writeOutput("G68");
               //System.out.print("G68 ");
               enterCoordinates(ctx.coordinates());
               if (ctx.NUM() != null){
                   writeOutput(" R" + ctx.NUM().toString());
                   //System.out.print(" R" + ctx.NUM().toString());
               }
           }
           if (ctx.TKN_UNROTATE() != null){
               writeOutput("G69");
               //System.out.print("G69 ");
           }
           if (ctx.TKN_O() != null){
               writeOutput("G68");
               //System.out.print("G68 ");
               enterPositioning(ctx.positioning());
               enterCoordinates(ctx.coordinates());
           }
           if (ctx.TKN_WORKING() != null){
               writeOutput("G92");
               //System.out.print("G92 ");
           }
        }
    }

        @Override
    public void enterPositioning(gcodeParser.PositioningContext ctx) {
        if(ctx.getText() != null ){
            switch (ctx.getText()){
                case "absolute":
                    writeOutput("G90 ");
                    //System.out.print("G90 ");
                    break;
                case "relative":
                    writeOutput("G91 ");
                    //System.out.print("G91 ");
                    break;
            }
        }
    }

    @Override
    public void enterScrew(gcodeParser.ScrewContext ctx) {
        int counter = 0;
        writeOutput("G70 I"+ctx.NUM(counter)+" ");
        //System.out.print("G70 I"+ctx.NUM(counter)+" ");
        counter++;
        if(ctx.TKN_ANGLE() != null){
            writeOutput("J"+ctx.NUM(counter)+" ");
            //System.out.print("J"+ctx.NUM(counter)+" ");
            counter++;
        }
        writeOutput("L"+ctx.NUM(counter));
        //System.out.println("L"+ctx.NUM(counter));
    }

    @Override
    public void enterBreak(gcodeParser.BreakContext ctx) {
        writeOutput("G80");
        //System.out.println("G80");
    }

    @Override
    public void enterFeed2(gcodeParser.Feed2Context ctx) {
        if(ctx.getText() != null){
            if(ctx.TKN_ITIME() != null){
                writeOutput("G93 F"+ctx.NUM());
                //System.out.println("G93 F"+ctx.NUM());
            }else if(ctx.TKN_UPM() != null){
                writeOutput("G94 F"+ctx.NUM());
                //System.out.println("G94 F"+ctx.NUM());
            }else if(ctx.TKN_UPR() != null){
                writeOutput("G95 F"+ctx.NUM());
                //System.out.println("G95 F"+ctx.NUM());
            }
        }
    }

    @Override
    public void enterSetspeed(gcodeParser.SetspeedContext ctx) {
        if(ctx.getText() != null){
            if(ctx.TKN_SET() != null){
                writeOutput("G96 D"+ctx.NUM());
                //System.out.println("G96 D"+ctx.NUM());
                isG96 = true;
            }else if(ctx.TKN_UNSET() != null){
                if(isG96){
                    writeOutput("G97");
                    //System.out.println("G97");
                    isG96 = false;
                }else{
                    writeOutput("G97");
                    //System.out.println("G97");
                    isG51 = false;
                    writeOutput("; WARNING -> Está usando el codigo 'unset surfspeed' sin antes haber especificado 'set surfspeed'"+"\n");
                }
            }
        }
    }

    @Override
    public void enterBackto(gcodeParser.BacktoContext ctx){
        if (ctx.backto2() != null){
            switch (ctx.backto2().getText()){
                case "point":
                    writeOutput("G98 ");
                    //System.out.println("G98 ");
                    break;
                case "plane":
                    writeOutput("G99 ");
                    //System.out.println("G99 ");
                    break;
            }
        }
    }
    @Override
    public void enterSpell(gcodeParser.SpellContext ctx){
        if (ctx.spell2() != null){
            String spell = ctx.spell2().getText();
            String[] elemn = spell.split("[A-Z]");
            String[] elems = spell.split("[0-9]+");
            String m = "";
            for (int i = 0; i < elems.length; i++){
                if (i != 0 && elems[i].equals("G")){
                    m = m + "\n";
                }
                m = m + elems[i] + elemn[i + 1] + " ";

            }
            writeOutput(m);
            //System.out.println(m);
        }
    }

    @Override
    public void enterSet(gcodeParser.SetContext ctx) {
        String paramsOffset= "";
        int offsetNumber = Integer.parseInt(ctx.NUM(0).toString());
        int typeNumber = Integer.parseInt(ctx.NUM(1).toString());
        //System.out.println(offsetNumber);
        paramsOffset= paramsOffset+" P"+ offsetNumber+" "+ "L"+typeNumber;
        if(ctx.TKN_VALUE()!=null){
            Double valueNumber= Double.parseDouble(ctx.NUM(2).toString());
            paramsOffset= paramsOffset + " R"+valueNumber;
        }
        //System.out.print(paramsOffset+" ");
        writeOutput(paramsOffset+ " ");
    }
    //offset: 'offset' (set    | 'not'    | 'left'    | 'right'    | 'plus'    | 'less'    | 'zero');
    @Override
    public void enterOffset(gcodeParser.OffsetContext ctx) {
        if(ctx.set()!=null){
            //System.out.print("G10 ");
            writeOutput("G10 ");
        }
        if(ctx.TKN_LEFT()!=null){
            //System.out.println("G41");
            writeOutput("G41 ");
            isG41 = true;
        }
        if(ctx.TKN_RIGHT()!=null){
            //System.out.println("G42");
            writeOutput("G42 ");
            isG42 = true;
        }
        if(ctx.TKN_NOT()!=null){
            if(isG41 || isG42){
                //System.out.println("G40");
                writeOutput("G40 ");
                isG41 = false;
                isG42 = false;
            }else{
                //System.out.println("G40");
                writeOutput("G40 ");
                writeOutput("; WARNING -> Está usando el codigo 'offset not' sin antes haber especificado una compensación con 'offset left' u 'offset right'"+"\n");
                //System.out.println("WARNING -> Está usando el codigo 'offset not' sin antes haber especificado una compensación con 'offset left' u 'offset right'");
            }
        }
        if(ctx.TKN_PLUS()!=null){
            //System.out.println("G43 ");
            writeOutput("G43 ");
            isG43 = true;
        }
        if(ctx.TKN_LESS()!=null){
            //System.out.println("G44 ");
            writeOutput("G44 ");
            isG44 = true;
        }
        if(ctx.TKN_ZERO()!=null){
            if(isG43 || isG44){
                //System.out.println("G49 ");
                writeOutput("G49 ");
                isG43 = false;
                isG44 = false;
            }else{
                //System.out.println("G49 ");
                writeOutput("G49 ");
                writeOutput("; WARNING -> Está usando el codigo 'offset zero' sin antes haber especificado una compensación con 'offset plus' u 'offset less'"+"\n");
                //System.out.println("WARNING -> Está usando el codigo 'offset zero' sin antes haber especificado una compensación con 'offset plus' u 'offset less'");
            }
        }
    }
}
