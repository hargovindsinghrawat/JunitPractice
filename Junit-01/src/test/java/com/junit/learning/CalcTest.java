package com.junit.learning;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalcTest {

	@Test
	public void test() {
		Calc c = new Calc();
		int actual = c.divide(10, 5);
		int expexted = 2;
		assertEquals(expexted,actual);
	}
}