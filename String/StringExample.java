package com.String;

public class StringExample {

	public static void main(String[] args) {
		String str = "WELCOME";    //it will store in constant string pool
		System.out.println(str);
		
		String str2 = new String("welcome");    //it will create new string object
		System.out.println(str2);
	}
}
