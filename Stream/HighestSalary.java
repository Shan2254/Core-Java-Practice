package com.Stream;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.Scanner;

public class HighestSalary {

	public static void main(String[] args) {
		Map<String, Integer> salary = new HashMap<>();
		
		salary.put("Shyam", 20000);
		salary.put("Adam", 25000);
		salary.put("Raj", 35000);
		salary.put("Akhilesh", 30000);
		salary.put("Shantanu", 40000);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of N: ");
		int N = sc.nextInt();
		
		Optional<Integer> nthSalary = salary.values().stream().distinct().sorted(Comparator.reverseOrder())
										.skip(N - 1).findFirst();
		if(nthSalary.isPresent()) {
			System.out.println(N+ "th highest salary is: "+nthSalary.get());
		} else {
			System.out.println(N +"th salary is not available");
		}
	}
}
