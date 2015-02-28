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
 *	File: ThreeAddressTranslater.java
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

public class ThreeAddressTranslater extends Stmt {

	private Expr expr1;
	private Expr expr2;
	private Expr expr3;
	private Stmt stmt;

	// for(expr1;expr2;expr3){
	// stmt;
	// }
	//
	//

	public ThreeAddressTranslater(Expr expr1, Expr expr2, Expr expr3, Stmt stmt) {
		this.expr1 = expr1;
		this.expr2 = expr2;
		this.expr3 = expr3;
		this.stmt = stmt;
	}

	@Override
	public void gen() {

	}

}
