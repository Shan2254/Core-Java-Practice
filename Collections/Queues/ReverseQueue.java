package com.Collections.Queues;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.stream.Collectors;

public class ReverseQueue {

	public static void main(String[] args) {
		Queue<Integer> queue = new LinkedList<>(Arrays.asList(5, 10, 15, 20, 25));
		
		List<Integer> reverseList = queue.stream().collect(Collectors.toCollection(LinkedList::new));
		
		Collections.reverse(reverseList);
		Queue<Integer> reverseQueue = new LinkedList<>(reverseList);
		
		System.out.println("Reversed Queue: "+ reverseQueue);
	}
}
