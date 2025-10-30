package com.DataStructure;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class FirstNonRepeatingCharacter {

	public static void main(String[] args) {
		String str = "capgemini";
		System.out.println("First non-repeating character: ");
		checkFirstNonRepeating(str);
	}

	private static void checkFirstNonRepeating(String str) {
		Map<Character, Integer> charCount = new HashMap<>();
		Queue<Character> queue = new LinkedList<>();
		
		for(char ch : str.toCharArray()) {
			charCount.put(ch, charCount.getOrDefault(ch, 0)+ 1);
			queue.add(ch);
			
			while(!queue.isEmpty() && charCount.get(queue.peek()) > 1) {
				queue.poll();
			}
		}
			if(queue.isEmpty()) {
				System.out.println("No non-repeating character found");
			} else {
				System.out.println(queue.peek()+ " ");
			}
	}
}
