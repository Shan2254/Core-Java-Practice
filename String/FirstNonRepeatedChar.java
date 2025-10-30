package com.String;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FirstNonRepeatedChar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a string: ");
		String input = sc.nextLine();
		Character result = findFirstNonRepeatedChar(input);
		
		if(result != null) {
			System.out.println("First non repeated char is: "+ result);
		} else {
			System.out.println("No non repeated character is found.");
		}
	}

	private static Character findFirstNonRepeatedChar(String str) {
		if(str == null || str.isEmpty()) {
			return null;
		}
		
		Map<Character, Integer> countChar = new LinkedHashMap<>();
		//count frequency
		for(char c : str.toCharArray()) {
			countChar.put(c, countChar.getOrDefault(c, 0)+ 1);
		}
		//find first char
		for(Map.Entry<Character, Integer> entry : countChar.entrySet()) {
			if(entry.getValue() == 1) {
				return entry.getKey();
			}
		}
		return null;
	}
}
