package com.Stream;

import java.util.Arrays;
import java.util.List;

public class StreamsExample {

	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(1, 2, 4, 6, 8, 9, 7, 10, 17, 20, 22, 25);
		
		numbers.stream().filter(i -> i % 2 == 0).forEach(System.out::println);
	}
}
