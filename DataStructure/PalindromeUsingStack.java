package com.DataStructure;

import java.util.Stack;

public class PalindromeUsingStack {

	public static boolean isPalindrome(String str) {
		Stack<Character> stack = new Stack<>();
		
		for(int i=0; i < str.length(); i++) {
			stack.push(str.charAt(i));
		}
		for(int i=0; i < str.length(); i++) {
			if(str.charAt(i) != stack.pop()) {
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		String str = "madam";
		
		System.out.println( str + " is palindrome? "+ isPalindrome(str));
	}
}
