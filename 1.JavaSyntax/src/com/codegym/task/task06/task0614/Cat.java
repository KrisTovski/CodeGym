package com.codegym.task.task06.task0614;

import java.util.ArrayList;

/* 
Static cats

*/

public class Cat {
    //write your code here
    public static ArrayList<Cat> cats = new ArrayList<Cat>();

    public Cat() {
    }

    public static void main(String[] args) {
        for (int i=0; i<10;i++){
            Cat cat = new Cat();
            cats.add(cat);

        }
        printCats();
    }

    public static void printCats() {
        for(Cat a : cats) System.out.println(a);
    }
}
