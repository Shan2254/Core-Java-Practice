package com.Collections.Stack;

import java.util.Stack;

public class SortStack {

	public static void sort(Stack<Integer> stack) {
		Stack<Integer> tempStack = new Stack<>();
		
		while(!stack.isEmpty()) {
			int current = stack.pop();
			//Move elements from tempStack back to stack if they are greater than current
			while(!tempStack.isEmpty() && tempStack.peek() > current) {
				stack.push(tempStack.pop());
			}
			tempStack.push(current);
		}
		//Move elements back to the original stack 
		while(!tempStack.isEmpty()) {
			stack.push(tempStack.pop());
		}
	}
	
	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>();
		stack.push(9);
		stack.push(7);
		stack.push(4);
		stack.push(2);
		stack.push(6);
		stack.push(1);
		stack.push(3);
		
		sort(stack);
		System.out.println("Sorted Stack: "+ stack);
	}
}
