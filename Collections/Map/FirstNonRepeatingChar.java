package com.Collections.Map;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatingChar {

	public static void main(String[] args) {
		String input = "capgemini";
		
		Map<Character, Integer> charCount = new LinkedHashMap<>();
		
		for(char c : input.toCharArray()) {
			charCount.put(c, charCount.getOrDefault(c, 0) + 1);
		}
		for(Map.Entry<Character, Integer> entry : charCount.entrySet()) {
			if(entry.getValue() == 1) {
				System.out.println("First non-repeating character: "+entry.getKey());
				return;
			}
		}
		System.out.println("No non-repeating character found.");
	}
}
