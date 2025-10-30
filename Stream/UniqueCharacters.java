package com.Stream;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class UniqueCharacters {

	public static void main(String[] args) {
		String str = "capgemini";
		
		Map<Character, Long> strMap = str.chars().mapToObj(c -> (char)c).collect(Collectors.groupingBy(c -> c, LinkedHashMap::new, Collectors.counting()));
		
		List<Character> uniqueChar = strMap.entrySet().stream().filter(entry -> entry.getValue() == 1)
										.map(Map.Entry::getKey).collect(Collectors.toList());
		System.out.println("Unique characters: "+ uniqueChar);
	}
}
