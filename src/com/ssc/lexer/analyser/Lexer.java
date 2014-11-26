package com.ssc.lexer.analyser;

import java.io.IOException;
import java.util.HashSet;

import com.ssc.lexer.token.Expression;
import com.ssc.lexer.token.KeyWord;
import com.ssc.lexer.token.Num;
import com.ssc.lexer.token.Token;
import com.ssc.lexer.token.Word;

/**
 * create a lexer which can handler keyword true, false. and can handler number
 * or identify.
 * 
 * @version $Revision$
 * @author Your Name
 */

public class Lexer {

	//look forward
	private int peek;

	//static keyWord set.
	private HashSet<String> keyWordSet = new HashSet<String>();


	public Lexer() throws IOException {
		peek = System.in.read();
		keyWordSet.add("true");
		keyWordSet.add("false");
	}

	public void scan() throws IOException {

		// 13 stand for 'enter' key
		while (peek != 13) {
			ignoreSpace();
			print(numLexer());
			print(wordLexer());
			print(expressionLexer());
		}

	}

	private Expression expressionLexer() throws IOException {
		switch (peek) {
		case '<':
			nextChar();
			if (peek == '=') {
				nextChar();
				return new Expression("<=");
			} else {
				return new Expression("<");
			}
		default:
			return null;
		}

	}

	private void print(Token t) {
		if (t == null) {
			// do nothing;
		} else {
			System.out.println(t.toString());
		}
	}

	private void ignoreSpace() throws IOException {
		while (peek == ' ' || peek == '\t') {
			nextChar();
		}
	}

	/*
	 * lexer number
	 */
	private Token numLexer() throws IOException {

		if (!isDigit((char) peek)) {
			return null;
		}

		int result = toInt((char) peek);

		while (true) {
			nextChar();
			if (isDigit((char) peek)) {
				result = result * 10;
				result = result + toInt((char) peek);
			} else {
				break;
			}
		}

		return new Num(result);
	}

	private Token wordLexer() throws IOException {

		if (!isInvidialChar(peek)) {
			return null;
		}

		Token token = null;
		char[] result = new char[10];

		int i = 0;
		while (isInvidialChar(peek)) {
			result[i++] = (char) peek;
			nextChar();
		}

		String tmp = new String(result).trim();

		if (keyWordSet.contains(tmp)) {
			token = new KeyWord(tmp);
		} else {
			token = new Word(tmp);
		}

		return token;

	}

	private boolean isInvidialChar(int c) {
		return ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z'));
	}

	private void nextChar() throws IOException {
		peek = System.in.read();
	}

	/**
	 * return true if char n can be formated to a digit
	 * 
	 * @param n
	 * @return
	 */
	private boolean isDigit(char n) {
		return (n >= '0' && n <= '9');
	}

	private int toInt(char c) {
		return (int) (c - 48);
	}

}
