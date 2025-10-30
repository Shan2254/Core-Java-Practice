package com.Collections.List;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SalaryIncrement {

	public static void main(String[] args) {
		List<Integer> salaries = Arrays.asList(30000, 40000, 55000, 60000, 70000);
		
		List<Double> updatedSalary = salaries.stream().map(salary -> salary * 1.10).collect(Collectors.toList());
		
		System.out.println("Updated salaries: "+ updatedSalary);
	}
}
