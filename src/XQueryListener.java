// Generated from /Users/cheng-hsunyang/Desktop/232/XQuery/src/XQuery.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link XQueryParser}.
 */
public interface XQueryListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code apSingleSlash}
	 * labeled alternative in {@link XQueryParser#ap}.
	 * @param ctx the parse tree
	 */
	void enterApSingleSlash(XQueryParser.ApSingleSlashContext ctx);
	/**
	 * Exit a parse tree produced by the {@code apSingleSlash}
	 * labeled alternative in {@link XQueryParser#ap}.
	 * @param ctx the parse tree
	 */
	void exitApSingleSlash(XQueryParser.ApSingleSlashContext ctx);
	/**
	 * Enter a parse tree produced by the {@code apDoubleSlash}
	 * labeled alternative in {@link XQueryParser#ap}.
	 * @param ctx the parse tree
	 */
	void enterApDoubleSlash(XQueryParser.ApDoubleSlashContext ctx);
	/**
	 * Exit a parse tree produced by the {@code apDoubleSlash}
	 * labeled alternative in {@link XQueryParser#ap}.
	 * @param ctx the parse tree
	 */
	void exitApDoubleSlash(XQueryParser.ApDoubleSlashContext ctx);
	/**
	 * Enter a parse tree produced by the {@code docName}
	 * labeled alternative in {@link XQueryParser#doc}.
	 * @param ctx the parse tree
	 */
	void enterDocName(XQueryParser.DocNameContext ctx);
	/**
	 * Exit a parse tree produced by the {@code docName}
	 * labeled alternative in {@link XQueryParser#doc}.
	 * @param ctx the parse tree
	 */
	void exitDocName(XQueryParser.DocNameContext ctx);
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
	 * Enter a parse tree produced by the {@code rpSingleSlash}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterRpSingleSlash(XQueryParser.RpSingleSlashContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rpSingleSlash}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitRpSingleSlash(XQueryParser.RpSingleSlashContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rpCurr}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterRpCurr(XQueryParser.RpCurrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rpCurr}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitRpCurr(XQueryParser.RpCurrContext ctx);
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
	 * Enter a parse tree produced by the {@code rpPrev}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterRpPrev(XQueryParser.RpPrevContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rpPrev}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitRpPrev(XQueryParser.RpPrevContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rpAtt}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterRpAtt(XQueryParser.RpAttContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rpAtt}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitRpAtt(XQueryParser.RpAttContext ctx);
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
	 * Enter a parse tree produced by the {@code rpDoubleSlah}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterRpDoubleSlah(XQueryParser.RpDoubleSlahContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rpDoubleSlah}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitRpDoubleSlah(XQueryParser.RpDoubleSlahContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rpSquare}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterRpSquare(XQueryParser.RpSquareContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rpSquare}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitRpSquare(XQueryParser.RpSquareContext ctx);
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
	 * Enter a parse tree produced by the {@code fEqual}
	 * labeled alternative in {@link XQueryParser#f}.
	 * @param ctx the parse tree
	 */
	void enterFEqual(XQueryParser.FEqualContext ctx);
	/**
	 * Exit a parse tree produced by the {@code fEqual}
	 * labeled alternative in {@link XQueryParser#f}.
	 * @param ctx the parse tree
	 */
	void exitFEqual(XQueryParser.FEqualContext ctx);
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
	 * Enter a parse tree produced by the {@code fSame}
	 * labeled alternative in {@link XQueryParser#f}.
	 * @param ctx the parse tree
	 */
	void enterFSame(XQueryParser.FSameContext ctx);
	/**
	 * Exit a parse tree produced by the {@code fSame}
	 * labeled alternative in {@link XQueryParser#f}.
	 * @param ctx the parse tree
	 */
	void exitFSame(XQueryParser.FSameContext ctx);
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