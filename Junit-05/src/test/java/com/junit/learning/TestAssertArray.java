package com.junit.learning;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestAssertArray {

	@Test
	void testArrays() {
		int exp[] = {1,2,3};
		int act[] = {1,2,3};
		
		assertArrayEquals(exp,act);
	}

}
