// Generated from C:/Git/Calculator/src/main/antlr4/com/synopsys/homework\CalcGrammar.g4 by ANTLR 4.5.1
package com.synopsys.homework.parser;

    import java.util.Map;
    import java.util.HashMap;

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
		RULE_mult_expr = 4, RULE_div_expr = 5, RULE_let_expr = 6, RULE_set_variable = 7, 
		RULE_expr_or_num = 8;
	public static final String[] ruleNames = {
		"eval", "expression", "add_expr", "sub_expr", "mult_expr", "div_expr", 
		"let_expr", "set_variable", "expr_or_num"
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


	    private Map<String, Integer> vars = new HashMap<>();

	public CalcGrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class EvalContext extends ParserRuleContext {
		public int value;
		public ExpressionContext exp;
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
			setState(18);
			((EvalContext)_localctx).exp = expression();
			((EvalContext)_localctx).value =  ((EvalContext)_localctx).exp.value;
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
		public int value;
		public Add_exprContext exp1;
		public Sub_exprContext exp2;
		public Mult_exprContext exp3;
		public Div_exprContext exp4;
		public Let_exprContext exp5;
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
			setState(36);
			switch (_input.LA(1)) {
			case ADD:
				enterOuterAlt(_localctx, 1);
				{
				setState(21);
				((ExpressionContext)_localctx).exp1 = add_expr();
				((ExpressionContext)_localctx).value =  ((ExpressionContext)_localctx).exp1.value;
				}
				break;
			case SUB:
				enterOuterAlt(_localctx, 2);
				{
				setState(24);
				((ExpressionContext)_localctx).exp2 = sub_expr();
				((ExpressionContext)_localctx).value =  ((ExpressionContext)_localctx).exp2.value;
				}
				break;
			case MULT:
				enterOuterAlt(_localctx, 3);
				{
				setState(27);
				((ExpressionContext)_localctx).exp3 = mult_expr();
				((ExpressionContext)_localctx).value =  ((ExpressionContext)_localctx).exp3.value;
				}
				break;
			case DIV:
				enterOuterAlt(_localctx, 4);
				{
				setState(30);
				((ExpressionContext)_localctx).exp4 = div_expr();
				((ExpressionContext)_localctx).value =  ((ExpressionContext)_localctx).exp4.value;
				}
				break;
			case LET:
				enterOuterAlt(_localctx, 5);
				{
				setState(33);
				((ExpressionContext)_localctx).exp5 = let_expr();
				((ExpressionContext)_localctx).value =  ((ExpressionContext)_localctx).exp5.value;
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
		public int value;
		public Expr_or_numContext a1;
		public Expr_or_numContext a2;
		public TerminalNode ADD() { return getToken(CalcGrammarParser.ADD, 0); }
		public TerminalNode LPAREN() { return getToken(CalcGrammarParser.LPAREN, 0); }
		public TerminalNode COMMA() { return getToken(CalcGrammarParser.COMMA, 0); }
		public TerminalNode RPAREN() { return getToken(CalcGrammarParser.RPAREN, 0); }
		public List<Expr_or_numContext> expr_or_num() {
			return getRuleContexts(Expr_or_numContext.class);
		}
		public Expr_or_numContext expr_or_num(int i) {
			return getRuleContext(Expr_or_numContext.class,i);
		}
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
			setState(38);
			match(ADD);
			setState(39);
			match(LPAREN);
			setState(40);
			((Add_exprContext)_localctx).a1 = expr_or_num();
			setState(41);
			match(COMMA);
			setState(42);
			((Add_exprContext)_localctx).a2 = expr_or_num();
			setState(43);
			match(RPAREN);
			((Add_exprContext)_localctx).value =  ((Add_exprContext)_localctx).a1.value + ((Add_exprContext)_localctx).a2.value;
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
		public int value;
		public Expr_or_numContext s1;
		public Expr_or_numContext s2;
		public TerminalNode SUB() { return getToken(CalcGrammarParser.SUB, 0); }
		public TerminalNode LPAREN() { return getToken(CalcGrammarParser.LPAREN, 0); }
		public TerminalNode COMMA() { return getToken(CalcGrammarParser.COMMA, 0); }
		public TerminalNode RPAREN() { return getToken(CalcGrammarParser.RPAREN, 0); }
		public List<Expr_or_numContext> expr_or_num() {
			return getRuleContexts(Expr_or_numContext.class);
		}
		public Expr_or_numContext expr_or_num(int i) {
			return getRuleContext(Expr_or_numContext.class,i);
		}
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
			setState(46);
			match(SUB);
			setState(47);
			match(LPAREN);
			setState(48);
			((Sub_exprContext)_localctx).s1 = expr_or_num();
			setState(49);
			match(COMMA);
			setState(50);
			((Sub_exprContext)_localctx).s2 = expr_or_num();
			setState(51);
			match(RPAREN);
			((Sub_exprContext)_localctx).value =  ((Sub_exprContext)_localctx).s1.value - ((Sub_exprContext)_localctx).s2.value;
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
		public int value;
		public Expr_or_numContext m1;
		public Expr_or_numContext m2;
		public TerminalNode MULT() { return getToken(CalcGrammarParser.MULT, 0); }
		public TerminalNode LPAREN() { return getToken(CalcGrammarParser.LPAREN, 0); }
		public TerminalNode COMMA() { return getToken(CalcGrammarParser.COMMA, 0); }
		public TerminalNode RPAREN() { return getToken(CalcGrammarParser.RPAREN, 0); }
		public List<Expr_or_numContext> expr_or_num() {
			return getRuleContexts(Expr_or_numContext.class);
		}
		public Expr_or_numContext expr_or_num(int i) {
			return getRuleContext(Expr_or_numContext.class,i);
		}
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
			setState(54);
			match(MULT);
			setState(55);
			match(LPAREN);
			setState(56);
			((Mult_exprContext)_localctx).m1 = expr_or_num();
			setState(57);
			match(COMMA);
			setState(58);
			((Mult_exprContext)_localctx).m2 = expr_or_num();
			setState(59);
			match(RPAREN);
			((Mult_exprContext)_localctx).value =  ((Mult_exprContext)_localctx).m1.value * ((Mult_exprContext)_localctx).m2.value;
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
		public int value;
		public Expr_or_numContext d1;
		public Expr_or_numContext d2;
		public TerminalNode DIV() { return getToken(CalcGrammarParser.DIV, 0); }
		public TerminalNode LPAREN() { return getToken(CalcGrammarParser.LPAREN, 0); }
		public TerminalNode COMMA() { return getToken(CalcGrammarParser.COMMA, 0); }
		public TerminalNode RPAREN() { return getToken(CalcGrammarParser.RPAREN, 0); }
		public List<Expr_or_numContext> expr_or_num() {
			return getRuleContexts(Expr_or_numContext.class);
		}
		public Expr_or_numContext expr_or_num(int i) {
			return getRuleContext(Expr_or_numContext.class,i);
		}
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
			setState(62);
			match(DIV);
			setState(63);
			match(LPAREN);
			setState(64);
			((Div_exprContext)_localctx).d1 = expr_or_num();
			setState(65);
			match(COMMA);
			setState(66);
			((Div_exprContext)_localctx).d2 = expr_or_num();
			setState(67);
			match(RPAREN);
			((Div_exprContext)_localctx).value =  ((Div_exprContext)_localctx).d1.value / ((Div_exprContext)_localctx).d2.value;
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
		public int value;
		public ExpressionContext exp;
		public TerminalNode LET() { return getToken(CalcGrammarParser.LET, 0); }
		public TerminalNode LPAREN() { return getToken(CalcGrammarParser.LPAREN, 0); }
		public Set_variableContext set_variable() {
			return getRuleContext(Set_variableContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(CalcGrammarParser.COMMA, 0); }
		public TerminalNode RPAREN() { return getToken(CalcGrammarParser.RPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
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
			setState(70);
			match(LET);
			setState(71);
			match(LPAREN);
			setState(72);
			set_variable();
			setState(73);
			match(COMMA);
			setState(74);
			((Let_exprContext)_localctx).exp = expression();
			setState(75);
			match(RPAREN);
			((Let_exprContext)_localctx).value =  ((Let_exprContext)_localctx).exp.value;
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

	public static class Set_variableContext extends ParserRuleContext {
		public Token bind;
		public Expr_or_numContext value;
		public TerminalNode COMMA() { return getToken(CalcGrammarParser.COMMA, 0); }
		public TerminalNode VARIABLE() { return getToken(CalcGrammarParser.VARIABLE, 0); }
		public Expr_or_numContext expr_or_num() {
			return getRuleContext(Expr_or_numContext.class,0);
		}
		public Set_variableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_set_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalcGrammarListener ) ((CalcGrammarListener)listener).enterSet_variable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalcGrammarListener ) ((CalcGrammarListener)listener).exitSet_variable(this);
		}
	}

	public final Set_variableContext set_variable() throws RecognitionException {
		Set_variableContext _localctx = new Set_variableContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_set_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			((Set_variableContext)_localctx).bind = match(VARIABLE);
			setState(79);
			match(COMMA);
			setState(80);
			((Set_variableContext)_localctx).value = expr_or_num();
			vars.put((((Set_variableContext)_localctx).bind!=null?((Set_variableContext)_localctx).bind.getText():null), ((Set_variableContext)_localctx).value.value);
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
		public int value;
		public ExpressionContext exp;
		public Token n;
		public Token var;
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
		enterRule(_localctx, 16, RULE_expr_or_num);
		try {
			setState(90);
			switch (_input.LA(1)) {
			case ADD:
			case SUB:
			case MULT:
			case DIV:
			case LET:
				enterOuterAlt(_localctx, 1);
				{
				setState(83);
				((Expr_or_numContext)_localctx).exp = expression();
				((Expr_or_numContext)_localctx).value =  ((Expr_or_numContext)_localctx).exp.value;
				}
				break;
			case NUMBER:
				enterOuterAlt(_localctx, 2);
				{
				setState(86);
				((Expr_or_numContext)_localctx).n = match(NUMBER);
				((Expr_or_numContext)_localctx).value =  Integer.parseInt((((Expr_or_numContext)_localctx).n!=null?((Expr_or_numContext)_localctx).n.getText():null));
				}
				break;
			case VARIABLE:
				enterOuterAlt(_localctx, 3);
				{
				setState(88);
				((Expr_or_numContext)_localctx).var = match(VARIABLE);
				((Expr_or_numContext)_localctx).value =  vars.get((((Expr_or_numContext)_localctx).var!=null?((Expr_or_numContext)_localctx).var.getText():null));
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\r_\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\3\2\3\2\3\2"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3\'\n\3"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5"+
		"\n]\n\n\3\n\2\2\13\2\4\6\b\n\f\16\20\22\2\2[\2\24\3\2\2\2\4&\3\2\2\2\6"+
		"(\3\2\2\2\b\60\3\2\2\2\n8\3\2\2\2\f@\3\2\2\2\16H\3\2\2\2\20P\3\2\2\2\22"+
		"\\\3\2\2\2\24\25\5\4\3\2\25\26\b\2\1\2\26\3\3\2\2\2\27\30\5\6\4\2\30\31"+
		"\b\3\1\2\31\'\3\2\2\2\32\33\5\b\5\2\33\34\b\3\1\2\34\'\3\2\2\2\35\36\5"+
		"\n\6\2\36\37\b\3\1\2\37\'\3\2\2\2 !\5\f\7\2!\"\b\3\1\2\"\'\3\2\2\2#$\5"+
		"\16\b\2$%\b\3\1\2%\'\3\2\2\2&\27\3\2\2\2&\32\3\2\2\2&\35\3\2\2\2& \3\2"+
		"\2\2&#\3\2\2\2\'\5\3\2\2\2()\7\3\2\2)*\7\b\2\2*+\5\22\n\2+,\7\n\2\2,-"+
		"\5\22\n\2-.\7\t\2\2./\b\4\1\2/\7\3\2\2\2\60\61\7\4\2\2\61\62\7\b\2\2\62"+
		"\63\5\22\n\2\63\64\7\n\2\2\64\65\5\22\n\2\65\66\7\t\2\2\66\67\b\5\1\2"+
		"\67\t\3\2\2\289\7\5\2\29:\7\b\2\2:;\5\22\n\2;<\7\n\2\2<=\5\22\n\2=>\7"+
		"\t\2\2>?\b\6\1\2?\13\3\2\2\2@A\7\6\2\2AB\7\b\2\2BC\5\22\n\2CD\7\n\2\2"+
		"DE\5\22\n\2EF\7\t\2\2FG\b\7\1\2G\r\3\2\2\2HI\7\7\2\2IJ\7\b\2\2JK\5\20"+
		"\t\2KL\7\n\2\2LM\5\4\3\2MN\7\t\2\2NO\b\b\1\2O\17\3\2\2\2PQ\7\f\2\2QR\7"+
		"\n\2\2RS\5\22\n\2ST\b\t\1\2T\21\3\2\2\2UV\5\4\3\2VW\b\n\1\2W]\3\2\2\2"+
		"XY\7\13\2\2Y]\b\n\1\2Z[\7\f\2\2[]\b\n\1\2\\U\3\2\2\2\\X\3\2\2\2\\Z\3\2"+
		"\2\2]\23\3\2\2\2\4&\\";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}