package com.Collections.Set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class CommonUsers {

	public static void main(String[] args) {
		
		Set<String> user1 = new HashSet<>(Arrays.asList("John", "Bob", "ABC", "Adam"));
		Set<String> user2 = new HashSet<>(Arrays.asList("John", "Marco", "XYZ", "Adam"));
		
		Set<String> commonUsers = new HashSet<>(user1);
		commonUsers.retainAll(user2);
		
		System.out.println("Common users are: "+ commonUsers);
	}
}
