package com.Stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class NumberStartsWith {

	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(1, 2, 204, 222, 234, 345, 456, 278, 290, 500);
		
//		List<Integer> numStartsWith2 = numbers.stream().map(e -> String.valueOf(e))
//								.filter(e -> e.startsWith("2"))
//								.map(Integer::valueOf).collect(Collectors.toList());
//		
//		System.out.println(numStartsWith2);
		
		Optional<Integer> sum = numbers.stream().reduce((a , b) -> a+b);
		System.out.println("Sum of all numbers are: " + sum.get());
		
//		double avg = numbers.stream().mapToInt(e -> e).average().getAsDouble();
//		System.out.println("Average is: " + avg);
	}
}
