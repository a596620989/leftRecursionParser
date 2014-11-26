package com.ssc.lexer.token;

/**
 * number, for example:
 *     1, 100.
 *     
 * 2a,10f will not be recognized as a number.
 * 
 * @version $Revision$
 * @author Your Name
 */

public class Num extends Token {
	private int value;

	public Num(int value) {
		this.value = value;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return "Num [value=" + value + "]";
	}

}
