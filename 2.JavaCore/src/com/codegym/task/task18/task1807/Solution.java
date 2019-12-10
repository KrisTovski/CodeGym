package com.codegym.task.task18.task1807;

/* 
Counting commas

*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        FileInputStream inputStream = new FileInputStream(s);

        int comaCount = 0;

        while (inputStream.available() > 0) {
            int readingBuffer = inputStream.read();
            if (readingBuffer == 44) comaCount++;


        }
        inputStream.close();
        System.out.println(comaCount);

    }
}
