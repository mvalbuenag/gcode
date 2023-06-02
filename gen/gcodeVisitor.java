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
	 * Visit a parse tree produced by {@link gcodeParser#s}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitS(gcodeParser.SContext ctx);
	/**
	 * Visit a parse tree produced by {@link gcodeParser#comandos}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComandos(gcodeParser.ComandosContext ctx);
	/**
	 * Visit a parse tree produced by {@link gcodeParser#coordinates}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCoordinates(gcodeParser.CoordinatesContext ctx);
	/**
	 * Visit a parse tree produced by {@link gcodeParser#coordinates2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCoordinates2(gcodeParser.Coordinates2Context ctx);
	/**
	 * Visit a parse tree produced by {@link gcodeParser#distances}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDistances(gcodeParser.DistancesContext ctx);
	/**
	 * Visit a parse tree produced by {@link gcodeParser#travel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTravel(gcodeParser.TravelContext ctx);
	/**
	 * Visit a parse tree produced by {@link gcodeParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(gcodeParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link gcodeParser#clock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClock(gcodeParser.ClockContext ctx);
	/**
	 * Visit a parse tree produced by {@link gcodeParser#pause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPause(gcodeParser.PauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link gcodeParser#time_unit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTime_unit(gcodeParser.Time_unitContext ctx);
	/**
	 * Visit a parse tree produced by {@link gcodeParser#stop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStop(gcodeParser.StopContext ctx);
	/**
	 * Visit a parse tree produced by {@link gcodeParser#offset}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOffset(gcodeParser.OffsetContext ctx);
	/**
	 * Visit a parse tree produced by {@link gcodeParser#set}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSet(gcodeParser.SetContext ctx);
	/**
	 * Visit a parse tree produced by {@link gcodeParser#world}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWorld(gcodeParser.WorldContext ctx);
	/**
	 * Visit a parse tree produced by {@link gcodeParser#world2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWorld2(gcodeParser.World2Context ctx);
	/**
	 * Visit a parse tree produced by {@link gcodeParser#positioning}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPositioning(gcodeParser.PositioningContext ctx);
	/**
	 * Visit a parse tree produced by {@link gcodeParser#plane}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlane(gcodeParser.PlaneContext ctx);
	/**
	 * Visit a parse tree produced by {@link gcodeParser#plane2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlane2(gcodeParser.Plane2Context ctx);
	/**
	 * Visit a parse tree produced by {@link gcodeParser#unit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnit(gcodeParser.UnitContext ctx);
	/**
	 * Visit a parse tree produced by {@link gcodeParser#unit2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnit2(gcodeParser.Unit2Context ctx);
	/**
	 * Visit a parse tree produced by {@link gcodeParser#park}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPark(gcodeParser.ParkContext ctx);
	/**
	 * Visit a parse tree produced by {@link gcodeParser#visit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVisit(gcodeParser.VisitContext ctx);
	/**
	 * Visit a parse tree produced by {@link gcodeParser#tourist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTourist(gcodeParser.TouristContext ctx);
	/**
	 * Visit a parse tree produced by {@link gcodeParser#scale}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScale(gcodeParser.ScaleContext ctx);
	/**
	 * Visit a parse tree produced by {@link gcodeParser#scale2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScale2(gcodeParser.Scale2Context ctx);
	/**
	 * Visit a parse tree produced by {@link gcodeParser#point}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPoint(gcodeParser.PointContext ctx);
	/**
	 * Visit a parse tree produced by {@link gcodeParser#screw}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScrew(gcodeParser.ScrewContext ctx);
	/**
	 * Visit a parse tree produced by {@link gcodeParser#cycle}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCycle(gcodeParser.CycleContext ctx);
	/**
	 * Visit a parse tree produced by {@link gcodeParser#cycle2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCycle2(gcodeParser.Cycle2Context ctx);
	/**
	 * Visit a parse tree produced by {@link gcodeParser#break}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBreak(gcodeParser.BreakContext ctx);
	/**
	 * Visit a parse tree produced by {@link gcodeParser#feed}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFeed(gcodeParser.FeedContext ctx);
	/**
	 * Visit a parse tree produced by {@link gcodeParser#feed2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFeed2(gcodeParser.Feed2Context ctx);
	/**
	 * Visit a parse tree produced by {@link gcodeParser#surfspeed}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSurfspeed(gcodeParser.SurfspeedContext ctx);
	/**
	 * Visit a parse tree produced by {@link gcodeParser#setspeed}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetspeed(gcodeParser.SetspeedContext ctx);
	/**
	 * Visit a parse tree produced by {@link gcodeParser#backto}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBackto(gcodeParser.BacktoContext ctx);
	/**
	 * Visit a parse tree produced by {@link gcodeParser#backto2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBackto2(gcodeParser.Backto2Context ctx);
	/**
	 * Visit a parse tree produced by {@link gcodeParser#spell}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpell(gcodeParser.SpellContext ctx);
}