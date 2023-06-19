package com.arr.prac;

import java.util.Scanner;
public class SortArray {
    public static void main(String[] args) {
        int[] arr = new int[] {5, 2, 8, 7, 6, 1, 3, 10, 4, 9};
        int temp = 0;
        System.out.println("Before sorting: ");
        for(int i=0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        for(int i=0; i < arr.length; i++) {
            for(int j = i+1; j < arr.length; j++) {
                if(arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println();
        System.out.println("After sorting");
        for(int i =0; i < arr.length; i++) {
            System.out.print(arr[i]+ " ");
        }
    }
}
