package com.String;

import java.util.Scanner;

public class RemoveCharacter {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a string: ");
		String str = sc.nextLine();
		System.out.println("Enter a character wants to remove: ");
		char c = sc.next().charAt(0);
		
		String result = removeCharacter(str, c);
		System.out.println("Result after removing: "+ result);
	}

	private static String removeCharacter(String str, char c) {
		// TODO Auto-generated method stub
		return str.replace(Character.toString(c), "");
	}
}
