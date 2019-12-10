package com.codegym.task.task05.task0527;

/* 
Tom and Jerry

*/

public class Solution {
    public static void main(String[] args) {
        Mouse jerryMouse = new Mouse("Jerry", 12, 5);
        Dog butchDog = new Dog ("Butch", 16, "lightgrey");
        Cat tomCat = new Cat ("Tom", 8, "darkgrey");

    }

    public static class Mouse {
        String name;
        int height;
        int tail;

        public Mouse(String name, int height, int tail) {
            this.name = name;
            this.height = height;
            this.tail = tail;
        }
    }

    public static class Dog {
        String name;
        int weight;
        String color;

        public Dog (String name, int weight, String color){
            this.name = name;
            this.weight = weight;
            this.color = color;
        }
    }
    public static class Cat {
        String name;
        int weight;
        String color;

        public  Cat (String name, int weight, String color){
            this.name = name;
            this.weight = weight;
            this.color = color;
        }
    }
}
