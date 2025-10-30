package com.Java;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PrimeNumEx {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(2, 3, 7, 11, 4, 6, 8, 10, 12);
		
		List<Integer> prime = numbers.stream().filter(PrimeNumEx::isPrime).collect(Collectors.toList());
		System.out.println(prime);
	}
	
	private static boolean isPrime(int num) {
		if(num < 2) { 
			return false;
		}
		return java.util.stream.IntStream.rangeClosed(2, (int) Math.sqrt(num)).allMatch(n -> num % 2 != 0);
	}
}
