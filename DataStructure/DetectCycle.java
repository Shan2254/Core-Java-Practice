package com.DataStructure;

public class DetectCycle {

	static class Node {
		int data;
		Node next;
		Node(int data) {
			this.data = data;
			this.next = null;
		}
	}
	Node head = null;
	
	public void insert(int data) {
		Node newNode = new Node(data);
		if(head == null) {
			head = newNode;
			return;
		}
		Node temp = head;
		while(temp.next != null) {
			temp = temp.next;
		}
		temp.next = newNode;
	}
	public boolean hasCycle() {
		Node slow = head;
		Node fast = head;
		while(fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
			
			if(slow == fast) {
				return true;
			}
		}
		return false;
	}
	public static void main(String[] args) {
		DetectCycle list = new DetectCycle();
		list.insert(1);
		list.insert(2);
		list.insert(3);
		list.insert(4);
		list.insert(5);
		
		System.out.println("Cycle present? "+ list.hasCycle());
	}
}
