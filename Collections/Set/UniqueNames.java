package com.Collections.Set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class UniqueNames {
	
	public static void main(String[] args) {
		List<String> names = Arrays.asList("John", "Adam", "ABC", "ABC");
		
		Set<String> uniqueNames = new HashSet<>(names);
		System.out.println("Unique names: "+ uniqueNames);
	}

}
