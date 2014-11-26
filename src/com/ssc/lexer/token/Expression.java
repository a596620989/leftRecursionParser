package com.ssc.lexer.token;

/**
 * epxression in programming language.
 * for example:
 *     <=,<,>=....
 * 
 * @version $Revision$
 * @author Your Name
 */

public class Expression extends Token {

	private String expression;

	public Expression(String expression) {
		this.expression = expression;
	}

	@Override
	public String toString() {
		return "Expression [expression:" + expression + "]";
	}

}
