package com.ssc.lexer.token;

/**
 * words defined in programming language, for example, a variable name definition.
 * 
 * TODO: store words in symbol table.
 * 
 * @version $Revision$
 * @author Your Name
 */

public class Word extends Token {

	private String word;

	public Word(String word) {
		this.word = word;
	}

	public String getWord() {
		return word;
	}

	public void setWord(String word) {
		this.word = word;
	}

	@Override
	public String toString() {
		return "Word [word=" + word + "]";
	}

}
