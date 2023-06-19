package com.arr.prac;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        int a[], n, search, x;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number you want in an array: ");
        n = sc.nextInt();
        a = new int[n];

        System.out.println("Enter "+n+" elements: ");
        for( x=0; x<n; x++) {
            a[x] = sc.nextInt();
        }
        System.out.println("Enter a value to find: ");
        search = sc.nextInt();
        for (x=0; x<n; x++) {
            if(a[x]== search) {
                System.out.println(search+" element found at "+(x+1));
                break;
            }
        }
        if(a[x]==n) {
            System.out.println(search+" isn't present in the array.");
        }
    }
}
