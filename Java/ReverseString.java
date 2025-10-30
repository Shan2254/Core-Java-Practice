package com.Java;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		
		System.out.println("Enter a string: ");
		Scanner sc = new Scanner(System.in);
		
		String input = sc.nextLine();
		String reverse = "";
		for(int i= input.length()-1; i >= 0; i--) {
			reverse += input.charAt(i);
		}
		
		System.out.println("Reverse string is: " + reverse);
	}
	
}
