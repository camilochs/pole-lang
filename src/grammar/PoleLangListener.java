// Generated from grammar/PoleLang.g4 by ANTLR 4.7

package grammar;
import java.util.HashMap;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link PoleLangParser}.
 */
public interface PoleLangListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link PoleLangParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(PoleLangParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link PoleLangParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(PoleLangParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link PoleLangParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(PoleLangParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PoleLangParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(PoleLangParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PoleLangParser#actionStatement}.
	 * @param ctx the parse tree
	 */
	void enterActionStatement(PoleLangParser.ActionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PoleLangParser#actionStatement}.
	 * @param ctx the parse tree
	 */
	void exitActionStatement(PoleLangParser.ActionStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PoleLangParser#printAction}.
	 * @param ctx the parse tree
	 */
	void enterPrintAction(PoleLangParser.PrintActionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PoleLangParser#printAction}.
	 * @param ctx the parse tree
	 */
	void exitPrintAction(PoleLangParser.PrintActionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PoleLangParser#lineActionWithLimit}.
	 * @param ctx the parse tree
	 */
	void enterLineActionWithLimit(PoleLangParser.LineActionWithLimitContext ctx);
	/**
	 * Exit a parse tree produced by {@link PoleLangParser#lineActionWithLimit}.
	 * @param ctx the parse tree
	 */
	void exitLineActionWithLimit(PoleLangParser.LineActionWithLimitContext ctx);
	/**
	 * Enter a parse tree produced by {@link PoleLangParser#lineAction}.
	 * @param ctx the parse tree
	 */
	void enterLineAction(PoleLangParser.LineActionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PoleLangParser#lineAction}.
	 * @param ctx the parse tree
	 */
	void exitLineAction(PoleLangParser.LineActionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PoleLangParser#exitsAction}.
	 * @param ctx the parse tree
	 */
	void enterExitsAction(PoleLangParser.ExitsActionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PoleLangParser#exitsAction}.
	 * @param ctx the parse tree
	 */
	void exitExitsAction(PoleLangParser.ExitsActionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PoleLangParser#logicalAction}.
	 * @param ctx the parse tree
	 */
	void enterLogicalAction(PoleLangParser.LogicalActionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PoleLangParser#logicalAction}.
	 * @param ctx the parse tree
	 */
	void exitLogicalAction(PoleLangParser.LogicalActionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PoleLangParser#ifAction}.
	 * @param ctx the parse tree
	 */
	void enterIfAction(PoleLangParser.IfActionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PoleLangParser#ifAction}.
	 * @param ctx the parse tree
	 */
	void exitIfAction(PoleLangParser.IfActionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PoleLangParser#infoSizeAction}.
	 * @param ctx the parse tree
	 */
	void enterInfoSizeAction(PoleLangParser.InfoSizeActionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PoleLangParser#infoSizeAction}.
	 * @param ctx the parse tree
	 */
	void exitInfoSizeAction(PoleLangParser.InfoSizeActionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PoleLangParser#infoAction}.
	 * @param ctx the parse tree
	 */
	void enterInfoAction(PoleLangParser.InfoActionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PoleLangParser#infoAction}.
	 * @param ctx the parse tree
	 */
	void exitInfoAction(PoleLangParser.InfoActionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PoleLangParser#printActionParameters}.
	 * @param ctx the parse tree
	 */
	void enterPrintActionParameters(PoleLangParser.PrintActionParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link PoleLangParser#printActionParameters}.
	 * @param ctx the parse tree
	 */
	void exitPrintActionParameters(PoleLangParser.PrintActionParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link PoleLangParser#headAction}.
	 * @param ctx the parse tree
	 */
	void enterHeadAction(PoleLangParser.HeadActionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PoleLangParser#headAction}.
	 * @param ctx the parse tree
	 */
	void exitHeadAction(PoleLangParser.HeadActionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PoleLangParser#addAction}.
	 * @param ctx the parse tree
	 */
	void enterAddAction(PoleLangParser.AddActionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PoleLangParser#addAction}.
	 * @param ctx the parse tree
	 */
	void exitAddAction(PoleLangParser.AddActionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PoleLangParser#splitMaxColumn}.
	 * @param ctx the parse tree
	 */
	void enterSplitMaxColumn(PoleLangParser.SplitMaxColumnContext ctx);
	/**
	 * Exit a parse tree produced by {@link PoleLangParser#splitMaxColumn}.
	 * @param ctx the parse tree
	 */
	void exitSplitMaxColumn(PoleLangParser.SplitMaxColumnContext ctx);
	/**
	 * Enter a parse tree produced by {@link PoleLangParser#splitMinColumn}.
	 * @param ctx the parse tree
	 */
	void enterSplitMinColumn(PoleLangParser.SplitMinColumnContext ctx);
	/**
	 * Exit a parse tree produced by {@link PoleLangParser#splitMinColumn}.
	 * @param ctx the parse tree
	 */
	void exitSplitMinColumn(PoleLangParser.SplitMinColumnContext ctx);
	/**
	 * Enter a parse tree produced by {@link PoleLangParser#splitSumColumn}.
	 * @param ctx the parse tree
	 */
	void enterSplitSumColumn(PoleLangParser.SplitSumColumnContext ctx);
	/**
	 * Exit a parse tree produced by {@link PoleLangParser#splitSumColumn}.
	 * @param ctx the parse tree
	 */
	void exitSplitSumColumn(PoleLangParser.SplitSumColumnContext ctx);
	/**
	 * Enter a parse tree produced by {@link PoleLangParser#splitOperations}.
	 * @param ctx the parse tree
	 */
	void enterSplitOperations(PoleLangParser.SplitOperationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PoleLangParser#splitOperations}.
	 * @param ctx the parse tree
	 */
	void exitSplitOperations(PoleLangParser.SplitOperationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PoleLangParser#splitAction}.
	 * @param ctx the parse tree
	 */
	void enterSplitAction(PoleLangParser.SplitActionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PoleLangParser#splitAction}.
	 * @param ctx the parse tree
	 */
	void exitSplitAction(PoleLangParser.SplitActionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PoleLangParser#copyAction}.
	 * @param ctx the parse tree
	 */
	void enterCopyAction(PoleLangParser.CopyActionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PoleLangParser#copyAction}.
	 * @param ctx the parse tree
	 */
	void exitCopyAction(PoleLangParser.CopyActionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PoleLangParser#iterativeOutputAction}.
	 * @param ctx the parse tree
	 */
	void enterIterativeOutputAction(PoleLangParser.IterativeOutputActionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PoleLangParser#iterativeOutputAction}.
	 * @param ctx the parse tree
	 */
	void exitIterativeOutputAction(PoleLangParser.IterativeOutputActionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PoleLangParser#forAction}.
	 * @param ctx the parse tree
	 */
	void enterForAction(PoleLangParser.ForActionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PoleLangParser#forAction}.
	 * @param ctx the parse tree
	 */
	void exitForAction(PoleLangParser.ForActionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PoleLangParser#iterativeAction}.
	 * @param ctx the parse tree
	 */
	void enterIterativeAction(PoleLangParser.IterativeActionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PoleLangParser#iterativeAction}.
	 * @param ctx the parse tree
	 */
	void exitIterativeAction(PoleLangParser.IterativeActionContext ctx);
}