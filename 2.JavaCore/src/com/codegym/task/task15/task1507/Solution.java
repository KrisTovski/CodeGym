package com.codegym.task.task15.task1507;

/* 
OOP: Method overloading

*/

public class Solution {
    public static void main(String[] args) {
        printMatrix(2, 3, "8");
    }
    public static void printMatrix(short m, short n, String value) {
        System.out.println("Filling with short and short value");
        printMatrix(m, n, (Object) value);
    }

    public static void printMatrix(Integer m, short n, String value) {
        System.out.println("Filling with Integer and short value");
        printMatrix(m, n, (Object) value);
    }

    public static void printMatrix(Integer m, int n, String value) {
        System.out.println("Filling with Integer value");
        printMatrix(m, n, (Object) value);
    }

    public static void printMatrix(short m, int n, String value) {
        System.out.println("Filling with short value");
        printMatrix(m, n, (Object) value);
    }

    public static void printMatrix(short m, Integer n, String value) {
        System.out.println("Filling with short and Integer value");
        printMatrix(m, n, (Object) value);
    }

    public static void printMatrix(Integer m, Integer n, String value) {
        System.out.println("Filling with two Integer value");
        printMatrix(m, n, (Object) value);
    }

    public static void printMatrix(int m, Integer n, String value) {
        System.out.println("Filling with Integer value");
        printMatrix(m, n, (Object) value);
    }

    public static void printMatrix(int m, short n, String value) {
        System.out.println("Filling with short value");
        printMatrix(m, n, (Object) value);
    }

    public static void printMatrix(int m, int n, String value) {
        System.out.println("Filling with String objects");
        printMatrix(m, n, (Object) value);
    }

    public static void printMatrix(int m, int n, Object value) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(value);
            }
            System.out.println();
        }
    }

}
