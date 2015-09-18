// Generated from gram.g4 by ANTLR 4.4
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class gramParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__12=1, T__11=2, T__10=3, T__9=4, T__8=5, T__7=6, T__6=7, T__5=8, T__4=9, 
		T__3=10, T__2=11, T__1=12, T__0=13;
	public static final String[] tokenNames = {
		"<INVALID>", "'GEO'", "'MIN'", "'MAX'", "'AVG'", "')'", "'9'", "'CHN'", 
		"'('", "'MED'", "'HAR'", "'0'", "'SDE'", "'VAR'"
	};
	public static final int
		RULE_start = 0, RULE_main_func = 1, RULE_func = 2, RULE_classyfunc = 3, 
		RULE_funcs = 4, RULE_l_otwarcie = 5, RULE_l_nawias = 6, RULE_p_zamkniecie = 7, 
		RULE_p_nawias = 8, RULE_liczba = 9, RULE_liczba_ = 10;
	public static final String[] ruleNames = {
		"start", "main_func", "func", "classyfunc", "funcs", "l_otwarcie", "l_nawias", 
		"p_zamkniecie", "p_nawias", "liczba", "liczba_"
	};

	@Override
	public String getGrammarFileName() { return "gram.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public gramParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class StartContext extends ParserRuleContext {
		public Main_funcContext main_func() {
			return getRuleContext(Main_funcContext.class,0);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramListener ) ((gramListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramListener ) ((gramListener)listener).exitStart(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(22); main_func();
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

	public static class Main_funcContext extends ParserRuleContext {
		public FuncContext func() {
			return getRuleContext(FuncContext.class,0);
		}
		public Main_funcContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main_func; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramListener ) ((gramListener)listener).enterMain_func(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramListener ) ((gramListener)listener).exitMain_func(this);
		}
	}

	public final Main_funcContext main_func() throws RecognitionException {
		Main_funcContext _localctx = new Main_funcContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_main_func);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(24); func();
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

	public static class FuncContext extends ParserRuleContext {
		public ClassyfuncContext classyfunc() {
			return getRuleContext(ClassyfuncContext.class,0);
		}
		public P_zamkniecieContext p_zamkniecie() {
			return getRuleContext(P_zamkniecieContext.class,0);
		}
		public L_otwarcieContext l_otwarcie() {
			return getRuleContext(L_otwarcieContext.class,0);
		}
		public FuncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramListener ) ((gramListener)listener).enterFunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramListener ) ((gramListener)listener).exitFunc(this);
		}
	}

	public final FuncContext func() throws RecognitionException {
		FuncContext _localctx = new FuncContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_func);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(26); classyfunc();
			setState(27); l_otwarcie();
			setState(28); p_zamkniecie();
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

	public static class ClassyfuncContext extends ParserRuleContext {
		public FuncsContext funcs() {
			return getRuleContext(FuncsContext.class,0);
		}
		public ClassyfuncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classyfunc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramListener ) ((gramListener)listener).enterClassyfunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramListener ) ((gramListener)listener).exitClassyfunc(this);
		}
	}

	public final ClassyfuncContext classyfunc() throws RecognitionException {
		ClassyfuncContext _localctx = new ClassyfuncContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_classyfunc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(30); funcs();
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
		public FuncsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramListener ) ((gramListener)listener).enterFuncs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramListener ) ((gramListener)listener).exitFuncs(this);
		}
	}

	public final FuncsContext funcs() throws RecognitionException {
		FuncsContext _localctx = new FuncsContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_funcs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(32);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__12) | (1L << T__11) | (1L << T__10) | (1L << T__9) | (1L << T__6) | (1L << T__4) | (1L << T__3) | (1L << T__1) | (1L << T__0))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static class L_otwarcieContext extends ParserRuleContext {
		public FuncContext func() {
			return getRuleContext(FuncContext.class,0);
		}
		public LiczbaContext liczba() {
			return getRuleContext(LiczbaContext.class,0);
		}
		public L_nawiasContext l_nawias() {
			return getRuleContext(L_nawiasContext.class,0);
		}
		public L_otwarcieContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_l_otwarcie; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramListener ) ((gramListener)listener).enterL_otwarcie(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramListener ) ((gramListener)listener).exitL_otwarcie(this);
		}
	}

	public final L_otwarcieContext l_otwarcie() throws RecognitionException {
		L_otwarcieContext _localctx = new L_otwarcieContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_l_otwarcie);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(41);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				{
				setState(34); l_nawias();
				}
				break;
			case 2:
				{
				setState(35); l_nawias();
				setState(36); func();
				}
				break;
			case 3:
				{
				setState(38); l_nawias();
				setState(39); liczba(0);
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

	public static class L_nawiasContext extends ParserRuleContext {
		public L_nawiasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_l_nawias; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramListener ) ((gramListener)listener).enterL_nawias(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramListener ) ((gramListener)listener).exitL_nawias(this);
		}
	}

	public final L_nawiasContext l_nawias() throws RecognitionException {
		L_nawiasContext _localctx = new L_nawiasContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_l_nawias);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(43); match(T__5);
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

	public static class P_zamkniecieContext extends ParserRuleContext {
		public P_nawiasContext p_nawias() {
			return getRuleContext(P_nawiasContext.class,0);
		}
		public FuncContext func() {
			return getRuleContext(FuncContext.class,0);
		}
		public LiczbaContext liczba() {
			return getRuleContext(LiczbaContext.class,0);
		}
		public P_zamkniecieContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_p_zamkniecie; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramListener ) ((gramListener)listener).enterP_zamkniecie(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramListener ) ((gramListener)listener).exitP_zamkniecie(this);
		}
	}

	public final P_zamkniecieContext p_zamkniecie() throws RecognitionException {
		P_zamkniecieContext _localctx = new P_zamkniecieContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_p_zamkniecie);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				setState(45); p_nawias();
				}
				break;
			case 2:
				{
				setState(46); p_nawias();
				setState(47); liczba(0);
				}
				break;
			case 3:
				{
				setState(49); p_nawias();
				setState(50); func();
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

	public static class P_nawiasContext extends ParserRuleContext {
		public P_nawiasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_p_nawias; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramListener ) ((gramListener)listener).enterP_nawias(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramListener ) ((gramListener)listener).exitP_nawias(this);
		}
	}

	public final P_nawiasContext p_nawias() throws RecognitionException {
		P_nawiasContext _localctx = new P_nawiasContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_p_nawias);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(54); match(T__8);
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

	public static class LiczbaContext extends ParserRuleContext {
		public Liczba_Context liczba_() {
			return getRuleContext(Liczba_Context.class,0);
		}
		public LiczbaContext liczba() {
			return getRuleContext(LiczbaContext.class,0);
		}
		public LiczbaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_liczba; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramListener ) ((gramListener)listener).enterLiczba(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramListener ) ((gramListener)listener).exitLiczba(this);
		}
	}

	public final LiczbaContext liczba() throws RecognitionException {
		return liczba(0);
	}

	private LiczbaContext liczba(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		LiczbaContext _localctx = new LiczbaContext(_ctx, _parentState);
		LiczbaContext _prevctx = _localctx;
		int _startState = 18;
		enterRecursionRule(_localctx, 18, RULE_liczba, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(57); liczba_();
			}
			_ctx.stop = _input.LT(-1);
			setState(63);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new LiczbaContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_liczba);
					setState(59);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(60); liczba_();
					}
					} 
				}
				setState(65);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
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

	public static class Liczba_Context extends ParserRuleContext {
		public Liczba_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_liczba_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramListener ) ((gramListener)listener).enterLiczba_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramListener ) ((gramListener)listener).exitLiczba_(this);
		}
	}

	public final Liczba_Context liczba_() throws RecognitionException {
		Liczba_Context _localctx = new Liczba_Context(_ctx, getState());
		enterRule(_localctx, 20, RULE_liczba_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
			_la = _input.LA(1);
			if ( !(_la==T__7 || _la==T__2) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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
		case 9: return liczba_sempred((LiczbaContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean liczba_sempred(LiczbaContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\17G\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4"+
		"\f\t\f\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\5\7,\n\7\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\67\n\t\3"+
		"\n\3\n\3\13\3\13\3\13\3\13\3\13\7\13@\n\13\f\13\16\13C\13\13\3\f\3\f\3"+
		"\f\2\3\24\r\2\4\6\b\n\f\16\20\22\24\26\2\4\6\2\3\6\t\t\13\f\16\17\4\2"+
		"\b\b\r\r@\2\30\3\2\2\2\4\32\3\2\2\2\6\34\3\2\2\2\b \3\2\2\2\n\"\3\2\2"+
		"\2\f+\3\2\2\2\16-\3\2\2\2\20\66\3\2\2\2\228\3\2\2\2\24:\3\2\2\2\26D\3"+
		"\2\2\2\30\31\5\4\3\2\31\3\3\2\2\2\32\33\5\6\4\2\33\5\3\2\2\2\34\35\5\b"+
		"\5\2\35\36\5\f\7\2\36\37\5\20\t\2\37\7\3\2\2\2 !\5\n\6\2!\t\3\2\2\2\""+
		"#\t\2\2\2#\13\3\2\2\2$,\5\16\b\2%&\5\16\b\2&\'\5\6\4\2\',\3\2\2\2()\5"+
		"\16\b\2)*\5\24\13\2*,\3\2\2\2+$\3\2\2\2+%\3\2\2\2+(\3\2\2\2,\r\3\2\2\2"+
		"-.\7\n\2\2.\17\3\2\2\2/\67\5\22\n\2\60\61\5\22\n\2\61\62\5\24\13\2\62"+
		"\67\3\2\2\2\63\64\5\22\n\2\64\65\5\6\4\2\65\67\3\2\2\2\66/\3\2\2\2\66"+
		"\60\3\2\2\2\66\63\3\2\2\2\67\21\3\2\2\289\7\7\2\29\23\3\2\2\2:;\b\13\1"+
		"\2;<\5\26\f\2<A\3\2\2\2=>\f\3\2\2>@\5\26\f\2?=\3\2\2\2@C\3\2\2\2A?\3\2"+
		"\2\2AB\3\2\2\2B\25\3\2\2\2CA\3\2\2\2DE\t\3\2\2E\27\3\2\2\2\5+\66A";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}