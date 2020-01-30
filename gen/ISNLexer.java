// Generated from C:/Users/Henrique/UMinho/1Ano2019/1Semestre/Gramaticas/ProjetoGramaticas/src\ISN.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ISNLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, DATA=2, INT=3, TEXT=4, WS=5, AT=6, DOT=7, COLON=8, COMMA=9, SEMI=10, 
		LPAREN=11, RPAREN=12, LBRACKET=13, RBRACKET=14, QUOTE=15;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "DATA", "INT", "TEXT", "WS", "AT", "DOT", "COLON", "COMMA", "SEMI", 
			"LPAREN", "RPAREN", "LBRACKET", "RBRACKET", "QUOTE"
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


	public ISNLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "ISN.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\21a\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3"+
		"\4\7\49\n\4\f\4\16\4<\13\4\3\5\3\5\7\5@\n\5\f\5\16\5C\13\5\3\5\3\5\3\6"+
		"\6\6H\n\6\r\6\16\6I\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13"+
		"\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\2\2\21\3\3\5\4\7\5\t\6"+
		"\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21\3\2\5\3\2"+
		"\62;\3\2$$\5\2\13\f\17\17\"\"\2c\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2"+
		"\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2"+
		"\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2"+
		"\2\37\3\2\2\2\3!\3\2\2\2\5+\3\2\2\2\7\66\3\2\2\2\t=\3\2\2\2\13G\3\2\2"+
		"\2\rM\3\2\2\2\17O\3\2\2\2\21Q\3\2\2\2\23S\3\2\2\2\25U\3\2\2\2\27W\3\2"+
		"\2\2\31Y\3\2\2\2\33[\3\2\2\2\35]\3\2\2\2\37_\3\2\2\2!\"\7T\2\2\"#\7g\2"+
		"\2#$\7i\2\2$%\7k\2\2%&\7u\2\2&\'\7v\2\2\'(\7g\2\2()\7t\2\2)*\7u\2\2*\4"+
		"\3\2\2\2+,\t\2\2\2,-\t\2\2\2-.\t\2\2\2./\t\2\2\2/\60\7/\2\2\60\61\t\2"+
		"\2\2\61\62\t\2\2\2\62\63\7/\2\2\63\64\t\2\2\2\64\65\t\2\2\2\65\6\3\2\2"+
		"\2\66:\t\2\2\2\679\t\2\2\28\67\3\2\2\29<\3\2\2\2:8\3\2\2\2:;\3\2\2\2;"+
		"\b\3\2\2\2<:\3\2\2\2=A\7$\2\2>@\n\3\2\2?>\3\2\2\2@C\3\2\2\2A?\3\2\2\2"+
		"AB\3\2\2\2BD\3\2\2\2CA\3\2\2\2DE\7$\2\2E\n\3\2\2\2FH\t\4\2\2GF\3\2\2\2"+
		"HI\3\2\2\2IG\3\2\2\2IJ\3\2\2\2JK\3\2\2\2KL\b\6\2\2L\f\3\2\2\2MN\7B\2\2"+
		"N\16\3\2\2\2OP\7\60\2\2P\20\3\2\2\2QR\7<\2\2R\22\3\2\2\2ST\7.\2\2T\24"+
		"\3\2\2\2UV\7=\2\2V\26\3\2\2\2WX\7*\2\2X\30\3\2\2\2YZ\7+\2\2Z\32\3\2\2"+
		"\2[\\\7]\2\2\\\34\3\2\2\2]^\7_\2\2^\36\3\2\2\2_`\7$\2\2` \3\2\2\2\6\2"+
		":AI\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}