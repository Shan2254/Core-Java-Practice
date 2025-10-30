//Given a String, find the first repeated character in it using Stream functions?


package com.Java;

import java.util.HashSet;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.Set;

public class FirstRepeatedChar {

	public static void main(String[] args) {
		
		String input = "Shantanu";
		
		Set<Integer> set = new HashSet<>();
		OptionalInt firstChar = input.chars().filter(i -> !set.add(i)).findFirst();
		System.out.println("First repeated character is: "+ (char) firstChar.getAsInt());
	}
}
