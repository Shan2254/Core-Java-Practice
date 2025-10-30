package com.Collections.Set;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CountrySearch {

	public static void main(String[] args) {
		
		Set<String> countries = new HashSet<>(Arrays.asList("India", "USA", "Japan", "Indonesia", "Italy"));
		
		List<String> list = new ArrayList<>(countries);
		Collections.sort(list);
		for(String country : list) {
			if(country.startsWith("I")) {
				System.out.println("First country starting with 'I': "+ country);
				return;
			}
		}
		System.out.println("No country found starting with 'I'.");
	}
}
