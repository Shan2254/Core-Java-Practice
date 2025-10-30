package com.String;

import java.util.Arrays;
import java.util.Scanner;

public class SameCharacterCheck {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st string: ");
		String str1 = sc.nextLine();
		System.out.println("Enter 2nd string: ");
		String str2 = sc.nextLine();
		
		if(havingSameCharacter(str1, str2)) {
			System.out.println("Yes, both strings are created with same characters.");
		} else {
			System.out.println("No, both strings does not created with same characters.");
		}
	}

	private static boolean havingSameCharacter(String str1, String str2) {
		if(str1 == null || str2 == null || str1.length() != str2.length()) {
			return false;
		}
		char[] arr1 = str1.toCharArray();
		char[] arr2 = str2.toCharArray();
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		return Arrays.equals(arr1, arr2);
	}
}
