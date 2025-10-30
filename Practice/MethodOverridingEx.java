package com.Practice;

class Planet {
	
	public void earth() {
		System.out.println("Earth is a planet");
	}
}
	
	class Pluto extends Planet {
		
		public void earth() {
			System.out.println("Pluto is also a planet");
		}
	}
public class MethodOverridingEx {

	public static void main(String[] args) {
		
		Pluto obj = new Pluto();
		Planet obj1 = new Planet();
		
		obj1.earth();
		obj.earth();
	}
}
