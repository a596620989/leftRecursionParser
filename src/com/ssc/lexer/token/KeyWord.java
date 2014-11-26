package com.ssc.lexer.token;

/**
 * key words, for example:
 *     if, true, false,while...
 * 
 * @version $Revision$
 * @author Your Name
 */

public class KeyWord extends Token {
	private String keyWord;

	public KeyWord(String keyWord) {
		this.keyWord = keyWord;
	}

	public String getKeyWord() {
		return keyWord;
	}

	public void setKeyWord(String keyWord) {
		this.keyWord = keyWord;
	}

	@Override
	public String toString() {
		return "KeyWord [keyWord=" + keyWord + "]";
	}

}
