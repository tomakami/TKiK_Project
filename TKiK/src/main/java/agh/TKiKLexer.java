// Generated from TKiK.g4 by ANTLR 4.9.2
package agh;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class TKiKLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		BOOL=1, CHAR=2, DOUBLE=3, FLOAT=4, INT=5, STRING=6, VOID=7, BOOLEAN=8, 
		FALSE=9, TRUE=10, BREAK=11, CONTINUE=12, RETURN=13, FOR=14, ELSE=15, IF=16, 
		WHILE=17, CIN=18, COUT=19, USING=20, INCLUDE=21, NAMESPACE=22, STD=23, 
		LEFTPAREN=24, RIGHTPAREN=25, LEFTBRACKET=26, RIGHTBRACKET=27, LEFTBRACE=28, 
		RIGHTBRACE=29, PLUS=30, MINUS=31, STAR=32, DIV=33, MOD=34, ASSIGN=35, 
		LESS=36, GREATER=37, EQUALS=38, NOTEQUALS=39, LESSEQUALS=40, GREATEREQUALS=41, 
		PLUSPLUS=42, MINUSMINUS=43, DIVASSIGN=44, MODASSIGN=45, MULASSIGN=46, 
		AND=47, OR=48, COMMA=49, QUESTION=50, EXCLAMATION=51, COLON=52, SEMI=53, 
		DOT=54, QUOTE=55, NUMBER=56, ID=57, NONDIGIT=58, DIGIT=59, NONZERODIGIT=60, 
		CHARACTER=61, TEXT=62, NATURAL=63, WHITESPACE=64, NEWLINE=65, BLOCKCOMMENT=66, 
		LINECOMMENT=67;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"BOOL", "CHAR", "DOUBLE", "FLOAT", "INT", "STRING", "VOID", "BOOLEAN", 
			"FALSE", "TRUE", "BREAK", "CONTINUE", "RETURN", "FOR", "ELSE", "IF", 
			"WHILE", "CIN", "COUT", "USING", "INCLUDE", "NAMESPACE", "STD", "LEFTPAREN", 
			"RIGHTPAREN", "LEFTBRACKET", "RIGHTBRACKET", "LEFTBRACE", "RIGHTBRACE", 
			"PLUS", "MINUS", "STAR", "DIV", "MOD", "ASSIGN", "LESS", "GREATER", "EQUALS", 
			"NOTEQUALS", "LESSEQUALS", "GREATEREQUALS", "PLUSPLUS", "MINUSMINUS", 
			"DIVASSIGN", "MODASSIGN", "MULASSIGN", "AND", "OR", "COMMA", "QUESTION", 
			"EXCLAMATION", "COLON", "SEMI", "DOT", "QUOTE", "NUMBER", "ID", "NONDIGIT", 
			"DIGIT", "NONZERODIGIT", "CHARACTER", "TEXT", "NATURAL", "SIGN", "Digitsequence", 
			"WHITESPACE", "NEWLINE", "BLOCKCOMMENT", "LINECOMMENT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'bool'", "'char'", "'double'", "'float'", "'int'", "'string'", 
			"'void'", null, "'false'", "'true'", "'break'", "'continue'", "'return'", 
			"'for'", "'else'", "'if'", "'while'", "'cin'", "'cout'", "'using'", "'#include <'", 
			"'namespace'", "'std;'", "'('", "')'", "'['", "']'", "'{'", "'}'", "'+'", 
			"'-'", "'*'", "'/'", "'%'", "'='", "'<'", "'>'", "'=='", "'!='", "'<='", 
			"'>='", "'++'", "'--'", "'/='", "'%='", "'*='", "'&&'", "'||'", "','", 
			"'?'", "'!'", "':'", "';'", "'.'", "'\"'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "BOOL", "CHAR", "DOUBLE", "FLOAT", "INT", "STRING", "VOID", "BOOLEAN", 
			"FALSE", "TRUE", "BREAK", "CONTINUE", "RETURN", "FOR", "ELSE", "IF", 
			"WHILE", "CIN", "COUT", "USING", "INCLUDE", "NAMESPACE", "STD", "LEFTPAREN", 
			"RIGHTPAREN", "LEFTBRACKET", "RIGHTBRACKET", "LEFTBRACE", "RIGHTBRACE", 
			"PLUS", "MINUS", "STAR", "DIV", "MOD", "ASSIGN", "LESS", "GREATER", "EQUALS", 
			"NOTEQUALS", "LESSEQUALS", "GREATEREQUALS", "PLUSPLUS", "MINUSMINUS", 
			"DIVASSIGN", "MODASSIGN", "MULASSIGN", "AND", "OR", "COMMA", "QUESTION", 
			"EXCLAMATION", "COLON", "SEMI", "DOT", "QUOTE", "NUMBER", "ID", "NONDIGIT", 
			"DIGIT", "NONZERODIGIT", "CHARACTER", "TEXT", "NATURAL", "WHITESPACE", 
			"NEWLINE", "BLOCKCOMMENT", "LINECOMMENT"
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


	public TKiKLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "TKiK.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2E\u01c2\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\3\2\3\2\3\2\3\2"+
		"\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b"+
		"\3\t\3\t\5\t\u00b7\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20"+
		"\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\24"+
		"\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33"+
		"\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3$"+
		"\3$\3%\3%\3&\3&\3\'\3\'\3\'\3(\3(\3(\3)\3)\3)\3*\3*\3*\3+\3+\3+\3,\3,"+
		"\3,\3-\3-\3-\3.\3.\3.\3/\3/\3/\3\60\3\60\3\60\3\61\3\61\3\61\3\62\3\62"+
		"\3\63\3\63\3\64\3\64\3\65\3\65\3\66\3\66\3\67\3\67\38\38\39\59\u0161\n"+
		"9\39\39\39\39\39\59\u0168\n9\3:\3:\7:\u016c\n:\f:\16:\u016f\13:\3;\3;"+
		"\3<\3<\3=\3=\3>\3>\5>\u0179\n>\3?\3?\7?\u017d\n?\f?\16?\u0180\13?\3?\3"+
		"?\3@\3@\3@\7@\u0187\n@\f@\16@\u018a\13@\5@\u018c\n@\3A\3A\3B\3B\5B\u0192"+
		"\nB\3B\7B\u0195\nB\fB\16B\u0198\13B\3C\6C\u019b\nC\rC\16C\u019c\3C\3C"+
		"\3D\3D\5D\u01a3\nD\3D\5D\u01a6\nD\3D\3D\3E\3E\3E\3E\7E\u01ae\nE\fE\16"+
		"E\u01b1\13E\3E\3E\3E\3E\3E\3F\3F\3F\3F\7F\u01bc\nF\fF\16F\u01bf\13F\3"+
		"F\3F\3\u01af\2G\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31"+
		"\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65"+
		"\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64"+
		"g\65i\66k\67m8o9q:s;u<w=y>{?}@\177A\u0081\2\u0083\2\u0085B\u0087C\u0089"+
		"D\u008bE\3\2\n\5\2C\\aac|\6\2\62;C\\aac|\3\2\62;\3\2\63;\3\2\62\62\4\2"+
		"--//\4\2\13\13\"\"\4\2\f\f\17\17\2\u01ce\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3"+
		"\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2"+
		"\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35"+
		"\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)"+
		"\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2"+
		"\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2"+
		"A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3"+
		"\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2"+
		"\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2"+
		"g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3"+
		"\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177\3"+
		"\2\2\2\2\u0085\3\2\2\2\2\u0087\3\2\2\2\2\u0089\3\2\2\2\2\u008b\3\2\2\2"+
		"\3\u008d\3\2\2\2\5\u0092\3\2\2\2\7\u0097\3\2\2\2\t\u009e\3\2\2\2\13\u00a4"+
		"\3\2\2\2\r\u00a8\3\2\2\2\17\u00af\3\2\2\2\21\u00b6\3\2\2\2\23\u00b8\3"+
		"\2\2\2\25\u00be\3\2\2\2\27\u00c3\3\2\2\2\31\u00c9\3\2\2\2\33\u00d2\3\2"+
		"\2\2\35\u00d9\3\2\2\2\37\u00dd\3\2\2\2!\u00e2\3\2\2\2#\u00e5\3\2\2\2%"+
		"\u00eb\3\2\2\2\'\u00ef\3\2\2\2)\u00f4\3\2\2\2+\u00fa\3\2\2\2-\u0105\3"+
		"\2\2\2/\u010f\3\2\2\2\61\u0114\3\2\2\2\63\u0116\3\2\2\2\65\u0118\3\2\2"+
		"\2\67\u011a\3\2\2\29\u011c\3\2\2\2;\u011e\3\2\2\2=\u0120\3\2\2\2?\u0122"+
		"\3\2\2\2A\u0124\3\2\2\2C\u0126\3\2\2\2E\u0128\3\2\2\2G\u012a\3\2\2\2I"+
		"\u012c\3\2\2\2K\u012e\3\2\2\2M\u0130\3\2\2\2O\u0133\3\2\2\2Q\u0136\3\2"+
		"\2\2S\u0139\3\2\2\2U\u013c\3\2\2\2W\u013f\3\2\2\2Y\u0142\3\2\2\2[\u0145"+
		"\3\2\2\2]\u0148\3\2\2\2_\u014b\3\2\2\2a\u014e\3\2\2\2c\u0151\3\2\2\2e"+
		"\u0153\3\2\2\2g\u0155\3\2\2\2i\u0157\3\2\2\2k\u0159\3\2\2\2m\u015b\3\2"+
		"\2\2o\u015d\3\2\2\2q\u0160\3\2\2\2s\u0169\3\2\2\2u\u0170\3\2\2\2w\u0172"+
		"\3\2\2\2y\u0174\3\2\2\2{\u0178\3\2\2\2}\u017a\3\2\2\2\177\u018b\3\2\2"+
		"\2\u0081\u018d\3\2\2\2\u0083\u018f\3\2\2\2\u0085\u019a\3\2\2\2\u0087\u01a5"+
		"\3\2\2\2\u0089\u01a9\3\2\2\2\u008b\u01b7\3\2\2\2\u008d\u008e\7d\2\2\u008e"+
		"\u008f\7q\2\2\u008f\u0090\7q\2\2\u0090\u0091\7n\2\2\u0091\4\3\2\2\2\u0092"+
		"\u0093\7e\2\2\u0093\u0094\7j\2\2\u0094\u0095\7c\2\2\u0095\u0096\7t\2\2"+
		"\u0096\6\3\2\2\2\u0097\u0098\7f\2\2\u0098\u0099\7q\2\2\u0099\u009a\7w"+
		"\2\2\u009a\u009b\7d\2\2\u009b\u009c\7n\2\2\u009c\u009d\7g\2\2\u009d\b"+
		"\3\2\2\2\u009e\u009f\7h\2\2\u009f\u00a0\7n\2\2\u00a0\u00a1\7q\2\2\u00a1"+
		"\u00a2\7c\2\2\u00a2\u00a3\7v\2\2\u00a3\n\3\2\2\2\u00a4\u00a5\7k\2\2\u00a5"+
		"\u00a6\7p\2\2\u00a6\u00a7\7v\2\2\u00a7\f\3\2\2\2\u00a8\u00a9\7u\2\2\u00a9"+
		"\u00aa\7v\2\2\u00aa\u00ab\7t\2\2\u00ab\u00ac\7k\2\2\u00ac\u00ad\7p\2\2"+
		"\u00ad\u00ae\7i\2\2\u00ae\16\3\2\2\2\u00af\u00b0\7x\2\2\u00b0\u00b1\7"+
		"q\2\2\u00b1\u00b2\7k\2\2\u00b2\u00b3\7f\2\2\u00b3\20\3\2\2\2\u00b4\u00b7"+
		"\5\23\n\2\u00b5\u00b7\5\25\13\2\u00b6\u00b4\3\2\2\2\u00b6\u00b5\3\2\2"+
		"\2\u00b7\22\3\2\2\2\u00b8\u00b9\7h\2\2\u00b9\u00ba\7c\2\2\u00ba\u00bb"+
		"\7n\2\2\u00bb\u00bc\7u\2\2\u00bc\u00bd\7g\2\2\u00bd\24\3\2\2\2\u00be\u00bf"+
		"\7v\2\2\u00bf\u00c0\7t\2\2\u00c0\u00c1\7w\2\2\u00c1\u00c2\7g\2\2\u00c2"+
		"\26\3\2\2\2\u00c3\u00c4\7d\2\2\u00c4\u00c5\7t\2\2\u00c5\u00c6\7g\2\2\u00c6"+
		"\u00c7\7c\2\2\u00c7\u00c8\7m\2\2\u00c8\30\3\2\2\2\u00c9\u00ca\7e\2\2\u00ca"+
		"\u00cb\7q\2\2\u00cb\u00cc\7p\2\2\u00cc\u00cd\7v\2\2\u00cd\u00ce\7k\2\2"+
		"\u00ce\u00cf\7p\2\2\u00cf\u00d0\7w\2\2\u00d0\u00d1\7g\2\2\u00d1\32\3\2"+
		"\2\2\u00d2\u00d3\7t\2\2\u00d3\u00d4\7g\2\2\u00d4\u00d5\7v\2\2\u00d5\u00d6"+
		"\7w\2\2\u00d6\u00d7\7t\2\2\u00d7\u00d8\7p\2\2\u00d8\34\3\2\2\2\u00d9\u00da"+
		"\7h\2\2\u00da\u00db\7q\2\2\u00db\u00dc\7t\2\2\u00dc\36\3\2\2\2\u00dd\u00de"+
		"\7g\2\2\u00de\u00df\7n\2\2\u00df\u00e0\7u\2\2\u00e0\u00e1\7g\2\2\u00e1"+
		" \3\2\2\2\u00e2\u00e3\7k\2\2\u00e3\u00e4\7h\2\2\u00e4\"\3\2\2\2\u00e5"+
		"\u00e6\7y\2\2\u00e6\u00e7\7j\2\2\u00e7\u00e8\7k\2\2\u00e8\u00e9\7n\2\2"+
		"\u00e9\u00ea\7g\2\2\u00ea$\3\2\2\2\u00eb\u00ec\7e\2\2\u00ec\u00ed\7k\2"+
		"\2\u00ed\u00ee\7p\2\2\u00ee&\3\2\2\2\u00ef\u00f0\7e\2\2\u00f0\u00f1\7"+
		"q\2\2\u00f1\u00f2\7w\2\2\u00f2\u00f3\7v\2\2\u00f3(\3\2\2\2\u00f4\u00f5"+
		"\7w\2\2\u00f5\u00f6\7u\2\2\u00f6\u00f7\7k\2\2\u00f7\u00f8\7p\2\2\u00f8"+
		"\u00f9\7i\2\2\u00f9*\3\2\2\2\u00fa\u00fb\7%\2\2\u00fb\u00fc\7k\2\2\u00fc"+
		"\u00fd\7p\2\2\u00fd\u00fe\7e\2\2\u00fe\u00ff\7n\2\2\u00ff\u0100\7w\2\2"+
		"\u0100\u0101\7f\2\2\u0101\u0102\7g\2\2\u0102\u0103\7\"\2\2\u0103\u0104"+
		"\7>\2\2\u0104,\3\2\2\2\u0105\u0106\7p\2\2\u0106\u0107\7c\2\2\u0107\u0108"+
		"\7o\2\2\u0108\u0109\7g\2\2\u0109\u010a\7u\2\2\u010a\u010b\7r\2\2\u010b"+
		"\u010c\7c\2\2\u010c\u010d\7e\2\2\u010d\u010e\7g\2\2\u010e.\3\2\2\2\u010f"+
		"\u0110\7u\2\2\u0110\u0111\7v\2\2\u0111\u0112\7f\2\2\u0112\u0113\7=\2\2"+
		"\u0113\60\3\2\2\2\u0114\u0115\7*\2\2\u0115\62\3\2\2\2\u0116\u0117\7+\2"+
		"\2\u0117\64\3\2\2\2\u0118\u0119\7]\2\2\u0119\66\3\2\2\2\u011a\u011b\7"+
		"_\2\2\u011b8\3\2\2\2\u011c\u011d\7}\2\2\u011d:\3\2\2\2\u011e\u011f\7\177"+
		"\2\2\u011f<\3\2\2\2\u0120\u0121\7-\2\2\u0121>\3\2\2\2\u0122\u0123\7/\2"+
		"\2\u0123@\3\2\2\2\u0124\u0125\7,\2\2\u0125B\3\2\2\2\u0126\u0127\7\61\2"+
		"\2\u0127D\3\2\2\2\u0128\u0129\7\'\2\2\u0129F\3\2\2\2\u012a\u012b\7?\2"+
		"\2\u012bH\3\2\2\2\u012c\u012d\7>\2\2\u012dJ\3\2\2\2\u012e\u012f\7@\2\2"+
		"\u012fL\3\2\2\2\u0130\u0131\7?\2\2\u0131\u0132\7?\2\2\u0132N\3\2\2\2\u0133"+
		"\u0134\7#\2\2\u0134\u0135\7?\2\2\u0135P\3\2\2\2\u0136\u0137\7>\2\2\u0137"+
		"\u0138\7?\2\2\u0138R\3\2\2\2\u0139\u013a\7@\2\2\u013a\u013b\7?\2\2\u013b"+
		"T\3\2\2\2\u013c\u013d\7-\2\2\u013d\u013e\7-\2\2\u013eV\3\2\2\2\u013f\u0140"+
		"\7/\2\2\u0140\u0141\7/\2\2\u0141X\3\2\2\2\u0142\u0143\7\61\2\2\u0143\u0144"+
		"\7?\2\2\u0144Z\3\2\2\2\u0145\u0146\7\'\2\2\u0146\u0147\7?\2\2\u0147\\"+
		"\3\2\2\2\u0148\u0149\7,\2\2\u0149\u014a\7?\2\2\u014a^\3\2\2\2\u014b\u014c"+
		"\7(\2\2\u014c\u014d\7(\2\2\u014d`\3\2\2\2\u014e\u014f\7~\2\2\u014f\u0150"+
		"\7~\2\2\u0150b\3\2\2\2\u0151\u0152\7.\2\2\u0152d\3\2\2\2\u0153\u0154\7"+
		"A\2\2\u0154f\3\2\2\2\u0155\u0156\7#\2\2\u0156h\3\2\2\2\u0157\u0158\7<"+
		"\2\2\u0158j\3\2\2\2\u0159\u015a\7=\2\2\u015al\3\2\2\2\u015b\u015c\7\60"+
		"\2\2\u015cn\3\2\2\2\u015d\u015e\7$\2\2\u015ep\3\2\2\2\u015f\u0161\5? "+
		"\2\u0160\u015f\3\2\2\2\u0160\u0161\3\2\2\2\u0161\u0167\3\2\2\2\u0162\u0168"+
		"\5\177@\2\u0163\u0164\5\177@\2\u0164\u0165\5m\67\2\u0165\u0166\5\177@"+
		"\2\u0166\u0168\3\2\2\2\u0167\u0162\3\2\2\2\u0167\u0163\3\2\2\2\u0168r"+
		"\3\2\2\2\u0169\u016d\t\2\2\2\u016a\u016c\t\3\2\2\u016b\u016a\3\2\2\2\u016c"+
		"\u016f\3\2\2\2\u016d\u016b\3\2\2\2\u016d\u016e\3\2\2\2\u016et\3\2\2\2"+
		"\u016f\u016d\3\2\2\2\u0170\u0171\t\2\2\2\u0171v\3\2\2\2\u0172\u0173\t"+
		"\4\2\2\u0173x\3\2\2\2\u0174\u0175\t\5\2\2\u0175z\3\2\2\2\u0176\u0179\5"+
		"w<\2\u0177\u0179\5u;\2\u0178\u0176\3\2\2\2\u0178\u0177\3\2\2\2\u0179|"+
		"\3\2\2\2\u017a\u017e\5o8\2\u017b\u017d\5{>\2\u017c\u017b\3\2\2\2\u017d"+
		"\u0180\3\2\2\2\u017e\u017c\3\2\2\2\u017e\u017f\3\2\2\2\u017f\u0181\3\2"+
		"\2\2\u0180\u017e\3\2\2\2\u0181\u0182\5o8\2\u0182~\3\2\2\2\u0183\u018c"+
		"\t\6\2\2\u0184\u0188\t\5\2\2\u0185\u0187\t\4\2\2\u0186\u0185\3\2\2\2\u0187"+
		"\u018a\3\2\2\2\u0188\u0186\3\2\2\2\u0188\u0189\3\2\2\2\u0189\u018c\3\2"+
		"\2\2\u018a\u0188\3\2\2\2\u018b\u0183\3\2\2\2\u018b\u0184\3\2\2\2\u018c"+
		"\u0080\3\2\2\2\u018d\u018e\t\7\2\2\u018e\u0082\3\2\2\2\u018f\u0196\5w"+
		"<\2\u0190\u0192\7)\2\2\u0191\u0190\3\2\2\2\u0191\u0192\3\2\2\2\u0192\u0193"+
		"\3\2\2\2\u0193\u0195\5w<\2\u0194\u0191\3\2\2\2\u0195\u0198\3\2\2\2\u0196"+
		"\u0194\3\2\2\2\u0196\u0197\3\2\2\2\u0197\u0084\3\2\2\2\u0198\u0196\3\2"+
		"\2\2\u0199\u019b\t\b\2\2\u019a\u0199\3\2\2\2\u019b\u019c\3\2\2\2\u019c"+
		"\u019a\3\2\2\2\u019c\u019d\3\2\2\2\u019d\u019e\3\2\2\2\u019e\u019f\bC"+
		"\2\2\u019f\u0086\3\2\2\2\u01a0\u01a2\7\17\2\2\u01a1\u01a3\7\f\2\2\u01a2"+
		"\u01a1\3\2\2\2\u01a2\u01a3\3\2\2\2\u01a3\u01a6\3\2\2\2\u01a4\u01a6\7\f"+
		"\2\2\u01a5\u01a0\3\2\2\2\u01a5\u01a4\3\2\2\2\u01a6\u01a7\3\2\2\2\u01a7"+
		"\u01a8\bD\2\2\u01a8\u0088\3\2\2\2\u01a9\u01aa\7\61\2\2\u01aa\u01ab\7,"+
		"\2\2\u01ab\u01af\3\2\2\2\u01ac\u01ae\13\2\2\2\u01ad\u01ac\3\2\2\2\u01ae"+
		"\u01b1\3\2\2\2\u01af\u01b0\3\2\2\2\u01af\u01ad\3\2\2\2\u01b0\u01b2\3\2"+
		"\2\2\u01b1\u01af\3\2\2\2\u01b2\u01b3\7,\2\2\u01b3\u01b4\7\61\2\2\u01b4"+
		"\u01b5\3\2\2\2\u01b5\u01b6\bE\2\2\u01b6\u008a\3\2\2\2\u01b7\u01b8\7\61"+
		"\2\2\u01b8\u01b9\7\61\2\2\u01b9\u01bd\3\2\2\2\u01ba\u01bc\n\t\2\2\u01bb"+
		"\u01ba\3\2\2\2\u01bc\u01bf\3\2\2\2\u01bd\u01bb\3\2\2\2\u01bd\u01be\3\2"+
		"\2\2\u01be\u01c0\3\2\2\2\u01bf\u01bd\3\2\2\2\u01c0\u01c1\bF\2\2\u01c1"+
		"\u008c\3\2\2\2\22\2\u00b6\u0160\u0167\u016d\u0178\u017e\u0188\u018b\u0191"+
		"\u0196\u019c\u01a2\u01a5\u01af\u01bd\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}