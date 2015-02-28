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
 *	File: If.java
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

public class If extends Stmt {

	private Expr expr;
	private Stmt stmt;

	public If(Expr expr, Stmt stmt) {
		super();
		this.expr = expr;
		this.stmt = stmt;
	}

	@Override
	public void gen() {

		System.out.println("IfFalse " + expr + "goto" + "after");

		stmt.gen();

	}

}
