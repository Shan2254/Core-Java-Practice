package com.keywords;

public class StaticVariableDemo {

    String name;
    int age;
    static String city = "Mumbai";

    public StaticVariableDemo(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println(name+" "+age+" "+city);
    }


    public static void main(String[] args) {
        StaticVariableDemo s1 = new StaticVariableDemo("Rahul",20);
        StaticVariableDemo s2 = new StaticVariableDemo("Amar",22);
        s1.display();
        s2.display();

    }
}
