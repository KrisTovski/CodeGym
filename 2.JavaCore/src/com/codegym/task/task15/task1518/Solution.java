package com.codegym.task.task15.task1518;

/* 
Static modifiers and kittens

*/

public class Solution {

    public static class Cat{
        public String name;
    }
    public static Cat cat;

    static {
        Cat cat1 = new Cat();
        cat1.name = "Kitty";
        cat = cat1;
        System.out.println(cat.name);

        //// or
//        cat = new Cat();
//        cat.name = "Fluffy";
//        System.out.println(cat.name);

    }

    public static void main(String[] args) {

    }
}
