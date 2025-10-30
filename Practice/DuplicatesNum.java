package com.Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class DuplicatesNum {

	public static void main(String[] args) {
//		List<Integer> numbers = Arrays.asList(10,15,8,49,25,98,98,32,15);
//		List<Integer> numbers = new ArrayList<>();
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("How many numbers you want in list: ");
//		int n = sc.nextInt();
//		System.out.println("Enter "+ n +" elements: ");
//		for(int i=0; i<n; i++) {
//			int j = sc.nextInt();
//			numbers.add(j);
//		}
//		
//		List<Integer> duplicates = numbers.stream().filter(i -> Collections.frequency(numbers, i)>1)
//											.distinct().collect(Collectors.toList());
//		
//		System.out.println("Duplicate numbers: " + duplicates);
		
		List<Integer> numbers = Arrays.asList(2, 4, 6, 5, 4, 2);
		List<Integer> duplicates = numbers.stream().filter(i -> Collections.frequency(numbers, i)>1).distinct()
														.collect(Collectors.toList());
		System.out.println("Duplicate numbers: "+ duplicates);
	}
}
