package com.Collections.Queues;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class HighValueOrder {

	public static Queue<Integer> highValueOrder(Queue<Integer> orders) {
		if(orders == null || orders.isEmpty())
			return orders;
		
		Queue<Integer> highValue = new LinkedList<>();
		Queue<Integer> others = new LinkedList<>();
		
		while(!orders.isEmpty()) {
			int order = orders.poll();
			
			if(order > 1000) {
				highValue.offer(order);
			} else {
				others.offer(order);
			}
		}
		highValue.addAll(others);
		return highValue;
	}
	public static void main(String[] args) {
		Queue<Integer> orders = new LinkedList<>(Arrays.asList(200, 400, 1500, 1200, 900, 700));
		Queue<Integer> reorder = highValueOrder(orders);
		System.out.println("Result is: "+ reorder);
	}
}
