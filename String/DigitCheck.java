package com.String;

public class DigitCheck {

	public static void main(String[] args) {
		String[] strCheck = {"123", "Hello", "Capgemini", "789"};
		for(String str : strCheck) {
			System.out.println("Checking: "+ str);
			
			boolean resultRegex = digitCheckByRegex(str);
			boolean resultLoop = digitCheckByLoop(str);
			System.out.println("using Regex: "+ resultRegex);
			System.out.println("using Loop: "+ resultLoop);
		}
	}

	private static boolean digitCheckByRegex(String str) {
		// TODO Auto-generated method stub
		return str != null && str.matches("\\d+");
	}
	
	private static boolean digitCheckByLoop(String str) {
		// TODO Auto-generated method stub
		if(str == null || str.isEmpty()) {
			return false;
		}
		for(char c : str.toCharArray()) {
			if(!Character.isDigit(c)) {
				return false;
			}
		}
		return true;
	}
}
