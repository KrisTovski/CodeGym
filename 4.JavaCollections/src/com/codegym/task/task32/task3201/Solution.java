package com.codegym.task.task32.task3201;

import java.io.IOException;
import java.io.RandomAccessFile;

/*
Writing to an existing file

*/
public class Solution {
    public static void main(String... args) throws IOException {

        String fileName = args[0];
        int number = Integer.parseInt(args[1]);
        String text = args[2];

        RandomAccessFile randomAccessFile = new RandomAccessFile(fileName, "rw");
        if(number <= randomAccessFile.length()){
            randomAccessFile.seek(number);
        } else {
            randomAccessFile.seek(randomAccessFile.length());
        }
        randomAccessFile.write(text.getBytes());
        randomAccessFile.close();


    }
}
