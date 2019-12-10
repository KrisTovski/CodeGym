package com.codegym.task.task05.task0510;

/* 
Initializing cats
 Name,
- Name, weight, age
- Name, age (standard weight)
- Weight, color (unknown name, address and age, i.e. a homeless cat)
- Weight, color, address (someone else's pet)
*/

public class Cat {
    String name;
    int age;
    int weight;
    String color;
    String address;


    public void initialize (String name){
        this.name = name;
        this.weight = 5;
        this.age = 5;
        this.color = "unknown";

    }
    public void initialize (String name, int weight, int age){
        this.name = name;
        this.weight = weight;
        this.age = age;
        this.color = "unknown";
    }
    public void initialize (String name, int age) {
        this.name = name;
        this.age = age;
        this.weight = 5;
        this.color = "unknown";
    }
    public void initialize (int weight, String color){
        this.weight = weight;
        this.color = color;
        this.age = 5;

    }
    public void initialize (int weight, String color, String address){
        this.weight = weight;
        this.age = 5;
        this.color = color;
        this.address = address;
    }



    public static void main(String[] args) {

    }
}
