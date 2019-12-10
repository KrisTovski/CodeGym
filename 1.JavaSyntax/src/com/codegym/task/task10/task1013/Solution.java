package com.codegym.task.task10.task1013;

/* 
Human class constructors

*/

public class Solution {
    public static void main(String[] args) {
    }

    public static class Human {
        private String firstName;
        private String lastName;
        private int height;
        private int weight;
        private boolean sex;
        private int age;

        public Human(boolean sex) {
            this.sex=sex;

        }

        public Human(String firstName) {
            this.firstName = firstName;
        }

        public Human(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public Human(String firstName, String lastName, int height) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.height = height;
        }

        public Human(String firstName, String lastName, int height, int weight) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.height = height;
            this.weight = weight;
        }

        public Human(String firstName, String lastName, int height, int weight, boolean sex) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.height = height;
            this.weight = weight;
            this.sex = sex;
        }
        public Human(String firstName, String lastName, int height, int weight, boolean sex, int age) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.height = height;
            this.weight = weight;
            this.sex = sex;
            this.age = age;
        }
        public Human(String firstName, String lastName, int weight, boolean sex, int age) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.weight = weight;
            this.sex = sex;
            this.age = age;
        }
        public Human(String firstName, String lastName, int height, int weight, int age) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.height = height;
            this.weight = weight;
            this.age = age;
        }
        public Human(String firstName, String lastName, boolean sex, int age) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.sex = sex;
            this.age = age;
        }
    }
}
