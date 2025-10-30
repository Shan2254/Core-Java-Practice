package com.Collections.Queues;

import java.util.LinkedList;
import java.util.Queue;

public class RemoveLargestFromQueue {

	public static void main(String[] args) {
		Queue<Integer> numbers = new LinkedList<>();
		
		numbers.add(10);
		numbers.add(20);
		numbers.add(30);
		numbers.add(40);
		numbers.add(50);
		
		System.out.println("Original Queue: "+ numbers);
		int max = Integer.MIN_VALUE;                 //find largest number
		for(int num : numbers) {
			if(num > max) {
				max = num;
			}
		}
		//Rebuild queue without the first occurrence of the largest number
		Queue<Integer> updatedQueue = new LinkedList<>();
		boolean removed = false;
		
		for(int num : numbers) {
			if(num == max && !removed) {
				removed = true; 
			}else {
				updatedQueue.add(num);
			}
		}
		System.out.println("Largest number is: "+ max);
		System.out.println("Updated Queue: "+ updatedQueue);
	}
}
