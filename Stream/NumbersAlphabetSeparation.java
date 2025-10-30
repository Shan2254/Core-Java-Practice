package com.Stream;


import java.util.*;
import java.util.stream.Collectors;

public class NumbersAlphabetSeparation {

	public static void main(String[] args) {
		
		List<Character> list = Arrays.asList('1', 'a', '2', 'b', '3', 'c');
		
		Map<Boolean, List<Character>> charMap = list.stream()
				.collect(Collectors.partitioningBy(Character::isDigit));
		
		System.out.println("Numeric: " + charMap.get(true));
		System.out.println("Alphabetic: " + charMap.get(false));
		
	}
}
