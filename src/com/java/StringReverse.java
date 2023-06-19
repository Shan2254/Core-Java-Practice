package com.java;

public class StringReverse {
    public static void main(String[] args) {
        String s1 = "Capgemini";

        StringBuilder s2 = new StringBuilder();
        s2.append(s1);

        s2.reverse();

        System.out.println(s2);
    }
}
