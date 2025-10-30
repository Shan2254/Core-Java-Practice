package com.Practice;

import java.util.Arrays;

public class MatrixReplaceByZeroOne {

	private static void printMatrix(int matrix [][]) {
		
		Arrays.stream(matrix).map(row -> Arrays.toString(row)).forEach(System.out::println);
	}
	
	public static void main(String[] args) {
		
		int matrix [][] = { {0,1,0},
							{1,0,1},
							{1,1,0} };
		
		System.out.println("Input Matrix: ");
		printMatrix(matrix);
		
		for(int i=0; i < matrix.length; i++) {
			for(int j=0; j < matrix[i].length; j++) {
				matrix[i][j] = (matrix[i][j] == 1) ? 0 : 1;
			}
		}
		System.out.println("Result Matrix: ");
		printMatrix(matrix);
	}
}
