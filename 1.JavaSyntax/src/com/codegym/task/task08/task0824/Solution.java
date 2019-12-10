package com.codegym.task.task08.task0824;

/* 
Make a family

*/

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {

        Human grandfather1 = new Human("John", true, 79);
        Human grandfather2 = new Human("Paul", true, 80);
        Human grandmother1 = new Human("Vicki", false, 75);
        Human grandmother2 = new Human("Betty", false, 78);

        Human father = new Human("Lesli", true,56);
        Human mother = new Human("Alexandra", false,54);
        Human child1 = new Human("Nicolas", true,16);
        Human child2 = new Human("Avril", false,14);
        Human child3 = new Human("Britney", false,10);
        grandfather1.children.add(father);
        grandfather2.children.add(mother);
        grandmother1.children.add(father);
        grandmother2.children.add(mother);
        father.children.add(child1);
        father.children.add(child2);
        father.children.add(child3);
        mother.children.add(child1);
        mother.children.add(child2);
        mother.children.add(child3);

        System.out.println(grandfather1);
        System.out.println(grandmother1);
        System.out.println(grandfather2);
        System.out.println(grandmother2);
        System.out.println(father);
        System.out.println(mother);
        System.out.println(child1);
        System.out.println(child2);
        System.out.println(child3);
    }

    public static class Human {
        String name;
        boolean sex;
        int age;
        ArrayList<Human> children;

        public Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = new ArrayList<>();
        }


            public String toString () {
                String text = "";
                text += "Name: " + this.name;
                text += ", sex: " + (this.sex ? "male" : "female");
                text += ", age: " + this.age;

                int childCount = this.children.size();
                if (childCount > 0) {
                    text += ", children: " + this.children.get(0).name;

                    for (int i = 1; i < childCount; i++) {
                        Human child = this.children.get(i);
                        text += ", " + child.name;
                    }
                }
                return text;
            }
        }

    }
