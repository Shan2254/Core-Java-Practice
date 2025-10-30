/*Find the Word/number got repeated by using Stream api
   input:2,3,34,,5,5,4,3,3,3 
   output:2-1,3-4,34-1,5-2,4-1 */

package com.Java;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FindRepetitions {

	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(2, 3, 34, 5, 5, 4, 3, 3, 3);
		
		Map<Integer, Long> repetitions = numbers.stream().collect(Collectors.groupingBy(i -> i, Collectors.counting()));
		
		String result = repetitions.entrySet().stream().map(entry -> entry.getKey()+ "-" + entry.getValue()).collect(Collectors.joining(", "));
		System.out.println("Output: "+ result);
	}
}
