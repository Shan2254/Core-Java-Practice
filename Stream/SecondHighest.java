package com.Stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Optional;

public class SecondHighest {
public static void main(String[] args) {
	
	int[] arr = {2, 4, 6, 7, 9, 4, 7};
	
	Optional<Integer> secondHighest = Arrays.stream(arr).boxed().distinct().sorted(Comparator.reverseOrder())
										.skip(1).findFirst();
	if(secondHighest.isPresent()) {
		System.out.println("Second highest element is: " + secondHighest.get());
	}
}
}
