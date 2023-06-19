package com.java;

public class FindVowels {
    public static void main(String[] args) {
        String s = "Capgemini";
        int count = 0;
        s = s.toLowerCase();
        System.out.println(s);
        int i;
        for(i = 0; i<s.length()-1; i++); {
            if(s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u') {
                count++;
            }
        }
        System.out.println("Vowels in a given string is: "+count);
    }
}
