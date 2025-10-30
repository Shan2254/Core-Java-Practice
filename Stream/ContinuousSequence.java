package com.Stream;

import java.util.ArrayList;
import java.util.List;

public class ContinuousSequence {
	public static void main(String[] args) {
	
		String input = "1 2 3 5 9 a 6 7 8 4 @ -5 -7 -3 -2 -1";
		String[] strArr = input.split(" ");
		List<Integer> numbers = new ArrayList<>();
		
		for(String str : strArr) {
			try {
				numbers.add(Integer.parseInt(str));
			} catch (NumberFormatException e) {
				
			}
		}
		List<List<Integer>> sequences = new ArrayList<>();
		List<Integer> currentSeq = new ArrayList<>();
		
		currentSeq.add(numbers.get(0));
		
		for(int i=1; i<numbers.size(); i++) {
			int diff = numbers.get(i) - numbers.get(i-1);
			if(diff == 1 || diff == -1) {
				currentSeq.add(numbers.get(i));
			} else {
				if(currentSeq.size() >= 3) {
					sequences.add(new ArrayList<>(currentSeq));
				}
				currentSeq.clear();
				currentSeq.add(numbers.get(i));
			}
		}
		if(currentSeq.size() >= 3) {
			sequences.add(currentSeq);
		}
		for(List<Integer> seq : sequences) {
			for(int num : seq) {
				System.out.print(num +" ");
			}
			System.out.println();
		}
	}
}
