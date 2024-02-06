package com.junit.learning;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestTrail {

	@Test
	void test() {
		assertEquals(6,6);
	}
	
	Shapes shape = new Shapes();

	@Test
	void testComputeSquareArea() {
		assertEquals(576, shape.computeSquareArea(24));
	}
	
	@Test
	void testComputeCircleArea() {
		assertEquals(78.5, shape.computeCircleArea(5),"Area of Circle is wrong");
	}
	
	@Test
	void testComputeCircleArea_Supplier() {
		assertEquals(76.5, shape.computeCircleArea(5),() -> "Area of Circle is wrong 1");
	}
}