/*
 *      State Street Corporation
 *
 * (C) COPYRIGHT STATE STREET BANK 2013
 * REPRODUCTION OR OTHER USE OF THIS PROGRAM AND ITS DOCUMENTATION
 * BY ELECTRONIC, MECHANICAL, PHOTOGRAPHIC, OR ANY OTHERS MEANS
 * IS STRICTLY PROHIBITED, UNLESS AUTHORIZED IN WRITING BY
 * STATE STREET BANK.
 * 
 * ******************************************************************
 *	
 *	File: Parser.java
 *	
 * 	PVCS Information
 *	    Archive: $Id$
 *	    version: $Revision$
 *	    date checked in: $Date$
 *	    Author: $Author$
 *
 *   REVISION LOG IS AT END OF FILE
 */

package parser;

import java.io.IOException;

/**
 * 
 * 
 * @version $Revision$
 * @author Your Name
 */

public class Parser2 {
	private int lookedAhead;

	public Parser2() {
		try {
			lookedAhead = System.in.read();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void anaylsis() throws IOException {
		term();
		R();
	}

	private void R() throws IOException {

		while (true) {
			if (lookedAhead == '+') {
				match('+');
				term();
				System.out.println("+");
			} else if (lookedAhead == '-') {
				match('-');
				term();
				System.out.println('-');
			}
			// 13 stand for /r/n
			else if (lookedAhead == 13) {
				// 空集! do nothing
				System.out.println("match empty collection");
				break;
			} else {
				// 文法R中未定义的分支会被认为是语法错误
				throw new Error("Syntax Error");
			}
		}

	}

	private void term() throws IOException {
		int temp = lookedAhead;
		match(lookedAhead);
		System.out.println((char) temp);

	}

	private void match(int n) throws IOException {
		if (lookedAhead == n) {
			int nextToken = System.in.read();
			lookedAhead = nextToken;
		} else {
			// predictive parsing(预测分析法)要求First(A)和First(B)不相交,
			// 这就可以根据First确定唯一语法, 也就说但凡某个分支解析时遇到
			// 不匹配,就可以断定为是语法错误.
			throw new Error("Syntax Error");
		}
	}

}
