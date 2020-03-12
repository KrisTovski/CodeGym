package com.codegym.task.task19.task1914;

/* 
Problem solving

*/

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {

        PrintStream backup = System.out;
        ByteArrayOutputStream storage = new ByteArrayOutputStream();
        PrintStream newPrint = new PrintStream(storage);
        System.setOut(newPrint);

        testString.printSomething();

        String equation = storage.toString();
        String[] numbers = equation.split(" ");
        int a = Integer.parseInt(numbers[0]);
        int b = Integer.parseInt(numbers[2]);
        int result = 0;
        switch (numbers[1]){
            case "+": {
                result = a + b;
                break;
            }
            case "-": {
                result = a - b;
                break;
            }
            case "*": {
                result = a * b;
                break;
            }
            case "/": {
                result = a / b;
                break;
            }
        }
        System.setOut(backup);


        System.out.println(equation + result);
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("3 + 6 = ");
        }
    }
}

