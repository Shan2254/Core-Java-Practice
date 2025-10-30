//Write a Java 8 program to find the number of Strings in a list whose length is greater
//than 5?


package com.Java;

import java.util.Arrays;
import java.util.List;

public class CountLongString {

	public static void main(String[] args) {
		
		List<String> strings = Arrays.asList("java", "hello", "capgemini", "string", "ball");
		long count = strings.stream().filter(s -> s.length() > 5).count();
		
		System.out.println("No. of strings whose length greater than 5 are: "+ count);
	}
}
