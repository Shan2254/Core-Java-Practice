package com.Stream;

import java.util.HashSet;
import java.util.OptionalInt;
import java.util.Set;

public class FirstRepeatElement {
	
public static void main(String[] args) {
		
		String input = "capgemini";
		
		Set<Integer> set = new HashSet<>();
		OptionalInt firstChar = input.chars().filter(i -> !set.add(i)).findFirst();
		System.out.println("First repeated character is: "+ (char) firstChar.getAsInt());
	}
}
