package com.Practice;

public class PairSum {
	
	public static void main(String[] args) {
		
		int[] list = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		int target = 9;
		
		for(int i=0 ; i < list.length; i++) {
			for(int j= i+1; j < list.length; j++) {
				
				if(list[i] + list[j] == target) {
					System.out.println("("+ list[i] + ", " + list[j]+ ")");
				}
			}
		}
	}
	
}
