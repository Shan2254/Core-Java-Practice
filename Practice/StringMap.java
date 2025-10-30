package com.Practice;

import java.util.HashMap;
import java.util.Map;

public class StringMap {

	public static void main(String[] args) {
		
		Map<Integer, String> names = new HashMap<>();
		names.put(1, "ABC");
		names.put(2, "PQR");
		names.put(3, "XYZ");
		
		for(Map.Entry<Integer, String> entry : names.entrySet()) {
			System.out.println(entry.getKey()+ " - "+ entry.getValue());
		}
	}
}
