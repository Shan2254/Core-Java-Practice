package com.java;

public class StringOccur {

    public static void main(String[] args) {
        String s1 = "Shantanu";
        int count = 0;
        for(int i = 0; i < s1.length(); i++) {
            if(s1.charAt(i) == 'a') {
                count++;
            }
        }
        System.out.println("Occurence of a in given string is: " +count);

        char ch[] = s1.toCharArray();
        String rev = "";
        for(int i=ch.length-1; i>=0; i--) {
            rev = rev + ch[i];
        }
        System.out.println("Reverse of given string is: "+rev);
    }
}
