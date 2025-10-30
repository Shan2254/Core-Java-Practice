//How to find duplicate elements in a given integers list in java using Stream functions?

package com.Java;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FindDuplicates {
	
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 4, 3, 6, 7, 9, 7);
		Set<Integer> set = new HashSet<>();
		
		List<Integer> duplicate = numbers.stream().filter(n -> !set.add(n)).collect(Collectors.toList());
		
		System.out.println("Duplicates Numbers are: "+ duplicate);
	}

}
