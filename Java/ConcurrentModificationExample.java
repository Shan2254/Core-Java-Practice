package com.Java;

import java.util.Arrays;
import java.util.List;

public class ConcurrentModificationExample {

	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		try {
		for(Integer n : numbers) {
			if(n % 2 != 0) {
				numbers.remove(n);
			}
		}
		} catch (Exception e) {
			System.out.println(e);
		}
		
		System.out.println(numbers);
		
	}
}
