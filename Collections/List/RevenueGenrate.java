package com.Collections.List;

import java.util.Arrays;
import java.util.List;

public class RevenueGenrate {

	public static void main(String[] args) {
		
		List<Integer> amounts = Arrays.asList(1000, 1500, 500, 700, 900, 400);
		
		double revenue = amounts.stream().mapToDouble(Integer::doubleValue).sum();
		
		System.out.println("Total revenue is: Rs."+ revenue);
	}
}
