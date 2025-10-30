package com.Collections.Map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FormattedList {

	public static void main(String[] args) {
		
		Map<String, Integer> nameIdMap = new HashMap<>();
		nameIdMap.put("Abc", 101);
		nameIdMap.put("Pqr", 102);
		nameIdMap.put("Xyz", 103);
		nameIdMap.put("Lmn", 104);
		
		List<String> formattedList = new ArrayList<>();
		for(Map.Entry<String, Integer> entry : nameIdMap.entrySet()) {
			formattedList.add(entry.getValue() + ": "+ entry.getKey());
		}
		System.out.println(formattedList);
		for(String s : formattedList) {
			System.out.println(s);
		}
	}
}
