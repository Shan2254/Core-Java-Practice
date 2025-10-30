//Given a list of integers, find the maximum value element present in it using Stream functions?

package com.Java;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MaxValue {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(10, 18, 22, 27, 4, 9);
		
		Optional<Integer> max = numbers.stream().max(Integer :: compareTo);
		
		System.out.println("Maximum value is: "+ max);
	}
}
