package com.junit.learning;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ReverseStringTest {

	@Test
	void test() {
		ReverseString rs = new ReverseString();
		assertEquals("avaj",rs.reverseString("java"));
	}
}
