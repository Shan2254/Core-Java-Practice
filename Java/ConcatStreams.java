//Q11) Write a Java 8 program to concatenate two Streams?

package com.Java;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ConcatStreams {

	public static void main(String[] args) {
		
		Stream<String> s1 = Stream.of("Hello");
		Stream<String> s2 = Stream.of("World");
		
		Stream<String> concatStream = Stream.concat(s1, s2);
		
		List<String> result = concatStream.collect(Collectors.toList());
		
		System.out.println("Result: "+ result);
	}
}
