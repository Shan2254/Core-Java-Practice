package com.Stream;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class DuplicateNumbers {

public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 7, 8, 10, 15, 10, 4, 22, 7, 30, 22, 2);
		
		Set<Integer> dupNum = numbers.stream().filter(e -> Collections.frequency(numbers, e) > 1)
									.collect(Collectors.toSet());
		System.out.println(dupNum);
	}
}
