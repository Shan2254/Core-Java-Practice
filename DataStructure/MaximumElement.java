package com.DataStructure;

public class MaximumElement {

	public static int findMax(int[] array) {
		if(array == null || array.length == 0) {
			System.out.println("Array is empty");
		}
		int max = array[0];
		
		for(int i=1; i < array.length; i++) {
			if(array[i] > max) {
				max = array[i];
			}
		}
		return max;	
	}
	public static void main(String[] args) {
		int[] numbers = {10, 40, 20, 50, 70, 30, 60};
		int max = findMax(numbers);
		System.out.println("Maximum element in the array: "+ max);
	}
}
