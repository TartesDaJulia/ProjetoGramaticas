// Generated from C:/Users/Henrique/IdeaProjects/TinyC/src\TinyCLexer.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class TinyCLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		IF=1, ELSE=2, WHILE=3, DO=4, FUNCTION=5, SEMI=6, COMMA=7, LCURLY=8, RCURLY=9, 
		LPAREN=10, RPAREN=11, ASSIGN=12, LT=13, PLUS=14, MINUS=15, STRING=16, 
		INT=17, WS=18;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"IF", "ELSE", "WHILE", "DO", "FUNCTION", "SEMI", "COMMA", "LCURLY", "RCURLY", 
			"LPAREN", "RPAREN", "ASSIGN", "LT", "PLUS", "MINUS", "STRING", "INT", 
			"WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'if'", "'else'", "'while'", "'do'", "'function'", "';'", "','", 
			"'{'", "'}'", "'('", "')'", "'='", "'<'", "'+'", "'-'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "IF", "ELSE", "WHILE", "DO", "FUNCTION", "SEMI", "COMMA", "LCURLY", 
			"RCURLY", "LPAREN", "RPAREN", "ASSIGN", "LT", "PLUS", "MINUS", "STRING", 
			"INT", "WS"
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


	public TinyCLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "TinyCLexer.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\24c\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5"+
		"\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3"+
		"\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\6"+
		"\21W\n\21\r\21\16\21X\3\22\6\22\\\n\22\r\22\16\22]\3\23\3\23\3\23\3\23"+
		"\2\2\24\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17"+
		"\35\20\37\21!\22#\23%\24\3\2\5\3\2c|\3\2\62;\5\2\13\f\17\17\"\"\2d\2\3"+
		"\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2"+
		"\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31"+
		"\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2"+
		"\2%\3\2\2\2\3\'\3\2\2\2\5*\3\2\2\2\7/\3\2\2\2\t\65\3\2\2\2\138\3\2\2\2"+
		"\rA\3\2\2\2\17C\3\2\2\2\21E\3\2\2\2\23G\3\2\2\2\25I\3\2\2\2\27K\3\2\2"+
		"\2\31M\3\2\2\2\33O\3\2\2\2\35Q\3\2\2\2\37S\3\2\2\2!V\3\2\2\2#[\3\2\2\2"+
		"%_\3\2\2\2\'(\7k\2\2()\7h\2\2)\4\3\2\2\2*+\7g\2\2+,\7n\2\2,-\7u\2\2-."+
		"\7g\2\2.\6\3\2\2\2/\60\7y\2\2\60\61\7j\2\2\61\62\7k\2\2\62\63\7n\2\2\63"+
		"\64\7g\2\2\64\b\3\2\2\2\65\66\7f\2\2\66\67\7q\2\2\67\n\3\2\2\289\7h\2"+
		"\29:\7w\2\2:;\7p\2\2;<\7e\2\2<=\7v\2\2=>\7k\2\2>?\7q\2\2?@\7p\2\2@\f\3"+
		"\2\2\2AB\7=\2\2B\16\3\2\2\2CD\7.\2\2D\20\3\2\2\2EF\7}\2\2F\22\3\2\2\2"+
		"GH\7\177\2\2H\24\3\2\2\2IJ\7*\2\2J\26\3\2\2\2KL\7+\2\2L\30\3\2\2\2MN\7"+
		"?\2\2N\32\3\2\2\2OP\7>\2\2P\34\3\2\2\2QR\7-\2\2R\36\3\2\2\2ST\7/\2\2T"+
		" \3\2\2\2UW\t\2\2\2VU\3\2\2\2WX\3\2\2\2XV\3\2\2\2XY\3\2\2\2Y\"\3\2\2\2"+
		"Z\\\t\3\2\2[Z\3\2\2\2\\]\3\2\2\2][\3\2\2\2]^\3\2\2\2^$\3\2\2\2_`\t\4\2"+
		"\2`a\3\2\2\2ab\b\23\2\2b&\3\2\2\2\5\2X]\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}