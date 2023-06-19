package com.pattern;

import java.util.Scanner;

public class RightAngleTri {
    public static void main(String[] args) {
        System.out.println("Enter no. of rows you want: ");
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        for (int i=0; i<=row;i++) {
            for (int j=0; j<i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
