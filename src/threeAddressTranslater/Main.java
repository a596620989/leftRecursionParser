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

package threeAddressTranslater;

/**
 *   
 *   
 * @version $Revision$
 * @author Your Name
 */

public class Main
{
    //int a
    //a = 0;
    //int i
    //i = 0;
    //if(a == 0){
    //    array[i + 1] = a + 1 + 2;
    //	  a = 10;
    //}
    //a = -1;

    Decl decl = new Decl("a");
    Assign assign = new Assign("=","a","0");
    Decl decl2 = new Decl("i");
    Assign assign2 = new Assign("=","i","0");
    If ifstmt = new If(new Expr("a==0"),new Stmts(new Stmts(),new Stmt(new Expr("array[i+1] = a + 1 + 2"))));
    
    Seq seq = new Seq(decl,new Seq(assign,new Seq(decl2,new Seq(assign2,fistmt))));
    
    seq.gen();
}


