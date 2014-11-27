package com.ssc.lexer.analyser;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class LexerTest {

	private Lexer instance;
	
	@Before
	public void setUp() throws Exception {
		instance = new Lexer();
	}

	@After
	public void tearDown() throws Exception {
		instance = null;
	}

	
	@Test
	public void testDeclaration(){
		instance.scan("int i;");
	}
	
	@Test
	public void testAssignment(){
		instance.scan("i=100;");
	}
	
	@Test
	public void testDeclarationAndAssignment() {
		instance.scan("int i=10;");
	}
	
	@Test
	public void testIf(){
		//TODO: support '('&')'
		//TODO: ArrayOutOfBoundException without LINE_DELIMITER ;
		instance.scan("if i = 0;");
	}
	
	@Test
	public void testIf1(){
		instance.scan("if true;");
	}
}
