package com.Collections.List;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TopScores {

	public static void main(String[] args) {
		List<Integer> scores = Arrays.asList(85, 75, 80, 90, 95, 100, 87);
		
		List<Integer> topScore = scores.stream().sorted((a, b)-> b - a).limit(3).collect(Collectors.toList());
		
		System.out.println("Top 3 scores: "+ topScore);
	}
}
