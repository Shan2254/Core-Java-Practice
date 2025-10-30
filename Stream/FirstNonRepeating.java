package com.Stream;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class FirstNonRepeating {

	public static void main(String[] args) {
		String str = "capgemini";
		
		Map<Character, Long> strMap = str.chars().mapToObj(c -> (char)c).collect(Collectors.groupingBy(c -> c, LinkedHashMap::new, Collectors.counting()));
		Optional<Character> firstNonRepeat = strMap.entrySet().stream().filter(entry -> entry.getValue() == 1)
											.map(Map.Entry::getKey).findFirst();
		
		if(firstNonRepeat.isPresent()) {
			System.out.println("First non repeating character is: "+ firstNonRepeat.get());
		} else {
			System.out.println("No non repeating character is found");
		}
	}
}
