package com.Practice;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequencyElements {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(10,15,8,49,25,98,98,32,15);
		
		Map<Integer, Long> frequency = numbers.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		
		frequency.forEach((num, count) -> System.out.println( + num +" : "+count));
	}
}
