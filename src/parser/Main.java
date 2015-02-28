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
 *	File: Main.java
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
 为下�?�语义，使用预测分析法写一个语法制导翻译器 expr -> expr + term {print '+'} expr -> expr - term
 * {print '-'} expr -> term
 * 
 * term -> 0 {print '0'} term -> 1 {print '1'} .... ....
 * 
 * term -> 9 {print '9'}
 * 
 * 左递归: A -> Aa | b
 * 
 * 转为右递归: A -> ｒR R -> ａR |　ｂR | empty
 * 
 * ｒ = term {print 'x'} ａ = + term {print '+'} ｂ = - term {print '-'}
 * 
 * A -> ｒ R R -> ａR = + term {print '+'} R -> ｂR = - term {print '-'} R -> empty
 * 
 * 预备知识： 我们将first（a）定义为可以由a生成的一个或多个终结符串的第一个符号的集合
 * 
 * @version $Revision$
 * @author Your Name
 */

public class Main {

	public static void main(String args[]) throws IOException {
		Parser2 p = new Parser2();
		p.anaylsis();
	}

}
