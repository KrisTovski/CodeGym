package com.codegym.task.task10.task1015;

import java.lang.reflect.Array;
import java.util.ArrayList;

/* 
Array of string lists

*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<String>[] arrayOfStringList = createList();
        printList(arrayOfStringList);
    }

    public static ArrayList<String>[] createList() {
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("java");
        list1.add("is");
        list1.add("beautiful");

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("the best");
        list2.add("programming");
        list2.add("language");

        ArrayList<String>[] arrayLists = new ArrayList[2];

        arrayLists[0] = list1;
        arrayLists[1] = list2;


        return arrayLists;
    }

    public static void printList(ArrayList<String>[] arrayOfStringList) {
        for (ArrayList<String> list : arrayOfStringList) {
            for (String s : list) {
                System.out.println(s);
            }
        }
    }
}