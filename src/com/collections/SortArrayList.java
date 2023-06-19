package com.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class SortArrayList {
    public static void main(String[] args) {

        ArrayList<Integer> list= new ArrayList();

        list.add(40);
        list.add(30);
        list.add(10);
        list.add(50);
        list.add(20);

        System.out.println("Given list is: "+list);
        Collections.sort(list);
        System.out.println("List after sorting: "+list);
        Collections.reverse(list);
        System.out.println("Reverse of arraylist is: "+list);
    }
}
