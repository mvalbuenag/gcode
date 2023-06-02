// Generated from /home/soporteit/Documentos/Lenguajes/gcode/grammar/gcode.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link gcodeParser}.
 */
public interface gcodeListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link gcodeParser#s}.
	 * @param ctx the parse tree
	 */
	void enterS(gcodeParser.SContext ctx);
	/**
	 * Exit a parse tree produced by {@link gcodeParser#s}.
	 * @param ctx the parse tree
	 */
	void exitS(gcodeParser.SContext ctx);
	/**
	 * Enter a parse tree produced by {@link gcodeParser#comandos}.
	 * @param ctx the parse tree
	 */
	void enterComandos(gcodeParser.ComandosContext ctx);
	/**
	 * Exit a parse tree produced by {@link gcodeParser#comandos}.
	 * @param ctx the parse tree
	 */
	void exitComandos(gcodeParser.ComandosContext ctx);
	/**
	 * Enter a parse tree produced by {@link gcodeParser#coordinates}.
	 * @param ctx the parse tree
	 */
	void enterCoordinates(gcodeParser.CoordinatesContext ctx);
	/**
	 * Exit a parse tree produced by {@link gcodeParser#coordinates}.
	 * @param ctx the parse tree
	 */
	void exitCoordinates(gcodeParser.CoordinatesContext ctx);
	/**
	 * Enter a parse tree produced by {@link gcodeParser#coordinates2}.
	 * @param ctx the parse tree
	 */
	void enterCoordinates2(gcodeParser.Coordinates2Context ctx);
	/**
	 * Exit a parse tree produced by {@link gcodeParser#coordinates2}.
	 * @param ctx the parse tree
	 */
	void exitCoordinates2(gcodeParser.Coordinates2Context ctx);
	/**
	 * Enter a parse tree produced by {@link gcodeParser#distances}.
	 * @param ctx the parse tree
	 */
	void enterDistances(gcodeParser.DistancesContext ctx);
	/**
	 * Exit a parse tree produced by {@link gcodeParser#distances}.
	 * @param ctx the parse tree
	 */
	void exitDistances(gcodeParser.DistancesContext ctx);
	/**
	 * Enter a parse tree produced by {@link gcodeParser#travel}.
	 * @param ctx the parse tree
	 */
	void enterTravel(gcodeParser.TravelContext ctx);
	/**
	 * Exit a parse tree produced by {@link gcodeParser#travel}.
	 * @param ctx the parse tree
	 */
	void exitTravel(gcodeParser.TravelContext ctx);
	/**
	 * Enter a parse tree produced by {@link gcodeParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(gcodeParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link gcodeParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(gcodeParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link gcodeParser#clock}.
	 * @param ctx the parse tree
	 */
	void enterClock(gcodeParser.ClockContext ctx);
	/**
	 * Exit a parse tree produced by {@link gcodeParser#clock}.
	 * @param ctx the parse tree
	 */
	void exitClock(gcodeParser.ClockContext ctx);
	/**
	 * Enter a parse tree produced by {@link gcodeParser#pause}.
	 * @param ctx the parse tree
	 */
	void enterPause(gcodeParser.PauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link gcodeParser#pause}.
	 * @param ctx the parse tree
	 */
	void exitPause(gcodeParser.PauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link gcodeParser#time_unit}.
	 * @param ctx the parse tree
	 */
	void enterTime_unit(gcodeParser.Time_unitContext ctx);
	/**
	 * Exit a parse tree produced by {@link gcodeParser#time_unit}.
	 * @param ctx the parse tree
	 */
	void exitTime_unit(gcodeParser.Time_unitContext ctx);
	/**
	 * Enter a parse tree produced by {@link gcodeParser#stop}.
	 * @param ctx the parse tree
	 */
	void enterStop(gcodeParser.StopContext ctx);
	/**
	 * Exit a parse tree produced by {@link gcodeParser#stop}.
	 * @param ctx the parse tree
	 */
	void exitStop(gcodeParser.StopContext ctx);
	/**
	 * Enter a parse tree produced by {@link gcodeParser#offset}.
	 * @param ctx the parse tree
	 */
	void enterOffset(gcodeParser.OffsetContext ctx);
	/**
	 * Exit a parse tree produced by {@link gcodeParser#offset}.
	 * @param ctx the parse tree
	 */
	void exitOffset(gcodeParser.OffsetContext ctx);
	/**
	 * Enter a parse tree produced by {@link gcodeParser#set}.
	 * @param ctx the parse tree
	 */
	void enterSet(gcodeParser.SetContext ctx);
	/**
	 * Exit a parse tree produced by {@link gcodeParser#set}.
	 * @param ctx the parse tree
	 */
	void exitSet(gcodeParser.SetContext ctx);
	/**
	 * Enter a parse tree produced by {@link gcodeParser#world}.
	 * @param ctx the parse tree
	 */
	void enterWorld(gcodeParser.WorldContext ctx);
	/**
	 * Exit a parse tree produced by {@link gcodeParser#world}.
	 * @param ctx the parse tree
	 */
	void exitWorld(gcodeParser.WorldContext ctx);
	/**
	 * Enter a parse tree produced by {@link gcodeParser#world2}.
	 * @param ctx the parse tree
	 */
	void enterWorld2(gcodeParser.World2Context ctx);
	/**
	 * Exit a parse tree produced by {@link gcodeParser#world2}.
	 * @param ctx the parse tree
	 */
	void exitWorld2(gcodeParser.World2Context ctx);
	/**
	 * Enter a parse tree produced by {@link gcodeParser#positioning}.
	 * @param ctx the parse tree
	 */
	void enterPositioning(gcodeParser.PositioningContext ctx);
	/**
	 * Exit a parse tree produced by {@link gcodeParser#positioning}.
	 * @param ctx the parse tree
	 */
	void exitPositioning(gcodeParser.PositioningContext ctx);
	/**
	 * Enter a parse tree produced by {@link gcodeParser#plane}.
	 * @param ctx the parse tree
	 */
	void enterPlane(gcodeParser.PlaneContext ctx);
	/**
	 * Exit a parse tree produced by {@link gcodeParser#plane}.
	 * @param ctx the parse tree
	 */
	void exitPlane(gcodeParser.PlaneContext ctx);
	/**
	 * Enter a parse tree produced by {@link gcodeParser#plane2}.
	 * @param ctx the parse tree
	 */
	void enterPlane2(gcodeParser.Plane2Context ctx);
	/**
	 * Exit a parse tree produced by {@link gcodeParser#plane2}.
	 * @param ctx the parse tree
	 */
	void exitPlane2(gcodeParser.Plane2Context ctx);
	/**
	 * Enter a parse tree produced by {@link gcodeParser#unit}.
	 * @param ctx the parse tree
	 */
	void enterUnit(gcodeParser.UnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link gcodeParser#unit}.
	 * @param ctx the parse tree
	 */
	void exitUnit(gcodeParser.UnitContext ctx);
	/**
	 * Enter a parse tree produced by {@link gcodeParser#unit2}.
	 * @param ctx the parse tree
	 */
	void enterUnit2(gcodeParser.Unit2Context ctx);
	/**
	 * Exit a parse tree produced by {@link gcodeParser#unit2}.
	 * @param ctx the parse tree
	 */
	void exitUnit2(gcodeParser.Unit2Context ctx);
	/**
	 * Enter a parse tree produced by {@link gcodeParser#park}.
	 * @param ctx the parse tree
	 */
	void enterPark(gcodeParser.ParkContext ctx);
	/**
	 * Exit a parse tree produced by {@link gcodeParser#park}.
	 * @param ctx the parse tree
	 */
	void exitPark(gcodeParser.ParkContext ctx);
	/**
	 * Enter a parse tree produced by {@link gcodeParser#visit}.
	 * @param ctx the parse tree
	 */
	void enterVisit(gcodeParser.VisitContext ctx);
	/**
	 * Exit a parse tree produced by {@link gcodeParser#visit}.
	 * @param ctx the parse tree
	 */
	void exitVisit(gcodeParser.VisitContext ctx);
	/**
	 * Enter a parse tree produced by {@link gcodeParser#tourist}.
	 * @param ctx the parse tree
	 */
	void enterTourist(gcodeParser.TouristContext ctx);
	/**
	 * Exit a parse tree produced by {@link gcodeParser#tourist}.
	 * @param ctx the parse tree
	 */
	void exitTourist(gcodeParser.TouristContext ctx);
	/**
	 * Enter a parse tree produced by {@link gcodeParser#scale}.
	 * @param ctx the parse tree
	 */
	void enterScale(gcodeParser.ScaleContext ctx);
	/**
	 * Exit a parse tree produced by {@link gcodeParser#scale}.
	 * @param ctx the parse tree
	 */
	void exitScale(gcodeParser.ScaleContext ctx);
	/**
	 * Enter a parse tree produced by {@link gcodeParser#scale2}.
	 * @param ctx the parse tree
	 */
	void enterScale2(gcodeParser.Scale2Context ctx);
	/**
	 * Exit a parse tree produced by {@link gcodeParser#scale2}.
	 * @param ctx the parse tree
	 */
	void exitScale2(gcodeParser.Scale2Context ctx);
	/**
	 * Enter a parse tree produced by {@link gcodeParser#point}.
	 * @param ctx the parse tree
	 */
	void enterPoint(gcodeParser.PointContext ctx);
	/**
	 * Exit a parse tree produced by {@link gcodeParser#point}.
	 * @param ctx the parse tree
	 */
	void exitPoint(gcodeParser.PointContext ctx);
	/**
	 * Enter a parse tree produced by {@link gcodeParser#screw}.
	 * @param ctx the parse tree
	 */
	void enterScrew(gcodeParser.ScrewContext ctx);
	/**
	 * Exit a parse tree produced by {@link gcodeParser#screw}.
	 * @param ctx the parse tree
	 */
	void exitScrew(gcodeParser.ScrewContext ctx);
	/**
	 * Enter a parse tree produced by {@link gcodeParser#cycle}.
	 * @param ctx the parse tree
	 */
	void enterCycle(gcodeParser.CycleContext ctx);
	/**
	 * Exit a parse tree produced by {@link gcodeParser#cycle}.
	 * @param ctx the parse tree
	 */
	void exitCycle(gcodeParser.CycleContext ctx);
	/**
	 * Enter a parse tree produced by {@link gcodeParser#cycle2}.
	 * @param ctx the parse tree
	 */
	void enterCycle2(gcodeParser.Cycle2Context ctx);
	/**
	 * Exit a parse tree produced by {@link gcodeParser#cycle2}.
	 * @param ctx the parse tree
	 */
	void exitCycle2(gcodeParser.Cycle2Context ctx);
	/**
	 * Enter a parse tree produced by {@link gcodeParser#break}.
	 * @param ctx the parse tree
	 */
	void enterBreak(gcodeParser.BreakContext ctx);
	/**
	 * Exit a parse tree produced by {@link gcodeParser#break}.
	 * @param ctx the parse tree
	 */
	void exitBreak(gcodeParser.BreakContext ctx);
	/**
	 * Enter a parse tree produced by {@link gcodeParser#feed}.
	 * @param ctx the parse tree
	 */
	void enterFeed(gcodeParser.FeedContext ctx);
	/**
	 * Exit a parse tree produced by {@link gcodeParser#feed}.
	 * @param ctx the parse tree
	 */
	void exitFeed(gcodeParser.FeedContext ctx);
	/**
	 * Enter a parse tree produced by {@link gcodeParser#feed2}.
	 * @param ctx the parse tree
	 */
	void enterFeed2(gcodeParser.Feed2Context ctx);
	/**
	 * Exit a parse tree produced by {@link gcodeParser#feed2}.
	 * @param ctx the parse tree
	 */
	void exitFeed2(gcodeParser.Feed2Context ctx);
	/**
	 * Enter a parse tree produced by {@link gcodeParser#surfspeed}.
	 * @param ctx the parse tree
	 */
	void enterSurfspeed(gcodeParser.SurfspeedContext ctx);
	/**
	 * Exit a parse tree produced by {@link gcodeParser#surfspeed}.
	 * @param ctx the parse tree
	 */
	void exitSurfspeed(gcodeParser.SurfspeedContext ctx);
	/**
	 * Enter a parse tree produced by {@link gcodeParser#setspeed}.
	 * @param ctx the parse tree
	 */
	void enterSetspeed(gcodeParser.SetspeedContext ctx);
	/**
	 * Exit a parse tree produced by {@link gcodeParser#setspeed}.
	 * @param ctx the parse tree
	 */
	void exitSetspeed(gcodeParser.SetspeedContext ctx);
	/**
	 * Enter a parse tree produced by {@link gcodeParser#backto}.
	 * @param ctx the parse tree
	 */
	void enterBackto(gcodeParser.BacktoContext ctx);
	/**
	 * Exit a parse tree produced by {@link gcodeParser#backto}.
	 * @param ctx the parse tree
	 */
	void exitBackto(gcodeParser.BacktoContext ctx);
	/**
	 * Enter a parse tree produced by {@link gcodeParser#backto2}.
	 * @param ctx the parse tree
	 */
	void enterBackto2(gcodeParser.Backto2Context ctx);
	/**
	 * Exit a parse tree produced by {@link gcodeParser#backto2}.
	 * @param ctx the parse tree
	 */
	void exitBackto2(gcodeParser.Backto2Context ctx);
	/**
	 * Enter a parse tree produced by {@link gcodeParser#spell}.
	 * @param ctx the parse tree
	 */
	void enterSpell(gcodeParser.SpellContext ctx);
	/**
	 * Exit a parse tree produced by {@link gcodeParser#spell}.
	 * @param ctx the parse tree
	 */
	void exitSpell(gcodeParser.SpellContext ctx);
}