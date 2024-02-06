package com.junit.learning;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class TestBeforeEachAfterEach {

	Shapes shape;
	
	@BeforeEach
	void init() {
		shape = new Shapes();
		System.out.println("before");
	}
	
	@AfterEach
	void init2() {
		System.out.println("after");
	}
	
	@BeforeAll
	static void init3() {
		System.out.println("x");
	}
	
	@AfterAll
	static void init4() {
		System.out.println("y");
	}

	@Test
	void testComputeSquareArea() {
		assertEquals(576, shape.computeSquareArea(24));
		System.out.println("1");
	}
	
	@Test
	void testComputeCircleArea() {
		assertEquals(78.5, shape.computeCircleArea(5),"Area of Circle is wrong");
		System.out.println("2");
	}
}
