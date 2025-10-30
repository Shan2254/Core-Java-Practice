package com.String;

import java.util.Scanner;

public class CheckStringContains {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st string: ");
		String str1 = sc.nextLine();
		System.out.println("Enter 2nd string: ");
		String str2 = sc.nextLine();
		
		if(str1.contains(str2)) {
			System.out.println("Yes, the first string contains second string");
		} else {
			System.out.println("No, the first string does not contain second string");
		}
	}
}
