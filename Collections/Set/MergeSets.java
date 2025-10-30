package com.Collections.Set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class MergeSets {

	public static void main(String[] args) {
		Set<String> set1 = new HashSet<>(Arrays.asList("Hello", "Capgemini", "World"));
		Set<String> set2 = new HashSet<>(Arrays.asList("Hello", "Capgemini", "Java", "ABC"));
		
		Set<String> mergeSet = new HashSet<>(set1);
		mergeSet.addAll(set2);
		System.out.println("Merged sets: "+ mergeSet);
	}
}
