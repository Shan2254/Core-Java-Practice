//Given a list of integers, sort all the values present in it in descending order using Stream functions?

package com.Java;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class SortDescOrder {

	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(10, 4, 18, 12, 9, 20);
		List<Integer> sortNumbers = numbers.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());
		
		System.out.println("Sorted list in descending order is: "+ sortNumbers);
	}
}
