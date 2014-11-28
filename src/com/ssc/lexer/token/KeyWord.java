package com.ssc.lexer.token;

import java.util.HashSet;

/**
 * key words, for example:
 *     if, true, false,while...
 * 
 * @version $Revision$
 * @author Your Name
 */

public class KeyWord extends Token {
	private String keyWord;
	
	//static keyWord set.
	private static HashSet<String> keyWordSet = new HashSet<String>();
	 
	static{
		keyWordSet.add("true");
		keyWordSet.add("false");
		keyWordSet.add("if");
		keyWordSet.add("while");
		//TODO: sounds not a good idea?
		keyWordSet.add(";");
	}

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

	public static boolean isKeyWord(String word){
		return keyWordSet.contains(word);
	}
	

}
