// Generated from /home/soporteit/Documentos/Lenguajes/gcode/grammar/gcode.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link gcodeParser}.
 */
public interface gcodeListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link gcodeParser#init}.
	 * @param ctx the parse tree
	 */
	void enterInit(gcodeParser.InitContext ctx);
	/**
	 * Exit a parse tree produced by {@link gcodeParser#init}.
	 * @param ctx the parse tree
	 */
	void exitInit(gcodeParser.InitContext ctx);
	/**
	 * Enter a parse tree produced by {@link gcodeParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(gcodeParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link gcodeParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(gcodeParser.ValueContext ctx);
}