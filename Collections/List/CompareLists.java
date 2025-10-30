package com.Collections.List;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CompareLists {

	public static void main(String[] args) {
		
		List<String> list1 = Arrays.asList("apple", "banana", "cherry");
		List<String> list2 = Arrays.asList("banana", "cherry", "apple");
		
		boolean areEqual = list1.size() == list2.size() && list1.stream().sorted().collect(Collectors.toList())
							.equals(list2.stream().sorted().collect(Collectors.toList()));
		
		if(areEqual == true) {
			
		System.out.println("Lists are equal.");
		} else {
			System.out.println("Lists are not equal");
		}
	}
}
