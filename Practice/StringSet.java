package com.Practice;

import java.util.HashSet;
import java.util.Set;

public class StringSet {

	public static void main(String[] args) {
		Set<String> animals = new HashSet<>();
		
		animals.add("Cat");
		animals.add("Dog");
		animals.add("Horse");
		animals.add("Lion");
		
		animals.remove("Dog");
		
		
		for(String animal : animals) {
			System.out.println(animal);
		}
	}
}
