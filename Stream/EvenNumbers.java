package com.Stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class EvenNumbers {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
		
//		List<Integer> result = list.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
//		
//		for(int r : result) {
//			System.out.print(r +" ");
//		}
		
		Map<Integer, Long> numsCount = list.stream().collect(Collectors.groupingBy(
										Function.identity(), Collectors.counting()));
		
		System.out.println(numsCount);
	}
}
