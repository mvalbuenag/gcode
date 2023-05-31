// Generated from /home/soporteit/Documentos/Lenguajes/gcode/grammar/gcode.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link gcodeParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface gcodeVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link gcodeParser#init}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInit(gcodeParser.InitContext ctx);
	/**
	 * Visit a parse tree produced by {@link gcodeParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(gcodeParser.ValueContext ctx);
}