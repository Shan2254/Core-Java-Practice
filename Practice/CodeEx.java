package com.Practice;

public class CodeEx {

	
	public static void main(String[] args) {
		
		String input = "capgemini";
		
		String output = "";
		
		StringBuilder result = new StringBuilder();
		
//		for(int i =0; i < input.length(); i++) {
//			if(input.charAt(i) == 'a') {
//				output = output + "@";
//			}
//			else {
//				output = output + input.charAt(i);
//			}
//		}
//		
//		System.out.println(output);
		
		for(char ch : input.toCharArray()) {
			if(ch == 'a') {
				result.append('@');
			} else {
				result.append(ch);
			}
		}
		System.out.println(result);
	}
}
