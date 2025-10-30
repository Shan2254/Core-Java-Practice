package com.Collections.Set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ProductIDCheck {

	public static void main(String[] args) {
		Set<String> productId = new HashSet<>(Arrays.asList("P101", "P102", "P103", "P104"));
		
		String searchId = "P104";
		if(productId.contains(searchId)) {
			System.out.println("Product ID "+ searchId + " exists.");
		} else {
			System.out.println("Product ID "+ searchId + " not exists.");
		}
	}
}
