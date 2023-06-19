package com.arr.prac;

public class ArraySearch {
    public static void main(String[] args) {
        int [] arr = new int[] {2, 4, 5, 9, -4, -7, 3, -1} ;
        System.out.println("Negative numbers from the array: ");
        for(int i=0; i < arr.length; i++) {
            if(arr[i] < 0) {
                System.out.print(arr[i]+" ");
            }
        }
    }
}
