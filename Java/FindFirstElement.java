//Given the list of integers, find the first element of the list using Stream functions?

package com.Java;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindFirstElement {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
		
		Optional<Integer> firstElement = numbers.stream().findFirst();
		System.out.println("First Element is: "+ firstElement);
	}
}
