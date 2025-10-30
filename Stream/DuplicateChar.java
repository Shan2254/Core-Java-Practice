package com.Stream;

import java.util.Map;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplicateChar {

	public static void main(String[] args) {
//		String input = "capgemini";
//		
//		Map<Character, Long> duplicates = input.chars().mapToObj(c -> (char) c)
//										.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
//		
//		duplicates.entrySet().stream().filter(entry -> entry.getValue() > 1)
//					.forEach(entry -> System.out.println(entry.getKey() + ": "+ entry.getValue()));
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String input = sc.nextLine();
		Map<Character, Long> duplicates = input.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(Function
														.identity(), Collectors.counting()));
		duplicates.entrySet().stream().filter(entry -> entry.getValue() > 1).forEach(entry -> 
														System.out.println(entry.getKey()+" - "+entry.getValue()));
	}
}
