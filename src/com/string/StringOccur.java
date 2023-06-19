package com.string;

public class StringOccur {
    public static void main(String[] args) {
        String str = "Shantanu";
        char c = 'a';
        int count = 0;
        for (int i=0; i < str.length(); i++) {
            if(str.charAt(i) == c) {
                count++;
            }
        }
        System.out.println("The occurence of a in given string is: "+count);
    }
}
