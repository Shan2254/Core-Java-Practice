package com.Collections.Stack;

import java.util.Stack;

public class RemoveBook {

	public static void removeBook(Stack<String> stack, String target) {
		Stack<String> tempStack = new Stack<>();
		boolean found = false;
		//Pop elements until we find the target
		while(!stack.isEmpty()) {
			String top = stack.pop();
			if(top.equals(target)) {
				found = true;
				break;
			} else {
				tempStack.push(top);
			}
		}
		//Push back the other books in original order
		while(!tempStack.isEmpty()) {
			stack.push(tempStack.pop());
		}
		if(!found) {
			System.out.println("Book "+ target +" not found in the stack.");
		}
	}
	
	public static void main(String[] args) {
		Stack<String> books = new Stack<>();
		books.push("Harry Potter");
		books.push("Time Machine");
		books.push("Think Like A Monk");
		books.push("Secret");
		books.push("Death");
		
		System.out.println("Original stack: "+ books);
		removeBook(books, "Time Machine");
		System.out.println("After Removing: "+ books);
		
	}
}
