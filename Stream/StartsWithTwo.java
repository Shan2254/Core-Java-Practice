package com.Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StartsWithTwo {

	public static void main(String[] args) {
		int[] numbers = {1, 2, 4, 9, 20, 22, 27, 50, 100, 200, 222};
		
		List<Integer> result = Arrays.stream(numbers).boxed().filter(num -> Integer.toString(num)
								.startsWith("2")).collect(Collectors.toList());
		
		System.out.println("Elements starting with 2: "+ result);
	}
}
