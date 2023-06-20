package com.string;

public class ReverseString {
    public static void main(String[] args) {
        System.out.println("Enter a string you want to reverse: ");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char ch[] = s.toCharArray();
        String rev = "";

        for(int i=ch.length-1; i>=0; i--) {
            rev = rev + ch[i];
        }
        System.out.println("Reverse of given string is: "+rev);
    }
}
