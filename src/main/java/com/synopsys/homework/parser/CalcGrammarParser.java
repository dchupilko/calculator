// Generated from C:/Git/Calculator/src/main/antlr4/com/synopsys/homework\CalcGrammar.g4 by ANTLR 4.5.1
package com.synopsys.homework.parser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CalcGrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ADD=1, SUB=2, MULT=3, DIV=4, LET=5, LPAREN=6, RPAREN=7, COMMA=8, NUMBER=9, 
		VARIABLE=10, WS=11;
	public static final int
		RULE_eval = 0, RULE_expression = 1, RULE_add_expr = 2, RULE_sub_expr = 3, 
		RULE_mult_expr = 4, RULE_div_expr = 5, RULE_let_expr = 6, RULE_expr_or_num = 7;
	public static final String[] ruleNames = {
		"eval", "expression", "add_expr", "sub_expr", "mult_expr", "div_expr", 
		"let_expr", "expr_or_num"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'add'", "'sub'", "'mult'", "'div'", "'let'", "'('", "')'", "','"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "ADD", "SUB", "MULT", "DIV", "LET", "LPAREN", "RPAREN", "COMMA", 
		"NUMBER", "VARIABLE", "WS"
	};
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
	public String getGrammarFileName() { return "CalcGrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CalcGrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class EvalContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public EvalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eval; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalcGrammarListener ) ((CalcGrammarListener)listener).enterEval(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalcGrammarListener ) ((CalcGrammarListener)listener).exitEval(this);
		}
	}

	public final EvalContext eval() throws RecognitionException {
		EvalContext _localctx = new EvalContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_eval);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(16);
			expression();
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
		public Add_exprContext add_expr() {
			return getRuleContext(Add_exprContext.class,0);
		}
		public Sub_exprContext sub_expr() {
			return getRuleContext(Sub_exprContext.class,0);
		}
		public Mult_exprContext mult_expr() {
			return getRuleContext(Mult_exprContext.class,0);
		}
		public Div_exprContext div_expr() {
			return getRuleContext(Div_exprContext.class,0);
		}
		public Let_exprContext let_expr() {
			return getRuleContext(Let_exprContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalcGrammarListener ) ((CalcGrammarListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalcGrammarListener ) ((CalcGrammarListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_expression);
		try {
			setState(23);
			switch (_input.LA(1)) {
			case ADD:
				enterOuterAlt(_localctx, 1);
				{
				setState(18);
				add_expr();
				}
				break;
			case SUB:
				enterOuterAlt(_localctx, 2);
				{
				setState(19);
				sub_expr();
				}
				break;
			case MULT:
				enterOuterAlt(_localctx, 3);
				{
				setState(20);
				mult_expr();
				}
				break;
			case DIV:
				enterOuterAlt(_localctx, 4);
				{
				setState(21);
				div_expr();
				}
				break;
			case LET:
				enterOuterAlt(_localctx, 5);
				{
				setState(22);
				let_expr();
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

	public static class Add_exprContext extends ParserRuleContext {
		public TerminalNode ADD() { return getToken(CalcGrammarParser.ADD, 0); }
		public TerminalNode LPAREN() { return getToken(CalcGrammarParser.LPAREN, 0); }
		public List<Expr_or_numContext> expr_or_num() {
			return getRuleContexts(Expr_or_numContext.class);
		}
		public Expr_or_numContext expr_or_num(int i) {
			return getRuleContext(Expr_or_numContext.class,i);
		}
		public TerminalNode COMMA() { return getToken(CalcGrammarParser.COMMA, 0); }
		public TerminalNode RPAREN() { return getToken(CalcGrammarParser.RPAREN, 0); }
		public Add_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_add_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalcGrammarListener ) ((CalcGrammarListener)listener).enterAdd_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalcGrammarListener ) ((CalcGrammarListener)listener).exitAdd_expr(this);
		}
	}

	public final Add_exprContext add_expr() throws RecognitionException {
		Add_exprContext _localctx = new Add_exprContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_add_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(25);
			match(ADD);
			setState(26);
			match(LPAREN);
			setState(27);
			expr_or_num();
			setState(28);
			match(COMMA);
			setState(29);
			expr_or_num();
			setState(30);
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

	public static class Sub_exprContext extends ParserRuleContext {
		public TerminalNode SUB() { return getToken(CalcGrammarParser.SUB, 0); }
		public TerminalNode LPAREN() { return getToken(CalcGrammarParser.LPAREN, 0); }
		public List<Expr_or_numContext> expr_or_num() {
			return getRuleContexts(Expr_or_numContext.class);
		}
		public Expr_or_numContext expr_or_num(int i) {
			return getRuleContext(Expr_or_numContext.class,i);
		}
		public TerminalNode COMMA() { return getToken(CalcGrammarParser.COMMA, 0); }
		public TerminalNode RPAREN() { return getToken(CalcGrammarParser.RPAREN, 0); }
		public Sub_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sub_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalcGrammarListener ) ((CalcGrammarListener)listener).enterSub_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalcGrammarListener ) ((CalcGrammarListener)listener).exitSub_expr(this);
		}
	}

	public final Sub_exprContext sub_expr() throws RecognitionException {
		Sub_exprContext _localctx = new Sub_exprContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_sub_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(32);
			match(SUB);
			setState(33);
			match(LPAREN);
			setState(34);
			expr_or_num();
			setState(35);
			match(COMMA);
			setState(36);
			expr_or_num();
			setState(37);
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

	public static class Mult_exprContext extends ParserRuleContext {
		public TerminalNode MULT() { return getToken(CalcGrammarParser.MULT, 0); }
		public TerminalNode LPAREN() { return getToken(CalcGrammarParser.LPAREN, 0); }
		public List<Expr_or_numContext> expr_or_num() {
			return getRuleContexts(Expr_or_numContext.class);
		}
		public Expr_or_numContext expr_or_num(int i) {
			return getRuleContext(Expr_or_numContext.class,i);
		}
		public TerminalNode COMMA() { return getToken(CalcGrammarParser.COMMA, 0); }
		public TerminalNode RPAREN() { return getToken(CalcGrammarParser.RPAREN, 0); }
		public Mult_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mult_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalcGrammarListener ) ((CalcGrammarListener)listener).enterMult_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalcGrammarListener ) ((CalcGrammarListener)listener).exitMult_expr(this);
		}
	}

	public final Mult_exprContext mult_expr() throws RecognitionException {
		Mult_exprContext _localctx = new Mult_exprContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_mult_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(39);
			match(MULT);
			setState(40);
			match(LPAREN);
			setState(41);
			expr_or_num();
			setState(42);
			match(COMMA);
			setState(43);
			expr_or_num();
			setState(44);
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

	public static class Div_exprContext extends ParserRuleContext {
		public TerminalNode DIV() { return getToken(CalcGrammarParser.DIV, 0); }
		public TerminalNode LPAREN() { return getToken(CalcGrammarParser.LPAREN, 0); }
		public List<Expr_or_numContext> expr_or_num() {
			return getRuleContexts(Expr_or_numContext.class);
		}
		public Expr_or_numContext expr_or_num(int i) {
			return getRuleContext(Expr_or_numContext.class,i);
		}
		public TerminalNode COMMA() { return getToken(CalcGrammarParser.COMMA, 0); }
		public TerminalNode RPAREN() { return getToken(CalcGrammarParser.RPAREN, 0); }
		public Div_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_div_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalcGrammarListener ) ((CalcGrammarListener)listener).enterDiv_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalcGrammarListener ) ((CalcGrammarListener)listener).exitDiv_expr(this);
		}
	}

	public final Div_exprContext div_expr() throws RecognitionException {
		Div_exprContext _localctx = new Div_exprContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_div_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(46);
			match(DIV);
			setState(47);
			match(LPAREN);
			setState(48);
			expr_or_num();
			setState(49);
			match(COMMA);
			setState(50);
			expr_or_num();
			setState(51);
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

	public static class Let_exprContext extends ParserRuleContext {
		public TerminalNode LET() { return getToken(CalcGrammarParser.LET, 0); }
		public TerminalNode LPAREN() { return getToken(CalcGrammarParser.LPAREN, 0); }
		public TerminalNode VARIABLE() { return getToken(CalcGrammarParser.VARIABLE, 0); }
		public List<TerminalNode> COMMA() { return getTokens(CalcGrammarParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CalcGrammarParser.COMMA, i);
		}
		public Expr_or_numContext expr_or_num() {
			return getRuleContext(Expr_or_numContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(CalcGrammarParser.RPAREN, 0); }
		public Let_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_let_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalcGrammarListener ) ((CalcGrammarListener)listener).enterLet_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalcGrammarListener ) ((CalcGrammarListener)listener).exitLet_expr(this);
		}
	}

	public final Let_exprContext let_expr() throws RecognitionException {
		Let_exprContext _localctx = new Let_exprContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_let_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(53);
			match(LET);
			setState(54);
			match(LPAREN);
			setState(55);
			match(VARIABLE);
			setState(56);
			match(COMMA);
			setState(57);
			expr_or_num();
			setState(58);
			match(COMMA);
			setState(59);
			expression();
			setState(60);
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

	public static class Expr_or_numContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode NUMBER() { return getToken(CalcGrammarParser.NUMBER, 0); }
		public TerminalNode VARIABLE() { return getToken(CalcGrammarParser.VARIABLE, 0); }
		public Expr_or_numContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_or_num; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalcGrammarListener ) ((CalcGrammarListener)listener).enterExpr_or_num(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalcGrammarListener ) ((CalcGrammarListener)listener).exitExpr_or_num(this);
		}
	}

	public final Expr_or_numContext expr_or_num() throws RecognitionException {
		Expr_or_numContext _localctx = new Expr_or_numContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_expr_or_num);
		try {
			setState(65);
			switch (_input.LA(1)) {
			case ADD:
			case SUB:
			case MULT:
			case DIV:
			case LET:
				enterOuterAlt(_localctx, 1);
				{
				setState(62);
				expression();
				}
				break;
			case NUMBER:
				enterOuterAlt(_localctx, 2);
				{
				setState(63);
				match(NUMBER);
				}
				break;
			case VARIABLE:
				enterOuterAlt(_localctx, 3);
				{
				setState(64);
				match(VARIABLE);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\rF\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\3\2\3\2\3\3\3\3\3\3"+
		"\3\3\3\3\5\3\32\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\5\tD\n\t\3\t\2\2\n\2\4\6\b\n"+
		"\f\16\20\2\2C\2\22\3\2\2\2\4\31\3\2\2\2\6\33\3\2\2\2\b\"\3\2\2\2\n)\3"+
		"\2\2\2\f\60\3\2\2\2\16\67\3\2\2\2\20C\3\2\2\2\22\23\5\4\3\2\23\3\3\2\2"+
		"\2\24\32\5\6\4\2\25\32\5\b\5\2\26\32\5\n\6\2\27\32\5\f\7\2\30\32\5\16"+
		"\b\2\31\24\3\2\2\2\31\25\3\2\2\2\31\26\3\2\2\2\31\27\3\2\2\2\31\30\3\2"+
		"\2\2\32\5\3\2\2\2\33\34\7\3\2\2\34\35\7\b\2\2\35\36\5\20\t\2\36\37\7\n"+
		"\2\2\37 \5\20\t\2 !\7\t\2\2!\7\3\2\2\2\"#\7\4\2\2#$\7\b\2\2$%\5\20\t\2"+
		"%&\7\n\2\2&\'\5\20\t\2\'(\7\t\2\2(\t\3\2\2\2)*\7\5\2\2*+\7\b\2\2+,\5\20"+
		"\t\2,-\7\n\2\2-.\5\20\t\2./\7\t\2\2/\13\3\2\2\2\60\61\7\6\2\2\61\62\7"+
		"\b\2\2\62\63\5\20\t\2\63\64\7\n\2\2\64\65\5\20\t\2\65\66\7\t\2\2\66\r"+
		"\3\2\2\2\678\7\7\2\289\7\b\2\29:\7\f\2\2:;\7\n\2\2;<\5\20\t\2<=\7\n\2"+
		"\2=>\5\4\3\2>?\7\t\2\2?\17\3\2\2\2@D\5\4\3\2AD\7\13\2\2BD\7\f\2\2C@\3"+
		"\2\2\2CA\3\2\2\2CB\3\2\2\2D\21\3\2\2\2\4\31C";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}