package com.Stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ConcatStream {

	public static void main(String[] args) {
		
		List<String> list1 = Arrays.asList("apple", "banana", "cherry");
		
		List<String> list2 = Arrays.asList("orange", "apple", "kiwi");
		
//		Map<String, Long> freqMap = Stream.concat(list1.stream(), list2.stream())
//										.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		
		Map<String, Long> freqMap = Stream.of(list1, list2).flatMap(List::stream)
									.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		
		freqMap.forEach((word, value) ->
					System.out.println(word + ", " + value));
	}
}
