//Q5) Given a list of integers, find the total number of elements present in the list using Stream functions?


package com.Java;

import java.util.Arrays;
import java.util.List;

public class NumberOfElements {

	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9);
		
		long count = numbers.stream().count();
		System.out.println("Number of elements are: "+ count);
	}
}
