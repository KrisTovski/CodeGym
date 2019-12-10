package com.codegym.task.task05.task0517;

/* 
Creating cats
Create the Cat class with five constructors:
- Name,
- Name, weight, age
- Name, age (standard weight)
- Weight, color (name, address, and age are unknown; the cat is homeless)
- Weight, color, address (someone else's pet)

The constructor's job is to make the object valid.
For example, if the weight is unknown, then you need to specify some average weight.
A cat can't weigh nothing.
The same applies to age. But there may or may not be a name (i.e. name might be null).
The same applies to the address (it might be null).


*/

public class Cat {
    String name;
    int weight;
    int age;
    String color;
    String address;

    public Cat(String name){
        this.name = name;
        this.weight = 5;
        this.age = 5;
        this.color = "unknown";

    }

    public Cat (String name, int weight, int age){
        this.name = name;
        this.weight = weight;
        this.age = age;
        this.color = "unknown";
    }

    public Cat(String name, int age){
        this.name = name;
        this.age = age;
        this.weight = 5;
        this.color = "unknown";
    }

    public Cat (int weight, String color){
        this.weight = weight;
        this.color = color;
        this.age = 5;
        this.name = null;
        this.address = null;
    }

    public Cat(int weight, String color, String address){
        this.weight = weight;
        this.color = color;
        this.address = address;
        this.age = 5;
        this.name = null;
    }

    public static void main(String[] args) {

    }
}
