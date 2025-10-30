package com.Practice;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LongestString {

	public static void main(String[] args) { 
	    List<String> fruits = Arrays.asList("apple", "banana", "orange", "watermelon");
	    
		int count =0;
		for(String s : fruits) {
			for(char ch :s.toCharArray()) {
				if(ch =='a'||ch =='A')
				{
					count++;
				}		
			}
		}
	System.out.println("Total count of 'a' is "+ count);	
	}
 
}

