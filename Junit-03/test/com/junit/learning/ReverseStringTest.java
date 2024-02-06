package com.junit.learning;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ReverseStringTest {

	ReverseString rev = new ReverseString();

	@Test
	void testReverseString_OneWord() {
		assertEquals("avaJ",rev.reverseString("Java"));
	}
	
	@Test
	void testReverseString_MultipleWord() {
		assertEquals("ysae si avaJ",rev.reverseString("Java is easy"));
	}
}