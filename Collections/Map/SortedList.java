package com.Collections.Map;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SortedList {

	public static void main(String[] args) {
		Map<String, Integer> studentScores = new HashMap<>();
		studentScores.put("Abc", 90);
		studentScores.put("John", 97);
		studentScores.put("Adam", 85);
		studentScores.put("Xyz", 80);
		
		List<Map.Entry<String, Integer>> sortedList = studentScores.entrySet().stream()
									.sorted(Map.Entry.comparingByValue()).collect(Collectors.toList());
		
		System.out.println("Sorted list is: "+ sortedList);
	}
}
