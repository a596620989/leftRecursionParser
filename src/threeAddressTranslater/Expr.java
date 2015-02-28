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
 *	File: Eval.java
 *	
 * 	PVCS Information
 *	    Archive: $Id$
 *	    version: $Revision$
 *	    date checked in: $Date$
 *	    Author: $Author$
 *
 *   REVISION LOG IS AT END OF FILE
 */

package threeAddressTranslater;

/**
 * 
 * 
 * @version $Revision$
 * @author Your Name
 */

public class Expr extends Node {

	private String left;
	private String right;

	public Expr(String left, String right) {
		this.left = left;
		this.right = right;
	}

	public Object eval() {
		return null;
	}

	public void gen() {
		rvalue();
		lvalue();
	}

	public Expr lvalue(){
	
	Expr result = null;
	
	if(isArray(left)){
	    String result = rvalue(left.substring(left.indexOf("["), left.indexOf("]")));
	    String arrayName;
	    System.out.println(arrayName + "[" + result + "]" = r);
	}else{
	    //array case
	    
	}
	
	
	
	return result;
	
    }

	/**
	 * return true if input is an identifier in symbol table
	 * 
	 * @param input
	 * @return
	 */
	private boolean isArray(String left) {
		return left.contains("[");
	}

	public Expr rvalue() {

	}

}
