package com.Collections.List;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplicateString {

	public static void main(String[] args) {
		List<String> strings = Arrays.asList("java", "world", "hello");
		
		List<Character> duplicates = strings.stream().flatMap(str -> str.chars().mapToObj(c -> (char) c))
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet().stream()
				.filter(entry -> entry.getValue() > 1).map(Map.Entry::getKey).collect(Collectors.toList());
		
		System.out.println("Duplicates characters: "+ duplicates);
	}
}
