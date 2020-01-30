// Generated from C:/Users/Henrique/UMinho/1Ano2019/1Semestre/Gramaticas/ProjetoGramaticas/src\ISN.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ISNParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, DATA=2, INT=3, TEXT=4, WS=5, AT=6, DOT=7, COLON=8, COMMA=9, SEMI=10, 
		LPAREN=11, RPAREN=12, LBRACKET=13, RBRACKET=14, QUOTE=15;
	public static final int
		RULE_registers = 0, RULE_register = 1, RULE_user = 2, RULE_info = 3;
	private static String[] makeRuleNames() {
		return new String[] {
			"registers", "register", "user", "info"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'Registers'", null, null, null, null, "'@'", "'.'", "':'", "','", 
			"';'", "'('", "')'", "'['", "']'", "'\"'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "DATA", "INT", "TEXT", "WS", "AT", "DOT", "COLON", "COMMA", 
			"SEMI", "LPAREN", "RPAREN", "LBRACKET", "RBRACKET", "QUOTE"
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
	public String getGrammarFileName() { return "ISN.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ISNParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class RegistersContext extends ParserRuleContext {
		public TerminalNode LBRACKET() { return getToken(ISNParser.LBRACKET, 0); }
		public TerminalNode RBRACKET() { return getToken(ISNParser.RBRACKET, 0); }
		public List<RegisterContext> register() {
			return getRuleContexts(RegisterContext.class);
		}
		public RegisterContext register(int i) {
			return getRuleContext(RegisterContext.class,i);
		}
		public RegistersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_registers; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ISNListener ) ((ISNListener)listener).enterRegisters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ISNListener ) ((ISNListener)listener).exitRegisters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ISNVisitor ) return ((ISNVisitor<? extends T>)visitor).visitRegisters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RegistersContext registers() throws RecognitionException {
		RegistersContext _localctx = new RegistersContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_registers);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(8);
			match(T__0);
			setState(9);
			match(LBRACKET);
			setState(11); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(10);
				register();
				}
				}
				setState(13); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==INT );
			setState(15);
			match(RBRACKET);
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

	public static class RegisterContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(ISNParser.INT, 0); }
		public TerminalNode LPAREN() { return getToken(ISNParser.LPAREN, 0); }
		public UserContext user() {
			return getRuleContext(UserContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(ISNParser.RPAREN, 0); }
		public RegisterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_register; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ISNListener ) ((ISNListener)listener).enterRegister(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ISNListener ) ((ISNListener)listener).exitRegister(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ISNVisitor ) return ((ISNVisitor<? extends T>)visitor).visitRegister(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RegisterContext register() throws RecognitionException {
		RegisterContext _localctx = new RegisterContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_register);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(17);
			match(INT);
			setState(18);
			match(LPAREN);
			setState(19);
			user();
			setState(20);
			match(RPAREN);
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

	public static class UserContext extends ParserRuleContext {
		public List<InfoContext> info() {
			return getRuleContexts(InfoContext.class);
		}
		public InfoContext info(int i) {
			return getRuleContext(InfoContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ISNParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ISNParser.COMMA, i);
		}
		public UserContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_user; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ISNListener ) ((ISNListener)listener).enterUser(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ISNListener ) ((ISNListener)listener).exitUser(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ISNVisitor ) return ((ISNVisitor<? extends T>)visitor).visitUser(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UserContext user() throws RecognitionException {
		UserContext _localctx = new UserContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_user);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(22);
			info();
			setState(23);
			match(COMMA);
			setState(24);
			info();
			setState(25);
			match(COMMA);
			setState(26);
			info();
			setState(27);
			match(COMMA);
			setState(28);
			info();
			setState(29);
			match(COMMA);
			setState(30);
			info();
			setState(31);
			match(COMMA);
			setState(32);
			info();
			setState(33);
			match(COMMA);
			setState(34);
			info();
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

	public static class InfoContext extends ParserRuleContext {
		public TerminalNode TEXT() { return getToken(ISNParser.TEXT, 0); }
		public TerminalNode DATA() { return getToken(ISNParser.DATA, 0); }
		public InfoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_info; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ISNListener ) ((ISNListener)listener).enterInfo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ISNListener ) ((ISNListener)listener).exitInfo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ISNVisitor ) return ((ISNVisitor<? extends T>)visitor).visitInfo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InfoContext info() throws RecognitionException {
		InfoContext _localctx = new InfoContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_info);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(36);
			_la = _input.LA(1);
			if ( !(_la==DATA || _la==TEXT) ) {
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\21)\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\3\2\3\2\3\2\6\2\16\n\2\r\2\16\2\17\3\2\3\2\3\3\3\3"+
		"\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\5\3\5\3\5\2\2\6\2\4\6\b\2\3\4\2\4\4\6\6\2%\2\n\3\2\2\2\4\23\3\2\2\2\6"+
		"\30\3\2\2\2\b&\3\2\2\2\n\13\7\3\2\2\13\r\7\17\2\2\f\16\5\4\3\2\r\f\3\2"+
		"\2\2\16\17\3\2\2\2\17\r\3\2\2\2\17\20\3\2\2\2\20\21\3\2\2\2\21\22\7\20"+
		"\2\2\22\3\3\2\2\2\23\24\7\5\2\2\24\25\7\r\2\2\25\26\5\6\4\2\26\27\7\16"+
		"\2\2\27\5\3\2\2\2\30\31\5\b\5\2\31\32\7\13\2\2\32\33\5\b\5\2\33\34\7\13"+
		"\2\2\34\35\5\b\5\2\35\36\7\13\2\2\36\37\5\b\5\2\37 \7\13\2\2 !\5\b\5\2"+
		"!\"\7\13\2\2\"#\5\b\5\2#$\7\13\2\2$%\5\b\5\2%\7\3\2\2\2&\'\t\2\2\2\'\t"+
		"\3\2\2\2\3\17";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}