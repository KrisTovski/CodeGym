package com.codegym.task.task05.task0504;


/* 
The Three "Muscateers"

*/

public class Solution {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Bob",1,8,5 );
        Cat cat2 = new Cat("Sue",2,7,4);
        Cat cat3 = new Cat("Jack",3,12,10);



    }

    public static class Cat {
        private String name;
        private int age;
        private int weight;
        private int strength;

        public Cat(String name, int age, int weight, int strength) {
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.strength = strength;
        }
    }
}