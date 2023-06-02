/** Convert short array inits like {1,2,3} to "\u0001\u0002\u0003" */
public class mygcode extends gcodeBaseListener {
    boolean isFast = false;
    boolean isClock = false;
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
}
