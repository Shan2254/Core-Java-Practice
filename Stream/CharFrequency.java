package com.Stream;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CharFrequency {

	public static void main(String[] args) {
		
		String input = "capgemini";
//		
//		Map<Character, Long> result = input.chars().mapToObj(c -> (char) c).collect(Collectors
//											.groupingBy(c -> c, LinkedHashMap::new, Collectors.counting()));
//	
//		System.out.println(result);
		
		Map<Character, Long> result = input.chars().mapToObj(c -> (char) c).collect(Collectors
				.groupingBy(c -> c, Collectors.counting()));
		
		result.forEach((ch, value) -> 
			System.out.println(ch +" - "+ value));
		
		
//		List<String> list = Arrays.asList("A","A","B","C","A","B","C","D","D","D");
//        
//        Map<String, Long> result = list.stream().collect(Collectors.groupingBy(c -> c, Collectors.counting()));
//        
//        result.forEach((ch, value) -> System.out.println(ch +" - "+ value));
	}
}
