package com.DataStructure;

public class ArrayQueue {

	int[] queue = new int[5];
	int front = 0;
	int rear = -1;
	
	void enqueue(int value) {
		if(rear == queue.length - 1) {
			System.out.println("Queue is full");
		} else {
			rear++;
			queue[rear] = value;
			System.out.println("Enqueued: "+ value);
		}
	}
	void dequeue() {
		if(front > rear) {
			System.out.println("Queue is empty");
		} else {
			System.out.println("Dequeued: "+ queue[front]);
			front++;
		}
	}
	void peek() {
		if(front > rear) {
			System.out.println("Queue is empty");
		} else {
			System.out.println("Front element: "+ queue[front]);
		}
	}
	public static void main(String[] args) {
		ArrayQueue q = new ArrayQueue();
		
		q.enqueue(1);
		q.enqueue(2);
		q.enqueue(3);
		q.peek();
		q.dequeue();
		q.peek();
		q.dequeue();
		q.dequeue();
		q.dequeue();
	}
}
