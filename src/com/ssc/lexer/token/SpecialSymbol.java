package com.ssc.lexer.token;

import java.util.HashSet;

/**
 * standard code should contains only [a-z],[A-Z],[0-9].
 * for some purpose(what purpose?), special symbol like (,);
 * is introduced to programming language.
 * @author e533268
 *
 */
public class SpecialSymbol extends Token {
	
	private String symbol;
	
	public SpecialSymbol(String symbol) {
		this.symbol = symbol;
	}

	// static keyWord set.
	private static HashSet<String> specialSymbolSet = new HashSet<String>();
	
	static{
		specialSymbolSet.add(";");
		specialSymbolSet.add("(");
		specialSymbolSet.add(")");
		//TODO:how to identify ( & ()? , former one in if statement, latter one in method call
		specialSymbolSet.add("()");
	}
	
	public static boolean isSpecialSymbol(String symbol){
		return specialSymbolSet.contains(symbol);
	}

	@Override
	public String toString() {
		return "SpecialSymbol [symbol=" + symbol + "]";
	}
	

}
