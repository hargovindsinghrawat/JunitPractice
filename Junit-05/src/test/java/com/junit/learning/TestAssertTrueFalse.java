package com.junit.learning;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestAssertTrueFalse {

	String str = "Hargovind";
	
	@Test
	void testTrue() {
		assertTrue(true);
	}
	
	@Test
	void testTrue2() {
		assertTrue(false);
	}
	
	@Test
	void testFalse() {
		assertFalse(true);
	}
	
	@Test
	void testFalse2() {
		assertFalse(false);
	}
	
	@Test
	void testTrue3() {
		assertTrue(str.equals("Hargovind"));
	}
	
	@Test
	void testTrue4() {
		assertTrue(str.equals("AHargovind"));
	}
	
	@Test
	void testFalse3() {
		assertFalse(str.equals("AHargovind"));
	}
	
	@Test
	void testFalse4() {
		assertFalse(str.equals("Hargovind"));
	}

}
