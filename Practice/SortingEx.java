package com.Practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingEx {

	public static void main(String[] args) {
		String[] input = {"1","A","B","C","2","3","F","V","5"};
		
		List<String> numbers = new ArrayList<>();
		List<String> letters = new ArrayList<>();
		
		for(String s : input) {
			if(s.matches("\\d")) 
				numbers.add(s);
			else if(s.matches("[A-Z]")) 
				letters.add(s);
		}
			Collections.sort(numbers);
			Collections.sort(letters);
			
			numbers.addAll(letters);
			System.out.println(numbers);
		}
	}
