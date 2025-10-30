package com.Collections.Set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashSetToTreeSet {

	public static void main(String[] args) {
		Set<String> hashSet = new HashSet<>(Arrays.asList("Banana", "Avocado", "Cherry", "Orange", "Apple"));
		
		TreeSet<String> treeSet = new TreeSet<>(hashSet);
		
		System.out.println("Sorted Set: "+ treeSet);
	}
}
