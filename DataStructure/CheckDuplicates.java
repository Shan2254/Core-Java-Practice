package com.DataStructure;

import java.util.HashSet;

public class CheckDuplicates {

	public static boolean hasDuplicates(int[] array) {
		HashSet<Integer> set = new HashSet<>();
		for(int num : array) {
			if(set.contains(num)) {
				return true;
			}
			set.add(num);
		}
		return false;	
	}
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5, 4, 7, 2};
		
		System.out.println("Array has duplicates? "+ hasDuplicates(arr));
	}
}
