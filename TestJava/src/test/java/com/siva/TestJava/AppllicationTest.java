package com.siva.TestJava;

import static org.junit.Assert.*;

import org.junit.Test;

public class AppllicationTest {

	@Test
	public void testReturnInt() {
		App app = new App();
		int i = app.returnInt(10);
		
		assertEquals(10, i);
	}

}
