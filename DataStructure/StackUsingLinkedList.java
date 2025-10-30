package com.DataStructure;

public class StackUsingLinkedList {

	static class Node {
		int data;
		Node next;
		
		Node(int data) {
			this.data = data;
			this.next = null;
		}
	}
	private Node top = null;
	
	public void push(int data) {
		Node newNode = new Node(data);
		newNode.next = top;
		top = newNode;
		System.out.println(data + " pushed to stack");
	}
	public int pop() {
		if(top == null) {
			System.out.println("Stack is empty");
			return -1;
		}
		int popped = top.data;
		top = top.next;
		return popped;
	}
	public int peek() {
		if(top == null) {
			System.out.println("Stack is empty");
			return -1;
		}
		return top.data;
	}
	
	public static void main(String[] args) {
		StackUsingLinkedList stack = new StackUsingLinkedList();
		stack.push(10);
		stack.push(20);
		stack.push(30);
		System.out.println("Top element: "+ stack.peek());
		System.out.println("Popped: "+ stack.pop());
		System.out.println("Top element after pop: "+ stack.peek());
	}
}
