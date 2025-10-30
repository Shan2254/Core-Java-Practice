//Q2) Given a list of integers, find out all the numbers starting with 1 using Stream functions?


package com.Java;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NumbersStartWithOne {
	
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 10, 18, 22, 50, 100, 111, 150);
		List<Integer> numberStartWithOne = numbers.stream().filter(n -> String.valueOf(n).startsWith("1")).collect(Collectors.toList());
		
		System.out.println("Numbers starting with one are: "+numberStartWithOne);
		
	}

}
