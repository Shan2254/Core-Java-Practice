package com.Collections.Set;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class MinMaxElement {

	public static void main(String[] args) {
		Set<Integer> numbers = new HashSet<>(Arrays.asList(10, 20, 40, 50, 70, 90));
		
		int min = Collections.min(numbers);
		int max = Collections.max(numbers);
		
		System.out.println("Minimum Element: "+ min);
		System.out.println("Maximum Element: "+ max);
	}
}
