package com.Java;

public class MyClass {
	
//	MyClass() {
//		System.out.println("Default constructor");
//	}
//
//	public static void main(String[] args) {
//		MyClass obj = new MyClass();
//	}
	
	public int Sum(int a, int b) {
		return a+b;
	}
	
	public int Sum(int a, int b, int c) {
		return a+b+c;
	}
	
	class Addition extends MyClass {
		public int Sum(int a, int b, int c ) {
			return a+b+c;
		}
	}
	
	public static void main(String[] args) {
		MyClass add = new MyClass();
		
		System.out.println(add.Sum(10, 20));
		System.out.println(add.Sum(10, 20, 30));
	}
}


