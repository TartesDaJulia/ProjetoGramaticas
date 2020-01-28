// Generated from C:/Users/Henrique/IdeaProjects/Teste2020/src\Drawing.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class DrawingParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, INT=13, WS=14;
	public static final int
		RULE_drawing = 0, RULE_canvas = 1, RULE_figures = 2, RULE_figure = 3, 
		RULE_rectangle = 4, RULE_triangle = 5, RULE_circle = 6, RULE_center = 7;
	private static String[] makeRuleNames() {
		return new String[] {
			"drawing", "canvas", "figures", "figure", "rectangle", "triangle", "circle", 
			"center"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'canvas'", "':'", "'x'", "'--drawing--'", "';'", "'rec'", "'@'", 
			"'tri'", "'cir'", "'('", "','", "')'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, "INT", "WS"
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
	public String getGrammarFileName() { return "Drawing.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public DrawingParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class DrawingContext extends ParserRuleContext {
		public CanvasContext canvas() {
			return getRuleContext(CanvasContext.class,0);
		}
		public FiguresContext figures() {
			return getRuleContext(FiguresContext.class,0);
		}
		public DrawingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_drawing; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DrawingListener ) ((DrawingListener)listener).enterDrawing(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DrawingListener ) ((DrawingListener)listener).exitDrawing(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DrawingVisitor ) return ((DrawingVisitor<? extends T>)visitor).visitDrawing(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DrawingContext drawing() throws RecognitionException {
		DrawingContext _localctx = new DrawingContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_drawing);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(16);
			canvas();
			setState(17);
			figures();
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

	public static class CanvasContext extends ParserRuleContext {
		public List<TerminalNode> INT() { return getTokens(DrawingParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(DrawingParser.INT, i);
		}
		public CanvasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_canvas; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DrawingListener ) ((DrawingListener)listener).enterCanvas(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DrawingListener ) ((DrawingListener)listener).exitCanvas(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DrawingVisitor ) return ((DrawingVisitor<? extends T>)visitor).visitCanvas(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CanvasContext canvas() throws RecognitionException {
		CanvasContext _localctx = new CanvasContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_canvas);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(19);
			match(T__0);
			setState(20);
			match(T__1);
			setState(21);
			match(INT);
			setState(22);
			match(T__2);
			setState(23);
			match(INT);
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

	public static class FiguresContext extends ParserRuleContext {
		public List<FigureContext> figure() {
			return getRuleContexts(FigureContext.class);
		}
		public FigureContext figure(int i) {
			return getRuleContext(FigureContext.class,i);
		}
		public FiguresContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_figures; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DrawingListener ) ((DrawingListener)listener).enterFigures(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DrawingListener ) ((DrawingListener)listener).exitFigures(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DrawingVisitor ) return ((DrawingVisitor<? extends T>)visitor).visitFigures(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FiguresContext figures() throws RecognitionException {
		FiguresContext _localctx = new FiguresContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_figures);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(25);
			match(T__3);
			setState(26);
			figure();
			setState(27);
			match(T__4);
			setState(33);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__7) | (1L << T__8))) != 0)) {
				{
				{
				setState(28);
				figure();
				setState(29);
				match(T__4);
				}
				}
				setState(35);
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

	public static class FigureContext extends ParserRuleContext {
		public RectangleContext rectangle() {
			return getRuleContext(RectangleContext.class,0);
		}
		public TriangleContext triangle() {
			return getRuleContext(TriangleContext.class,0);
		}
		public CircleContext circle() {
			return getRuleContext(CircleContext.class,0);
		}
		public FigureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_figure; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DrawingListener ) ((DrawingListener)listener).enterFigure(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DrawingListener ) ((DrawingListener)listener).exitFigure(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DrawingVisitor ) return ((DrawingVisitor<? extends T>)visitor).visitFigure(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FigureContext figure() throws RecognitionException {
		FigureContext _localctx = new FigureContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_figure);
		try {
			setState(39);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
				enterOuterAlt(_localctx, 1);
				{
				setState(36);
				rectangle();
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 2);
				{
				setState(37);
				triangle();
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 3);
				{
				setState(38);
				circle();
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

	public static class RectangleContext extends ParserRuleContext {
		public List<TerminalNode> INT() { return getTokens(DrawingParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(DrawingParser.INT, i);
		}
		public CenterContext center() {
			return getRuleContext(CenterContext.class,0);
		}
		public RectangleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rectangle; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DrawingListener ) ((DrawingListener)listener).enterRectangle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DrawingListener ) ((DrawingListener)listener).exitRectangle(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DrawingVisitor ) return ((DrawingVisitor<? extends T>)visitor).visitRectangle(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RectangleContext rectangle() throws RecognitionException {
		RectangleContext _localctx = new RectangleContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_rectangle);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(41);
			match(T__5);
			setState(42);
			match(INT);
			setState(43);
			match(T__2);
			setState(44);
			match(INT);
			setState(45);
			match(T__6);
			setState(46);
			center();
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

	public static class TriangleContext extends ParserRuleContext {
		public List<TerminalNode> INT() { return getTokens(DrawingParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(DrawingParser.INT, i);
		}
		public CenterContext center() {
			return getRuleContext(CenterContext.class,0);
		}
		public TriangleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_triangle; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DrawingListener ) ((DrawingListener)listener).enterTriangle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DrawingListener ) ((DrawingListener)listener).exitTriangle(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DrawingVisitor ) return ((DrawingVisitor<? extends T>)visitor).visitTriangle(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TriangleContext triangle() throws RecognitionException {
		TriangleContext _localctx = new TriangleContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_triangle);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			match(T__7);
			setState(49);
			match(INT);
			setState(50);
			match(T__2);
			setState(51);
			match(INT);
			setState(52);
			match(T__6);
			setState(53);
			center();
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

	public static class CircleContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(DrawingParser.INT, 0); }
		public CenterContext center() {
			return getRuleContext(CenterContext.class,0);
		}
		public CircleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_circle; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DrawingListener ) ((DrawingListener)listener).enterCircle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DrawingListener ) ((DrawingListener)listener).exitCircle(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DrawingVisitor ) return ((DrawingVisitor<? extends T>)visitor).visitCircle(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CircleContext circle() throws RecognitionException {
		CircleContext _localctx = new CircleContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_circle);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(55);
			match(T__8);
			setState(56);
			match(INT);
			setState(57);
			match(T__6);
			setState(58);
			center();
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

	public static class CenterContext extends ParserRuleContext {
		public List<TerminalNode> INT() { return getTokens(DrawingParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(DrawingParser.INT, i);
		}
		public CenterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_center; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DrawingListener ) ((DrawingListener)listener).enterCenter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DrawingListener ) ((DrawingListener)listener).exitCenter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DrawingVisitor ) return ((DrawingVisitor<? extends T>)visitor).visitCenter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CenterContext center() throws RecognitionException {
		CenterContext _localctx = new CenterContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_center);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			match(T__9);
			setState(61);
			match(INT);
			setState(62);
			match(T__10);
			setState(63);
			match(INT);
			setState(64);
			match(T__11);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\20E\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\3\2\3\2\3\2\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\7\4\"\n\4\f\4\16\4%\13\4\3\5"+
		"\3\5\3\5\5\5*\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\2\2\n\2\4\6\b\n\f"+
		"\16\20\2\2\2?\2\22\3\2\2\2\4\25\3\2\2\2\6\33\3\2\2\2\b)\3\2\2\2\n+\3\2"+
		"\2\2\f\62\3\2\2\2\169\3\2\2\2\20>\3\2\2\2\22\23\5\4\3\2\23\24\5\6\4\2"+
		"\24\3\3\2\2\2\25\26\7\3\2\2\26\27\7\4\2\2\27\30\7\17\2\2\30\31\7\5\2\2"+
		"\31\32\7\17\2\2\32\5\3\2\2\2\33\34\7\6\2\2\34\35\5\b\5\2\35#\7\7\2\2\36"+
		"\37\5\b\5\2\37 \7\7\2\2 \"\3\2\2\2!\36\3\2\2\2\"%\3\2\2\2#!\3\2\2\2#$"+
		"\3\2\2\2$\7\3\2\2\2%#\3\2\2\2&*\5\n\6\2\'*\5\f\7\2(*\5\16\b\2)&\3\2\2"+
		"\2)\'\3\2\2\2)(\3\2\2\2*\t\3\2\2\2+,\7\b\2\2,-\7\17\2\2-.\7\5\2\2./\7"+
		"\17\2\2/\60\7\t\2\2\60\61\5\20\t\2\61\13\3\2\2\2\62\63\7\n\2\2\63\64\7"+
		"\17\2\2\64\65\7\5\2\2\65\66\7\17\2\2\66\67\7\t\2\2\678\5\20\t\28\r\3\2"+
		"\2\29:\7\13\2\2:;\7\17\2\2;<\7\t\2\2<=\5\20\t\2=\17\3\2\2\2>?\7\f\2\2"+
		"?@\7\17\2\2@A\7\r\2\2AB\7\17\2\2BC\7\16\2\2C\21\3\2\2\2\4#)";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}