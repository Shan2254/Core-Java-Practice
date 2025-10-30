/*Given a List of Integers find total count, min, max, sum, and the average for numbers by using Stream api
input  :list=[2, 3, 5, 7, 11, 13, 17, 19, 23, 29] 
output: count=10, sum=129, min=2, average=12.900000, max=29 */


package com.Java;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;

public class StreamStat {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29);
		
		IntSummaryStatistics stats = numbers.stream().mapToInt(Integer::intValue).summaryStatistics();
		
		System.out.println("Count: "+ stats.getCount());
		System.out.println("Sum: "+ stats.getSum());
		System.out.println("Min: "+ stats.getMin());
		System.out.println("Max: "+ stats.getMax());
		System.out.println("Average: "+ stats.getAverage());
	}
}
