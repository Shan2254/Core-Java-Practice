package com.Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

//Throw a example of ConcurrentModificationException and then fix it by using below problem
//--- delete odd number from list 2,4,6,7,8

public class ConcurrentModification {

	public static void main(String[] args) {
		
		List<Integer> numbers = new ArrayList<>(Arrays.asList(2, 4, 6, 7, 8));
		
		//It will get ConcurrentModification exception
//		for(int n : numbers) {
//			if(n % 2 != 0) {
//				numbers.remove(n);   // modifying during iteration
//			}
//		}
		
		//remove concurrentModification exception
		 Iterator<Integer> iterator = numbers.iterator();
		 while(iterator.hasNext()) {
			 int num = iterator.next();
			 if(num % 2 != 0) {
				 iterator.remove();
			 }
		 }
		System.out.println(numbers);
	}
	
}
