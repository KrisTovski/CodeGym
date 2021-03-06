package com.codegym.task.task19.task1913;

/* 
Output only digits

*/

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {

        PrintStream backup = System.out;
        ByteArrayOutputStream storage = new ByteArrayOutputStream();
        PrintStream newPrint = new PrintStream(storage);
        System.setOut(newPrint);

        testString.printSomething();

        String result = storage.toString().replaceAll("\\D+","");

        System.setOut(backup);

        System.out.println(result);
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("This 1 text 23 is 4 f5-6or7 tes8ting");
        }
    }
}
