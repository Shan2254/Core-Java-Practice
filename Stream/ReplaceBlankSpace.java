package com.Stream;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReplaceBlankSpace {
	
		public static void main(String[] args) {

//		String input = "Hello my name is Shantanu";
//		String result = input.chars().mapToObj(c -> (char) c).map(c -> c == ' '?'_' : c).map(String::valueOf)
//																.collect(Collectors.joining());
//
//		System.out.println("Result is: "+result);
			
		String input = "Hello_my@name#is$Shantanu*";
		
		String result = input.replaceAll("[^a-zA-Z0-9]", " ");
		System.out.println("Result is: "+ result);
	}		
}

