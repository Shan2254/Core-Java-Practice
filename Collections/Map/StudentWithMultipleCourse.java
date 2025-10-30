package com.Collections.Map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StudentWithMultipleCourse {

	public static void main(String[] args) {
		Map<String, List<String>> courseStudents = new HashMap<>();
		
		courseStudents.put("Java", Arrays.asList("Abc", "Adam", "John", "Xyz"));
		courseStudents.put("Python", Arrays.asList("Abc", "Ajay", "John", "Raj"));
		courseStudents.put("Data Science", Arrays.asList("Raj", "Saket", "Shreya", "Dipali"));
		
		Map<String, Integer> studentCourseCount = new HashMap<>();
		for(List<String> students : courseStudents.values()) {
			for(String student : students) {
				studentCourseCount.put(student, studentCourseCount.getOrDefault(student, 0)+ 1);
			}
		}
		
		List<String> result = new ArrayList<>();
		for(Map.Entry<String, Integer> entry : studentCourseCount.entrySet()) {
			if(entry.getValue() >= 2) {
				result.add(entry.getKey());
			}
		}
		System.out.println("Students enrolled in 2 courses are: "+ result);
	}
}
