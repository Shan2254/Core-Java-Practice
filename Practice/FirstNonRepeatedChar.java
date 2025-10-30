package com.Practice;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Stream;

public class FirstNonRepeatedChar {

	public static void main(String[] args) {
		String[] words = {"array", "apple", "rat"};
		
//		Map<Character, Integer> charCount = new LinkedHashMap<>();
//		
//		for(String word : words) {
//			for(char c : word.toCharArray()) {
//				charCount.put(c, charCount.getOrDefault(c, 0) + 1);
//			}
//		}
//		for(Map.Entry<Character, Integer> entry : charCount.entrySet()) {
//			if(entry.getValue() == 1) {
//				System.out.println(entry.getKey());
//			}
//		}
		
		for(String s : words) {
			String str = s;
			Character ch = str.chars().mapToObj(c -> (char) c).filter(c -> str.indexOf(c) == str.lastIndexOf(c))
																							.findFirst().get();
			
			System.out.println(ch);
		}
	}
}
