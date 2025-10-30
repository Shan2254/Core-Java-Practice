package com.Collections.Stack;

import java.util.Stack;

public class NextGreaterElement {

	    public static int[] nextGreaterElement(int[] stack) {
	        int n = stack.length;
	        int[] result = new int[n];
	        Stack<Integer> tempStack = new Stack<>();

	        // Initialize the result array with -1
	        for (int i = 0; i < n; i++) {
	            result[i] = -1;
	        }

	        // Iterate through the stack from right to left
	        for (int i = n - 1; i >= 0; i--) {
	            // While tempStack is not empty and the top element is less than or equal to stack[i]
	            while (!tempStack.isEmpty() && tempStack.peek() <= stack[i]) {
	                tempStack.pop();
	            }

	            // If tempStack is not empty, the top element is the next greater element
	            if (!tempStack.isEmpty()) {
	                result[i] = tempStack.peek();
	            }

	            // Push the current element onto the tempStack
	            tempStack.push(stack[i]);
	        }

	        return result;
	    }

	    public static void main(String[] args) {
	        int[] stack = {4, 5, 2, 10, 8};
	        int[] nextGreater = nextGreaterElement(stack);

	        System.out.print("The next greater elements for the stack are: ");
	        for (int i : nextGreater) {
	            System.out.print(i + " ");
	        }
	    }
	}

