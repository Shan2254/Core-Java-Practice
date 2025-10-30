package com.DataStructure;

public class ReverseArray {

	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5, 6, 7};
		
		reverseArray(arr);
		System.out.println("Reversed array is: ");
		printArray(arr);
	}
	
	public static void reverseArray(int[] array) {
		int start = 0;
		int end = array.length - 1;
		
		while(start < end) {
			int temp = array[start];
			array[start] = array[end];
			array[end] = temp;
			
			start++;
			end--;
		}
	}
	public static void printArray(int[] array) {
		for(int num : array) {
			System.out.print(num+ " ");
		}
	}
}
