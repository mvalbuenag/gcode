/** Convert short array inits like {1,2,3} to "\u0001\u0002\u0003" */
public class mygcode extends gcodeBaseListener {
    @Override         	/** Translate { to " */
    public void enterInit(gcodeParser.InitContext ctx) {
        System.out.print('"');
    }

    @Override         	/** Translate } to " */
    public void exitInit(gcodeParser.InitContext ctx) {
        System.out.print('"');
    }

    @Override    /** Translate integers to 4-digit hex strings prefixed with \\u */
    public void enterValue(gcodeParser.ValueContext ctx) {
// Assumes no nested array initializers
        int value = Integer.valueOf(ctx.INT().getText());
        System.out.printf("\\u%04x", value);
    }
}
