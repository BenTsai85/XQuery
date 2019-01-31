// Generated from /Users/cheng-hsunyang/Desktop/232/XQuery/src/XQuery.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link XQueryParser}.
 */
public interface XQueryListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code apChildren}
	 * labeled alternative in {@link XQueryParser#ap}.
	 * @param ctx the parse tree
	 */
	void enterApChildren(XQueryParser.ApChildrenContext ctx);
	/**
	 * Exit a parse tree produced by the {@code apChildren}
	 * labeled alternative in {@link XQueryParser#ap}.
	 * @param ctx the parse tree
	 */
	void exitApChildren(XQueryParser.ApChildrenContext ctx);
	/**
	 * Enter a parse tree produced by the {@code apAll}
	 * labeled alternative in {@link XQueryParser#ap}.
	 * @param ctx the parse tree
	 */
	void enterApAll(XQueryParser.ApAllContext ctx);
	/**
	 * Exit a parse tree produced by the {@code apAll}
	 * labeled alternative in {@link XQueryParser#ap}.
	 * @param ctx the parse tree
	 */
	void exitApAll(XQueryParser.ApAllContext ctx);
	/**
	 * Enter a parse tree produced by the {@code apDoc}
	 * labeled alternative in {@link XQueryParser#doc}.
	 * @param ctx the parse tree
	 */
	void enterApDoc(XQueryParser.ApDocContext ctx);
	/**
	 * Exit a parse tree produced by the {@code apDoc}
	 * labeled alternative in {@link XQueryParser#doc}.
	 * @param ctx the parse tree
	 */
	void exitApDoc(XQueryParser.ApDocContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rpPair}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterRpPair(XQueryParser.RpPairContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rpPair}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitRpPair(XQueryParser.RpPairContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rpText}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterRpText(XQueryParser.RpTextContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rpText}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitRpText(XQueryParser.RpTextContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rpChildren}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterRpChildren(XQueryParser.RpChildrenContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rpChildren}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitRpChildren(XQueryParser.RpChildrenContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rpTag}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterRpTag(XQueryParser.RpTagContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rpTag}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitRpTag(XQueryParser.RpTagContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rpParent}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterRpParent(XQueryParser.RpParentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rpParent}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitRpParent(XQueryParser.RpParentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rpParentheses}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterRpParentheses(XQueryParser.RpParenthesesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rpParentheses}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitRpParentheses(XQueryParser.RpParenthesesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rpAll}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterRpAll(XQueryParser.RpAllContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rpAll}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitRpAll(XQueryParser.RpAllContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rpCurrent}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterRpCurrent(XQueryParser.RpCurrentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rpCurrent}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitRpCurrent(XQueryParser.RpCurrentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rpFilter}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterRpFilter(XQueryParser.RpFilterContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rpFilter}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitRpFilter(XQueryParser.RpFilterContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rpWildcard}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterRpWildcard(XQueryParser.RpWildcardContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rpWildcard}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitRpWildcard(XQueryParser.RpWildcardContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rpAttribute}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterRpAttribute(XQueryParser.RpAttributeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rpAttribute}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitRpAttribute(XQueryParser.RpAttributeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code fRelativePath}
	 * labeled alternative in {@link XQueryParser#f}.
	 * @param ctx the parse tree
	 */
	void enterFRelativePath(XQueryParser.FRelativePathContext ctx);
	/**
	 * Exit a parse tree produced by the {@code fRelativePath}
	 * labeled alternative in {@link XQueryParser#f}.
	 * @param ctx the parse tree
	 */
	void exitFRelativePath(XQueryParser.FRelativePathContext ctx);
	/**
	 * Enter a parse tree produced by the {@code fNot}
	 * labeled alternative in {@link XQueryParser#f}.
	 * @param ctx the parse tree
	 */
	void enterFNot(XQueryParser.FNotContext ctx);
	/**
	 * Exit a parse tree produced by the {@code fNot}
	 * labeled alternative in {@link XQueryParser#f}.
	 * @param ctx the parse tree
	 */
	void exitFNot(XQueryParser.FNotContext ctx);
	/**
	 * Enter a parse tree produced by the {@code fParentheses}
	 * labeled alternative in {@link XQueryParser#f}.
	 * @param ctx the parse tree
	 */
	void enterFParentheses(XQueryParser.FParenthesesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code fParentheses}
	 * labeled alternative in {@link XQueryParser#f}.
	 * @param ctx the parse tree
	 */
	void exitFParentheses(XQueryParser.FParenthesesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code fOr}
	 * labeled alternative in {@link XQueryParser#f}.
	 * @param ctx the parse tree
	 */
	void enterFOr(XQueryParser.FOrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code fOr}
	 * labeled alternative in {@link XQueryParser#f}.
	 * @param ctx the parse tree
	 */
	void exitFOr(XQueryParser.FOrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code fIdentityEquality}
	 * labeled alternative in {@link XQueryParser#f}.
	 * @param ctx the parse tree
	 */
	void enterFIdentityEquality(XQueryParser.FIdentityEqualityContext ctx);
	/**
	 * Exit a parse tree produced by the {@code fIdentityEquality}
	 * labeled alternative in {@link XQueryParser#f}.
	 * @param ctx the parse tree
	 */
	void exitFIdentityEquality(XQueryParser.FIdentityEqualityContext ctx);
	/**
	 * Enter a parse tree produced by the {@code fValueEquality}
	 * labeled alternative in {@link XQueryParser#f}.
	 * @param ctx the parse tree
	 */
	void enterFValueEquality(XQueryParser.FValueEqualityContext ctx);
	/**
	 * Exit a parse tree produced by the {@code fValueEquality}
	 * labeled alternative in {@link XQueryParser#f}.
	 * @param ctx the parse tree
	 */
	void exitFValueEquality(XQueryParser.FValueEqualityContext ctx);
	/**
	 * Enter a parse tree produced by the {@code fAnd}
	 * labeled alternative in {@link XQueryParser#f}.
	 * @param ctx the parse tree
	 */
	void enterFAnd(XQueryParser.FAndContext ctx);
	/**
	 * Exit a parse tree produced by the {@code fAnd}
	 * labeled alternative in {@link XQueryParser#f}.
	 * @param ctx the parse tree
	 */
	void exitFAnd(XQueryParser.FAndContext ctx);
}