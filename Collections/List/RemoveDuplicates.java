package com.Collections.List;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicates {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(5, 4, 3, 7, 4, 9, 7, 2, 9);
		
//		List<Integer> newList = numbers.stream().collect(Collectors.toCollection(LinkedHashSet::new)).stream().collect(Collectors.toList());
		List<Integer> newList = numbers.stream().distinct().collect(Collectors.toList());
		System.out.println("Result: "+ newList);
	}
}
