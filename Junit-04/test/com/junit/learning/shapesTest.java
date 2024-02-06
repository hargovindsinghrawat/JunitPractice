package com.junit.learning;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class shapesTest {

	Shapes shape = new Shapes();

	@Test
	void testComputeSquareArea() {
		assertEquals(576, shape.computeSquareArea(24));
	}
	
	@Test
	void testComputeCircleArea() {
		assertEquals(78.5, shape.computeCircleArea(5));
	}
}