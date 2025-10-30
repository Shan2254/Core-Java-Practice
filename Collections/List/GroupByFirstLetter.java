package com.Collections.List;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupByFirstLetter {

	public static void main(String[] args) {
		
		List<String> words = Arrays.asList("apple", "banana", "apricot","blueberry", "cherry", "avocado");
		
		Map<Character, List<String>> groupWords = words.stream().collect(Collectors.groupingBy(word -> word.charAt(0)));
		
		System.out.println("Grouped words are: "+ groupWords);
	}
}
