/** Convert short array inits like {1,2,3} to "\u0001\u0002\u0003" */
public class mygcode extends gcodeBaseListener {
    boolean isFast = false;
    boolean isClock = false;
    boolean isG51 = false;
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
        System.out.print(coordinates);
    }

    @Override
    public void enterCoordinates2(gcodeParser.Coordinates2Context ctx) {
        String coordinates = "";
        int counter = 0;
        if(isClock){
            if(ctx.TKN_B() != null || ctx.TKN_C() != null){
                System.err.printf("Error semantico, clock o counterclock no permiten parámetros de coordenadas en b o c, se esperaba a");
                System.exit(-1);
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
            System.out.print(coordinates);
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
        System.out.print(coordinates);
    }

    @Override
    public void enterType(gcodeParser.TypeContext ctx) {
        if(ctx.TKN_FAST() != null) {
            isFast = true;
            System.out.print("G0 ");
        }else if(ctx.TKN_LINEAR() != null){
            if(ctx.TKN_ARC() != null){
                System.out.print("G1 R" + ctx.NUM(0).getText() + " ");
            }else{
                System.out.print("G1 ");
            }
        }else if(ctx.clock() != null){
            isClock = true;
            int counter = 0;
            if(ctx.getText() != null){
                if(ctx.clock().getText().equals("clock")) System.out.print("G2 ");
                if(ctx.clock().getText().equals("counterclock")) System.out.print("G3 ");
            }
            if(ctx.TKN_RADIUS() != null){
                System.out.print("R" + ctx.NUM(counter).getText() + " ");
                counter++;
            }
            if(ctx.TKN_LAPS() != null) System.out.print("P" + ctx.NUM(counter).getText() + " ");
        }
    }

    @Override
    public void exitTravel(gcodeParser.TravelContext ctx) {
        if(isFast){
            if(Double.parseDouble(ctx.NUM().getText())>=0 && Double.parseDouble(ctx.NUM().getText())<=1){
                System.out.println("E" + ctx.NUM());
                isFast = false;
            }else{
                System.err.printf("Error semantico, se esperaba un valor de 'at' entre 0 y 1");
                System.exit(-1);
            }
        }else{
            System.out.println("E" + ctx.NUM());
        }
    }

    @Override
    public void enterPause(gcodeParser.PauseContext ctx) {
        System.out.print("G4 " + ctx.NUM().getText() + " ");
    }

    @Override
    public void enterTime_unit(gcodeParser.Time_unitContext ctx) {
        System.out.println(ctx.getText());
    }

    @Override
    public void enterStop(gcodeParser.StopContext ctx) {
        System.out.println("G9");
    }

    @Override
    public void enterPlane2(gcodeParser.Plane2Context ctx) {
        if(ctx.getText() != null){
            if(ctx.getText().equals("XY")) System.out.println("G17");
            if(ctx.getText().equals("ZX")) System.out.println("G18");
            if(ctx.getText().equals("YZ")) System.out.println("G19");
        }
    }

    @Override
    public void enterUnit2(gcodeParser.Unit2Context ctx) {
        if(ctx.getText() != null){
            if(ctx.getText().equals("in")) System.out.println("G20");
            if(ctx.getText().equals("mm")) System.out.println("G21");
        }
    }

    @Override
    public void enterPark(gcodeParser.ParkContext ctx) {
        if(ctx.NUM() != null){
            if(Integer.parseInt(ctx.NUM().getText() ) == 0 || Integer.parseInt(ctx.NUM().getText() ) == 1 || Integer.parseInt(ctx.NUM().getText() ) == 2){
                System.out.println("G27 P" + ctx.NUM().getText());
            }else{
                System.err.printf("Error semantico, se esperaba en elevation un valor de 0, 1 o 2");
                System.exit(-1);
            }
        }
    }

    @Override
    public void enterVisit(gcodeParser.VisitContext ctx) {
        System.out.print("G28 ");
    }

    @Override
    public void enterTourist(gcodeParser.TouristContext ctx) {
        System.out.print("G29 ");
    }

    @Override
    public void enterScale2(gcodeParser.Scale2Context ctx) {
        if(ctx.getText() != null){
            if(ctx.getText().equals("not")){
                if(isG51){
                    System.out.println("G50");
                    isG51 = false;
                }else{
                    System.out.println("G50");
                    isG51 = false;
                    System.out.println("WARNING -> Está usando el codigo 'scale not' sin antes haber especificado 'scale'");
                }
            }else{
                if(Double.parseDouble(ctx.NUM().getText())>=0.001 && Double.parseDouble(ctx.NUM().getText())<=999.999){
                    isG51 = true;
                    System.out.println("G51 P" + ctx.NUM().getText());
                }else{
                    System.err.printf("Error semantico, se esperaba en by un número entre 0,001 y 999,999");
                    System.exit(-1);
                }
            }
        }
    }

    @Override
    public void exitCycle(gcodeParser.CycleContext ctx) {
        int counter = 0;
        if(ctx.TKN_RETRACT() != null){
            System.out.print("R"+ctx.NUM(counter).getText()+" ");
            counter++;
        }
        if(ctx.TKN_STAY() != null){
            System.out.print("P"+ctx.NUM(counter).getText()+" ");
            counter++;
        }
        if(ctx.TKN_FORWARD() != null){
            System.out.print("F"+ctx.NUM(counter).getText()+" ");
            counter++;
        }
        if(ctx.TKN_REPEAT() != null){
            System.out.print("L"+ctx.NUM(counter).getText()+" ");
        }
    }

    @Override
    public void enterCycle2(gcodeParser.Cycle2Context ctx) {
        if(ctx.getText() != null){
            switch (ctx.getText()){
                case "hspd":
                    System.out.print("G73 ");
                    break;
                case "invtap":
                    System.out.print("G74 ");
                    break;
                case "fineboring":
                    System.out.print("G76 ");
                    break;
                case "backbore":
                    System.out.print("G77 ");
                    break;
                case "drill":
                    System.out.print("G81 ");
                    break;
                case "spodtrill":
                    System.out.print("G82 ");
                    break;
                case "npdrill":
                    System.out.print("G83 ");
                    break;
                case "tap":
                    System.out.print("G84 ");
                    break;
                case "boreinout":
                    System.out.print("G85 ");
                    break;
                case "borenstop":
                    System.out.print("G86 ");
                    break;
                case "boreinwellout":
                    System.out.print("G89 ");
                    break;
            }
        }
    }
}
