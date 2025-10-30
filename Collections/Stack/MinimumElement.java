package com.Collections.Stack;

import java.util.Stack;

public class MinimumElement {

	Stack<Integer> stack = new Stack<>();
	Stack<Integer> minStack = new Stack<>();
	
	public void push(int x) {
		stack.push(x);
		if(minStack.isEmpty() || x <= minStack.peek()) {
			minStack.push(x);
		} else {
			minStack.push(minStack.peek());
		}
	}
	public void pop() {
		if(!stack.isEmpty()) {
			stack.pop();
			minStack.pop();
		}
	}
	public int getMin() {
		if(!minStack.isEmpty()) {
			return minStack.peek();
		}
		return -1;
	}
	
	public static void main(String[] args) {
		MinimumElement s = new MinimumElement();
		s.push(2);
		s.push(8);
		s.push(4);
		s.push(6);
		s.push(10);
		
		System.out.println("Minimum Element: "+ s.getMin());
	}
}
