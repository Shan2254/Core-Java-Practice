package com.Collections.List;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveProduct {

	public static void main(String[] args) {
		
		List<String> products = Arrays.asList("Outdated TV", "Smartphone", "Outdated Fridge", "Laptop");
		
		List<String> newList = products.stream().filter(name -> !name.toLowerCase().contains("outdated")).collect(Collectors.toList());
		
		System.out.println("New products list is: "+ newList);
	}
}
