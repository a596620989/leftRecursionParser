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

public class Parser {
	private int lookedAhead;

	public Parser() {
		try {
			lookedAhead = System.in.read();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void anaylsis() {
		term();
		R();
	}

	private void R() {
		// if(lookedAhead == '+'){
		// match('+');
		// term();
		// System.out.println("+");
		// R();
		// }else if(lookedAhead == '-'){
		// match('-');
		// term();
		// System.out.println('-');
		// R();
		// }else{
		// //empty kongji! do nothing
		// System.out.println("match empty collection");
		// }

		while (true) {
			if (lookedAhead == '+') {
				match('+');
				term();
				System.out.println("+");
			} else if (lookedAhead == '-') {
				match('-');
				term();
				System.out.println('-');
			} else {
				// empty kongji! do nothing
				System.out.println("match empty collection");
				break;
			}
		}

	}

	private void term() {
		int temp = lookedAhead;
		match(lookedAhead);
		System.out.println((char) temp);

		// switch (lookedAhead){
		// case '0':
		// match('0');
		// System.out.println("0");
		// break;
		// case '1':
		// match('1');
		// System.out.println("1");
		// break;
		// case '2':
		// match('2');
		// System.out.println("2");
		// break;
		// case '3':
		// match('3');
		// System.out.println("3");
		// break;
		// case '4':
		// match('4');
		// System.out.println("4");
		// break;
		// case '5':
		// match('5');
		// System.out.println("5");
		// break;
		// case '6':
		// match('6');
		// System.out.println("6");
		// break;
		// case '7':
		// match('7');
		// System.out.println("7");
		// break;
		// case '8':
		// match('8');
		// System.out.println("8");
		// break;
		// case '9':
		// match('9');
		// System.out.println("9");
		// break;
		// }
	}

	private void match(int n) {
		// System.out.println("lookedAhead" + lookedAhead + "n: " + n );
		// if(n != lookedAhead){
		// System.out.println("dismatch" );
		// }
		int nextToken = 0;
		try {
			nextToken = System.in.read();
		} catch (IOException e) {
			e.printStackTrace();
		}
		lookedAhead = nextToken;
	}

}
