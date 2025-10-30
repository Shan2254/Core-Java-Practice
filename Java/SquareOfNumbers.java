/*Given a list of Integer find square of all distinct numbers By using stream api
  list=[9, 10, 3, 4, 7, 3, 4]   */

package com.Java;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SquareOfNumbers {

	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(9, 10, 3, 4, 7, 3, 4);
		
		List<Integer> distinctSquares = numbers.stream().distinct().map(n -> n*n).collect(Collectors.toList());
		
		System.out.println("Square of numbers are: "+ distinctSquares);
	}
}
