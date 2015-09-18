// Generated from gram.g4 by ANTLR 4.5.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link gramParser}.
 */
public interface gramListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link gramParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(gramParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(gramParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramParser#main_func}.
	 * @param ctx the parse tree
	 */
	void enterMain_func(gramParser.Main_funcContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramParser#main_func}.
	 * @param ctx the parse tree
	 */
	void exitMain_func(gramParser.Main_funcContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramParser#func}.
	 * @param ctx the parse tree
	 */
	void enterFunc(gramParser.FuncContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramParser#func}.
	 * @param ctx the parse tree
	 */
	void exitFunc(gramParser.FuncContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramParser#classyfunc}.
	 * @param ctx the parse tree
	 */
	void enterClassyfunc(gramParser.ClassyfuncContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramParser#classyfunc}.
	 * @param ctx the parse tree
	 */
	void exitClassyfunc(gramParser.ClassyfuncContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramParser#funcs}.
	 * @param ctx the parse tree
	 */
	void enterFuncs(gramParser.FuncsContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramParser#funcs}.
	 * @param ctx the parse tree
	 */
	void exitFuncs(gramParser.FuncsContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramParser#l_otwarcie}.
	 * @param ctx the parse tree
	 */
	void enterL_otwarcie(gramParser.L_otwarcieContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramParser#l_otwarcie}.
	 * @param ctx the parse tree
	 */
	void exitL_otwarcie(gramParser.L_otwarcieContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramParser#l_nawias}.
	 * @param ctx the parse tree
	 */
	void enterL_nawias(gramParser.L_nawiasContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramParser#l_nawias}.
	 * @param ctx the parse tree
	 */
	void exitL_nawias(gramParser.L_nawiasContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramParser#p_zamkniecie}.
	 * @param ctx the parse tree
	 */
	void enterP_zamkniecie(gramParser.P_zamkniecieContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramParser#p_zamkniecie}.
	 * @param ctx the parse tree
	 */
	void exitP_zamkniecie(gramParser.P_zamkniecieContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramParser#p_nawias}.
	 * @param ctx the parse tree
	 */
	void enterP_nawias(gramParser.P_nawiasContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramParser#p_nawias}.
	 * @param ctx the parse tree
	 */
	void exitP_nawias(gramParser.P_nawiasContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramParser#liczba}.
	 * @param ctx the parse tree
	 */
	void enterLiczba(gramParser.LiczbaContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramParser#liczba}.
	 * @param ctx the parse tree
	 */
	void exitLiczba(gramParser.LiczbaContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramParser#liczba_}.
	 * @param ctx the parse tree
	 */
	void enterLiczba_(gramParser.Liczba_Context ctx);
	/**
	 * Exit a parse tree produced by {@link gramParser#liczba_}.
	 * @param ctx the parse tree
	 */
	void exitLiczba_(gramParser.Liczba_Context ctx);
}