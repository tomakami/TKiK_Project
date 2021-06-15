// Generated from TKiK.g4 by ANTLR 4.9.2
package agh;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class TKiKParser extends Parser {
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
	public static final int
		RULE_entire_program = 0, RULE_library = 1, RULE_using = 2, RULE_function = 3, 
		RULE_argument = 4, RULE_code = 5, RULE_body = 6, RULE_body_element = 7, 
		RULE_variable_declaration = 8, RULE_double_operator = 9, RULE_single_operator = 10, 
		RULE_statement = 11, RULE_variable = 12, RULE_return_statement = 13, RULE_if_statement = 14, 
		RULE_while_statement = 15, RULE_for_statement = 16, RULE_expression = 17, 
		RULE_type = 18;
	private static String[] makeRuleNames() {
		return new String[] {
			"entire_program", "library", "using", "function", "argument", "code", 
			"body", "body_element", "variable_declaration", "double_operator", "single_operator", 
			"statement", "variable", "return_statement", "if_statement", "while_statement", 
			"for_statement", "expression", "type"
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

	@Override
	public String getGrammarFileName() { return "TKiK.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public TKiKParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class Entire_programContext extends ParserRuleContext {
		public UsingContext using() {
			return getRuleContext(UsingContext.class,0);
		}
		public CodeContext code() {
			return getRuleContext(CodeContext.class,0);
		}
		public List<LibraryContext> library() {
			return getRuleContexts(LibraryContext.class);
		}
		public LibraryContext library(int i) {
			return getRuleContext(LibraryContext.class,i);
		}
		public Entire_programContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_entire_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TKiKListener ) ((TKiKListener)listener).enterEntire_program(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TKiKListener ) ((TKiKListener)listener).exitEntire_program(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TKiKVisitor ) return ((TKiKVisitor<? extends T>)visitor).visitEntire_program(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Entire_programContext entire_program() throws RecognitionException {
		Entire_programContext _localctx = new Entire_programContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_entire_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(39); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(38);
				library();
				}
				}
				setState(41); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==INCLUDE );
			setState(43);
			using();
			setState(44);
			code();
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

	public static class LibraryContext extends ParserRuleContext {
		public TerminalNode INCLUDE() { return getToken(TKiKParser.INCLUDE, 0); }
		public TerminalNode ID() { return getToken(TKiKParser.ID, 0); }
		public TerminalNode GREATER() { return getToken(TKiKParser.GREATER, 0); }
		public LibraryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_library; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TKiKListener ) ((TKiKListener)listener).enterLibrary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TKiKListener ) ((TKiKListener)listener).exitLibrary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TKiKVisitor ) return ((TKiKVisitor<? extends T>)visitor).visitLibrary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LibraryContext library() throws RecognitionException {
		LibraryContext _localctx = new LibraryContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_library);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(46);
			match(INCLUDE);
			setState(47);
			match(ID);
			setState(48);
			match(GREATER);
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

	public static class UsingContext extends ParserRuleContext {
		public TerminalNode USING() { return getToken(TKiKParser.USING, 0); }
		public TerminalNode NAMESPACE() { return getToken(TKiKParser.NAMESPACE, 0); }
		public TerminalNode STD() { return getToken(TKiKParser.STD, 0); }
		public UsingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_using; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TKiKListener ) ((TKiKListener)listener).enterUsing(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TKiKListener ) ((TKiKListener)listener).exitUsing(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TKiKVisitor ) return ((TKiKVisitor<? extends T>)visitor).visitUsing(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UsingContext using() throws RecognitionException {
		UsingContext _localctx = new UsingContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_using);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			match(USING);
			setState(51);
			match(NAMESPACE);
			setState(52);
			match(STD);
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

	public static class FunctionContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(TKiKParser.ID, 0); }
		public TerminalNode LEFTPAREN() { return getToken(TKiKParser.LEFTPAREN, 0); }
		public TerminalNode RIGHTPAREN() { return getToken(TKiKParser.RIGHTPAREN, 0); }
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public ArgumentContext argument() {
			return getRuleContext(ArgumentContext.class,0);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TKiKListener ) ((TKiKListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TKiKListener ) ((TKiKListener)listener).exitFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TKiKVisitor ) return ((TKiKVisitor<? extends T>)visitor).visitFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
			type();
			setState(55);
			match(ID);
			setState(56);
			match(LEFTPAREN);
			setState(58);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOL) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << STRING) | (1L << VOID))) != 0)) {
				{
				setState(57);
				argument();
				}
			}

			setState(60);
			match(RIGHTPAREN);
			setState(61);
			body();
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

	public static class ArgumentContext extends ParserRuleContext {
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<TerminalNode> ID() { return getTokens(TKiKParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(TKiKParser.ID, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(TKiKParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(TKiKParser.COMMA, i);
		}
		public ArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TKiKListener ) ((TKiKListener)listener).enterArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TKiKListener ) ((TKiKListener)listener).exitArgument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TKiKVisitor ) return ((TKiKVisitor<? extends T>)visitor).visitArgument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentContext argument() throws RecognitionException {
		ArgumentContext _localctx = new ArgumentContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_argument);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(63);
			type();
			setState(64);
			match(ID);
			setState(71);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(65);
				match(COMMA);
				setState(66);
				type();
				setState(67);
				match(ID);
				}
				}
				setState(73);
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

	public static class CodeContext extends ParserRuleContext {
		public List<FunctionContext> function() {
			return getRuleContexts(FunctionContext.class);
		}
		public FunctionContext function(int i) {
			return getRuleContext(FunctionContext.class,i);
		}
		public CodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_code; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TKiKListener ) ((TKiKListener)listener).enterCode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TKiKListener ) ((TKiKListener)listener).exitCode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TKiKVisitor ) return ((TKiKVisitor<? extends T>)visitor).visitCode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CodeContext code() throws RecognitionException {
		CodeContext _localctx = new CodeContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_code);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(74);
				function();
				}
				}
				setState(77); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOL) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << STRING) | (1L << VOID))) != 0) );
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

	public static class BodyContext extends ParserRuleContext {
		public TerminalNode LEFTBRACE() { return getToken(TKiKParser.LEFTBRACE, 0); }
		public TerminalNode RIGHTBRACE() { return getToken(TKiKParser.RIGHTBRACE, 0); }
		public List<Body_elementContext> body_element() {
			return getRuleContexts(Body_elementContext.class);
		}
		public Body_elementContext body_element(int i) {
			return getRuleContext(Body_elementContext.class,i);
		}
		public Return_statementContext return_statement() {
			return getRuleContext(Return_statementContext.class,0);
		}
		public BodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TKiKListener ) ((TKiKListener)listener).enterBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TKiKListener ) ((TKiKListener)listener).exitBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TKiKVisitor ) return ((TKiKVisitor<? extends T>)visitor).visitBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BodyContext body() throws RecognitionException {
		BodyContext _localctx = new BodyContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			match(LEFTBRACE);
			setState(83);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOL) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << STRING) | (1L << VOID) | (1L << BOOLEAN) | (1L << FOR) | (1L << IF) | (1L << WHILE) | (1L << LEFTPAREN) | (1L << LEFTBRACE) | (1L << PLUSPLUS) | (1L << MINUSMINUS) | (1L << EXCLAMATION) | (1L << NUMBER) | (1L << ID) | (1L << TEXT))) != 0)) {
				{
				{
				setState(80);
				body_element();
				}
				}
				setState(85);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(87);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RETURN) {
				{
				setState(86);
				return_statement();
				}
			}

			setState(89);
			match(RIGHTBRACE);
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

	public static class Body_elementContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Body_elementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_body_element; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TKiKListener ) ((TKiKListener)listener).enterBody_element(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TKiKListener ) ((TKiKListener)listener).exitBody_element(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TKiKVisitor ) return ((TKiKVisitor<? extends T>)visitor).visitBody_element(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Body_elementContext body_element() throws RecognitionException {
		Body_elementContext _localctx = new Body_elementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_body_element);
		try {
			setState(93);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOL:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case STRING:
			case VOID:
			case FOR:
			case IF:
			case WHILE:
				enterOuterAlt(_localctx, 1);
				{
				setState(91);
				statement();
				}
				break;
			case BOOLEAN:
			case LEFTPAREN:
			case LEFTBRACE:
			case PLUSPLUS:
			case MINUSMINUS:
			case EXCLAMATION:
			case NUMBER:
			case ID:
			case TEXT:
				enterOuterAlt(_localctx, 2);
				{
				setState(92);
				expression(0);
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

	public static class Variable_declarationContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(TKiKParser.ID, 0); }
		public TerminalNode SEMI() { return getToken(TKiKParser.SEMI, 0); }
		public TerminalNode LEFTBRACKET() { return getToken(TKiKParser.LEFTBRACKET, 0); }
		public TerminalNode RIGHTBRACKET() { return getToken(TKiKParser.RIGHTBRACKET, 0); }
		public TerminalNode ASSIGN() { return getToken(TKiKParser.ASSIGN, 0); }
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode NATURAL() { return getToken(TKiKParser.NATURAL, 0); }
		public Variable_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TKiKListener ) ((TKiKListener)listener).enterVariable_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TKiKListener ) ((TKiKListener)listener).exitVariable_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TKiKVisitor ) return ((TKiKVisitor<? extends T>)visitor).visitVariable_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Variable_declarationContext variable_declaration() throws RecognitionException {
		Variable_declarationContext _localctx = new Variable_declarationContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_variable_declaration);
		int _la;
		try {
			setState(119);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(95);
				type();
				setState(96);
				match(ID);
				setState(99);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LEFTBRACKET) {
					{
					setState(97);
					match(LEFTBRACKET);
					setState(98);
					match(RIGHTBRACKET);
					}
				}

				setState(106);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASSIGN) {
					{
					setState(101);
					match(ASSIGN);
					setState(104);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
					case 1:
						{
						setState(102);
						variable();
						}
						break;
					case 2:
						{
						setState(103);
						expression(0);
						}
						break;
					}
					}
				}

				setState(108);
				match(SEMI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(110);
				type();
				setState(111);
				match(ID);
				setState(115);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LEFTBRACKET) {
					{
					setState(112);
					match(LEFTBRACKET);
					setState(113);
					match(NATURAL);
					setState(114);
					match(RIGHTBRACKET);
					}
				}

				setState(117);
				match(SEMI);
				}
				break;
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

	public static class Double_operatorContext extends ParserRuleContext {
		public TerminalNode PLUS() { return getToken(TKiKParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(TKiKParser.MINUS, 0); }
		public TerminalNode STAR() { return getToken(TKiKParser.STAR, 0); }
		public TerminalNode DIV() { return getToken(TKiKParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(TKiKParser.MOD, 0); }
		public TerminalNode LESS() { return getToken(TKiKParser.LESS, 0); }
		public TerminalNode AND() { return getToken(TKiKParser.AND, 0); }
		public TerminalNode OR() { return getToken(TKiKParser.OR, 0); }
		public TerminalNode GREATER() { return getToken(TKiKParser.GREATER, 0); }
		public TerminalNode EQUALS() { return getToken(TKiKParser.EQUALS, 0); }
		public TerminalNode NOTEQUALS() { return getToken(TKiKParser.NOTEQUALS, 0); }
		public TerminalNode LESSEQUALS() { return getToken(TKiKParser.LESSEQUALS, 0); }
		public TerminalNode GREATEREQUALS() { return getToken(TKiKParser.GREATEREQUALS, 0); }
		public TerminalNode DIVASSIGN() { return getToken(TKiKParser.DIVASSIGN, 0); }
		public TerminalNode MODASSIGN() { return getToken(TKiKParser.MODASSIGN, 0); }
		public TerminalNode MULASSIGN() { return getToken(TKiKParser.MULASSIGN, 0); }
		public TerminalNode ASSIGN() { return getToken(TKiKParser.ASSIGN, 0); }
		public Double_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_double_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TKiKListener ) ((TKiKListener)listener).enterDouble_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TKiKListener ) ((TKiKListener)listener).exitDouble_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TKiKVisitor ) return ((TKiKVisitor<? extends T>)visitor).visitDouble_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Double_operatorContext double_operator() throws RecognitionException {
		Double_operatorContext _localctx = new Double_operatorContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_double_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS) | (1L << MINUS) | (1L << STAR) | (1L << DIV) | (1L << MOD) | (1L << ASSIGN) | (1L << LESS) | (1L << GREATER) | (1L << EQUALS) | (1L << NOTEQUALS) | (1L << LESSEQUALS) | (1L << GREATEREQUALS) | (1L << DIVASSIGN) | (1L << MODASSIGN) | (1L << MULASSIGN) | (1L << AND) | (1L << OR))) != 0)) ) {
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

	public static class Single_operatorContext extends ParserRuleContext {
		public TerminalNode PLUSPLUS() { return getToken(TKiKParser.PLUSPLUS, 0); }
		public TerminalNode MINUSMINUS() { return getToken(TKiKParser.MINUSMINUS, 0); }
		public TerminalNode EXCLAMATION() { return getToken(TKiKParser.EXCLAMATION, 0); }
		public Single_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_single_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TKiKListener ) ((TKiKListener)listener).enterSingle_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TKiKListener ) ((TKiKListener)listener).exitSingle_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TKiKVisitor ) return ((TKiKVisitor<? extends T>)visitor).visitSingle_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Single_operatorContext single_operator() throws RecognitionException {
		Single_operatorContext _localctx = new Single_operatorContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_single_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUSPLUS) | (1L << MINUSMINUS) | (1L << EXCLAMATION))) != 0)) ) {
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

	public static class StatementContext extends ParserRuleContext {
		public For_statementContext for_statement() {
			return getRuleContext(For_statementContext.class,0);
		}
		public If_statementContext if_statement() {
			return getRuleContext(If_statementContext.class,0);
		}
		public While_statementContext while_statement() {
			return getRuleContext(While_statementContext.class,0);
		}
		public Variable_declarationContext variable_declaration() {
			return getRuleContext(Variable_declarationContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TKiKListener ) ((TKiKListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TKiKListener ) ((TKiKListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TKiKVisitor ) return ((TKiKVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_statement);
		try {
			setState(129);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FOR:
				enterOuterAlt(_localctx, 1);
				{
				setState(125);
				for_statement();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 2);
				{
				setState(126);
				if_statement();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 3);
				{
				setState(127);
				while_statement();
				}
				break;
			case BOOL:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case STRING:
			case VOID:
				enterOuterAlt(_localctx, 4);
				{
				setState(128);
				variable_declaration();
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

	public static class VariableContext extends ParserRuleContext {
		public List<TerminalNode> NUMBER() { return getTokens(TKiKParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(TKiKParser.NUMBER, i);
		}
		public TerminalNode BOOLEAN() { return getToken(TKiKParser.BOOLEAN, 0); }
		public TerminalNode TEXT() { return getToken(TKiKParser.TEXT, 0); }
		public TerminalNode LEFTBRACE() { return getToken(TKiKParser.LEFTBRACE, 0); }
		public TerminalNode RIGHTBRACE() { return getToken(TKiKParser.RIGHTBRACE, 0); }
		public List<TerminalNode> COMMA() { return getTokens(TKiKParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(TKiKParser.COMMA, i);
		}
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TKiKListener ) ((TKiKListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TKiKListener ) ((TKiKListener)listener).exitVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TKiKVisitor ) return ((TKiKVisitor<? extends T>)visitor).visitVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_variable);
		int _la;
		try {
			setState(146);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(131);
				match(NUMBER);
				}
				break;
			case BOOLEAN:
				enterOuterAlt(_localctx, 2);
				{
				setState(132);
				match(BOOLEAN);
				}
				break;
			case TEXT:
				enterOuterAlt(_localctx, 3);
				{
				setState(133);
				match(TEXT);
				}
				break;
			case LEFTBRACE:
				enterOuterAlt(_localctx, 4);
				{
				setState(134);
				match(LEFTBRACE);
				setState(143);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NUMBER) {
					{
					setState(135);
					match(NUMBER);
					setState(140);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(136);
						match(COMMA);
						setState(137);
						match(NUMBER);
						}
						}
						setState(142);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(145);
				match(RIGHTBRACE);
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

	public static class Return_statementContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(TKiKParser.RETURN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(TKiKParser.SEMI, 0); }
		public Return_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TKiKListener ) ((TKiKListener)listener).enterReturn_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TKiKListener ) ((TKiKListener)listener).exitReturn_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TKiKVisitor ) return ((TKiKVisitor<? extends T>)visitor).visitReturn_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Return_statementContext return_statement() throws RecognitionException {
		Return_statementContext _localctx = new Return_statementContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_return_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			match(RETURN);
			setState(149);
			expression(0);
			setState(150);
			match(SEMI);
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

	public static class If_statementContext extends ParserRuleContext {
		public List<TerminalNode> IF() { return getTokens(TKiKParser.IF); }
		public TerminalNode IF(int i) {
			return getToken(TKiKParser.IF, i);
		}
		public List<TerminalNode> LEFTPAREN() { return getTokens(TKiKParser.LEFTPAREN); }
		public TerminalNode LEFTPAREN(int i) {
			return getToken(TKiKParser.LEFTPAREN, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> RIGHTPAREN() { return getTokens(TKiKParser.RIGHTPAREN); }
		public TerminalNode RIGHTPAREN(int i) {
			return getToken(TKiKParser.RIGHTPAREN, i);
		}
		public List<BodyContext> body() {
			return getRuleContexts(BodyContext.class);
		}
		public BodyContext body(int i) {
			return getRuleContext(BodyContext.class,i);
		}
		public List<TerminalNode> ELSE() { return getTokens(TKiKParser.ELSE); }
		public TerminalNode ELSE(int i) {
			return getToken(TKiKParser.ELSE, i);
		}
		public If_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TKiKListener ) ((TKiKListener)listener).enterIf_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TKiKListener ) ((TKiKListener)listener).exitIf_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TKiKVisitor ) return ((TKiKVisitor<? extends T>)visitor).visitIf_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_statementContext if_statement() throws RecognitionException {
		If_statementContext _localctx = new If_statementContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_if_statement);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(152);
			match(IF);
			setState(153);
			match(LEFTPAREN);
			setState(154);
			expression(0);
			setState(155);
			match(RIGHTPAREN);
			setState(156);
			body();
			setState(166);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(157);
					match(ELSE);
					setState(158);
					match(IF);
					setState(159);
					match(LEFTPAREN);
					setState(160);
					expression(0);
					setState(161);
					match(RIGHTPAREN);
					setState(162);
					body();
					}
					} 
				}
				setState(168);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			}
			setState(171);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(169);
				match(ELSE);
				setState(170);
				body();
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

	public static class While_statementContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(TKiKParser.WHILE, 0); }
		public TerminalNode LEFTPAREN() { return getToken(TKiKParser.LEFTPAREN, 0); }
		public TerminalNode RIGHTPAREN() { return getToken(TKiKParser.RIGHTPAREN, 0); }
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public While_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TKiKListener ) ((TKiKListener)listener).enterWhile_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TKiKListener ) ((TKiKListener)listener).exitWhile_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TKiKVisitor ) return ((TKiKVisitor<? extends T>)visitor).visitWhile_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final While_statementContext while_statement() throws RecognitionException {
		While_statementContext _localctx = new While_statementContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_while_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(173);
			match(WHILE);
			setState(174);
			match(LEFTPAREN);
			setState(176);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << LEFTPAREN) | (1L << LEFTBRACE) | (1L << PLUSPLUS) | (1L << MINUSMINUS) | (1L << EXCLAMATION) | (1L << NUMBER) | (1L << ID) | (1L << TEXT))) != 0)) {
				{
				setState(175);
				expression(0);
				}
			}

			setState(178);
			match(RIGHTPAREN);
			setState(179);
			body();
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

	public static class For_statementContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(TKiKParser.FOR, 0); }
		public TerminalNode LEFTPAREN() { return getToken(TKiKParser.LEFTPAREN, 0); }
		public List<TerminalNode> SEMI() { return getTokens(TKiKParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(TKiKParser.SEMI, i);
		}
		public TerminalNode RIGHTPAREN() { return getToken(TKiKParser.RIGHTPAREN, 0); }
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public Variable_declarationContext variable_declaration() {
			return getRuleContext(Variable_declarationContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public For_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TKiKListener ) ((TKiKListener)listener).enterFor_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TKiKListener ) ((TKiKListener)listener).exitFor_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TKiKVisitor ) return ((TKiKVisitor<? extends T>)visitor).visitFor_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_statementContext for_statement() throws RecognitionException {
		For_statementContext _localctx = new For_statementContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_for_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(181);
			match(FOR);
			setState(182);
			match(LEFTPAREN);
			setState(185);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOL:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case STRING:
			case VOID:
				{
				setState(183);
				variable_declaration();
				}
				break;
			case SEMI:
				{
				setState(184);
				match(SEMI);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(188);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << LEFTPAREN) | (1L << LEFTBRACE) | (1L << PLUSPLUS) | (1L << MINUSMINUS) | (1L << EXCLAMATION) | (1L << NUMBER) | (1L << ID) | (1L << TEXT))) != 0)) {
				{
				setState(187);
				expression(0);
				}
			}

			setState(190);
			match(SEMI);
			setState(192);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << LEFTPAREN) | (1L << LEFTBRACE) | (1L << PLUSPLUS) | (1L << MINUSMINUS) | (1L << EXCLAMATION) | (1L << NUMBER) | (1L << ID) | (1L << TEXT))) != 0)) {
				{
				setState(191);
				expression(0);
				}
			}

			setState(194);
			match(RIGHTPAREN);
			setState(195);
			body();
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

	public static class ExpressionContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(TKiKParser.ID, 0); }
		public TerminalNode LEFTPAREN() { return getToken(TKiKParser.LEFTPAREN, 0); }
		public TerminalNode RIGHTPAREN() { return getToken(TKiKParser.RIGHTPAREN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(TKiKParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(TKiKParser.COMMA, i);
		}
		public Single_operatorContext single_operator() {
			return getRuleContext(Single_operatorContext.class,0);
		}
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public Double_operatorContext double_operator() {
			return getRuleContext(Double_operatorContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(TKiKParser.SEMI, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TKiKListener ) ((TKiKListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TKiKListener ) ((TKiKListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TKiKVisitor ) return ((TKiKVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 34;
		enterRecursionRule(_localctx, 34, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(220);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				{
				setState(198);
				match(ID);
				setState(199);
				match(LEFTPAREN);
				setState(208);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << LEFTPAREN) | (1L << LEFTBRACE) | (1L << PLUSPLUS) | (1L << MINUSMINUS) | (1L << EXCLAMATION) | (1L << NUMBER) | (1L << ID) | (1L << TEXT))) != 0)) {
					{
					setState(200);
					expression(0);
					setState(205);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(201);
						match(COMMA);
						setState(202);
						expression(0);
						}
						}
						setState(207);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(210);
				match(RIGHTPAREN);
				}
				break;
			case 2:
				{
				setState(211);
				match(LEFTPAREN);
				setState(212);
				expression(0);
				setState(213);
				match(RIGHTPAREN);
				}
				break;
			case 3:
				{
				setState(215);
				single_operator();
				setState(216);
				expression(4);
				}
				break;
			case 4:
				{
				setState(218);
				variable();
				}
				break;
			case 5:
				{
				setState(219);
				match(ID);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(232);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(230);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(222);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(223);
						double_operator();
						setState(224);
						expression(7);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(226);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(227);
						single_operator();
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(228);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(229);
						match(SEMI);
						}
						break;
					}
					} 
				}
				setState(234);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class TypeContext extends ParserRuleContext {
		public TerminalNode BOOL() { return getToken(TKiKParser.BOOL, 0); }
		public TerminalNode CHAR() { return getToken(TKiKParser.CHAR, 0); }
		public TerminalNode DOUBLE() { return getToken(TKiKParser.DOUBLE, 0); }
		public TerminalNode FLOAT() { return getToken(TKiKParser.FLOAT, 0); }
		public TerminalNode INT() { return getToken(TKiKParser.INT, 0); }
		public TerminalNode STRING() { return getToken(TKiKParser.STRING, 0); }
		public TerminalNode VOID() { return getToken(TKiKParser.VOID, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TKiKListener ) ((TKiKListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TKiKListener ) ((TKiKListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TKiKVisitor ) return ((TKiKVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(235);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOL) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << STRING) | (1L << VOID))) != 0)) ) {
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 17:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 6);
		case 1:
			return precpred(_ctx, 5);
		case 2:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3E\u00f0\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\3\2\6\2*\n\2\r\2\16\2+\3\2\3\2\3\2\3\3\3\3\3\3\3"+
		"\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\5\5=\n\5\3\5\3\5\3\5\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\7\6H\n\6\f\6\16\6K\13\6\3\7\6\7N\n\7\r\7\16\7O\3\b\3\b\7\b"+
		"T\n\b\f\b\16\bW\13\b\3\b\5\bZ\n\b\3\b\3\b\3\t\3\t\5\t`\n\t\3\n\3\n\3\n"+
		"\3\n\5\nf\n\n\3\n\3\n\3\n\5\nk\n\n\5\nm\n\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\5\nv\n\n\3\n\3\n\5\nz\n\n\3\13\3\13\3\f\3\f\3\r\3\r\3\r\3\r\5\r\u0084"+
		"\n\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\7\16\u008d\n\16\f\16\16\16\u0090"+
		"\13\16\5\16\u0092\n\16\3\16\5\16\u0095\n\16\3\17\3\17\3\17\3\17\3\20\3"+
		"\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\7\20\u00a7\n\20"+
		"\f\20\16\20\u00aa\13\20\3\20\3\20\5\20\u00ae\n\20\3\21\3\21\3\21\5\21"+
		"\u00b3\n\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\5\22\u00bc\n\22\3\22\5"+
		"\22\u00bf\n\22\3\22\3\22\5\22\u00c3\n\22\3\22\3\22\3\22\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\7\23\u00ce\n\23\f\23\16\23\u00d1\13\23\5\23\u00d3\n\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u00df\n\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\7\23\u00e9\n\23\f\23\16\23\u00ec\13"+
		"\23\3\24\3\24\3\24\2\3$\25\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$"+
		"&\2\5\4\2 +.\62\4\2,-\65\65\3\2\3\t\2\u00ff\2)\3\2\2\2\4\60\3\2\2\2\6"+
		"\64\3\2\2\2\b8\3\2\2\2\nA\3\2\2\2\fM\3\2\2\2\16Q\3\2\2\2\20_\3\2\2\2\22"+
		"y\3\2\2\2\24{\3\2\2\2\26}\3\2\2\2\30\u0083\3\2\2\2\32\u0094\3\2\2\2\34"+
		"\u0096\3\2\2\2\36\u009a\3\2\2\2 \u00af\3\2\2\2\"\u00b7\3\2\2\2$\u00de"+
		"\3\2\2\2&\u00ed\3\2\2\2(*\5\4\3\2)(\3\2\2\2*+\3\2\2\2+)\3\2\2\2+,\3\2"+
		"\2\2,-\3\2\2\2-.\5\6\4\2./\5\f\7\2/\3\3\2\2\2\60\61\7\27\2\2\61\62\7;"+
		"\2\2\62\63\7\'\2\2\63\5\3\2\2\2\64\65\7\26\2\2\65\66\7\30\2\2\66\67\7"+
		"\31\2\2\67\7\3\2\2\289\5&\24\29:\7;\2\2:<\7\32\2\2;=\5\n\6\2<;\3\2\2\2"+
		"<=\3\2\2\2=>\3\2\2\2>?\7\33\2\2?@\5\16\b\2@\t\3\2\2\2AB\5&\24\2BI\7;\2"+
		"\2CD\7\63\2\2DE\5&\24\2EF\7;\2\2FH\3\2\2\2GC\3\2\2\2HK\3\2\2\2IG\3\2\2"+
		"\2IJ\3\2\2\2J\13\3\2\2\2KI\3\2\2\2LN\5\b\5\2ML\3\2\2\2NO\3\2\2\2OM\3\2"+
		"\2\2OP\3\2\2\2P\r\3\2\2\2QU\7\36\2\2RT\5\20\t\2SR\3\2\2\2TW\3\2\2\2US"+
		"\3\2\2\2UV\3\2\2\2VY\3\2\2\2WU\3\2\2\2XZ\5\34\17\2YX\3\2\2\2YZ\3\2\2\2"+
		"Z[\3\2\2\2[\\\7\37\2\2\\\17\3\2\2\2]`\5\30\r\2^`\5$\23\2_]\3\2\2\2_^\3"+
		"\2\2\2`\21\3\2\2\2ab\5&\24\2be\7;\2\2cd\7\34\2\2df\7\35\2\2ec\3\2\2\2"+
		"ef\3\2\2\2fl\3\2\2\2gj\7%\2\2hk\5\32\16\2ik\5$\23\2jh\3\2\2\2ji\3\2\2"+
		"\2km\3\2\2\2lg\3\2\2\2lm\3\2\2\2mn\3\2\2\2no\7\67\2\2oz\3\2\2\2pq\5&\24"+
		"\2qu\7;\2\2rs\7\34\2\2st\7A\2\2tv\7\35\2\2ur\3\2\2\2uv\3\2\2\2vw\3\2\2"+
		"\2wx\7\67\2\2xz\3\2\2\2ya\3\2\2\2yp\3\2\2\2z\23\3\2\2\2{|\t\2\2\2|\25"+
		"\3\2\2\2}~\t\3\2\2~\27\3\2\2\2\177\u0084\5\"\22\2\u0080\u0084\5\36\20"+
		"\2\u0081\u0084\5 \21\2\u0082\u0084\5\22\n\2\u0083\177\3\2\2\2\u0083\u0080"+
		"\3\2\2\2\u0083\u0081\3\2\2\2\u0083\u0082\3\2\2\2\u0084\31\3\2\2\2\u0085"+
		"\u0095\7:\2\2\u0086\u0095\7\n\2\2\u0087\u0095\7@\2\2\u0088\u0091\7\36"+
		"\2\2\u0089\u008e\7:\2\2\u008a\u008b\7\63\2\2\u008b\u008d\7:\2\2\u008c"+
		"\u008a\3\2\2\2\u008d\u0090\3\2\2\2\u008e\u008c\3\2\2\2\u008e\u008f\3\2"+
		"\2\2\u008f\u0092\3\2\2\2\u0090\u008e\3\2\2\2\u0091\u0089\3\2\2\2\u0091"+
		"\u0092\3\2\2\2\u0092\u0093\3\2\2\2\u0093\u0095\7\37\2\2\u0094\u0085\3"+
		"\2\2\2\u0094\u0086\3\2\2\2\u0094\u0087\3\2\2\2\u0094\u0088\3\2\2\2\u0095"+
		"\33\3\2\2\2\u0096\u0097\7\17\2\2\u0097\u0098\5$\23\2\u0098\u0099\7\67"+
		"\2\2\u0099\35\3\2\2\2\u009a\u009b\7\22\2\2\u009b\u009c\7\32\2\2\u009c"+
		"\u009d\5$\23\2\u009d\u009e\7\33\2\2\u009e\u00a8\5\16\b\2\u009f\u00a0\7"+
		"\21\2\2\u00a0\u00a1\7\22\2\2\u00a1\u00a2\7\32\2\2\u00a2\u00a3\5$\23\2"+
		"\u00a3\u00a4\7\33\2\2\u00a4\u00a5\5\16\b\2\u00a5\u00a7\3\2\2\2\u00a6\u009f"+
		"\3\2\2\2\u00a7\u00aa\3\2\2\2\u00a8\u00a6\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9"+
		"\u00ad\3\2\2\2\u00aa\u00a8\3\2\2\2\u00ab\u00ac\7\21\2\2\u00ac\u00ae\5"+
		"\16\b\2\u00ad\u00ab\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae\37\3\2\2\2\u00af"+
		"\u00b0\7\23\2\2\u00b0\u00b2\7\32\2\2\u00b1\u00b3\5$\23\2\u00b2\u00b1\3"+
		"\2\2\2\u00b2\u00b3\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4\u00b5\7\33\2\2\u00b5"+
		"\u00b6\5\16\b\2\u00b6!\3\2\2\2\u00b7\u00b8\7\20\2\2\u00b8\u00bb\7\32\2"+
		"\2\u00b9\u00bc\5\22\n\2\u00ba\u00bc\7\67\2\2\u00bb\u00b9\3\2\2\2\u00bb"+
		"\u00ba\3\2\2\2\u00bc\u00be\3\2\2\2\u00bd\u00bf\5$\23\2\u00be\u00bd\3\2"+
		"\2\2\u00be\u00bf\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0\u00c2\7\67\2\2\u00c1"+
		"\u00c3\5$\23\2\u00c2\u00c1\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3\u00c4\3\2"+
		"\2\2\u00c4\u00c5\7\33\2\2\u00c5\u00c6\5\16\b\2\u00c6#\3\2\2\2\u00c7\u00c8"+
		"\b\23\1\2\u00c8\u00c9\7;\2\2\u00c9\u00d2\7\32\2\2\u00ca\u00cf\5$\23\2"+
		"\u00cb\u00cc\7\63\2\2\u00cc\u00ce\5$\23\2\u00cd\u00cb\3\2\2\2\u00ce\u00d1"+
		"\3\2\2\2\u00cf\u00cd\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0\u00d3\3\2\2\2\u00d1"+
		"\u00cf\3\2\2\2\u00d2\u00ca\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3\u00d4\3\2"+
		"\2\2\u00d4\u00df\7\33\2\2\u00d5\u00d6\7\32\2\2\u00d6\u00d7\5$\23\2\u00d7"+
		"\u00d8\7\33\2\2\u00d8\u00df\3\2\2\2\u00d9\u00da\5\26\f\2\u00da\u00db\5"+
		"$\23\6\u00db\u00df\3\2\2\2\u00dc\u00df\5\32\16\2\u00dd\u00df\7;\2\2\u00de"+
		"\u00c7\3\2\2\2\u00de\u00d5\3\2\2\2\u00de\u00d9\3\2\2\2\u00de\u00dc\3\2"+
		"\2\2\u00de\u00dd\3\2\2\2\u00df\u00ea\3\2\2\2\u00e0\u00e1\f\b\2\2\u00e1"+
		"\u00e2\5\24\13\2\u00e2\u00e3\5$\23\t\u00e3\u00e9\3\2\2\2\u00e4\u00e5\f"+
		"\7\2\2\u00e5\u00e9\5\26\f\2\u00e6\u00e7\f\5\2\2\u00e7\u00e9\7\67\2\2\u00e8"+
		"\u00e0\3\2\2\2\u00e8\u00e4\3\2\2\2\u00e8\u00e6\3\2\2\2\u00e9\u00ec\3\2"+
		"\2\2\u00ea\u00e8\3\2\2\2\u00ea\u00eb\3\2\2\2\u00eb%\3\2\2\2\u00ec\u00ea"+
		"\3\2\2\2\u00ed\u00ee\t\4\2\2\u00ee\'\3\2\2\2\35+<IOUY_ejluy\u0083\u008e"+
		"\u0091\u0094\u00a8\u00ad\u00b2\u00bb\u00be\u00c2\u00cf\u00d2\u00de\u00e8"+
		"\u00ea";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}