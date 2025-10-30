package com.DataStructure;

public class SinglyLinkedList {

	class Node {
		int data;
		Node next;
		
		Node(int data){
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
		Node current = head;
		while(current.next != null) {
			current = current.next;
		}
		current.next = newNode;
	}
	public void delete(int data) {
		if(head == null) {
			System.out.println("List is empty");
			return;
		}
		if(head.data == data) {
			head = head.next;
			return;
		}
		Node current = head;
		Node prev = null;
		
		while(current != null && current.data != data) {
			prev = current;
			current = current.next;
		}
		if(current == null) {
			System.out.println("Value not found");
		} else {
			prev.next = current.next;
		}
	}
	public void traverse() {
		if(head == null) {
			System.out.println("List is empty.");
			return;
		}
		Node current = head;
		System.out.println("Linked List: ");
		while(current != null) {
			System.out.println(current.data + " ");
			current = current.next;
		}
		System.out.println();
	}
	public static void main(String[] args) {
		SinglyLinkedList list = new SinglyLinkedList();
		
		list.insert(10);
		list.insert(20);
		list.insert(30);
		list.traverse();
		list.delete(30);
		list.traverse();
		list.delete(50);
		list.traverse();
	}
}
