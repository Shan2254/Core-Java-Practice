package com.Stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequencyOfWord {
	
	public static void main(String[] args) {
		
		List<String> words = Arrays.asList("apple", "banana", "cherry", "apple", "banana");
		
		String input = "Get the future you want";
		
		Map<String, Long> wordFrequency = words.stream().collect(Collectors.groupingBy(Function.identity(),
											Collectors.counting()));
		
		System.out.println("Word frequency is: ");
		wordFrequency.forEach((word, count) ->
			System.out.println(word +" - "+ count));	
		
		Map<Character, Long> charFrequency = input.chars().mapToObj(c -> (char) c).map(Character::toLowerCase).collect(Collectors
									.groupingBy(c -> c, Collectors.counting()));
		
		System.out.println("Character frequency is: ");
		System.out.println(charFrequency);
		
	}
}
