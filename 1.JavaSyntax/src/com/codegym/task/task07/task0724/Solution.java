package com.codegym.task.task07.task0724;

/* 
Family census

*/

public class Solution {
    public static void main(String[] args) {
        Human human1 = new Human("John",true,60);
        Human human2 = new Human("Paul",true,65);
        Human human3 = new Human("Kate",false,59);
        Human human4 = new Human("Victoria",false,62);
        Human human5 = new Human("Anna",false,32, human1,human3);
        Human human6 = new Human("Steve",true,35, human2, human4);
        Human human7 = new Human("Paula",false,5, human6, human5);
        Human human8 = new Human("Rebeca",false,2, human6, human5);
        Human human9 = new Human("Michael",true,1, human6,human5);

        System.out.println(human1.toString());
        System.out.println(human2.toString());
        System.out.println(human3.toString());
        System.out.println(human4.toString());
        System.out.println(human5.toString());
        System.out.println(human6.toString());
        System.out.println(human7.toString());
        System.out.println(human8.toString());
        System.out.println(human9.toString());
    }

    public static class Human {
        String name;
        boolean sex;
        int age;
        Human father;
        Human mother;

        public Human(String name, boolean sex, int age){
            this.name = name;
            this.sex = sex;
            this.age = age;

        }
        public Human(String name, boolean sex, int age, Human father, Human mother){
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }

        public String toString() {
            String text = "";
            text += "Name: " + this.name;
            text += ", sex: " + (this.sex ? "male" : "female");
            text += ", age: " + this.age;

            if (this.father != null)
                text += ", father: " + this.father.name;

            if (this.mother != null)
                text += ", mother: " + this.mother.name;

            return text;
        }
    }
}