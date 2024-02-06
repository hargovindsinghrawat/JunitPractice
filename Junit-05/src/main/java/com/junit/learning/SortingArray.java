package com.junit.learning;

import java.util.Arrays;

public class SortingArray {

	public int[] sortingArray(int[] array) {
		Arrays.sort(array);
		return array;
	}
	
	public int[] sortingArray2(int[] array) {
		for(int i=0;i<100000000;i++) {
			Arrays.sort(array);
		}
		return array;
	}
}