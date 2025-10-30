//Given a String, find the first non-repeated character in it using Stream functions?

package com.Java;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonRepeatedChar {

	public static void main(String[] args) {
		
		String input = "Shantanu";
		
		Optional<Character> result = input.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(Function.identity(), 
											LinkedHashMap::new, Collectors.counting())).entrySet().stream()
											.filter(entry -> entry.getValue() == 1).map(Map.Entry::getKey).findFirst();	
		
		System.out.println("First non-repeated character is: "+ result);
	}
}
