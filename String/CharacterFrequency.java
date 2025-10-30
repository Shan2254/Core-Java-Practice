package com.String;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CharacterFrequency {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a string: ");
		String str = sc.nextLine();
		
		countCharacters(str);
	}

	private static void countCharacters(String str) {
		
		Map<Character, Integer> frequencyMap = new HashMap<>();
	
		for(char c : str.toCharArray()) {
			frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
		}
		System.out.println("Character frequency: ");
		for(Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
			System.out.println(entry.getKey()+ " : "+ entry.getValue());
		}	
	}
}
