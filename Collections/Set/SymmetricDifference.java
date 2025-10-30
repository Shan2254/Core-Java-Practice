package com.Collections.Set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SymmetricDifference {

	public static void main(String[] args) {
		
		Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3, 4));
		Set<Integer> set2 = new HashSet<>(Arrays.asList(3, 4, 5, 6));
		
		Set<Integer> union = new HashSet<>(set1);
		union.addAll(set2);       //Union of both set
		
		Set<Integer> intersection = new HashSet<>(set1);
		intersection.retainAll(set2); 
		
		union.removeAll(intersection);       //Symm. diff. = union - intersection
		System.out.println("Symmetric Difference: "+ union);
	}
}
