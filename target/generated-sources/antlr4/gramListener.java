// Generated from gram.g4 by ANTLR 4.4
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link gramParser}.
 */
public interface gramListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link gramParser#p_zamkniecie}.
	 * @param ctx the parse tree
	 */
	void enterP_zamkniecie(@NotNull gramParser.P_zamkniecieContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramParser#p_zamkniecie}.
	 * @param ctx the parse tree
	 */
	void exitP_zamkniecie(@NotNull gramParser.P_zamkniecieContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramParser#funcs}.
	 * @param ctx the parse tree
	 */
	void enterFuncs(@NotNull gramParser.FuncsContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramParser#funcs}.
	 * @param ctx the parse tree
	 */
	void exitFuncs(@NotNull gramParser.FuncsContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramParser#main_func}.
	 * @param ctx the parse tree
	 */
	void enterMain_func(@NotNull gramParser.Main_funcContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramParser#main_func}.
	 * @param ctx the parse tree
	 */
	void exitMain_func(@NotNull gramParser.Main_funcContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(@NotNull gramParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(@NotNull gramParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramParser#l_otwarcie}.
	 * @param ctx the parse tree
	 */
	void enterL_otwarcie(@NotNull gramParser.L_otwarcieContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramParser#l_otwarcie}.
	 * @param ctx the parse tree
	 */
	void exitL_otwarcie(@NotNull gramParser.L_otwarcieContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramParser#l_nawias}.
	 * @param ctx the parse tree
	 */
	void enterL_nawias(@NotNull gramParser.L_nawiasContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramParser#l_nawias}.
	 * @param ctx the parse tree
	 */
	void exitL_nawias(@NotNull gramParser.L_nawiasContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramParser#func}.
	 * @param ctx the parse tree
	 */
	void enterFunc(@NotNull gramParser.FuncContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramParser#func}.
	 * @param ctx the parse tree
	 */
	void exitFunc(@NotNull gramParser.FuncContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramParser#p_nawias}.
	 * @param ctx the parse tree
	 */
	void enterP_nawias(@NotNull gramParser.P_nawiasContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramParser#p_nawias}.
	 * @param ctx the parse tree
	 */
	void exitP_nawias(@NotNull gramParser.P_nawiasContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramParser#classyfunc}.
	 * @param ctx the parse tree
	 */
	void enterClassyfunc(@NotNull gramParser.ClassyfuncContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramParser#classyfunc}.
	 * @param ctx the parse tree
	 */
	void exitClassyfunc(@NotNull gramParser.ClassyfuncContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramParser#liczba_}.
	 * @param ctx the parse tree
	 */
	void enterLiczba_(@NotNull gramParser.Liczba_Context ctx);
	/**
	 * Exit a parse tree produced by {@link gramParser#liczba_}.
	 * @param ctx the parse tree
	 */
	void exitLiczba_(@NotNull gramParser.Liczba_Context ctx);
	/**
	 * Enter a parse tree produced by {@link gramParser#liczba}.
	 * @param ctx the parse tree
	 */
	void enterLiczba(@NotNull gramParser.LiczbaContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramParser#liczba}.
	 * @param ctx the parse tree
	 */
	void exitLiczba(@NotNull gramParser.LiczbaContext ctx);
}