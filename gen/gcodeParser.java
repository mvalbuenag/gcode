// Generated from C:/Users/samue/OneDrive/Documentos/Universidad/2023_1/Lenguajes de programación/Proyecto final/gcode/grammar\gcode.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class gcodeParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.12.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, T__43=44, T__44=45, 
		T__45=46, T__46=47, T__47=48, T__48=49, T__49=50, T__50=51, T__51=52, 
		T__52=53, T__53=54, T__54=55, T__55=56, T__56=57, TKN_X=58, TKN_Y=59, 
		TKN_Z=60, TKN_A=61, TKN_B=62, TKN_C=63, TKN_I=64, TKN_J=65, TKN_K=66, 
		TKN_NOT=67, TKN_PLUS=68, TKN_LESS=69, TKN_ZERO=70, TKN_LEFT=71, TKN_RIGHT=72, 
		TKN_FAST=73, TKN_LINEAR=74, TKN_AWAY=75, TKN_RADIUS=76, TKN_AT=77, TKN_TO=78, 
		TKN_ARC=79, TKN_LAPS=80, TKN_RETRACT=81, TKN_STAY=82, TKN_FORWARD=83, 
		TKN_REPEAT=84, TKN_ANGLE=85, TKN_ITIME=86, TKN_UPM=87, TKN_UPR=88, TKN_SET=89, 
		TKN_UNSET=90, TKN_VALUE=91, GCOMANDS=92, GPARAMS=93, COMENTARIO=94, ESP=95, 
		NUM=96;
	public static final int
		RULE_s = 0, RULE_comandos = 1, RULE_coordinates = 2, RULE_coordinates2 = 3, 
		RULE_distances = 4, RULE_travel = 5, RULE_type = 6, RULE_clock = 7, RULE_pause = 8, 
		RULE_time_unit = 9, RULE_stop = 10, RULE_offset = 11, RULE_set = 12, RULE_world = 13, 
		RULE_world2 = 14, RULE_positioning = 15, RULE_plane = 16, RULE_plane2 = 17, 
		RULE_unit = 18, RULE_unit2 = 19, RULE_park = 20, RULE_visit = 21, RULE_tourist = 22, 
		RULE_scale = 23, RULE_scale2 = 24, RULE_point = 25, RULE_screw = 26, RULE_cycle = 27, 
		RULE_cycle2 = 28, RULE_break = 29, RULE_feed = 30, RULE_feed2 = 31, RULE_surfspeed = 32, 
		RULE_setspeed = 33, RULE_backto = 34, RULE_backto2 = 35, RULE_spell = 36;
	private static String[] makeRuleNames() {
		return new String[] {
			"s", "comandos", "coordinates", "coordinates2", "distances", "travel", 
			"type", "clock", "pause", "time_unit", "stop", "offset", "set", "world", 
			"world2", "positioning", "plane", "plane2", "unit", "unit2", "park", 
			"visit", "tourist", "scale", "scale2", "point", "screw", "cycle", "cycle2", 
			"break", "feed", "feed2", "surfspeed", "setspeed", "backto", "backto2", 
			"spell"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'travel'", "'clock'", "'counterclock'", "'pause'", "'s'", "'ms'", 
			"'stop'", "'offset'", "'type'", "'axes'", "'world'", "'cartesian'", "'polar'", 
			"'rotate'", "'unrotate'", "'o'", "'working'", "'relative'", "'absolute'", 
			"'plane'", "'XY'", "'ZX'", "'YZ'", "'unit'", "'in'", "'mm'", "'park'", 
			"'elevation'", "'visit'", "'tourist'", "'scale'", "'by'", "'point'", 
			"'screw'", "'nholes'", "'cycle'", "'hspd'", "'invtap'", "'fineboring'", 
			"'backbore'", "'drill'", "'spodtrill'", "'npdrill'", "'tap'", "'boreinout'", 
			"'borenstop'", "'boreinwellout'", "'break'", "'feed'", "'bpm'", "'inpm'", 
			"'inpr'", "'surfspeed'", "'rpm'", "'backto'", "'spell'", "'cast'", "'X'", 
			"'Y'", "'Z'", "'A'", "'B'", "'C'", "'I'", "'J'", "'K'", "'not'", "'plus'", 
			"'less'", "'zero'", "'left'", "'right'", "'fast'", "'linear'", "'away'", 
			"'radius'", "'at'", "'to'", "'arc'", "'laps'", "'retract'", "'stay'", 
			"'forward'", "'repeat'", "'angle'", "'itime'", "'upm'", "'upr'", "'set'", 
			"'unset'", "'value'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, "TKN_X", 
			"TKN_Y", "TKN_Z", "TKN_A", "TKN_B", "TKN_C", "TKN_I", "TKN_J", "TKN_K", 
			"TKN_NOT", "TKN_PLUS", "TKN_LESS", "TKN_ZERO", "TKN_LEFT", "TKN_RIGHT", 
			"TKN_FAST", "TKN_LINEAR", "TKN_AWAY", "TKN_RADIUS", "TKN_AT", "TKN_TO", 
			"TKN_ARC", "TKN_LAPS", "TKN_RETRACT", "TKN_STAY", "TKN_FORWARD", "TKN_REPEAT", 
			"TKN_ANGLE", "TKN_ITIME", "TKN_UPM", "TKN_UPR", "TKN_SET", "TKN_UNSET", 
			"TKN_VALUE", "GCOMANDS", "GPARAMS", "COMENTARIO", "ESP", "NUM"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "gcode.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public gcodeParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SContext extends ParserRuleContext {
		public List<ComandosContext> comandos() {
			return getRuleContexts(ComandosContext.class);
		}
		public ComandosContext comandos(int i) {
			return getRuleContext(ComandosContext.class,i);
		}
		public SContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_s; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gcodeListener ) ((gcodeListener)listener).enterS(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gcodeListener ) ((gcodeListener)listener).exitS(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gcodeVisitor ) return ((gcodeVisitor<? extends T>)visitor).visitS(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SContext s() throws RecognitionException {
		SContext _localctx = new SContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_s);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 117938113641187730L) != 0)) {
				{
				{
				setState(74);
				comandos();
				}
				}
				setState(79);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ComandosContext extends ParserRuleContext {
		public TravelContext travel() {
			return getRuleContext(TravelContext.class,0);
		}
		public PauseContext pause() {
			return getRuleContext(PauseContext.class,0);
		}
		public StopContext stop() {
			return getRuleContext(StopContext.class,0);
		}
		public OffsetContext offset() {
			return getRuleContext(OffsetContext.class,0);
		}
		public WorldContext world() {
			return getRuleContext(WorldContext.class,0);
		}
		public PlaneContext plane() {
			return getRuleContext(PlaneContext.class,0);
		}
		public UnitContext unit() {
			return getRuleContext(UnitContext.class,0);
		}
		public ParkContext park() {
			return getRuleContext(ParkContext.class,0);
		}
		public VisitContext visit() {
			return getRuleContext(VisitContext.class,0);
		}
		public TouristContext tourist() {
			return getRuleContext(TouristContext.class,0);
		}
		public ScaleContext scale() {
			return getRuleContext(ScaleContext.class,0);
		}
		public PointContext point() {
			return getRuleContext(PointContext.class,0);
		}
		public ScrewContext screw() {
			return getRuleContext(ScrewContext.class,0);
		}
		public CycleContext cycle() {
			return getRuleContext(CycleContext.class,0);
		}
		public BreakContext break_() {
			return getRuleContext(BreakContext.class,0);
		}
		public FeedContext feed() {
			return getRuleContext(FeedContext.class,0);
		}
		public SurfspeedContext surfspeed() {
			return getRuleContext(SurfspeedContext.class,0);
		}
		public BacktoContext backto() {
			return getRuleContext(BacktoContext.class,0);
		}
		public SpellContext spell() {
			return getRuleContext(SpellContext.class,0);
		}
		public ComandosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comandos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gcodeListener ) ((gcodeListener)listener).enterComandos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gcodeListener ) ((gcodeListener)listener).exitComandos(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gcodeVisitor ) return ((gcodeVisitor<? extends T>)visitor).visitComandos(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComandosContext comandos() throws RecognitionException {
		ComandosContext _localctx = new ComandosContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_comandos);
		try {
			setState(99);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(80);
				travel();
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 2);
				{
				setState(81);
				pause();
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 3);
				{
				setState(82);
				stop();
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 4);
				{
				setState(83);
				offset();
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 5);
				{
				setState(84);
				world();
				}
				break;
			case T__19:
				enterOuterAlt(_localctx, 6);
				{
				setState(85);
				plane();
				}
				break;
			case T__23:
				enterOuterAlt(_localctx, 7);
				{
				setState(86);
				unit();
				}
				break;
			case T__26:
				enterOuterAlt(_localctx, 8);
				{
				setState(87);
				park();
				}
				break;
			case T__28:
				enterOuterAlt(_localctx, 9);
				{
				setState(88);
				visit();
				}
				break;
			case T__29:
				enterOuterAlt(_localctx, 10);
				{
				setState(89);
				tourist();
				}
				break;
			case T__30:
				enterOuterAlt(_localctx, 11);
				{
				setState(90);
				scale();
				}
				break;
			case T__32:
				enterOuterAlt(_localctx, 12);
				{
				setState(91);
				point();
				}
				break;
			case T__33:
				enterOuterAlt(_localctx, 13);
				{
				setState(92);
				screw();
				}
				break;
			case T__35:
				enterOuterAlt(_localctx, 14);
				{
				setState(93);
				cycle();
				}
				break;
			case T__47:
				enterOuterAlt(_localctx, 15);
				{
				setState(94);
				break_();
				}
				break;
			case T__48:
				enterOuterAlt(_localctx, 16);
				{
				setState(95);
				feed();
				}
				break;
			case T__52:
				enterOuterAlt(_localctx, 17);
				{
				setState(96);
				surfspeed();
				}
				break;
			case T__54:
				enterOuterAlt(_localctx, 18);
				{
				setState(97);
				backto();
				}
				break;
			case T__55:
				enterOuterAlt(_localctx, 19);
				{
				setState(98);
				spell();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CoordinatesContext extends ParserRuleContext {
		public List<TerminalNode> NUM() { return getTokens(gcodeParser.NUM); }
		public TerminalNode NUM(int i) {
			return getToken(gcodeParser.NUM, i);
		}
		public TerminalNode TKN_X() { return getToken(gcodeParser.TKN_X, 0); }
		public TerminalNode TKN_Y() { return getToken(gcodeParser.TKN_Y, 0); }
		public TerminalNode TKN_Z() { return getToken(gcodeParser.TKN_Z, 0); }
		public CoordinatesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_coordinates; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gcodeListener ) ((gcodeListener)listener).enterCoordinates(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gcodeListener ) ((gcodeListener)listener).exitCoordinates(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gcodeVisitor ) return ((gcodeVisitor<? extends T>)visitor).visitCoordinates(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CoordinatesContext coordinates() throws RecognitionException {
		CoordinatesContext _localctx = new CoordinatesContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_coordinates);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(101);
				match(NUM);
				setState(102);
				match(TKN_X);
				}
				break;
			}
			setState(107);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(105);
				match(NUM);
				setState(106);
				match(TKN_Y);
				}
				break;
			}
			setState(111);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(109);
				match(NUM);
				setState(110);
				match(TKN_Z);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Coordinates2Context extends ParserRuleContext {
		public List<TerminalNode> NUM() { return getTokens(gcodeParser.NUM); }
		public TerminalNode NUM(int i) {
			return getToken(gcodeParser.NUM, i);
		}
		public TerminalNode TKN_A() { return getToken(gcodeParser.TKN_A, 0); }
		public TerminalNode TKN_B() { return getToken(gcodeParser.TKN_B, 0); }
		public TerminalNode TKN_C() { return getToken(gcodeParser.TKN_C, 0); }
		public Coordinates2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_coordinates2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gcodeListener ) ((gcodeListener)listener).enterCoordinates2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gcodeListener ) ((gcodeListener)listener).exitCoordinates2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gcodeVisitor ) return ((gcodeVisitor<? extends T>)visitor).visitCoordinates2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Coordinates2Context coordinates2() throws RecognitionException {
		Coordinates2Context _localctx = new Coordinates2Context(_ctx, getState());
		enterRule(_localctx, 6, RULE_coordinates2);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(113);
				match(NUM);
				setState(114);
				match(TKN_A);
				}
				break;
			}
			setState(119);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(117);
				match(NUM);
				setState(118);
				match(TKN_B);
				}
				break;
			}
			setState(123);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NUM) {
				{
				setState(121);
				match(NUM);
				setState(122);
				match(TKN_C);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DistancesContext extends ParserRuleContext {
		public List<TerminalNode> NUM() { return getTokens(gcodeParser.NUM); }
		public TerminalNode NUM(int i) {
			return getToken(gcodeParser.NUM, i);
		}
		public TerminalNode TKN_I() { return getToken(gcodeParser.TKN_I, 0); }
		public TerminalNode TKN_J() { return getToken(gcodeParser.TKN_J, 0); }
		public TerminalNode TKN_K() { return getToken(gcodeParser.TKN_K, 0); }
		public DistancesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_distances; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gcodeListener ) ((gcodeListener)listener).enterDistances(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gcodeListener ) ((gcodeListener)listener).exitDistances(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gcodeVisitor ) return ((gcodeVisitor<? extends T>)visitor).visitDistances(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DistancesContext distances() throws RecognitionException {
		DistancesContext _localctx = new DistancesContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_distances);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(125);
				match(NUM);
				setState(126);
				match(TKN_I);
				}
				break;
			}
			setState(131);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(129);
				match(NUM);
				setState(130);
				match(TKN_J);
				}
				break;
			}
			setState(135);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(133);
				match(NUM);
				setState(134);
				match(TKN_K);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TravelContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode TKN_AT() { return getToken(gcodeParser.TKN_AT, 0); }
		public TerminalNode NUM() { return getToken(gcodeParser.NUM, 0); }
		public TerminalNode TKN_TO() { return getToken(gcodeParser.TKN_TO, 0); }
		public CoordinatesContext coordinates() {
			return getRuleContext(CoordinatesContext.class,0);
		}
		public Coordinates2Context coordinates2() {
			return getRuleContext(Coordinates2Context.class,0);
		}
		public TravelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_travel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gcodeListener ) ((gcodeListener)listener).enterTravel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gcodeListener ) ((gcodeListener)listener).exitTravel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gcodeVisitor ) return ((gcodeVisitor<? extends T>)visitor).visitTravel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TravelContext travel() throws RecognitionException {
		TravelContext _localctx = new TravelContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_travel);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			match(T__0);
			setState(138);
			type();
			setState(143);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TKN_TO) {
				{
				setState(139);
				match(TKN_TO);
				setState(140);
				coordinates();
				setState(141);
				coordinates2();
				}
			}

			setState(145);
			match(TKN_AT);
			setState(146);
			match(NUM);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TypeContext extends ParserRuleContext {
		public TerminalNode TKN_FAST() { return getToken(gcodeParser.TKN_FAST, 0); }
		public TerminalNode TKN_LINEAR() { return getToken(gcodeParser.TKN_LINEAR, 0); }
		public TerminalNode TKN_ARC() { return getToken(gcodeParser.TKN_ARC, 0); }
		public List<TerminalNode> NUM() { return getTokens(gcodeParser.NUM); }
		public TerminalNode NUM(int i) {
			return getToken(gcodeParser.NUM, i);
		}
		public ClockContext clock() {
			return getRuleContext(ClockContext.class,0);
		}
		public TerminalNode TKN_LAPS() { return getToken(gcodeParser.TKN_LAPS, 0); }
		public TerminalNode TKN_AWAY() { return getToken(gcodeParser.TKN_AWAY, 0); }
		public DistancesContext distances() {
			return getRuleContext(DistancesContext.class,0);
		}
		public TerminalNode TKN_RADIUS() { return getToken(gcodeParser.TKN_RADIUS, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gcodeListener ) ((gcodeListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gcodeListener ) ((gcodeListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gcodeVisitor ) return ((gcodeVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_type);
		int _la;
		try {
			setState(165);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TKN_FAST:
				enterOuterAlt(_localctx, 1);
				{
				setState(148);
				match(TKN_FAST);
				}
				break;
			case TKN_LINEAR:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(149);
				match(TKN_LINEAR);
				setState(152);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TKN_ARC) {
					{
					setState(150);
					match(TKN_ARC);
					setState(151);
					match(NUM);
					}
				}

				}
				}
				break;
			case T__1:
			case T__2:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(154);
				clock();
				setState(159);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case TKN_AWAY:
					{
					{
					setState(155);
					match(TKN_AWAY);
					setState(156);
					distances();
					}
					}
					break;
				case TKN_RADIUS:
					{
					{
					setState(157);
					match(TKN_RADIUS);
					setState(158);
					match(NUM);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(163);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NUM) {
					{
					setState(161);
					match(NUM);
					setState(162);
					match(TKN_LAPS);
					}
				}

				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ClockContext extends ParserRuleContext {
		public ClockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_clock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gcodeListener ) ((gcodeListener)listener).enterClock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gcodeListener ) ((gcodeListener)listener).exitClock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gcodeVisitor ) return ((gcodeVisitor<? extends T>)visitor).visitClock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClockContext clock() throws RecognitionException {
		ClockContext _localctx = new ClockContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_clock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
			_la = _input.LA(1);
			if ( !(_la==T__1 || _la==T__2) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PauseContext extends ParserRuleContext {
		public TerminalNode NUM() { return getToken(gcodeParser.NUM, 0); }
		public Time_unitContext time_unit() {
			return getRuleContext(Time_unitContext.class,0);
		}
		public PauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gcodeListener ) ((gcodeListener)listener).enterPause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gcodeListener ) ((gcodeListener)listener).exitPause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gcodeVisitor ) return ((gcodeVisitor<? extends T>)visitor).visitPause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PauseContext pause() throws RecognitionException {
		PauseContext _localctx = new PauseContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_pause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
			match(T__3);
			setState(170);
			match(NUM);
			setState(171);
			time_unit();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Time_unitContext extends ParserRuleContext {
		public Time_unitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_time_unit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gcodeListener ) ((gcodeListener)listener).enterTime_unit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gcodeListener ) ((gcodeListener)listener).exitTime_unit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gcodeVisitor ) return ((gcodeVisitor<? extends T>)visitor).visitTime_unit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Time_unitContext time_unit() throws RecognitionException {
		Time_unitContext _localctx = new Time_unitContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_time_unit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(173);
			_la = _input.LA(1);
			if ( !(_la==T__4 || _la==T__5) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StopContext extends ParserRuleContext {
		public StopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gcodeListener ) ((gcodeListener)listener).enterStop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gcodeListener ) ((gcodeListener)listener).exitStop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gcodeVisitor ) return ((gcodeVisitor<? extends T>)visitor).visitStop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StopContext stop() throws RecognitionException {
		StopContext _localctx = new StopContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_stop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			match(T__6);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class OffsetContext extends ParserRuleContext {
		public SetContext set() {
			return getRuleContext(SetContext.class,0);
		}
		public TerminalNode TKN_NOT() { return getToken(gcodeParser.TKN_NOT, 0); }
		public TerminalNode TKN_LEFT() { return getToken(gcodeParser.TKN_LEFT, 0); }
		public TerminalNode TKN_RIGHT() { return getToken(gcodeParser.TKN_RIGHT, 0); }
		public TerminalNode TKN_PLUS() { return getToken(gcodeParser.TKN_PLUS, 0); }
		public TerminalNode TKN_LESS() { return getToken(gcodeParser.TKN_LESS, 0); }
		public TerminalNode TKN_ZERO() { return getToken(gcodeParser.TKN_ZERO, 0); }
		public OffsetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_offset; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gcodeListener ) ((gcodeListener)listener).enterOffset(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gcodeListener ) ((gcodeListener)listener).exitOffset(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gcodeVisitor ) return ((gcodeVisitor<? extends T>)visitor).visitOffset(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OffsetContext offset() throws RecognitionException {
		OffsetContext _localctx = new OffsetContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_offset);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
			match(T__7);
			setState(185);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TKN_SET:
				{
				setState(178);
				set();
				}
				break;
			case TKN_NOT:
				{
				setState(179);
				match(TKN_NOT);
				}
				break;
			case TKN_LEFT:
				{
				setState(180);
				match(TKN_LEFT);
				}
				break;
			case TKN_RIGHT:
				{
				setState(181);
				match(TKN_RIGHT);
				}
				break;
			case TKN_PLUS:
				{
				setState(182);
				match(TKN_PLUS);
				}
				break;
			case TKN_LESS:
				{
				setState(183);
				match(TKN_LESS);
				}
				break;
			case TKN_ZERO:
				{
				setState(184);
				match(TKN_ZERO);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SetContext extends ParserRuleContext {
		public TerminalNode TKN_SET() { return getToken(gcodeParser.TKN_SET, 0); }
		public List<TerminalNode> NUM() { return getTokens(gcodeParser.NUM); }
		public TerminalNode NUM(int i) {
			return getToken(gcodeParser.NUM, i);
		}
		public CoordinatesContext coordinates() {
			return getRuleContext(CoordinatesContext.class,0);
		}
		public Coordinates2Context coordinates2() {
			return getRuleContext(Coordinates2Context.class,0);
		}
		public TerminalNode TKN_VALUE() { return getToken(gcodeParser.TKN_VALUE, 0); }
		public SetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_set; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gcodeListener ) ((gcodeListener)listener).enterSet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gcodeListener ) ((gcodeListener)listener).exitSet(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gcodeVisitor ) return ((gcodeVisitor<? extends T>)visitor).visitSet(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SetContext set() throws RecognitionException {
		SetContext _localctx = new SetContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_set);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(187);
			match(TKN_SET);
			setState(188);
			match(T__7);
			setState(189);
			match(NUM);
			setState(190);
			match(T__8);
			setState(191);
			match(NUM);
			setState(196);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__9) {
				{
				setState(192);
				match(T__9);
				setState(193);
				coordinates();
				setState(194);
				coordinates2();
				}
			}

			setState(200);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TKN_VALUE) {
				{
				setState(198);
				match(TKN_VALUE);
				setState(199);
				match(NUM);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class WorldContext extends ParserRuleContext {
		public World2Context world2() {
			return getRuleContext(World2Context.class,0);
		}
		public WorldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_world; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gcodeListener ) ((gcodeListener)listener).enterWorld(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gcodeListener ) ((gcodeListener)listener).exitWorld(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gcodeVisitor ) return ((gcodeVisitor<? extends T>)visitor).visitWorld(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WorldContext world() throws RecognitionException {
		WorldContext _localctx = new WorldContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_world);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(202);
			match(T__10);
			setState(203);
			world2();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class World2Context extends ParserRuleContext {
		public CoordinatesContext coordinates() {
			return getRuleContext(CoordinatesContext.class,0);
		}
		public TerminalNode TKN_ANGLE() { return getToken(gcodeParser.TKN_ANGLE, 0); }
		public TerminalNode NUM() { return getToken(gcodeParser.NUM, 0); }
		public PositioningContext positioning() {
			return getRuleContext(PositioningContext.class,0);
		}
		public World2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_world2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gcodeListener ) ((gcodeListener)listener).enterWorld2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gcodeListener ) ((gcodeListener)listener).exitWorld2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gcodeVisitor ) return ((gcodeVisitor<? extends T>)visitor).visitWorld2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final World2Context world2() throws RecognitionException {
		World2Context _localctx = new World2Context(_ctx, getState());
		enterRule(_localctx, 28, RULE_world2);
		int _la;
		try {
			setState(219);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__11:
				enterOuterAlt(_localctx, 1);
				{
				setState(205);
				match(T__11);
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 2);
				{
				setState(206);
				match(T__12);
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 3);
				{
				setState(207);
				match(T__13);
				setState(208);
				coordinates();
				setState(211);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TKN_ANGLE) {
					{
					setState(209);
					match(TKN_ANGLE);
					setState(210);
					match(NUM);
					}
				}

				}
				break;
			case T__14:
				enterOuterAlt(_localctx, 4);
				{
				setState(213);
				match(T__14);
				}
				break;
			case T__15:
				enterOuterAlt(_localctx, 5);
				{
				setState(214);
				match(T__15);
				setState(215);
				positioning();
				setState(216);
				coordinates();
				}
				break;
			case T__16:
				enterOuterAlt(_localctx, 6);
				{
				setState(218);
				match(T__16);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PositioningContext extends ParserRuleContext {
		public PositioningContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_positioning; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gcodeListener ) ((gcodeListener)listener).enterPositioning(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gcodeListener ) ((gcodeListener)listener).exitPositioning(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gcodeVisitor ) return ((gcodeVisitor<? extends T>)visitor).visitPositioning(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PositioningContext positioning() throws RecognitionException {
		PositioningContext _localctx = new PositioningContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_positioning);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(221);
			_la = _input.LA(1);
			if ( !(_la==T__17 || _la==T__18) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PlaneContext extends ParserRuleContext {
		public Plane2Context plane2() {
			return getRuleContext(Plane2Context.class,0);
		}
		public PlaneContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_plane; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gcodeListener ) ((gcodeListener)listener).enterPlane(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gcodeListener ) ((gcodeListener)listener).exitPlane(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gcodeVisitor ) return ((gcodeVisitor<? extends T>)visitor).visitPlane(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PlaneContext plane() throws RecognitionException {
		PlaneContext _localctx = new PlaneContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_plane);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(223);
			match(T__19);
			setState(224);
			plane2();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Plane2Context extends ParserRuleContext {
		public Plane2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_plane2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gcodeListener ) ((gcodeListener)listener).enterPlane2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gcodeListener ) ((gcodeListener)listener).exitPlane2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gcodeVisitor ) return ((gcodeVisitor<? extends T>)visitor).visitPlane2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Plane2Context plane2() throws RecognitionException {
		Plane2Context _localctx = new Plane2Context(_ctx, getState());
		enterRule(_localctx, 34, RULE_plane2);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(226);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 14680064L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class UnitContext extends ParserRuleContext {
		public Unit2Context unit2() {
			return getRuleContext(Unit2Context.class,0);
		}
		public UnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gcodeListener ) ((gcodeListener)listener).enterUnit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gcodeListener ) ((gcodeListener)listener).exitUnit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gcodeVisitor ) return ((gcodeVisitor<? extends T>)visitor).visitUnit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnitContext unit() throws RecognitionException {
		UnitContext _localctx = new UnitContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_unit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(228);
			match(T__23);
			setState(229);
			unit2();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Unit2Context extends ParserRuleContext {
		public Unit2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unit2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gcodeListener ) ((gcodeListener)listener).enterUnit2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gcodeListener ) ((gcodeListener)listener).exitUnit2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gcodeVisitor ) return ((gcodeVisitor<? extends T>)visitor).visitUnit2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Unit2Context unit2() throws RecognitionException {
		Unit2Context _localctx = new Unit2Context(_ctx, getState());
		enterRule(_localctx, 38, RULE_unit2);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(231);
			_la = _input.LA(1);
			if ( !(_la==T__24 || _la==T__25) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ParkContext extends ParserRuleContext {
		public TerminalNode NUM() { return getToken(gcodeParser.NUM, 0); }
		public ParkContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_park; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gcodeListener ) ((gcodeListener)listener).enterPark(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gcodeListener ) ((gcodeListener)listener).exitPark(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gcodeVisitor ) return ((gcodeVisitor<? extends T>)visitor).visitPark(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParkContext park() throws RecognitionException {
		ParkContext _localctx = new ParkContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_park);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(233);
			match(T__26);
			setState(234);
			match(T__27);
			setState(235);
			match(NUM);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class VisitContext extends ParserRuleContext {
		public CoordinatesContext coordinates() {
			return getRuleContext(CoordinatesContext.class,0);
		}
		public VisitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_visit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gcodeListener ) ((gcodeListener)listener).enterVisit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gcodeListener ) ((gcodeListener)listener).exitVisit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gcodeVisitor ) return ((gcodeVisitor<? extends T>)visitor).visitVisit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VisitContext visit() throws RecognitionException {
		VisitContext _localctx = new VisitContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_visit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(237);
			match(T__28);
			setState(238);
			coordinates();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TouristContext extends ParserRuleContext {
		public CoordinatesContext coordinates() {
			return getRuleContext(CoordinatesContext.class,0);
		}
		public TouristContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tourist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gcodeListener ) ((gcodeListener)listener).enterTourist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gcodeListener ) ((gcodeListener)listener).exitTourist(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gcodeVisitor ) return ((gcodeVisitor<? extends T>)visitor).visitTourist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TouristContext tourist() throws RecognitionException {
		TouristContext _localctx = new TouristContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_tourist);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(240);
			match(T__29);
			setState(241);
			coordinates();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ScaleContext extends ParserRuleContext {
		public Scale2Context scale2() {
			return getRuleContext(Scale2Context.class,0);
		}
		public ScaleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scale; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gcodeListener ) ((gcodeListener)listener).enterScale(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gcodeListener ) ((gcodeListener)listener).exitScale(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gcodeVisitor ) return ((gcodeVisitor<? extends T>)visitor).visitScale(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ScaleContext scale() throws RecognitionException {
		ScaleContext _localctx = new ScaleContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_scale);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(243);
			match(T__30);
			setState(244);
			scale2();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Scale2Context extends ParserRuleContext {
		public TerminalNode TKN_NOT() { return getToken(gcodeParser.TKN_NOT, 0); }
		public CoordinatesContext coordinates() {
			return getRuleContext(CoordinatesContext.class,0);
		}
		public TerminalNode NUM() { return getToken(gcodeParser.NUM, 0); }
		public Scale2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scale2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gcodeListener ) ((gcodeListener)listener).enterScale2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gcodeListener ) ((gcodeListener)listener).exitScale2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gcodeVisitor ) return ((gcodeVisitor<? extends T>)visitor).visitScale2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Scale2Context scale2() throws RecognitionException {
		Scale2Context _localctx = new Scale2Context(_ctx, getState());
		enterRule(_localctx, 48, RULE_scale2);
		try {
			setState(251);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TKN_NOT:
				enterOuterAlt(_localctx, 1);
				{
				setState(246);
				match(TKN_NOT);
				}
				break;
			case T__31:
			case NUM:
				enterOuterAlt(_localctx, 2);
				{
				setState(247);
				coordinates();
				setState(248);
				match(T__31);
				setState(249);
				match(NUM);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PointContext extends ParserRuleContext {
		public TerminalNode NUM() { return getToken(gcodeParser.NUM, 0); }
		public CoordinatesContext coordinates() {
			return getRuleContext(CoordinatesContext.class,0);
		}
		public PointContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_point; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gcodeListener ) ((gcodeListener)listener).enterPoint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gcodeListener ) ((gcodeListener)listener).exitPoint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gcodeVisitor ) return ((gcodeVisitor<? extends T>)visitor).visitPoint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PointContext point() throws RecognitionException {
		PointContext _localctx = new PointContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_point);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(253);
			match(T__32);
			setState(254);
			match(NUM);
			setState(255);
			coordinates();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ScrewContext extends ParserRuleContext {
		public TerminalNode TKN_RADIUS() { return getToken(gcodeParser.TKN_RADIUS, 0); }
		public List<TerminalNode> NUM() { return getTokens(gcodeParser.NUM); }
		public TerminalNode NUM(int i) {
			return getToken(gcodeParser.NUM, i);
		}
		public TerminalNode TKN_ANGLE() { return getToken(gcodeParser.TKN_ANGLE, 0); }
		public ScrewContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_screw; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gcodeListener ) ((gcodeListener)listener).enterScrew(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gcodeListener ) ((gcodeListener)listener).exitScrew(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gcodeVisitor ) return ((gcodeVisitor<? extends T>)visitor).visitScrew(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ScrewContext screw() throws RecognitionException {
		ScrewContext _localctx = new ScrewContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_screw);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(257);
			match(T__33);
			setState(258);
			match(TKN_RADIUS);
			setState(259);
			match(NUM);
			setState(262);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TKN_ANGLE) {
				{
				setState(260);
				match(TKN_ANGLE);
				setState(261);
				match(NUM);
				}
			}

			setState(264);
			match(T__34);
			setState(265);
			match(NUM);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CycleContext extends ParserRuleContext {
		public Cycle2Context cycle2() {
			return getRuleContext(Cycle2Context.class,0);
		}
		public TerminalNode TKN_FORWARD() { return getToken(gcodeParser.TKN_FORWARD, 0); }
		public List<TerminalNode> NUM() { return getTokens(gcodeParser.NUM); }
		public TerminalNode NUM(int i) {
			return getToken(gcodeParser.NUM, i);
		}
		public CoordinatesContext coordinates() {
			return getRuleContext(CoordinatesContext.class,0);
		}
		public TerminalNode TKN_RETRACT() { return getToken(gcodeParser.TKN_RETRACT, 0); }
		public TerminalNode TKN_STAY() { return getToken(gcodeParser.TKN_STAY, 0); }
		public TerminalNode TKN_REPEAT() { return getToken(gcodeParser.TKN_REPEAT, 0); }
		public CycleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cycle; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gcodeListener ) ((gcodeListener)listener).enterCycle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gcodeListener ) ((gcodeListener)listener).exitCycle(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gcodeVisitor ) return ((gcodeVisitor<? extends T>)visitor).visitCycle(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CycleContext cycle() throws RecognitionException {
		CycleContext _localctx = new CycleContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_cycle);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(267);
			match(T__35);
			setState(268);
			cycle2();
			setState(271);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__24) {
				{
				setState(269);
				match(T__24);
				setState(270);
				coordinates();
				}
			}

			setState(275);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TKN_RETRACT) {
				{
				setState(273);
				match(TKN_RETRACT);
				setState(274);
				match(NUM);
				}
			}

			setState(279);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TKN_STAY) {
				{
				setState(277);
				match(TKN_STAY);
				setState(278);
				match(NUM);
				}
			}

			setState(281);
			match(TKN_FORWARD);
			setState(282);
			match(NUM);
			setState(285);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TKN_REPEAT) {
				{
				setState(283);
				match(TKN_REPEAT);
				setState(284);
				match(NUM);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Cycle2Context extends ParserRuleContext {
		public Cycle2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cycle2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gcodeListener ) ((gcodeListener)listener).enterCycle2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gcodeListener ) ((gcodeListener)listener).exitCycle2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gcodeVisitor ) return ((gcodeVisitor<? extends T>)visitor).visitCycle2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cycle2Context cycle2() throws RecognitionException {
		Cycle2Context _localctx = new Cycle2Context(_ctx, getState());
		enterRule(_localctx, 56, RULE_cycle2);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(287);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 281337537757184L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BreakContext extends ParserRuleContext {
		public BreakContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_break; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gcodeListener ) ((gcodeListener)listener).enterBreak(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gcodeListener ) ((gcodeListener)listener).exitBreak(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gcodeVisitor ) return ((gcodeVisitor<? extends T>)visitor).visitBreak(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BreakContext break_() throws RecognitionException {
		BreakContext _localctx = new BreakContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_break);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(289);
			match(T__47);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FeedContext extends ParserRuleContext {
		public Feed2Context feed2() {
			return getRuleContext(Feed2Context.class,0);
		}
		public FeedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_feed; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gcodeListener ) ((gcodeListener)listener).enterFeed(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gcodeListener ) ((gcodeListener)listener).exitFeed(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gcodeVisitor ) return ((gcodeVisitor<? extends T>)visitor).visitFeed(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FeedContext feed() throws RecognitionException {
		FeedContext _localctx = new FeedContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_feed);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(291);
			match(T__48);
			setState(292);
			feed2();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Feed2Context extends ParserRuleContext {
		public TerminalNode TKN_ITIME() { return getToken(gcodeParser.TKN_ITIME, 0); }
		public TerminalNode NUM() { return getToken(gcodeParser.NUM, 0); }
		public TerminalNode TKN_UPM() { return getToken(gcodeParser.TKN_UPM, 0); }
		public TerminalNode TKN_UPR() { return getToken(gcodeParser.TKN_UPR, 0); }
		public Feed2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_feed2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gcodeListener ) ((gcodeListener)listener).enterFeed2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gcodeListener ) ((gcodeListener)listener).exitFeed2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gcodeVisitor ) return ((gcodeVisitor<? extends T>)visitor).visitFeed2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Feed2Context feed2() throws RecognitionException {
		Feed2Context _localctx = new Feed2Context(_ctx, getState());
		enterRule(_localctx, 62, RULE_feed2);
		try {
			setState(303);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TKN_ITIME:
				enterOuterAlt(_localctx, 1);
				{
				setState(294);
				match(TKN_ITIME);
				setState(295);
				match(NUM);
				setState(296);
				match(T__49);
				}
				break;
			case TKN_UPM:
				enterOuterAlt(_localctx, 2);
				{
				setState(297);
				match(TKN_UPM);
				setState(298);
				match(NUM);
				setState(299);
				match(T__50);
				}
				break;
			case TKN_UPR:
				enterOuterAlt(_localctx, 3);
				{
				setState(300);
				match(TKN_UPR);
				setState(301);
				match(NUM);
				setState(302);
				match(T__51);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SurfspeedContext extends ParserRuleContext {
		public SetspeedContext setspeed() {
			return getRuleContext(SetspeedContext.class,0);
		}
		public SurfspeedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_surfspeed; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gcodeListener ) ((gcodeListener)listener).enterSurfspeed(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gcodeListener ) ((gcodeListener)listener).exitSurfspeed(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gcodeVisitor ) return ((gcodeVisitor<? extends T>)visitor).visitSurfspeed(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SurfspeedContext surfspeed() throws RecognitionException {
		SurfspeedContext _localctx = new SurfspeedContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_surfspeed);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(305);
			match(T__52);
			setState(306);
			setspeed();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SetspeedContext extends ParserRuleContext {
		public TerminalNode TKN_SET() { return getToken(gcodeParser.TKN_SET, 0); }
		public TerminalNode NUM() { return getToken(gcodeParser.NUM, 0); }
		public TerminalNode TKN_UNSET() { return getToken(gcodeParser.TKN_UNSET, 0); }
		public SetspeedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setspeed; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gcodeListener ) ((gcodeListener)listener).enterSetspeed(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gcodeListener ) ((gcodeListener)listener).exitSetspeed(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gcodeVisitor ) return ((gcodeVisitor<? extends T>)visitor).visitSetspeed(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SetspeedContext setspeed() throws RecognitionException {
		SetspeedContext _localctx = new SetspeedContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_setspeed);
		try {
			setState(312);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TKN_SET:
				enterOuterAlt(_localctx, 1);
				{
				setState(308);
				match(TKN_SET);
				setState(309);
				match(NUM);
				setState(310);
				match(T__53);
				}
				break;
			case TKN_UNSET:
				enterOuterAlt(_localctx, 2);
				{
				setState(311);
				match(TKN_UNSET);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BacktoContext extends ParserRuleContext {
		public Backto2Context backto2() {
			return getRuleContext(Backto2Context.class,0);
		}
		public BacktoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_backto; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gcodeListener ) ((gcodeListener)listener).enterBackto(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gcodeListener ) ((gcodeListener)listener).exitBackto(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gcodeVisitor ) return ((gcodeVisitor<? extends T>)visitor).visitBackto(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BacktoContext backto() throws RecognitionException {
		BacktoContext _localctx = new BacktoContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_backto);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(314);
			match(T__54);
			setState(315);
			backto2();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Backto2Context extends ParserRuleContext {
		public Backto2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_backto2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gcodeListener ) ((gcodeListener)listener).enterBackto2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gcodeListener ) ((gcodeListener)listener).exitBackto2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gcodeVisitor ) return ((gcodeVisitor<? extends T>)visitor).visitBackto2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Backto2Context backto2() throws RecognitionException {
		Backto2Context _localctx = new Backto2Context(_ctx, getState());
		enterRule(_localctx, 70, RULE_backto2);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(317);
			_la = _input.LA(1);
			if ( !(_la==T__19 || _la==T__32) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SpellContext extends ParserRuleContext {
		public List<TerminalNode> GCOMANDS() { return getTokens(gcodeParser.GCOMANDS); }
		public TerminalNode GCOMANDS(int i) {
			return getToken(gcodeParser.GCOMANDS, i);
		}
		public List<TerminalNode> GPARAMS() { return getTokens(gcodeParser.GPARAMS); }
		public TerminalNode GPARAMS(int i) {
			return getToken(gcodeParser.GPARAMS, i);
		}
		public SpellContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_spell; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gcodeListener ) ((gcodeListener)listener).enterSpell(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gcodeListener ) ((gcodeListener)listener).exitSpell(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gcodeVisitor ) return ((gcodeVisitor<? extends T>)visitor).visitSpell(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SpellContext spell() throws RecognitionException {
		SpellContext _localctx = new SpellContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_spell);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(319);
			match(T__55);
			setState(324);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==GCOMANDS) {
				{
				{
				setState(320);
				match(GCOMANDS);
				setState(321);
				match(GPARAMS);
				}
				}
				setState(326);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(327);
			match(T__56);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\u0004\u0001`\u014a\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0002"+
		"#\u0007#\u0002$\u0007$\u0001\u0000\u0005\u0000L\b\u0000\n\u0000\f\u0000"+
		"O\t\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0003\u0001d\b\u0001\u0001\u0002\u0001\u0002"+
		"\u0003\u0002h\b\u0002\u0001\u0002\u0001\u0002\u0003\u0002l\b\u0002\u0001"+
		"\u0002\u0001\u0002\u0003\u0002p\b\u0002\u0001\u0003\u0001\u0003\u0003"+
		"\u0003t\b\u0003\u0001\u0003\u0001\u0003\u0003\u0003x\b\u0003\u0001\u0003"+
		"\u0001\u0003\u0003\u0003|\b\u0003\u0001\u0004\u0001\u0004\u0003\u0004"+
		"\u0080\b\u0004\u0001\u0004\u0001\u0004\u0003\u0004\u0084\b\u0004\u0001"+
		"\u0004\u0001\u0004\u0003\u0004\u0088\b\u0004\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005\u0090\b\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0003\u0006\u0099\b\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0003\u0006\u00a0\b\u0006\u0001\u0006\u0001\u0006\u0003"+
		"\u0006\u00a4\b\u0006\u0003\u0006\u00a6\b\u0006\u0001\u0007\u0001\u0007"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\n\u0001\n\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0003\u000b\u00ba\b\u000b\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0003\f\u00c5\b\f\u0001\f\u0001"+
		"\f\u0003\f\u00c9\b\f\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u00d4\b\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0003"+
		"\u000e\u00dc\b\u000e\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0003\u0018\u00fc\b\u0018\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001"+
		"\u001a\u0003\u001a\u0107\b\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001"+
		"\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0003\u001b\u0110\b\u001b\u0001"+
		"\u001b\u0001\u001b\u0003\u001b\u0114\b\u001b\u0001\u001b\u0001\u001b\u0003"+
		"\u001b\u0118\b\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0003"+
		"\u001b\u011e\b\u001b\u0001\u001c\u0001\u001c\u0001\u001d\u0001\u001d\u0001"+
		"\u001e\u0001\u001e\u0001\u001e\u0001\u001f\u0001\u001f\u0001\u001f\u0001"+
		"\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0003"+
		"\u001f\u0130\b\u001f\u0001 \u0001 \u0001 \u0001!\u0001!\u0001!\u0001!"+
		"\u0003!\u0139\b!\u0001\"\u0001\"\u0001\"\u0001#\u0001#\u0001$\u0001$\u0001"+
		"$\u0005$\u0143\b$\n$\f$\u0146\t$\u0001$\u0001$\u0001$\u0000\u0000%\u0000"+
		"\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c"+
		"\u001e \"$&(*,.02468:<>@BDFH\u0000\u0007\u0001\u0000\u0002\u0003\u0001"+
		"\u0000\u0005\u0006\u0001\u0000\u0012\u0013\u0001\u0000\u0015\u0017\u0001"+
		"\u0000\u0019\u001a\u0001\u0000%/\u0002\u0000\u0014\u0014!!\u015e\u0000"+
		"M\u0001\u0000\u0000\u0000\u0002c\u0001\u0000\u0000\u0000\u0004g\u0001"+
		"\u0000\u0000\u0000\u0006s\u0001\u0000\u0000\u0000\b\u007f\u0001\u0000"+
		"\u0000\u0000\n\u0089\u0001\u0000\u0000\u0000\f\u00a5\u0001\u0000\u0000"+
		"\u0000\u000e\u00a7\u0001\u0000\u0000\u0000\u0010\u00a9\u0001\u0000\u0000"+
		"\u0000\u0012\u00ad\u0001\u0000\u0000\u0000\u0014\u00af\u0001\u0000\u0000"+
		"\u0000\u0016\u00b1\u0001\u0000\u0000\u0000\u0018\u00bb\u0001\u0000\u0000"+
		"\u0000\u001a\u00ca\u0001\u0000\u0000\u0000\u001c\u00db\u0001\u0000\u0000"+
		"\u0000\u001e\u00dd\u0001\u0000\u0000\u0000 \u00df\u0001\u0000\u0000\u0000"+
		"\"\u00e2\u0001\u0000\u0000\u0000$\u00e4\u0001\u0000\u0000\u0000&\u00e7"+
		"\u0001\u0000\u0000\u0000(\u00e9\u0001\u0000\u0000\u0000*\u00ed\u0001\u0000"+
		"\u0000\u0000,\u00f0\u0001\u0000\u0000\u0000.\u00f3\u0001\u0000\u0000\u0000"+
		"0\u00fb\u0001\u0000\u0000\u00002\u00fd\u0001\u0000\u0000\u00004\u0101"+
		"\u0001\u0000\u0000\u00006\u010b\u0001\u0000\u0000\u00008\u011f\u0001\u0000"+
		"\u0000\u0000:\u0121\u0001\u0000\u0000\u0000<\u0123\u0001\u0000\u0000\u0000"+
		">\u012f\u0001\u0000\u0000\u0000@\u0131\u0001\u0000\u0000\u0000B\u0138"+
		"\u0001\u0000\u0000\u0000D\u013a\u0001\u0000\u0000\u0000F\u013d\u0001\u0000"+
		"\u0000\u0000H\u013f\u0001\u0000\u0000\u0000JL\u0003\u0002\u0001\u0000"+
		"KJ\u0001\u0000\u0000\u0000LO\u0001\u0000\u0000\u0000MK\u0001\u0000\u0000"+
		"\u0000MN\u0001\u0000\u0000\u0000N\u0001\u0001\u0000\u0000\u0000OM\u0001"+
		"\u0000\u0000\u0000Pd\u0003\n\u0005\u0000Qd\u0003\u0010\b\u0000Rd\u0003"+
		"\u0014\n\u0000Sd\u0003\u0016\u000b\u0000Td\u0003\u001a\r\u0000Ud\u0003"+
		" \u0010\u0000Vd\u0003$\u0012\u0000Wd\u0003(\u0014\u0000Xd\u0003*\u0015"+
		"\u0000Yd\u0003,\u0016\u0000Zd\u0003.\u0017\u0000[d\u00032\u0019\u0000"+
		"\\d\u00034\u001a\u0000]d\u00036\u001b\u0000^d\u0003:\u001d\u0000_d\u0003"+
		"<\u001e\u0000`d\u0003@ \u0000ad\u0003D\"\u0000bd\u0003H$\u0000cP\u0001"+
		"\u0000\u0000\u0000cQ\u0001\u0000\u0000\u0000cR\u0001\u0000\u0000\u0000"+
		"cS\u0001\u0000\u0000\u0000cT\u0001\u0000\u0000\u0000cU\u0001\u0000\u0000"+
		"\u0000cV\u0001\u0000\u0000\u0000cW\u0001\u0000\u0000\u0000cX\u0001\u0000"+
		"\u0000\u0000cY\u0001\u0000\u0000\u0000cZ\u0001\u0000\u0000\u0000c[\u0001"+
		"\u0000\u0000\u0000c\\\u0001\u0000\u0000\u0000c]\u0001\u0000\u0000\u0000"+
		"c^\u0001\u0000\u0000\u0000c_\u0001\u0000\u0000\u0000c`\u0001\u0000\u0000"+
		"\u0000ca\u0001\u0000\u0000\u0000cb\u0001\u0000\u0000\u0000d\u0003\u0001"+
		"\u0000\u0000\u0000ef\u0005`\u0000\u0000fh\u0005:\u0000\u0000ge\u0001\u0000"+
		"\u0000\u0000gh\u0001\u0000\u0000\u0000hk\u0001\u0000\u0000\u0000ij\u0005"+
		"`\u0000\u0000jl\u0005;\u0000\u0000ki\u0001\u0000\u0000\u0000kl\u0001\u0000"+
		"\u0000\u0000lo\u0001\u0000\u0000\u0000mn\u0005`\u0000\u0000np\u0005<\u0000"+
		"\u0000om\u0001\u0000\u0000\u0000op\u0001\u0000\u0000\u0000p\u0005\u0001"+
		"\u0000\u0000\u0000qr\u0005`\u0000\u0000rt\u0005=\u0000\u0000sq\u0001\u0000"+
		"\u0000\u0000st\u0001\u0000\u0000\u0000tw\u0001\u0000\u0000\u0000uv\u0005"+
		"`\u0000\u0000vx\u0005>\u0000\u0000wu\u0001\u0000\u0000\u0000wx\u0001\u0000"+
		"\u0000\u0000x{\u0001\u0000\u0000\u0000yz\u0005`\u0000\u0000z|\u0005?\u0000"+
		"\u0000{y\u0001\u0000\u0000\u0000{|\u0001\u0000\u0000\u0000|\u0007\u0001"+
		"\u0000\u0000\u0000}~\u0005`\u0000\u0000~\u0080\u0005@\u0000\u0000\u007f"+
		"}\u0001\u0000\u0000\u0000\u007f\u0080\u0001\u0000\u0000\u0000\u0080\u0083"+
		"\u0001\u0000\u0000\u0000\u0081\u0082\u0005`\u0000\u0000\u0082\u0084\u0005"+
		"A\u0000\u0000\u0083\u0081\u0001\u0000\u0000\u0000\u0083\u0084\u0001\u0000"+
		"\u0000\u0000\u0084\u0087\u0001\u0000\u0000\u0000\u0085\u0086\u0005`\u0000"+
		"\u0000\u0086\u0088\u0005B\u0000\u0000\u0087\u0085\u0001\u0000\u0000\u0000"+
		"\u0087\u0088\u0001\u0000\u0000\u0000\u0088\t\u0001\u0000\u0000\u0000\u0089"+
		"\u008a\u0005\u0001\u0000\u0000\u008a\u008f\u0003\f\u0006\u0000\u008b\u008c"+
		"\u0005N\u0000\u0000\u008c\u008d\u0003\u0004\u0002\u0000\u008d\u008e\u0003"+
		"\u0006\u0003\u0000\u008e\u0090\u0001\u0000\u0000\u0000\u008f\u008b\u0001"+
		"\u0000\u0000\u0000\u008f\u0090\u0001\u0000\u0000\u0000\u0090\u0091\u0001"+
		"\u0000\u0000\u0000\u0091\u0092\u0005M\u0000\u0000\u0092\u0093\u0005`\u0000"+
		"\u0000\u0093\u000b\u0001\u0000\u0000\u0000\u0094\u00a6\u0005I\u0000\u0000"+
		"\u0095\u0098\u0005J\u0000\u0000\u0096\u0097\u0005O\u0000\u0000\u0097\u0099"+
		"\u0005`\u0000\u0000\u0098\u0096\u0001\u0000\u0000\u0000\u0098\u0099\u0001"+
		"\u0000\u0000\u0000\u0099\u00a6\u0001\u0000\u0000\u0000\u009a\u009f\u0003"+
		"\u000e\u0007\u0000\u009b\u009c\u0005K\u0000\u0000\u009c\u00a0\u0003\b"+
		"\u0004\u0000\u009d\u009e\u0005L\u0000\u0000\u009e\u00a0\u0005`\u0000\u0000"+
		"\u009f\u009b\u0001\u0000\u0000\u0000\u009f\u009d\u0001\u0000\u0000\u0000"+
		"\u00a0\u00a3\u0001\u0000\u0000\u0000\u00a1\u00a2\u0005`\u0000\u0000\u00a2"+
		"\u00a4\u0005P\u0000\u0000\u00a3\u00a1\u0001\u0000\u0000\u0000\u00a3\u00a4"+
		"\u0001\u0000\u0000\u0000\u00a4\u00a6\u0001\u0000\u0000\u0000\u00a5\u0094"+
		"\u0001\u0000\u0000\u0000\u00a5\u0095\u0001\u0000\u0000\u0000\u00a5\u009a"+
		"\u0001\u0000\u0000\u0000\u00a6\r\u0001\u0000\u0000\u0000\u00a7\u00a8\u0007"+
		"\u0000\u0000\u0000\u00a8\u000f\u0001\u0000\u0000\u0000\u00a9\u00aa\u0005"+
		"\u0004\u0000\u0000\u00aa\u00ab\u0005`\u0000\u0000\u00ab\u00ac\u0003\u0012"+
		"\t\u0000\u00ac\u0011\u0001\u0000\u0000\u0000\u00ad\u00ae\u0007\u0001\u0000"+
		"\u0000\u00ae\u0013\u0001\u0000\u0000\u0000\u00af\u00b0\u0005\u0007\u0000"+
		"\u0000\u00b0\u0015\u0001\u0000\u0000\u0000\u00b1\u00b9\u0005\b\u0000\u0000"+
		"\u00b2\u00ba\u0003\u0018\f\u0000\u00b3\u00ba\u0005C\u0000\u0000\u00b4"+
		"\u00ba\u0005G\u0000\u0000\u00b5\u00ba\u0005H\u0000\u0000\u00b6\u00ba\u0005"+
		"D\u0000\u0000\u00b7\u00ba\u0005E\u0000\u0000\u00b8\u00ba\u0005F\u0000"+
		"\u0000\u00b9\u00b2\u0001\u0000\u0000\u0000\u00b9\u00b3\u0001\u0000\u0000"+
		"\u0000\u00b9\u00b4\u0001\u0000\u0000\u0000\u00b9\u00b5\u0001\u0000\u0000"+
		"\u0000\u00b9\u00b6\u0001\u0000\u0000\u0000\u00b9\u00b7\u0001\u0000\u0000"+
		"\u0000\u00b9\u00b8\u0001\u0000\u0000\u0000\u00ba\u0017\u0001\u0000\u0000"+
		"\u0000\u00bb\u00bc\u0005Y\u0000\u0000\u00bc\u00bd\u0005\b\u0000\u0000"+
		"\u00bd\u00be\u0005`\u0000\u0000\u00be\u00bf\u0005\t\u0000\u0000\u00bf"+
		"\u00c4\u0005`\u0000\u0000\u00c0\u00c1\u0005\n\u0000\u0000\u00c1\u00c2"+
		"\u0003\u0004\u0002\u0000\u00c2\u00c3\u0003\u0006\u0003\u0000\u00c3\u00c5"+
		"\u0001\u0000\u0000\u0000\u00c4\u00c0\u0001\u0000\u0000\u0000\u00c4\u00c5"+
		"\u0001\u0000\u0000\u0000\u00c5\u00c8\u0001\u0000\u0000\u0000\u00c6\u00c7"+
		"\u0005[\u0000\u0000\u00c7\u00c9\u0005`\u0000\u0000\u00c8\u00c6\u0001\u0000"+
		"\u0000\u0000\u00c8\u00c9\u0001\u0000\u0000\u0000\u00c9\u0019\u0001\u0000"+
		"\u0000\u0000\u00ca\u00cb\u0005\u000b\u0000\u0000\u00cb\u00cc\u0003\u001c"+
		"\u000e\u0000\u00cc\u001b\u0001\u0000\u0000\u0000\u00cd\u00dc\u0005\f\u0000"+
		"\u0000\u00ce\u00dc\u0005\r\u0000\u0000\u00cf\u00d0\u0005\u000e\u0000\u0000"+
		"\u00d0\u00d3\u0003\u0004\u0002\u0000\u00d1\u00d2\u0005U\u0000\u0000\u00d2"+
		"\u00d4\u0005`\u0000\u0000\u00d3\u00d1\u0001\u0000\u0000\u0000\u00d3\u00d4"+
		"\u0001\u0000\u0000\u0000\u00d4\u00dc\u0001\u0000\u0000\u0000\u00d5\u00dc"+
		"\u0005\u000f\u0000\u0000\u00d6\u00d7\u0005\u0010\u0000\u0000\u00d7\u00d8"+
		"\u0003\u001e\u000f\u0000\u00d8\u00d9\u0003\u0004\u0002\u0000\u00d9\u00dc"+
		"\u0001\u0000\u0000\u0000\u00da\u00dc\u0005\u0011\u0000\u0000\u00db\u00cd"+
		"\u0001\u0000\u0000\u0000\u00db\u00ce\u0001\u0000\u0000\u0000\u00db\u00cf"+
		"\u0001\u0000\u0000\u0000\u00db\u00d5\u0001\u0000\u0000\u0000\u00db\u00d6"+
		"\u0001\u0000\u0000\u0000\u00db\u00da\u0001\u0000\u0000\u0000\u00dc\u001d"+
		"\u0001\u0000\u0000\u0000\u00dd\u00de\u0007\u0002\u0000\u0000\u00de\u001f"+
		"\u0001\u0000\u0000\u0000\u00df\u00e0\u0005\u0014\u0000\u0000\u00e0\u00e1"+
		"\u0003\"\u0011\u0000\u00e1!\u0001\u0000\u0000\u0000\u00e2\u00e3\u0007"+
		"\u0003\u0000\u0000\u00e3#\u0001\u0000\u0000\u0000\u00e4\u00e5\u0005\u0018"+
		"\u0000\u0000\u00e5\u00e6\u0003&\u0013\u0000\u00e6%\u0001\u0000\u0000\u0000"+
		"\u00e7\u00e8\u0007\u0004\u0000\u0000\u00e8\'\u0001\u0000\u0000\u0000\u00e9"+
		"\u00ea\u0005\u001b\u0000\u0000\u00ea\u00eb\u0005\u001c\u0000\u0000\u00eb"+
		"\u00ec\u0005`\u0000\u0000\u00ec)\u0001\u0000\u0000\u0000\u00ed\u00ee\u0005"+
		"\u001d\u0000\u0000\u00ee\u00ef\u0003\u0004\u0002\u0000\u00ef+\u0001\u0000"+
		"\u0000\u0000\u00f0\u00f1\u0005\u001e\u0000\u0000\u00f1\u00f2\u0003\u0004"+
		"\u0002\u0000\u00f2-\u0001\u0000\u0000\u0000\u00f3\u00f4\u0005\u001f\u0000"+
		"\u0000\u00f4\u00f5\u00030\u0018\u0000\u00f5/\u0001\u0000\u0000\u0000\u00f6"+
		"\u00fc\u0005C\u0000\u0000\u00f7\u00f8\u0003\u0004\u0002\u0000\u00f8\u00f9"+
		"\u0005 \u0000\u0000\u00f9\u00fa\u0005`\u0000\u0000\u00fa\u00fc\u0001\u0000"+
		"\u0000\u0000\u00fb\u00f6\u0001\u0000\u0000\u0000\u00fb\u00f7\u0001\u0000"+
		"\u0000\u0000\u00fc1\u0001\u0000\u0000\u0000\u00fd\u00fe\u0005!\u0000\u0000"+
		"\u00fe\u00ff\u0005`\u0000\u0000\u00ff\u0100\u0003\u0004\u0002\u0000\u0100"+
		"3\u0001\u0000\u0000\u0000\u0101\u0102\u0005\"\u0000\u0000\u0102\u0103"+
		"\u0005L\u0000\u0000\u0103\u0106\u0005`\u0000\u0000\u0104\u0105\u0005U"+
		"\u0000\u0000\u0105\u0107\u0005`\u0000\u0000\u0106\u0104\u0001\u0000\u0000"+
		"\u0000\u0106\u0107\u0001\u0000\u0000\u0000\u0107\u0108\u0001\u0000\u0000"+
		"\u0000\u0108\u0109\u0005#\u0000\u0000\u0109\u010a\u0005`\u0000\u0000\u010a"+
		"5\u0001\u0000\u0000\u0000\u010b\u010c\u0005$\u0000\u0000\u010c\u010f\u0003"+
		"8\u001c\u0000\u010d\u010e\u0005\u0019\u0000\u0000\u010e\u0110\u0003\u0004"+
		"\u0002\u0000\u010f\u010d\u0001\u0000\u0000\u0000\u010f\u0110\u0001\u0000"+
		"\u0000\u0000\u0110\u0113\u0001\u0000\u0000\u0000\u0111\u0112\u0005Q\u0000"+
		"\u0000\u0112\u0114\u0005`\u0000\u0000\u0113\u0111\u0001\u0000\u0000\u0000"+
		"\u0113\u0114\u0001\u0000\u0000\u0000\u0114\u0117\u0001\u0000\u0000\u0000"+
		"\u0115\u0116\u0005R\u0000\u0000\u0116\u0118\u0005`\u0000\u0000\u0117\u0115"+
		"\u0001\u0000\u0000\u0000\u0117\u0118\u0001\u0000\u0000\u0000\u0118\u0119"+
		"\u0001\u0000\u0000\u0000\u0119\u011a\u0005S\u0000\u0000\u011a\u011d\u0005"+
		"`\u0000\u0000\u011b\u011c\u0005T\u0000\u0000\u011c\u011e\u0005`\u0000"+
		"\u0000\u011d\u011b\u0001\u0000\u0000\u0000\u011d\u011e\u0001\u0000\u0000"+
		"\u0000\u011e7\u0001\u0000\u0000\u0000\u011f\u0120\u0007\u0005\u0000\u0000"+
		"\u01209\u0001\u0000\u0000\u0000\u0121\u0122\u00050\u0000\u0000\u0122;"+
		"\u0001\u0000\u0000\u0000\u0123\u0124\u00051\u0000\u0000\u0124\u0125\u0003"+
		">\u001f\u0000\u0125=\u0001\u0000\u0000\u0000\u0126\u0127\u0005V\u0000"+
		"\u0000\u0127\u0128\u0005`\u0000\u0000\u0128\u0130\u00052\u0000\u0000\u0129"+
		"\u012a\u0005W\u0000\u0000\u012a\u012b\u0005`\u0000\u0000\u012b\u0130\u0005"+
		"3\u0000\u0000\u012c\u012d\u0005X\u0000\u0000\u012d\u012e\u0005`\u0000"+
		"\u0000\u012e\u0130\u00054\u0000\u0000\u012f\u0126\u0001\u0000\u0000\u0000"+
		"\u012f\u0129\u0001\u0000\u0000\u0000\u012f\u012c\u0001\u0000\u0000\u0000"+
		"\u0130?\u0001\u0000\u0000\u0000\u0131\u0132\u00055\u0000\u0000\u0132\u0133"+
		"\u0003B!\u0000\u0133A\u0001\u0000\u0000\u0000\u0134\u0135\u0005Y\u0000"+
		"\u0000\u0135\u0136\u0005`\u0000\u0000\u0136\u0139\u00056\u0000\u0000\u0137"+
		"\u0139\u0005Z\u0000\u0000\u0138\u0134\u0001\u0000\u0000\u0000\u0138\u0137"+
		"\u0001\u0000\u0000\u0000\u0139C\u0001\u0000\u0000\u0000\u013a\u013b\u0005"+
		"7\u0000\u0000\u013b\u013c\u0003F#\u0000\u013cE\u0001\u0000\u0000\u0000"+
		"\u013d\u013e\u0007\u0006\u0000\u0000\u013eG\u0001\u0000\u0000\u0000\u013f"+
		"\u0144\u00058\u0000\u0000\u0140\u0141\u0005\\\u0000\u0000\u0141\u0143"+
		"\u0005]\u0000\u0000\u0142\u0140\u0001\u0000\u0000\u0000\u0143\u0146\u0001"+
		"\u0000\u0000\u0000\u0144\u0142\u0001\u0000\u0000\u0000\u0144\u0145\u0001"+
		"\u0000\u0000\u0000\u0145\u0147\u0001\u0000\u0000\u0000\u0146\u0144\u0001"+
		"\u0000\u0000\u0000\u0147\u0148\u00059\u0000\u0000\u0148I\u0001\u0000\u0000"+
		"\u0000\u001eMcgkosw{\u007f\u0083\u0087\u008f\u0098\u009f\u00a3\u00a5\u00b9"+
		"\u00c4\u00c8\u00d3\u00db\u00fb\u0106\u010f\u0113\u0117\u011d\u012f\u0138"+
		"\u0144";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}