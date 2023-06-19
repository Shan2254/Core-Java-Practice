package com.java;

import java.util.Scanner;

public class FirstCharOccurence {
    public static void main(String[] args) {
        String str;
        int count = 0;
        System.out.println("Enter a string to find first char occourence: ");
        Scanner sc = new Scanner(System.in);
        str = sc.nextLine();
        char ch[] = str.toCharArray();
        for(int i=0; i< ch.length; i++) {
            if(ch[0] == ch[i]) {
                count++;

            }
        }
        System.out.println("Occurence of first character in given string is: "+count);

    }
}
