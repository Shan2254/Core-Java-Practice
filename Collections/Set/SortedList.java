package com.Collections.Set;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class SortedList {
	public static void main(String[] args) {
	Set<Integer> numbers = Set.of(4, 2, 6, 9, 7, 3, 8, 1, 5);
	
	List<Integer> sortedList = numbers.stream().sorted().collect(Collectors.toList());
	
	System.out.println("Sorted List: "+ sortedList);
	}
}
