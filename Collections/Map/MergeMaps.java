package com.Collections.Map;

import java.util.HashMap;
import java.util.Map;

public class MergeMaps {

	public static void main(String[] args) {
		Map<String, Integer> map1 = new HashMap<>();
		map1.put("Abc", 101);
		map1.put("Pqr", 102);
		
		Map<String, Integer> map2 = new HashMap<>();
		map2.put("Abc", 101);
		map2.put("Xyz", 103);
		
		for(Map.Entry<String, Integer> entry : map2.entrySet()) {
			map1.merge(entry.getKey(), entry.getValue(), Integer::sum);
		}
		System.out.println("Merged Map: "+ map1);
	}
}
