package com.Collections.Queues;

import java.util.PriorityQueue;

public class MergePriorityQueue {

	public static void main(String[] args) {
		
		PriorityQueue<Integer> queue1 = new PriorityQueue<>();
		queue1.add(2);
		queue1.add(4);
		queue1.add(7);
		queue1.add(5);
		
		PriorityQueue<Integer> queue2 = new PriorityQueue<>();
		queue2.add(3);
		queue2.add(1);
		queue2.add(8);
		queue2.add(6);
		
		PriorityQueue<Integer> merged = new PriorityQueue<>();
		merged.addAll(queue1);
		merged.addAll(queue2);
		
		System.out.println("Merged Priority Queue: ");
		while(!merged.isEmpty()) {
			System.out.print(merged.poll()+" ");
		}
	}
}
