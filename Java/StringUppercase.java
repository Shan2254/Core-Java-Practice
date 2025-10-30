/*Given a list of Strings .sConvert String to uppercase and Join them with coma (,) using Stream api
List=["USA", "Japan", "France", "Germany", "Italy", "U.K.","Canada"] */


package com.Java;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringUppercase {

	public static void main(String[] args) {
		List<String> countries = Arrays.asList("USA", "Japan", "France", "Germany", "Italy", "U.K.", "Canada");
		
		String result = countries.stream().map(String::toUpperCase).collect(Collectors.joining(", "));
		System.out.println(result);
	}
}
