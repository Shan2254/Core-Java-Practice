package com.DataStructure;

import java.util.Stack;

public class NextGreaterElement {

	public static void main(String[] args) {
		int[] arr = {2, 4, 6, 8, 10};
		printNextGreater(arr);
	}

	private static void printNextGreater(int[] arr) {
		Stack<Integer> stack = new Stack<>();
		int n = arr.length;
		int[] result = new int[n];
		
		for(int i = n-1; i >= 0; i--) {
			while(!stack.isEmpty() && stack.peek() <= arr[i]) {
				stack.pop();
			}
			result[i] = stack.isEmpty() ? -1 : stack.peek();
			stack.push(arr[i]);
		}
		for(int i = 0; i < n; i++) {
			System.out.println(arr[i]+ " - "+ result[i]);
		}
	}
}
