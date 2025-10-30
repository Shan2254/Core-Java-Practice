package com.String;

 class Singleton {

	private static Singleton instance = new Singleton();
	
	private Singleton() {
		System.out.println("Singleton instance created");
	}
	public static Singleton getInstance() {
		return instance;
	}
	public void display() {
		System.out.println("Hello");
	}
}
public class Main {
	public static void main(String[] args) {
		Singleton obj = Singleton.getInstance();
		obj.display();
	}
}
