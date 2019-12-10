package com.codegym.task.task09.task0926;

import java.util.ArrayList;

/* 
List of number arrays

*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<int[]> list = createList();
        printList(list);
    }

    public static ArrayList<int[]> createList() {
        ArrayList<int[]> list = new ArrayList<>();
        int[] five = {3,5,7,2,4};
        int[] two = {23,98};
        int[] four = {1,2,3,4};
        int[] seven = {4,7,12,43,76,36,5};
        int[] zero = {};

        list.add(five);
        list.add(two);
        list.add(four);
        list.add(seven);
        list.add(zero);
        return list;


    }

    public static void printList(ArrayList<int[]> list) {
        for (int[] array : list) {
            for (int x : array) {
                System.out.println(x);
            }
        }
    }
}
