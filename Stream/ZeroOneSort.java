package com.Stream;

import java.util.Arrays;

public class ZeroOneSort {

	public static void main(String[] args) {
		int[] arr = {1, 1, 0, 1, 0};
		
		//Sort using streams
		arr = Arrays.stream(arr).sorted().toArray();	
		System.out.println("Result: "+ Arrays.toString(arr));
	}
}
