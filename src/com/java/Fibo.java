package com.java;

import java.util.Scanner;

public class Fibo {
    public static void main(String[] args) {
        int n1 =0, n2=1, n3;
        System.out.println("Enter a number you want in series: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Fibonacci series till "+n+" terms is: ");
        for(int i=0; i<=n; i++) {
            System.out.print(n1+" ");
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
        }
    }
}
