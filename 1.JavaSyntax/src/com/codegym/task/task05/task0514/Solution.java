package com.codegym.task.task05.task0514;

/* 
A programmer creates a person
Create the Person class. A person should have a String name and int age.
Add the initialize(String name, int age) method where you will initialize the variables name and age.
In the main method, create a Person object and store a reference to it in the variable person.
Call the initialize method with any values.
*/

public class Solution {
    public static void main(String[] args) {
        Person person = new Person();
        person.initialize("John", 39);
    }

    static class Person {
        String name;
        int age;
        public void initialize (String name, int age){
            this.name = name;
            this.age = age;
        }
    }
}
