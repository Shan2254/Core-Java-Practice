package com.String;

public class StringBuilderDemo {

	public static void main(String[] args) {
//		StringBuilder sb = new StringBuilder("Welcome");
//		System.out.println("Initial string is: "+ sb);
//		sb.append(" to Capgemeini");
//		System.out.println(sb);
//		
//		sb.reverse();
//		System.out.println(sb);
		String str = "welcome";
		String rev = "";
		
		for(int i = str.length()-1; i >= 0; i--) {
			rev += str.charAt(i);
		}
		System.out.println(rev);
	}
}
