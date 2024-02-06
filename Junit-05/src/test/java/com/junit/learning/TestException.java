package com.junit.learning;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestException {

	@Test
	void testException() {
//		try{
//			SortingArray sortArr = new SortingArray();
//			int unSortedArray[] = {1,2,3};
//			int sortedArray[] = sortArr.sortingArray(unSortedArray);
//			//explexitily failing 
//			fail("Failing");
//		}
//		catch(Exception e){
//			System.out.println("Exception generated");
//		}
		SortingArray sortArr = new SortingArray();
		int unSortedArray[] = null;
		assertThrows(NullPointerException.class, () -> sortArr.sortingArray(unSortedArray));
	}
}