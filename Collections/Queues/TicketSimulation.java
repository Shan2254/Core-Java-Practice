package com.Collections.Queues;

import java.util.LinkedList;
import java.util.Queue;

public class TicketSimulation {

	public static void main(String[] args) {
		Queue<String> queue = new LinkedList<>();
		
		queue.offer("Abc");
		queue.offer("Amar");
		queue.offer("Raj");
		queue.offer("AK");
		queue.offer("XYZ");
		
		while (!queue.isEmpty()) {
			String person = queue.poll();
			
			System.out.println("Serving: "+ person);
		}
	}
}
