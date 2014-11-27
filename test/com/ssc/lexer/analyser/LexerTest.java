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
	public void test() throws IOException {
		instance.scan("int i<=10;");
	}

}
