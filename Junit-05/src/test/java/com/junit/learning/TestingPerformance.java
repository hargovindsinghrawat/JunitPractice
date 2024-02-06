package com.junit.learning;

import static org.junit.jupiter.api.Assertions.*;

import java.time.Duration;

import org.junit.jupiter.api.Test;

class TestingPerformance {

	@Test
	void testPerformance() {
		SortingArray sortArr = new SortingArray();
		int arr[] = {1,2,4,3,6};
		assertTimeout(Duration.ofMillis(1), () -> sortArr.sortingArray2(arr));
	}

}
