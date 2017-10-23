// Generated from grammar/PoleLang.g4 by ANTLR 4.7

package grammar;
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
public class PoleLangParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, Print=3, To=4, If=5, For=6, ForIndex=7, Add=8, Copy=9, 
		Split=10, Line=11, Head=12, Info=13, Exists=14, With=15, MaxColumn=16, 
		MinColumn=17, SumColumn=18, FormatSize=19, MegaBytes=20, Bytes=21, KiloBytes=22, 
		GigaBytes=23, End=24, Number=25, FileNameText=26, ID=27, StringInput=28, 
		Ws=29;
	public static final int
		RULE_program = 0, RULE_statement = 1, RULE_actionStatement = 2, RULE_printAction = 3, 
		RULE_lineActionWithLimit = 4, RULE_lineAction = 5, RULE_exitsAction = 6, 
		RULE_logicalAction = 7, RULE_ifAction = 8, RULE_infoSizeAction = 9, RULE_infoAction = 10, 
		RULE_printActionParameters = 11, RULE_headAction = 12, RULE_addAction = 13, 
		RULE_splitMaxColumn = 14, RULE_splitMinColumn = 15, RULE_splitSumColumn = 16, 
		RULE_splitOperations = 17, RULE_splitAction = 18, RULE_copyAction = 19, 
		RULE_iterativeOutputAction = 20, RULE_forAction = 21, RULE_iterativeAction = 22;
	public static final String[] ruleNames = {
		"program", "statement", "actionStatement", "printAction", "lineActionWithLimit", 
		"lineAction", "exitsAction", "logicalAction", "ifAction", "infoSizeAction", 
		"infoAction", "printActionParameters", "headAction", "addAction", "splitMaxColumn", 
		"splitMinColumn", "splitSumColumn", "splitOperations", "splitAction", 
		"copyAction", "iterativeOutputAction", "forAction", "iterativeAction"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'('", "')'", "'print'", "'to'", "'if'", "'for'", "'='", "'add'", 
		"'copy'", "'split'", "'line'", "'head'", "'info'", "'exists'", "'with'", 
		"'max-column'", "'min-column'", "'sum-column'", "'format-size'", "'mb'", 
		"'b'", "'kb'", "'gb'", "'end'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, "Print", "To", "If", "For", "ForIndex", "Add", "Copy", 
		"Split", "Line", "Head", "Info", "Exists", "With", "MaxColumn", "MinColumn", 
		"SumColumn", "FormatSize", "MegaBytes", "Bytes", "KiloBytes", "GigaBytes", 
		"End", "Number", "FileNameText", "ID", "StringInput", "Ws"
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
	public String getGrammarFileName() { return "PoleLang.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public PoleLangParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(PoleLangParser.EOF, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PoleLangListener ) ((PoleLangListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PoleLangListener ) ((PoleLangListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(47); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(46);
				statement();
				}
				}
				setState(49); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Print) | (1L << For) | (1L << Add) | (1L << Split))) != 0) );
			setState(51);
			match(EOF);
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
		public ActionStatementContext actionStatement() {
			return getRuleContext(ActionStatementContext.class,0);
		}
		public CopyActionContext copyAction() {
			return getRuleContext(CopyActionContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PoleLangListener ) ((PoleLangListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PoleLangListener ) ((PoleLangListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(53);
			actionStatement();
			setState(55);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Copy) {
				{
				setState(54);
				copyAction();
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

	public static class ActionStatementContext extends ParserRuleContext {
		public PrintActionContext printAction() {
			return getRuleContext(PrintActionContext.class,0);
		}
		public AddActionContext addAction() {
			return getRuleContext(AddActionContext.class,0);
		}
		public SplitActionContext splitAction() {
			return getRuleContext(SplitActionContext.class,0);
		}
		public IterativeActionContext iterativeAction() {
			return getRuleContext(IterativeActionContext.class,0);
		}
		public ActionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_actionStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PoleLangListener ) ((PoleLangListener)listener).enterActionStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PoleLangListener ) ((PoleLangListener)listener).exitActionStatement(this);
		}
	}

	public final ActionStatementContext actionStatement() throws RecognitionException {
		ActionStatementContext _localctx = new ActionStatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_actionStatement);
		try {
			setState(61);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Print:
				enterOuterAlt(_localctx, 1);
				{
				setState(57);
				printAction();
				}
				break;
			case Add:
				enterOuterAlt(_localctx, 2);
				{
				setState(58);
				addAction();
				}
				break;
			case Split:
				enterOuterAlt(_localctx, 3);
				{
				setState(59);
				splitAction();
				}
				break;
			case For:
				enterOuterAlt(_localctx, 4);
				{
				setState(60);
				iterativeAction();
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

	public static class PrintActionContext extends ParserRuleContext {
		public TerminalNode Print() { return getToken(PoleLangParser.Print, 0); }
		public TerminalNode FileNameText() { return getToken(PoleLangParser.FileNameText, 0); }
		public PrintActionParametersContext printActionParameters() {
			return getRuleContext(PrintActionParametersContext.class,0);
		}
		public PrintActionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printAction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PoleLangListener ) ((PoleLangListener)listener).enterPrintAction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PoleLangListener ) ((PoleLangListener)listener).exitPrintAction(this);
		}
	}

	public final PrintActionContext printAction() throws RecognitionException {
		PrintActionContext _localctx = new PrintActionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_printAction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(63);
			match(Print);
			setState(64);
			match(FileNameText);
			setState(66);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << If) | (1L << Line) | (1L << Info))) != 0)) {
				{
				setState(65);
				printActionParameters();
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

	public static class LineActionWithLimitContext extends ParserRuleContext {
		public TerminalNode To() { return getToken(PoleLangParser.To, 0); }
		public TerminalNode Number() { return getToken(PoleLangParser.Number, 0); }
		public TerminalNode End() { return getToken(PoleLangParser.End, 0); }
		public LineActionWithLimitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lineActionWithLimit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PoleLangListener ) ((PoleLangListener)listener).enterLineActionWithLimit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PoleLangListener ) ((PoleLangListener)listener).exitLineActionWithLimit(this);
		}
	}

	public final LineActionWithLimitContext lineActionWithLimit() throws RecognitionException {
		LineActionWithLimitContext _localctx = new LineActionWithLimitContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_lineActionWithLimit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			match(To);
			setState(69);
			_la = _input.LA(1);
			if ( !(_la==End || _la==Number) ) {
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

	public static class LineActionContext extends ParserRuleContext {
		public TerminalNode Line() { return getToken(PoleLangParser.Line, 0); }
		public TerminalNode Number() { return getToken(PoleLangParser.Number, 0); }
		public LineActionWithLimitContext lineActionWithLimit() {
			return getRuleContext(LineActionWithLimitContext.class,0);
		}
		public LineActionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lineAction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PoleLangListener ) ((PoleLangListener)listener).enterLineAction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PoleLangListener ) ((PoleLangListener)listener).exitLineAction(this);
		}
	}

	public final LineActionContext lineAction() throws RecognitionException {
		LineActionContext _localctx = new LineActionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_lineAction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
			match(Line);
			setState(72);
			match(Number);
			setState(74);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==To) {
				{
				setState(73);
				lineActionWithLimit();
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

	public static class ExitsActionContext extends ParserRuleContext {
		public LineActionContext lineAction() {
			return getRuleContext(LineActionContext.class,0);
		}
		public TerminalNode Exists() { return getToken(PoleLangParser.Exists, 0); }
		public TerminalNode StringInput() { return getToken(PoleLangParser.StringInput, 0); }
		public ExitsActionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exitsAction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PoleLangListener ) ((PoleLangListener)listener).enterExitsAction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PoleLangListener ) ((PoleLangListener)listener).exitExitsAction(this);
		}
	}

	public final ExitsActionContext exitsAction() throws RecognitionException {
		ExitsActionContext _localctx = new ExitsActionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_exitsAction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			lineAction();
			setState(77);
			match(Exists);
			setState(78);
			match(StringInput);
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

	public static class LogicalActionContext extends ParserRuleContext {
		public ExitsActionContext exitsAction() {
			return getRuleContext(ExitsActionContext.class,0);
		}
		public LogicalActionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalAction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PoleLangListener ) ((PoleLangListener)listener).enterLogicalAction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PoleLangListener ) ((PoleLangListener)listener).exitLogicalAction(this);
		}
	}

	public final LogicalActionContext logicalAction() throws RecognitionException {
		LogicalActionContext _localctx = new LogicalActionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_logicalAction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			exitsAction();
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

	public static class IfActionContext extends ParserRuleContext {
		public TerminalNode If() { return getToken(PoleLangParser.If, 0); }
		public LogicalActionContext logicalAction() {
			return getRuleContext(LogicalActionContext.class,0);
		}
		public IfActionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifAction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PoleLangListener ) ((PoleLangListener)listener).enterIfAction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PoleLangListener ) ((PoleLangListener)listener).exitIfAction(this);
		}
	}

	public final IfActionContext ifAction() throws RecognitionException {
		IfActionContext _localctx = new IfActionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_ifAction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			match(If);
			setState(88);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				{
				setState(83);
				match(T__0);
				setState(84);
				logicalAction();
				setState(85);
				match(T__1);
				}
				break;
			case Line:
				{
				setState(87);
				logicalAction();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class InfoSizeActionContext extends ParserRuleContext {
		public TerminalNode Bytes() { return getToken(PoleLangParser.Bytes, 0); }
		public TerminalNode KiloBytes() { return getToken(PoleLangParser.KiloBytes, 0); }
		public TerminalNode MegaBytes() { return getToken(PoleLangParser.MegaBytes, 0); }
		public TerminalNode GigaBytes() { return getToken(PoleLangParser.GigaBytes, 0); }
		public InfoSizeActionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_infoSizeAction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PoleLangListener ) ((PoleLangListener)listener).enterInfoSizeAction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PoleLangListener ) ((PoleLangListener)listener).exitInfoSizeAction(this);
		}
	}

	public final InfoSizeActionContext infoSizeAction() throws RecognitionException {
		InfoSizeActionContext _localctx = new InfoSizeActionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_infoSizeAction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MegaBytes) | (1L << Bytes) | (1L << KiloBytes) | (1L << GigaBytes))) != 0)) ) {
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

	public static class InfoActionContext extends ParserRuleContext {
		public TerminalNode Info() { return getToken(PoleLangParser.Info, 0); }
		public TerminalNode With() { return getToken(PoleLangParser.With, 0); }
		public TerminalNode FormatSize() { return getToken(PoleLangParser.FormatSize, 0); }
		public InfoSizeActionContext infoSizeAction() {
			return getRuleContext(InfoSizeActionContext.class,0);
		}
		public InfoActionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_infoAction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PoleLangListener ) ((PoleLangListener)listener).enterInfoAction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PoleLangListener ) ((PoleLangListener)listener).exitInfoAction(this);
		}
	}

	public final InfoActionContext infoAction() throws RecognitionException {
		InfoActionContext _localctx = new InfoActionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_infoAction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			match(Info);
			setState(93);
			match(With);
			setState(94);
			match(FormatSize);
			setState(95);
			infoSizeAction();
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

	public static class PrintActionParametersContext extends ParserRuleContext {
		public LineActionContext lineAction() {
			return getRuleContext(LineActionContext.class,0);
		}
		public IfActionContext ifAction() {
			return getRuleContext(IfActionContext.class,0);
		}
		public InfoActionContext infoAction() {
			return getRuleContext(InfoActionContext.class,0);
		}
		public PrintActionParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printActionParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PoleLangListener ) ((PoleLangListener)listener).enterPrintActionParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PoleLangListener ) ((PoleLangListener)listener).exitPrintActionParameters(this);
		}
	}

	public final PrintActionParametersContext printActionParameters() throws RecognitionException {
		PrintActionParametersContext _localctx = new PrintActionParametersContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_printActionParameters);
		try {
			setState(100);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Line:
				enterOuterAlt(_localctx, 1);
				{
				setState(97);
				lineAction();
				}
				break;
			case If:
				enterOuterAlt(_localctx, 2);
				{
				setState(98);
				ifAction();
				}
				break;
			case Info:
				enterOuterAlt(_localctx, 3);
				{
				setState(99);
				infoAction();
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

	public static class HeadActionContext extends ParserRuleContext {
		public TerminalNode Head() { return getToken(PoleLangParser.Head, 0); }
		public HeadActionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_headAction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PoleLangListener ) ((PoleLangListener)listener).enterHeadAction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PoleLangListener ) ((PoleLangListener)listener).exitHeadAction(this);
		}
	}

	public final HeadActionContext headAction() throws RecognitionException {
		HeadActionContext _localctx = new HeadActionContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_headAction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			match(Head);
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

	public static class AddActionContext extends ParserRuleContext {
		public TerminalNode Add() { return getToken(PoleLangParser.Add, 0); }
		public TerminalNode StringInput() { return getToken(PoleLangParser.StringInput, 0); }
		public TerminalNode To() { return getToken(PoleLangParser.To, 0); }
		public TerminalNode FileNameText() { return getToken(PoleLangParser.FileNameText, 0); }
		public HeadActionContext headAction() {
			return getRuleContext(HeadActionContext.class,0);
		}
		public AddActionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addAction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PoleLangListener ) ((PoleLangListener)listener).enterAddAction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PoleLangListener ) ((PoleLangListener)listener).exitAddAction(this);
		}
	}

	public final AddActionContext addAction() throws RecognitionException {
		AddActionContext _localctx = new AddActionContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_addAction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			match(Add);
			setState(106);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Head) {
				{
				setState(105);
				headAction();
				}
			}

			setState(108);
			match(StringInput);
			setState(109);
			match(To);
			setState(110);
			match(FileNameText);
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

	public static class SplitMaxColumnContext extends ParserRuleContext {
		public TerminalNode MaxColumn() { return getToken(PoleLangParser.MaxColumn, 0); }
		public TerminalNode Number() { return getToken(PoleLangParser.Number, 0); }
		public SplitMaxColumnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_splitMaxColumn; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PoleLangListener ) ((PoleLangListener)listener).enterSplitMaxColumn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PoleLangListener ) ((PoleLangListener)listener).exitSplitMaxColumn(this);
		}
	}

	public final SplitMaxColumnContext splitMaxColumn() throws RecognitionException {
		SplitMaxColumnContext _localctx = new SplitMaxColumnContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_splitMaxColumn);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			match(MaxColumn);
			setState(113);
			match(Number);
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

	public static class SplitMinColumnContext extends ParserRuleContext {
		public TerminalNode MinColumn() { return getToken(PoleLangParser.MinColumn, 0); }
		public TerminalNode Number() { return getToken(PoleLangParser.Number, 0); }
		public SplitMinColumnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_splitMinColumn; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PoleLangListener ) ((PoleLangListener)listener).enterSplitMinColumn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PoleLangListener ) ((PoleLangListener)listener).exitSplitMinColumn(this);
		}
	}

	public final SplitMinColumnContext splitMinColumn() throws RecognitionException {
		SplitMinColumnContext _localctx = new SplitMinColumnContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_splitMinColumn);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			match(MinColumn);
			setState(116);
			match(Number);
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

	public static class SplitSumColumnContext extends ParserRuleContext {
		public TerminalNode SumColumn() { return getToken(PoleLangParser.SumColumn, 0); }
		public TerminalNode Number() { return getToken(PoleLangParser.Number, 0); }
		public SplitSumColumnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_splitSumColumn; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PoleLangListener ) ((PoleLangListener)listener).enterSplitSumColumn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PoleLangListener ) ((PoleLangListener)listener).exitSplitSumColumn(this);
		}
	}

	public final SplitSumColumnContext splitSumColumn() throws RecognitionException {
		SplitSumColumnContext _localctx = new SplitSumColumnContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_splitSumColumn);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			match(SumColumn);
			setState(119);
			match(Number);
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

	public static class SplitOperationsContext extends ParserRuleContext {
		public SplitMaxColumnContext splitMaxColumn() {
			return getRuleContext(SplitMaxColumnContext.class,0);
		}
		public SplitMinColumnContext splitMinColumn() {
			return getRuleContext(SplitMinColumnContext.class,0);
		}
		public SplitSumColumnContext splitSumColumn() {
			return getRuleContext(SplitSumColumnContext.class,0);
		}
		public SplitOperationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_splitOperations; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PoleLangListener ) ((PoleLangListener)listener).enterSplitOperations(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PoleLangListener ) ((PoleLangListener)listener).exitSplitOperations(this);
		}
	}

	public final SplitOperationsContext splitOperations() throws RecognitionException {
		SplitOperationsContext _localctx = new SplitOperationsContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_splitOperations);
		try {
			setState(124);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MaxColumn:
				enterOuterAlt(_localctx, 1);
				{
				setState(121);
				splitMaxColumn();
				}
				break;
			case MinColumn:
				enterOuterAlt(_localctx, 2);
				{
				setState(122);
				splitMinColumn();
				}
				break;
			case SumColumn:
				enterOuterAlt(_localctx, 3);
				{
				setState(123);
				splitSumColumn();
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

	public static class SplitActionContext extends ParserRuleContext {
		public TerminalNode Split() { return getToken(PoleLangParser.Split, 0); }
		public TerminalNode FileNameText() { return getToken(PoleLangParser.FileNameText, 0); }
		public TerminalNode With() { return getToken(PoleLangParser.With, 0); }
		public TerminalNode StringInput() { return getToken(PoleLangParser.StringInput, 0); }
		public SplitOperationsContext splitOperations() {
			return getRuleContext(SplitOperationsContext.class,0);
		}
		public SplitActionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_splitAction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PoleLangListener ) ((PoleLangListener)listener).enterSplitAction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PoleLangListener ) ((PoleLangListener)listener).exitSplitAction(this);
		}
	}

	public final SplitActionContext splitAction() throws RecognitionException {
		SplitActionContext _localctx = new SplitActionContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_splitAction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			match(Split);
			setState(127);
			match(FileNameText);
			setState(128);
			match(With);
			setState(129);
			match(StringInput);
			setState(130);
			splitOperations();
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

	public static class CopyActionContext extends ParserRuleContext {
		public TerminalNode Copy() { return getToken(PoleLangParser.Copy, 0); }
		public TerminalNode FileNameText() { return getToken(PoleLangParser.FileNameText, 0); }
		public CopyActionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_copyAction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PoleLangListener ) ((PoleLangListener)listener).enterCopyAction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PoleLangListener ) ((PoleLangListener)listener).exitCopyAction(this);
		}
	}

	public final CopyActionContext copyAction() throws RecognitionException {
		CopyActionContext _localctx = new CopyActionContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_copyAction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
			match(Copy);
			setState(133);
			match(FileNameText);
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

	public static class IterativeOutputActionContext extends ParserRuleContext {
		public TerminalNode StringInput() { return getToken(PoleLangParser.StringInput, 0); }
		public IterativeOutputActionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iterativeOutputAction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PoleLangListener ) ((PoleLangListener)listener).enterIterativeOutputAction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PoleLangListener ) ((PoleLangListener)listener).exitIterativeOutputAction(this);
		}
	}

	public final IterativeOutputActionContext iterativeOutputAction() throws RecognitionException {
		IterativeOutputActionContext _localctx = new IterativeOutputActionContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_iterativeOutputAction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			match(StringInput);
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

	public static class ForActionContext extends ParserRuleContext {
		public TerminalNode For() { return getToken(PoleLangParser.For, 0); }
		public TerminalNode ID() { return getToken(PoleLangParser.ID, 0); }
		public TerminalNode ForIndex() { return getToken(PoleLangParser.ForIndex, 0); }
		public List<TerminalNode> Number() { return getTokens(PoleLangParser.Number); }
		public TerminalNode Number(int i) {
			return getToken(PoleLangParser.Number, i);
		}
		public TerminalNode To() { return getToken(PoleLangParser.To, 0); }
		public IterativeOutputActionContext iterativeOutputAction() {
			return getRuleContext(IterativeOutputActionContext.class,0);
		}
		public ForActionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forAction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PoleLangListener ) ((PoleLangListener)listener).enterForAction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PoleLangListener ) ((PoleLangListener)listener).exitForAction(this);
		}
	}

	public final ForActionContext forAction() throws RecognitionException {
		ForActionContext _localctx = new ForActionContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_forAction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			match(For);
			setState(138);
			match(ID);
			setState(139);
			match(ForIndex);
			setState(140);
			match(Number);
			setState(141);
			match(To);
			setState(142);
			match(Number);
			setState(143);
			iterativeOutputAction();
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

	public static class IterativeActionContext extends ParserRuleContext {
		public ForActionContext forAction() {
			return getRuleContext(ForActionContext.class,0);
		}
		public IterativeActionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iterativeAction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PoleLangListener ) ((PoleLangListener)listener).enterIterativeAction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PoleLangListener ) ((PoleLangListener)listener).exitIterativeAction(this);
		}
	}

	public final IterativeActionContext iterativeAction() throws RecognitionException {
		IterativeActionContext _localctx = new IterativeActionContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_iterativeAction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			forAction();
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\37\u0096\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\3\2\6\2\62"+
		"\n\2\r\2\16\2\63\3\2\3\2\3\3\3\3\5\3:\n\3\3\4\3\4\3\4\3\4\5\4@\n\4\3\5"+
		"\3\5\3\5\5\5E\n\5\3\6\3\6\3\6\3\7\3\7\3\7\5\7M\n\7\3\b\3\b\3\b\3\b\3\t"+
		"\3\t\3\n\3\n\3\n\3\n\3\n\3\n\5\n[\n\n\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3"+
		"\r\3\r\3\r\5\rg\n\r\3\16\3\16\3\17\3\17\5\17m\n\17\3\17\3\17\3\17\3\17"+
		"\3\20\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3\23\5\23\177"+
		"\n\23\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\2\2\31\2\4\6\b\n\f\16\20"+
		"\22\24\26\30\32\34\36 \"$&(*,.\2\4\3\2\32\33\3\2\26\31\2\u008b\2\61\3"+
		"\2\2\2\4\67\3\2\2\2\6?\3\2\2\2\bA\3\2\2\2\nF\3\2\2\2\fI\3\2\2\2\16N\3"+
		"\2\2\2\20R\3\2\2\2\22T\3\2\2\2\24\\\3\2\2\2\26^\3\2\2\2\30f\3\2\2\2\32"+
		"h\3\2\2\2\34j\3\2\2\2\36r\3\2\2\2 u\3\2\2\2\"x\3\2\2\2$~\3\2\2\2&\u0080"+
		"\3\2\2\2(\u0086\3\2\2\2*\u0089\3\2\2\2,\u008b\3\2\2\2.\u0093\3\2\2\2\60"+
		"\62\5\4\3\2\61\60\3\2\2\2\62\63\3\2\2\2\63\61\3\2\2\2\63\64\3\2\2\2\64"+
		"\65\3\2\2\2\65\66\7\2\2\3\66\3\3\2\2\2\679\5\6\4\28:\5(\25\298\3\2\2\2"+
		"9:\3\2\2\2:\5\3\2\2\2;@\5\b\5\2<@\5\34\17\2=@\5&\24\2>@\5.\30\2?;\3\2"+
		"\2\2?<\3\2\2\2?=\3\2\2\2?>\3\2\2\2@\7\3\2\2\2AB\7\5\2\2BD\7\34\2\2CE\5"+
		"\30\r\2DC\3\2\2\2DE\3\2\2\2E\t\3\2\2\2FG\7\6\2\2GH\t\2\2\2H\13\3\2\2\2"+
		"IJ\7\r\2\2JL\7\33\2\2KM\5\n\6\2LK\3\2\2\2LM\3\2\2\2M\r\3\2\2\2NO\5\f\7"+
		"\2OP\7\20\2\2PQ\7\36\2\2Q\17\3\2\2\2RS\5\16\b\2S\21\3\2\2\2TZ\7\7\2\2"+
		"UV\7\3\2\2VW\5\20\t\2WX\7\4\2\2X[\3\2\2\2Y[\5\20\t\2ZU\3\2\2\2ZY\3\2\2"+
		"\2[\23\3\2\2\2\\]\t\3\2\2]\25\3\2\2\2^_\7\17\2\2_`\7\21\2\2`a\7\25\2\2"+
		"ab\5\24\13\2b\27\3\2\2\2cg\5\f\7\2dg\5\22\n\2eg\5\26\f\2fc\3\2\2\2fd\3"+
		"\2\2\2fe\3\2\2\2g\31\3\2\2\2hi\7\16\2\2i\33\3\2\2\2jl\7\n\2\2km\5\32\16"+
		"\2lk\3\2\2\2lm\3\2\2\2mn\3\2\2\2no\7\36\2\2op\7\6\2\2pq\7\34\2\2q\35\3"+
		"\2\2\2rs\7\22\2\2st\7\33\2\2t\37\3\2\2\2uv\7\23\2\2vw\7\33\2\2w!\3\2\2"+
		"\2xy\7\24\2\2yz\7\33\2\2z#\3\2\2\2{\177\5\36\20\2|\177\5 \21\2}\177\5"+
		"\"\22\2~{\3\2\2\2~|\3\2\2\2~}\3\2\2\2\177%\3\2\2\2\u0080\u0081\7\f\2\2"+
		"\u0081\u0082\7\34\2\2\u0082\u0083\7\21\2\2\u0083\u0084\7\36\2\2\u0084"+
		"\u0085\5$\23\2\u0085\'\3\2\2\2\u0086\u0087\7\13\2\2\u0087\u0088\7\34\2"+
		"\2\u0088)\3\2\2\2\u0089\u008a\7\36\2\2\u008a+\3\2\2\2\u008b\u008c\7\b"+
		"\2\2\u008c\u008d\7\35\2\2\u008d\u008e\7\t\2\2\u008e\u008f\7\33\2\2\u008f"+
		"\u0090\7\6\2\2\u0090\u0091\7\33\2\2\u0091\u0092\5*\26\2\u0092-\3\2\2\2"+
		"\u0093\u0094\5,\27\2\u0094/\3\2\2\2\13\639?DLZfl~";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}