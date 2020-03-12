package com.codegym.task.task32.task3210;

import java.io.IOException;
import java.io.RandomAccessFile;

/* 
Using RandomAccessFile

*/

public class Solution {
    public static void main(String... args) {
        String fileName = args[0];
        int number = Integer.parseInt(args[1]);
        String text = args[2];

        try(RandomAccessFile randomAccessFile = new RandomAccessFile(fileName, "rw")){
            byte[] buffer = new byte[text.length()];
            randomAccessFile.seek(number);
            randomAccessFile.read(buffer, 0, buffer.length);

            String textFromFile = new String(buffer);
            randomAccessFile.seek(randomAccessFile.length());
            if(textFromFile.equals(text)){
                randomAccessFile.write("true".getBytes());
            } else {
                randomAccessFile.write("false".getBytes());
            }
        } catch (IOException e){
            e.printStackTrace();
        }

    }
}