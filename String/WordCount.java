package com.String;

import java.util.Scanner;

public class WordCount {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a string: ");
		String str = sc.nextLine();
		
		String[] words = str.trim().split(" ");
		System.out.println("Number of words in string are: "+ words.length);
	}
}
