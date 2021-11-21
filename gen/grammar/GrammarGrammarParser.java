// Generated from /home/qrort/hw/mt/lab3/src/grammar/GrammarGrammar.g4 by ANTLR 4.8
package grammar;

    import java.util.*;
    import templates.*;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GrammarGrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, WHITESPACE=2, TOKENS=3, RULES=4, NAME=5, BLANKS=6, STARTS=7, ATTR=8, 
		SIGN=9, FUNC=10, DCOLON=11, TERM=12, NTERM=13, REGEX=14, LB=15, RB=16, 
		CODE=17, LBS=18, RBS=19, QUOTE=20, SEMICOLON=21, VERT=22, COMMA=23;
	public static final int
		RULE_start = 0, RULE_signs = 1, RULE_sign = 2, RULE_funcs = 3, RULE_name = 4, 
		RULE_blanks = 5, RULE_startS = 6, RULE_attrs = 7, RULE_attr = 8, RULE_lexems = 9, 
		RULE_nextLexem = 10, RULE_rules = 11, RULE_nextRule = 12, RULE_ruleContent = 13, 
		RULE_ruleContentContinuation = 14, RULE_ruleInstance = 15, RULE_tokenSequence = 16, 
		RULE_tokenInstance = 17, RULE_codeValue = 18, RULE_attrValue = 19;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "signs", "sign", "funcs", "name", "blanks", "startS", "attrs", 
			"attr", "lexems", "nextLexem", "rules", "nextRule", "ruleContent", "ruleContentContinuation", 
			"ruleInstance", "tokenSequence", "tokenInstance", "codeValue", "attrValue"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'='", null, "'@tokens'", "'@rules'", "'@name'", "'@blank'", "'@start'", 
			"'@returns'", "'@signatures'", "'@functions'", "'::'", null, null, null, 
			"'{'", "'}'", null, "'('", "')'", "'\"'", "';'", "'|'", "','"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "WHITESPACE", "TOKENS", "RULES", "NAME", "BLANKS", "STARTS", 
			"ATTR", "SIGN", "FUNC", "DCOLON", "TERM", "NTERM", "REGEX", "LB", "RB", 
			"CODE", "LBS", "RBS", "QUOTE", "SEMICOLON", "VERT", "COMMA"
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
	public String getGrammarFileName() { return "GrammarGrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public GrammarGrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class StartContext extends ParserRuleContext {
		public GrammarHolder val = new GrammarHolder();
		public NameContext name;
		public BlanksContext blanks;
		public StartSContext startS;
		public AttrsContext attrs;
		public LexemsContext lexems;
		public SignsContext signs;
		public FuncsContext funcs;
		public RulesContext rules;
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public BlanksContext blanks() {
			return getRuleContext(BlanksContext.class,0);
		}
		public StartSContext startS() {
			return getRuleContext(StartSContext.class,0);
		}
		public AttrsContext attrs() {
			return getRuleContext(AttrsContext.class,0);
		}
		public LexemsContext lexems() {
			return getRuleContext(LexemsContext.class,0);
		}
		public SignsContext signs() {
			return getRuleContext(SignsContext.class,0);
		}
		public FuncsContext funcs() {
			return getRuleContext(FuncsContext.class,0);
		}
		public RulesContext rules() {
			return getRuleContext(RulesContext.class,0);
		}
		public TerminalNode EOF() { return getToken(GrammarGrammarParser.EOF, 0); }
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarGrammarListener ) ((GrammarGrammarListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarGrammarListener ) ((GrammarGrammarListener)listener).exitStart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarGrammarVisitor ) return ((GrammarGrammarVisitor<? extends T>)visitor).visitStart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(40);
			((StartContext)_localctx).name = name();
			setState(41);
			((StartContext)_localctx).blanks = blanks();
			setState(42);
			((StartContext)_localctx).startS = startS();
			setState(43);
			((StartContext)_localctx).attrs = attrs();
			setState(44);
			((StartContext)_localctx).lexems = lexems();
			setState(45);
			((StartContext)_localctx).signs = signs();
			setState(46);
			((StartContext)_localctx).funcs = funcs();
			setState(47);
			((StartContext)_localctx).rules = rules();
			setState(48);
			match(EOF);

			        _localctx.val.setBlanks(((StartContext)_localctx).blanks.reg);
			        _localctx.val.setStart(((StartContext)_localctx).startS.val);
			        _localctx.val.setAttr(((StartContext)_localctx).attrs.vals);
			        _localctx.val.setName(((StartContext)_localctx).name.value);
			        _localctx.val.addTokens(((StartContext)_localctx).lexems.toks);
			        _localctx.val.setSigns(((StartContext)_localctx).signs.vals);
			        _localctx.val.addFuncs(((StartContext)_localctx).funcs.val);
			        _localctx.val.addRules(((StartContext)_localctx).rules.ruls);
			    
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

	public static class SignsContext extends ParserRuleContext {
		public ArrayList<String> vals = new ArrayList<>();
		public SignContext s;
		public TerminalNode SIGN() { return getToken(GrammarGrammarParser.SIGN, 0); }
		public TerminalNode LB() { return getToken(GrammarGrammarParser.LB, 0); }
		public TerminalNode RB() { return getToken(GrammarGrammarParser.RB, 0); }
		public List<SignContext> sign() {
			return getRuleContexts(SignContext.class);
		}
		public SignContext sign(int i) {
			return getRuleContext(SignContext.class,i);
		}
		public SignsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarGrammarListener ) ((GrammarGrammarListener)listener).enterSigns(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarGrammarListener ) ((GrammarGrammarListener)listener).exitSigns(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarGrammarVisitor ) return ((GrammarGrammarVisitor<? extends T>)visitor).visitSigns(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SignsContext signs() throws RecognitionException {
		SignsContext _localctx = new SignsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_signs);
		int _la;
		try {
			setState(63);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SIGN:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(51);
				match(SIGN);
				setState(52);
				match(LB);
				setState(56); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(53);
					((SignsContext)_localctx).s = sign();
					_localctx.vals.add(((SignsContext)_localctx).s.val);
					}
					}
					setState(58); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NTERM );
				setState(60);
				match(RB);
				}
				}
				break;
			case RULES:
			case FUNC:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class SignContext extends ParserRuleContext {
		public String val;
		public Token NTERM;
		public AttrValueContext attrValue;
		public TerminalNode NTERM() { return getToken(GrammarGrammarParser.NTERM, 0); }
		public AttrValueContext attrValue() {
			return getRuleContext(AttrValueContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(GrammarGrammarParser.SEMICOLON, 0); }
		public SignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarGrammarListener ) ((GrammarGrammarListener)listener).enterSign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarGrammarListener ) ((GrammarGrammarListener)listener).exitSign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarGrammarVisitor ) return ((GrammarGrammarVisitor<? extends T>)visitor).visitSign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SignContext sign() throws RecognitionException {
		SignContext _localctx = new SignContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_sign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(65);
			((SignContext)_localctx).NTERM = match(NTERM);
			setState(66);
			((SignContext)_localctx).attrValue = attrValue();
			setState(67);
			match(SEMICOLON);

			        ((SignContext)_localctx).val =  (((SignContext)_localctx).NTERM!=null?((SignContext)_localctx).NTERM.getText():null) + ((SignContext)_localctx).attrValue.value.toString();
			    
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

	public static class FuncsContext extends ParserRuleContext {
		public String val;
		public Token CODE;
		public TerminalNode FUNC() { return getToken(GrammarGrammarParser.FUNC, 0); }
		public TerminalNode CODE() { return getToken(GrammarGrammarParser.CODE, 0); }
		public FuncsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarGrammarListener ) ((GrammarGrammarListener)listener).enterFuncs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarGrammarListener ) ((GrammarGrammarListener)listener).exitFuncs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarGrammarVisitor ) return ((GrammarGrammarVisitor<? extends T>)visitor).visitFuncs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncsContext funcs() throws RecognitionException {
		FuncsContext _localctx = new FuncsContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_funcs);
		try {
			setState(74);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FUNC:
				enterOuterAlt(_localctx, 1);
				{
				setState(70);
				match(FUNC);
				setState(71);
				((FuncsContext)_localctx).CODE = match(CODE);

				        ((FuncsContext)_localctx).val =  (((FuncsContext)_localctx).CODE!=null?((FuncsContext)_localctx).CODE.getText():null);
				    
				}
				break;
			case RULES:
				enterOuterAlt(_localctx, 2);
				{

				        ((FuncsContext)_localctx).val =  "";
				    
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

	public static class NameContext extends ParserRuleContext {
		public String value;
		public Token NTERM;
		public TerminalNode NAME() { return getToken(GrammarGrammarParser.NAME, 0); }
		public TerminalNode LB() { return getToken(GrammarGrammarParser.LB, 0); }
		public TerminalNode NTERM() { return getToken(GrammarGrammarParser.NTERM, 0); }
		public TerminalNode RB() { return getToken(GrammarGrammarParser.RB, 0); }
		public NameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarGrammarListener ) ((GrammarGrammarListener)listener).enterName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarGrammarListener ) ((GrammarGrammarListener)listener).exitName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarGrammarVisitor ) return ((GrammarGrammarVisitor<? extends T>)visitor).visitName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NameContext name() throws RecognitionException {
		NameContext _localctx = new NameContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			match(NAME);
			setState(77);
			match(LB);
			setState(78);
			((NameContext)_localctx).NTERM = match(NTERM);
			setState(79);
			match(RB);

			        ((NameContext)_localctx).value =  (((NameContext)_localctx).NTERM!=null?((NameContext)_localctx).NTERM.getText():null);
			    
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

	public static class BlanksContext extends ParserRuleContext {
		public String reg;
		public Token REGEX;
		public TerminalNode BLANKS() { return getToken(GrammarGrammarParser.BLANKS, 0); }
		public TerminalNode LB() { return getToken(GrammarGrammarParser.LB, 0); }
		public TerminalNode REGEX() { return getToken(GrammarGrammarParser.REGEX, 0); }
		public TerminalNode RB() { return getToken(GrammarGrammarParser.RB, 0); }
		public BlanksContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blanks; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarGrammarListener ) ((GrammarGrammarListener)listener).enterBlanks(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarGrammarListener ) ((GrammarGrammarListener)listener).exitBlanks(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarGrammarVisitor ) return ((GrammarGrammarVisitor<? extends T>)visitor).visitBlanks(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlanksContext blanks() throws RecognitionException {
		BlanksContext _localctx = new BlanksContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_blanks);
		try {
			setState(88);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BLANKS:
				enterOuterAlt(_localctx, 1);
				{
				setState(82);
				match(BLANKS);
				setState(83);
				match(LB);
				setState(84);
				((BlanksContext)_localctx).REGEX = match(REGEX);
				setState(85);
				match(RB);

				        ((BlanksContext)_localctx).reg =  (((BlanksContext)_localctx).REGEX!=null?((BlanksContext)_localctx).REGEX.getText():null);
				    
				}
				break;
			case STARTS:
				enterOuterAlt(_localctx, 2);
				{

				        ((BlanksContext)_localctx).reg =  "";
				    
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

	public static class StartSContext extends ParserRuleContext {
		public String val;
		public Token NTERM;
		public TerminalNode STARTS() { return getToken(GrammarGrammarParser.STARTS, 0); }
		public TerminalNode LB() { return getToken(GrammarGrammarParser.LB, 0); }
		public TerminalNode NTERM() { return getToken(GrammarGrammarParser.NTERM, 0); }
		public TerminalNode RB() { return getToken(GrammarGrammarParser.RB, 0); }
		public StartSContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_startS; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarGrammarListener ) ((GrammarGrammarListener)listener).enterStartS(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarGrammarListener ) ((GrammarGrammarListener)listener).exitStartS(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarGrammarVisitor ) return ((GrammarGrammarVisitor<? extends T>)visitor).visitStartS(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StartSContext startS() throws RecognitionException {
		StartSContext _localctx = new StartSContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_startS);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			match(STARTS);
			setState(91);
			match(LB);
			setState(92);
			((StartSContext)_localctx).NTERM = match(NTERM);
			setState(93);
			match(RB);

			        ((StartSContext)_localctx).val =  (((StartSContext)_localctx).NTERM!=null?((StartSContext)_localctx).NTERM.getText():null);
			    
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

	public static class AttrsContext extends ParserRuleContext {
		public ArrayList <String> vals = new ArrayList<>();
		public AttrContext ai;
		public TerminalNode ATTR() { return getToken(GrammarGrammarParser.ATTR, 0); }
		public TerminalNode LB() { return getToken(GrammarGrammarParser.LB, 0); }
		public TerminalNode RB() { return getToken(GrammarGrammarParser.RB, 0); }
		public List<AttrContext> attr() {
			return getRuleContexts(AttrContext.class);
		}
		public AttrContext attr(int i) {
			return getRuleContext(AttrContext.class,i);
		}
		public AttrsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attrs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarGrammarListener ) ((GrammarGrammarListener)listener).enterAttrs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarGrammarListener ) ((GrammarGrammarListener)listener).exitAttrs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarGrammarVisitor ) return ((GrammarGrammarVisitor<? extends T>)visitor).visitAttrs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttrsContext attrs() throws RecognitionException {
		AttrsContext _localctx = new AttrsContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_attrs);
		int _la;
		try {
			setState(108);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ATTR:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(96);
				match(ATTR);
				setState(97);
				match(LB);
				setState(101); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(98);
					((AttrsContext)_localctx).ai = attr();
					 _localctx.vals.add(((AttrsContext)_localctx).ai.v1); _localctx.vals.add(((AttrsContext)_localctx).ai.v2);
					}
					}
					setState(103); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NTERM );
				setState(105);
				match(RB);
				}
				}
				break;
			case TOKENS:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class AttrContext extends ParserRuleContext {
		public String v1;
		public String v2;
		public Token NTERM;
		public Token REGEX;
		public TerminalNode NTERM() { return getToken(GrammarGrammarParser.NTERM, 0); }
		public TerminalNode REGEX() { return getToken(GrammarGrammarParser.REGEX, 0); }
		public TerminalNode SEMICOLON() { return getToken(GrammarGrammarParser.SEMICOLON, 0); }
		public AttrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarGrammarListener ) ((GrammarGrammarListener)listener).enterAttr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarGrammarListener ) ((GrammarGrammarListener)listener).exitAttr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarGrammarVisitor ) return ((GrammarGrammarVisitor<? extends T>)visitor).visitAttr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttrContext attr() throws RecognitionException {
		AttrContext _localctx = new AttrContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_attr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
			((AttrContext)_localctx).NTERM = match(NTERM);
			setState(111);
			match(T__0);
			setState(112);
			((AttrContext)_localctx).REGEX = match(REGEX);
			setState(113);
			match(SEMICOLON);

			        ((AttrContext)_localctx).v1 =  (((AttrContext)_localctx).NTERM!=null?((AttrContext)_localctx).NTERM.getText():null);
			        ((AttrContext)_localctx).v2 =  (((AttrContext)_localctx).REGEX!=null?((AttrContext)_localctx).REGEX.getText():null);
			    
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

	public static class LexemsContext extends ParserRuleContext {
		public ArrayList<MyToken> toks = new ArrayList<>();
		public NextLexemContext li;
		public TerminalNode TOKENS() { return getToken(GrammarGrammarParser.TOKENS, 0); }
		public TerminalNode LB() { return getToken(GrammarGrammarParser.LB, 0); }
		public TerminalNode RB() { return getToken(GrammarGrammarParser.RB, 0); }
		public List<NextLexemContext> nextLexem() {
			return getRuleContexts(NextLexemContext.class);
		}
		public NextLexemContext nextLexem(int i) {
			return getRuleContext(NextLexemContext.class,i);
		}
		public LexemsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lexems; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarGrammarListener ) ((GrammarGrammarListener)listener).enterLexems(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarGrammarListener ) ((GrammarGrammarListener)listener).exitLexems(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarGrammarVisitor ) return ((GrammarGrammarVisitor<? extends T>)visitor).visitLexems(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LexemsContext lexems() throws RecognitionException {
		LexemsContext _localctx = new LexemsContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_lexems);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			match(TOKENS);
			setState(117);
			match(LB);
			setState(121); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(118);
				((LexemsContext)_localctx).li = nextLexem();
				_localctx.toks.add(((LexemsContext)_localctx).li.val);
				}
				}
				setState(123); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==TERM );
			setState(125);
			match(RB);
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

	public static class NextLexemContext extends ParserRuleContext {
		public MyToken val;
		public Token TERM;
		public Token REGEX;
		public TerminalNode TERM() { return getToken(GrammarGrammarParser.TERM, 0); }
		public TerminalNode DCOLON() { return getToken(GrammarGrammarParser.DCOLON, 0); }
		public TerminalNode REGEX() { return getToken(GrammarGrammarParser.REGEX, 0); }
		public TerminalNode SEMICOLON() { return getToken(GrammarGrammarParser.SEMICOLON, 0); }
		public NextLexemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nextLexem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarGrammarListener ) ((GrammarGrammarListener)listener).enterNextLexem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarGrammarListener ) ((GrammarGrammarListener)listener).exitNextLexem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarGrammarVisitor ) return ((GrammarGrammarVisitor<? extends T>)visitor).visitNextLexem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NextLexemContext nextLexem() throws RecognitionException {
		NextLexemContext _localctx = new NextLexemContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_nextLexem);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			((NextLexemContext)_localctx).TERM = match(TERM);
			setState(128);
			match(DCOLON);
			setState(129);
			((NextLexemContext)_localctx).REGEX = match(REGEX);
			setState(130);
			match(SEMICOLON);

			        ((NextLexemContext)_localctx).val =  new Term((((NextLexemContext)_localctx).TERM!=null?((NextLexemContext)_localctx).TERM.getText():null), (((NextLexemContext)_localctx).REGEX!=null?((NextLexemContext)_localctx).REGEX.getText():null));
			    
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

	public static class RulesContext extends ParserRuleContext {
		public ArrayList<Rule> ruls = new ArrayList<>();
		public NextRuleContext ri;
		public TerminalNode RULES() { return getToken(GrammarGrammarParser.RULES, 0); }
		public TerminalNode LB() { return getToken(GrammarGrammarParser.LB, 0); }
		public TerminalNode RB() { return getToken(GrammarGrammarParser.RB, 0); }
		public List<NextRuleContext> nextRule() {
			return getRuleContexts(NextRuleContext.class);
		}
		public NextRuleContext nextRule(int i) {
			return getRuleContext(NextRuleContext.class,i);
		}
		public RulesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rules; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarGrammarListener ) ((GrammarGrammarListener)listener).enterRules(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarGrammarListener ) ((GrammarGrammarListener)listener).exitRules(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarGrammarVisitor ) return ((GrammarGrammarVisitor<? extends T>)visitor).visitRules(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RulesContext rules() throws RecognitionException {
		RulesContext _localctx = new RulesContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_rules);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			match(RULES);
			setState(134);
			match(LB);
			setState(138); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(135);
				((RulesContext)_localctx).ri = nextRule();
				_localctx.ruls.addAll(((RulesContext)_localctx).ri.ruleList);
				}
				}
				setState(140); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NTERM );
			setState(142);
			match(RB);
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

	public static class NextRuleContext extends ParserRuleContext {
		public ArrayList<Rule> ruleList;
		public Token NTERM;
		public RuleContentContext ruleContent;
		public TerminalNode NTERM() { return getToken(GrammarGrammarParser.NTERM, 0); }
		public TerminalNode DCOLON() { return getToken(GrammarGrammarParser.DCOLON, 0); }
		public RuleContentContext ruleContent() {
			return getRuleContext(RuleContentContext.class,0);
		}
		public NextRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nextRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarGrammarListener ) ((GrammarGrammarListener)listener).enterNextRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarGrammarListener ) ((GrammarGrammarListener)listener).exitNextRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarGrammarVisitor ) return ((GrammarGrammarVisitor<? extends T>)visitor).visitNextRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NextRuleContext nextRule() throws RecognitionException {
		NextRuleContext _localctx = new NextRuleContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_nextRule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
			((NextRuleContext)_localctx).NTERM = match(NTERM);
			setState(145);
			match(DCOLON);
			setState(146);
			((NextRuleContext)_localctx).ruleContent = ruleContent();

			        ((NextRuleContext)_localctx).ruleList =  Rule.makeRules((((NextRuleContext)_localctx).NTERM!=null?((NextRuleContext)_localctx).NTERM.getText():null), ((NextRuleContext)_localctx).ruleContent.content.toString());
			    
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

	public static class RuleContentContext extends ParserRuleContext {
		public StringBuilder content = new StringBuilder();
		public RuleInstanceContext ri;
		public RuleContentContinuationContext rcc;
		public RuleInstanceContext ruleInstance() {
			return getRuleContext(RuleInstanceContext.class,0);
		}
		public RuleContentContinuationContext ruleContentContinuation() {
			return getRuleContext(RuleContentContinuationContext.class,0);
		}
		public RuleContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleContent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarGrammarListener ) ((GrammarGrammarListener)listener).enterRuleContent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarGrammarListener ) ((GrammarGrammarListener)listener).exitRuleContent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarGrammarVisitor ) return ((GrammarGrammarVisitor<? extends T>)visitor).visitRuleContent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RuleContentContext ruleContent() throws RecognitionException {
		RuleContentContext _localctx = new RuleContentContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_ruleContent);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			((RuleContentContext)_localctx).ri = ruleInstance();
			setState(150);
			((RuleContentContext)_localctx).rcc = ruleContentContinuation();

			        _localctx.content.append(((RuleContentContext)_localctx).ri.value);
			        _localctx.content.append(((RuleContentContext)_localctx).rcc.content);
			    
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

	public static class RuleContentContinuationContext extends ParserRuleContext {
		public StringBuilder content = new StringBuilder();
		public Token VERT;
		public RuleInstanceContext ri;
		public RuleContentContinuationContext rcc;
		public TerminalNode VERT() { return getToken(GrammarGrammarParser.VERT, 0); }
		public RuleInstanceContext ruleInstance() {
			return getRuleContext(RuleInstanceContext.class,0);
		}
		public RuleContentContinuationContext ruleContentContinuation() {
			return getRuleContext(RuleContentContinuationContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(GrammarGrammarParser.SEMICOLON, 0); }
		public RuleContentContinuationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleContentContinuation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarGrammarListener ) ((GrammarGrammarListener)listener).enterRuleContentContinuation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarGrammarListener ) ((GrammarGrammarListener)listener).exitRuleContentContinuation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarGrammarVisitor ) return ((GrammarGrammarVisitor<? extends T>)visitor).visitRuleContentContinuation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RuleContentContinuationContext ruleContentContinuation() throws RecognitionException {
		RuleContentContinuationContext _localctx = new RuleContentContinuationContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_ruleContentContinuation);
		try {
			setState(160);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VERT:
				enterOuterAlt(_localctx, 1);
				{
				setState(153);
				((RuleContentContinuationContext)_localctx).VERT = match(VERT);
				setState(154);
				((RuleContentContinuationContext)_localctx).ri = ruleInstance();
				setState(155);
				((RuleContentContinuationContext)_localctx).rcc = ruleContentContinuation();

				        _localctx.content.append((((RuleContentContinuationContext)_localctx).VERT!=null?((RuleContentContinuationContext)_localctx).VERT.getText():null));
				        _localctx.content.append(((RuleContentContinuationContext)_localctx).ri.value);
				        _localctx.content.append(((RuleContentContinuationContext)_localctx).rcc.content);
				    
				}
				break;
			case SEMICOLON:
				enterOuterAlt(_localctx, 2);
				{
				setState(158);
				match(SEMICOLON);

				    
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

	public static class RuleInstanceContext extends ParserRuleContext {
		public StringBuilder value = new StringBuilder();
		public TokenSequenceContext tokenSequence;
		public CodeValueContext c1;
		public TerminalNode LBS() { return getToken(GrammarGrammarParser.LBS, 0); }
		public TokenSequenceContext tokenSequence() {
			return getRuleContext(TokenSequenceContext.class,0);
		}
		public TerminalNode RBS() { return getToken(GrammarGrammarParser.RBS, 0); }
		public CodeValueContext codeValue() {
			return getRuleContext(CodeValueContext.class,0);
		}
		public RuleInstanceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleInstance; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarGrammarListener ) ((GrammarGrammarListener)listener).enterRuleInstance(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarGrammarListener ) ((GrammarGrammarListener)listener).exitRuleInstance(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarGrammarVisitor ) return ((GrammarGrammarVisitor<? extends T>)visitor).visitRuleInstance(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RuleInstanceContext ruleInstance() throws RecognitionException {
		RuleInstanceContext _localctx = new RuleInstanceContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_ruleInstance);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
			match(LBS);
			setState(163);
			((RuleInstanceContext)_localctx).tokenSequence = tokenSequence();
			setState(164);
			((RuleInstanceContext)_localctx).c1 = codeValue();
			setState(165);
			match(RBS);

			        _localctx.value.append(((RuleInstanceContext)_localctx).tokenSequence.value);
			        _localctx.value.append(((RuleInstanceContext)_localctx).c1.value);
			    
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

	public static class TokenSequenceContext extends ParserRuleContext {
		public StringBuilder value = new StringBuilder();
		public TokenInstanceContext t0;
		public TokenSequenceContext t1;
		public TokenInstanceContext body;
		public TerminalNode COMMA() { return getToken(GrammarGrammarParser.COMMA, 0); }
		public TokenInstanceContext tokenInstance() {
			return getRuleContext(TokenInstanceContext.class,0);
		}
		public TokenSequenceContext tokenSequence() {
			return getRuleContext(TokenSequenceContext.class,0);
		}
		public TokenSequenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tokenSequence; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarGrammarListener ) ((GrammarGrammarListener)listener).enterTokenSequence(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarGrammarListener ) ((GrammarGrammarListener)listener).exitTokenSequence(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarGrammarVisitor ) return ((GrammarGrammarVisitor<? extends T>)visitor).visitTokenSequence(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TokenSequenceContext tokenSequence() throws RecognitionException {
		TokenSequenceContext _localctx = new TokenSequenceContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_tokenSequence);
		try {
			setState(176);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(168);
				((TokenSequenceContext)_localctx).t0 = tokenInstance();
				setState(169);
				match(COMMA);
				setState(170);
				((TokenSequenceContext)_localctx).t1 = tokenSequence();

				        _localctx.value.append(((TokenSequenceContext)_localctx).t0.value);
				        _localctx.value.append(",");
				        _localctx.value.append(((TokenSequenceContext)_localctx).t1.value);
				    
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(173);
				((TokenSequenceContext)_localctx).body = tokenInstance();

				        _localctx.value.append(((TokenSequenceContext)_localctx).body.value);
				    
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

	public static class TokenInstanceContext extends ParserRuleContext {
		public StringBuilder value = new StringBuilder();
		public Token t1;
		public AttrValueContext c1;
		public AttrValueContext attrValue() {
			return getRuleContext(AttrValueContext.class,0);
		}
		public TerminalNode NTERM() { return getToken(GrammarGrammarParser.NTERM, 0); }
		public TerminalNode TERM() { return getToken(GrammarGrammarParser.TERM, 0); }
		public TokenInstanceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tokenInstance; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarGrammarListener ) ((GrammarGrammarListener)listener).enterTokenInstance(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarGrammarListener ) ((GrammarGrammarListener)listener).exitTokenInstance(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarGrammarVisitor ) return ((GrammarGrammarVisitor<? extends T>)visitor).visitTokenInstance(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TokenInstanceContext tokenInstance() throws RecognitionException {
		TokenInstanceContext _localctx = new TokenInstanceContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_tokenInstance);
		int _la;
		try {
			setState(184);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(178);
				((TokenInstanceContext)_localctx).t1 = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==TERM || _la==NTERM) ) {
					((TokenInstanceContext)_localctx).t1 = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(179);
				((TokenInstanceContext)_localctx).c1 = attrValue();

				        _localctx.value.append((((TokenInstanceContext)_localctx).t1!=null?((TokenInstanceContext)_localctx).t1.getText():null));
				        _localctx.value.append(((TokenInstanceContext)_localctx).c1.value);
				    
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(182);
				((TokenInstanceContext)_localctx).t1 = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==TERM || _la==NTERM) ) {
					((TokenInstanceContext)_localctx).t1 = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}

				        _localctx.value.append((((TokenInstanceContext)_localctx).t1!=null?((TokenInstanceContext)_localctx).t1.getText():null));
				    
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

	public static class CodeValueContext extends ParserRuleContext {
		public StringBuilder value = new StringBuilder();
		public Token DCOLON;
		public Token CODE;
		public TerminalNode DCOLON() { return getToken(GrammarGrammarParser.DCOLON, 0); }
		public TerminalNode CODE() { return getToken(GrammarGrammarParser.CODE, 0); }
		public CodeValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_codeValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarGrammarListener ) ((GrammarGrammarListener)listener).enterCodeValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarGrammarListener ) ((GrammarGrammarListener)listener).exitCodeValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarGrammarVisitor ) return ((GrammarGrammarVisitor<? extends T>)visitor).visitCodeValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CodeValueContext codeValue() throws RecognitionException {
		CodeValueContext _localctx = new CodeValueContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_codeValue);
		try {
			setState(190);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DCOLON:
				enterOuterAlt(_localctx, 1);
				{
				setState(186);
				((CodeValueContext)_localctx).DCOLON = match(DCOLON);
				setState(187);
				((CodeValueContext)_localctx).CODE = match(CODE);

				        _localctx.value.append((((CodeValueContext)_localctx).DCOLON!=null?((CodeValueContext)_localctx).DCOLON.getText():null));
				        _localctx.value.append((((CodeValueContext)_localctx).CODE!=null?((CodeValueContext)_localctx).CODE.getText():null));
				    
				}
				break;
			case RBS:
				enterOuterAlt(_localctx, 2);
				{

				    
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

	public static class AttrValueContext extends ParserRuleContext {
		public StringBuilder value = new StringBuilder();
		public Token CODE;
		public TerminalNode CODE() { return getToken(GrammarGrammarParser.CODE, 0); }
		public AttrValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attrValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarGrammarListener ) ((GrammarGrammarListener)listener).enterAttrValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarGrammarListener ) ((GrammarGrammarListener)listener).exitAttrValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarGrammarVisitor ) return ((GrammarGrammarVisitor<? extends T>)visitor).visitAttrValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttrValueContext attrValue() throws RecognitionException {
		AttrValueContext _localctx = new AttrValueContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_attrValue);
		try {
			setState(195);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CODE:
				enterOuterAlt(_localctx, 1);
				{
				setState(192);
				((AttrValueContext)_localctx).CODE = match(CODE);

				        _localctx.value.append((((AttrValueContext)_localctx).CODE!=null?((AttrValueContext)_localctx).CODE.getText():null));
				    
				}
				break;
			case DCOLON:
			case RBS:
			case SEMICOLON:
			case COMMA:
				enterOuterAlt(_localctx, 2);
				{


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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\31\u00c8\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\3\3\3\3\3\3\3\3\3\6\3;\n\3\r\3\16\3<\3\3\3\3\3\3\5\3B\n\3\3\4\3"+
		"\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\5\5M\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\5\7[\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3"+
		"\t\6\th\n\t\r\t\16\ti\3\t\3\t\3\t\5\to\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\13"+
		"\3\13\3\13\3\13\3\13\6\13|\n\13\r\13\16\13}\3\13\3\13\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\r\3\r\3\r\3\r\3\r\6\r\u008d\n\r\r\r\16\r\u008e\3\r\3\r\3\16"+
		"\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\5\20\u00a3\n\20\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\5\22\u00b3\n\22\3\23\3\23\3\23\3\23\3\23\3\23\5\23"+
		"\u00bb\n\23\3\24\3\24\3\24\3\24\5\24\u00c1\n\24\3\25\3\25\3\25\5\25\u00c6"+
		"\n\25\3\25\2\2\26\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(\2\3\3\2"+
		"\16\17\2\u00c0\2*\3\2\2\2\4A\3\2\2\2\6C\3\2\2\2\bL\3\2\2\2\nN\3\2\2\2"+
		"\fZ\3\2\2\2\16\\\3\2\2\2\20n\3\2\2\2\22p\3\2\2\2\24v\3\2\2\2\26\u0081"+
		"\3\2\2\2\30\u0087\3\2\2\2\32\u0092\3\2\2\2\34\u0097\3\2\2\2\36\u00a2\3"+
		"\2\2\2 \u00a4\3\2\2\2\"\u00b2\3\2\2\2$\u00ba\3\2\2\2&\u00c0\3\2\2\2(\u00c5"+
		"\3\2\2\2*+\5\n\6\2+,\5\f\7\2,-\5\16\b\2-.\5\20\t\2./\5\24\13\2/\60\5\4"+
		"\3\2\60\61\5\b\5\2\61\62\5\30\r\2\62\63\7\2\2\3\63\64\b\2\1\2\64\3\3\2"+
		"\2\2\65\66\7\13\2\2\66:\7\21\2\2\678\5\6\4\289\b\3\1\29;\3\2\2\2:\67\3"+
		"\2\2\2;<\3\2\2\2<:\3\2\2\2<=\3\2\2\2=>\3\2\2\2>?\7\22\2\2?B\3\2\2\2@B"+
		"\b\3\1\2A\65\3\2\2\2A@\3\2\2\2B\5\3\2\2\2CD\7\17\2\2DE\5(\25\2EF\7\27"+
		"\2\2FG\b\4\1\2G\7\3\2\2\2HI\7\f\2\2IJ\7\23\2\2JM\b\5\1\2KM\b\5\1\2LH\3"+
		"\2\2\2LK\3\2\2\2M\t\3\2\2\2NO\7\7\2\2OP\7\21\2\2PQ\7\17\2\2QR\7\22\2\2"+
		"RS\b\6\1\2S\13\3\2\2\2TU\7\b\2\2UV\7\21\2\2VW\7\20\2\2WX\7\22\2\2X[\b"+
		"\7\1\2Y[\b\7\1\2ZT\3\2\2\2ZY\3\2\2\2[\r\3\2\2\2\\]\7\t\2\2]^\7\21\2\2"+
		"^_\7\17\2\2_`\7\22\2\2`a\b\b\1\2a\17\3\2\2\2bc\7\n\2\2cg\7\21\2\2de\5"+
		"\22\n\2ef\b\t\1\2fh\3\2\2\2gd\3\2\2\2hi\3\2\2\2ig\3\2\2\2ij\3\2\2\2jk"+
		"\3\2\2\2kl\7\22\2\2lo\3\2\2\2mo\b\t\1\2nb\3\2\2\2nm\3\2\2\2o\21\3\2\2"+
		"\2pq\7\17\2\2qr\7\3\2\2rs\7\20\2\2st\7\27\2\2tu\b\n\1\2u\23\3\2\2\2vw"+
		"\7\5\2\2w{\7\21\2\2xy\5\26\f\2yz\b\13\1\2z|\3\2\2\2{x\3\2\2\2|}\3\2\2"+
		"\2}{\3\2\2\2}~\3\2\2\2~\177\3\2\2\2\177\u0080\7\22\2\2\u0080\25\3\2\2"+
		"\2\u0081\u0082\7\16\2\2\u0082\u0083\7\r\2\2\u0083\u0084\7\20\2\2\u0084"+
		"\u0085\7\27\2\2\u0085\u0086\b\f\1\2\u0086\27\3\2\2\2\u0087\u0088\7\6\2"+
		"\2\u0088\u008c\7\21\2\2\u0089\u008a\5\32\16\2\u008a\u008b\b\r\1\2\u008b"+
		"\u008d\3\2\2\2\u008c\u0089\3\2\2\2\u008d\u008e\3\2\2\2\u008e\u008c\3\2"+
		"\2\2\u008e\u008f\3\2\2\2\u008f\u0090\3\2\2\2\u0090\u0091\7\22\2\2\u0091"+
		"\31\3\2\2\2\u0092\u0093\7\17\2\2\u0093\u0094\7\r\2\2\u0094\u0095\5\34"+
		"\17\2\u0095\u0096\b\16\1\2\u0096\33\3\2\2\2\u0097\u0098\5 \21\2\u0098"+
		"\u0099\5\36\20\2\u0099\u009a\b\17\1\2\u009a\35\3\2\2\2\u009b\u009c\7\30"+
		"\2\2\u009c\u009d\5 \21\2\u009d\u009e\5\36\20\2\u009e\u009f\b\20\1\2\u009f"+
		"\u00a3\3\2\2\2\u00a0\u00a1\7\27\2\2\u00a1\u00a3\b\20\1\2\u00a2\u009b\3"+
		"\2\2\2\u00a2\u00a0\3\2\2\2\u00a3\37\3\2\2\2\u00a4\u00a5\7\24\2\2\u00a5"+
		"\u00a6\5\"\22\2\u00a6\u00a7\5&\24\2\u00a7\u00a8\7\25\2\2\u00a8\u00a9\b"+
		"\21\1\2\u00a9!\3\2\2\2\u00aa\u00ab\5$\23\2\u00ab\u00ac\7\31\2\2\u00ac"+
		"\u00ad\5\"\22\2\u00ad\u00ae\b\22\1\2\u00ae\u00b3\3\2\2\2\u00af\u00b0\5"+
		"$\23\2\u00b0\u00b1\b\22\1\2\u00b1\u00b3\3\2\2\2\u00b2\u00aa\3\2\2\2\u00b2"+
		"\u00af\3\2\2\2\u00b3#\3\2\2\2\u00b4\u00b5\t\2\2\2\u00b5\u00b6\5(\25\2"+
		"\u00b6\u00b7\b\23\1\2\u00b7\u00bb\3\2\2\2\u00b8\u00b9\t\2\2\2\u00b9\u00bb"+
		"\b\23\1\2\u00ba\u00b4\3\2\2\2\u00ba\u00b8\3\2\2\2\u00bb%\3\2\2\2\u00bc"+
		"\u00bd\7\r\2\2\u00bd\u00be\7\23\2\2\u00be\u00c1\b\24\1\2\u00bf\u00c1\b"+
		"\24\1\2\u00c0\u00bc\3\2\2\2\u00c0\u00bf\3\2\2\2\u00c1\'\3\2\2\2\u00c2"+
		"\u00c3\7\23\2\2\u00c3\u00c6\b\25\1\2\u00c4\u00c6\b\25\1\2\u00c5\u00c2"+
		"\3\2\2\2\u00c5\u00c4\3\2\2\2\u00c6)\3\2\2\2\17<ALZin}\u008e\u00a2\u00b2"+
		"\u00ba\u00c0\u00c5";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}