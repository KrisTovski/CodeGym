package com.codegym.task.task19.task1915;

/* 
Duplicate text

*/

import java.io.*;

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        reader.close();

        PrintStream consoleStream = System.out;
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream stream = new PrintStream(outputStream);
        System.setOut(stream);

        testString.printSomething();

        System.setOut(consoleStream);

//        FileOutputStream fos = new FileOutputStream(fileName);
//        outputStream.writeTo(fos);
//        System.out.println(outputStream.toString());
//
//        fos.close();


        // convert writing in our ByteArray data to string
        String str = outputStream.toString();

        // output result string
        System.out.println(str);

        // write string to file
        FileOutputStream file = new FileOutputStream(fileName);
        file.write(str.getBytes());
        file.close();

    }

    public static class TestString {
        public void printSomething() {
            System.out.println("This is text for testing");
        }
    }
}

