package com.Practice;

public class ToggleString {

	public static void main(String[] args) { 
		String str = "telCo";
		StringBuilder toggled = new StringBuilder();
		
		for(char ch : str.toCharArray()) {
			if(Character.isUpperCase(ch)) {
				toggled.append(Character.toLowerCase(ch));
			} else {
				toggled.append(Character.toUpperCase(ch));
			}
		}
		str = toggled.toString();
		System.out.println("Result is: "+ str);
	}
}
