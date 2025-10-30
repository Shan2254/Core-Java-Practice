package com.Collections.Map;

import java.util.HashMap;
import java.util.Map;

public class TopScorer {

	public static void main(String[] args) {
		Map<String, Integer> studentScores = new HashMap<>();
		
		studentScores.put("Abc", 90);
		studentScores.put("John", 97);
		studentScores.put("Adam", 85);
		
		String topStudent = null;
		int highestScore = Integer.MIN_VALUE;
		
		for(Map.Entry<String, Integer> entry : studentScores.entrySet()) {
			if(entry.getValue() > highestScore) {
				highestScore = entry.getValue();
				topStudent = entry.getKey();
			}
		}
		System.out.println("Top student name is "+ topStudent +" with score: "+ highestScore);
	}
}
