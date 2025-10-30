package com.Collections.List;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FirstName {

	public static void main(String[] args) {
		
		List<String> fullNames = Arrays.asList("John Doe", "Shantanu Joshi");
		
		List<String> firstName = fullNames.stream().map(name -> name.split(" ")[0]).collect(Collectors.toList());
		
		System.out.println("First Name: "+firstName);
	}
}
