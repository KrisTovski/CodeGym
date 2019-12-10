package com.codegym.task.task08.task0819;

import java.sql.SQLOutput;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* 
Set of cats

*/

public class Solution {
    public static void main(String[] args) {
        Set<Cat> cats = createCats();


        for(Cat x:cats){
            cats.remove(x);
            break;
        }

        printCats(cats);
    }

    public static Set<Cat> createCats() {
        Set<Cat> set = new HashSet<>();
            set.add(new Cat());
            set.add(new Cat());
            set.add(new Cat());

        return set;

    }

    public static void printCats(Set<Cat> cats) {
        Iterator<Cat> iterator = cats.iterator();
        while (iterator.hasNext()){
           String text = iterator.next().toString();
           System.out.println(text);
        }

    }

    public static class Cat{

    }
}
