package com.ssc.lexer.analyser;

import com.ssc.lexer.token.Expression;
import com.ssc.lexer.token.KeyWord;
import com.ssc.lexer.token.Num;
import com.ssc.lexer.token.Token;
import com.ssc.lexer.token.Word;
import com.ssc.lexer.token.SpecialSymbol;

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
	private char[] line;
	private int index = 0;



	public Lexer()  {
	}

	public void scan(String line)  {
		
		//add end of line signal.
		line = line + Constants.LINE_DELIMITER;
		
		this.line = line.toCharArray();
		nextChar();

		while (peek != Constants.LINE_DELIMITER) {
			ignoreSpace();
			print(numLexer());
			print(wordLexer());
			print(expressionLexer());
			print(specialSymbolLexer());
		}

	}

	private Expression expressionLexer() {
		switch (peek) {
		case '<':
			nextChar();
			if (peek == '=') {
				nextChar();
				return new Expression("<=");
			} else {
				return new Expression("<");
			}
		case '=':
			nextChar();
			if(peek == '='){
				nextChar();
				return new Expression("==");
			}else{
				return new Expression("=");
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

	private void ignoreSpace() {
		while (peek == ' ' || peek == '\t') {
			nextChar();
		}
	}

	/*
	 * lexer number
	 */
	private Token numLexer() {

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

	private Token wordLexer() {

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

		if (KeyWord.isKeyWord(tmp)) {
			token = new KeyWord(tmp);
		} else {
			token = new Word(tmp);
		}

		return token;

	}
	
	private Token specialSymbolLexer() {


		Token token = null;

		String tmp = String.valueOf((char)peek);

		if (SpecialSymbol.isSpecialSymbol(tmp)) {
			nextChar();
			token = new SpecialSymbol(tmp);
		} 

		return token;

	}

	private boolean isInvidialChar(int c) {
		return ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')
				|| (c >= '0' && c <= '9'));
	}

	private void nextChar() {
		peek = this.line[index++];
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
