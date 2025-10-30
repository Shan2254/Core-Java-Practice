package com.Stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Optional;

public class LongestString {

	public static void main(String[] args) {
		String[] words = {"hello", "world", "capgemini", "java", "apple"};
		
		Optional<String> longest = Arrays.stream(words).max(Comparator.comparingInt(String::length));
		
		if(longest.isPresent()) {
			System.out.println("Longest string is: "+ longest.get());
		}
	}
}
