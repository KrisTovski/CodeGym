package com.codegym.task.task18.task1819;

/* 
Combining files

*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String f1 = reader.readLine();
        String f2 = reader.readLine();

        FileInputStream fileInputStream1 = new FileInputStream(f1);
        FileInputStream fileInputStream2 = new FileInputStream(f2);


        byte[] buffer1 = new byte[fileInputStream1.available()];
        fileInputStream1.read(buffer1);


        byte[] buffer2 = new byte[fileInputStream2.available()];
        fileInputStream2.read(buffer2);

        FileOutputStream fileOutputStream= new FileOutputStream(f1);
        fileOutputStream.write(buffer2);
        fileOutputStream.write(buffer1);

        fileInputStream1.close();
        fileInputStream2.close();
        fileOutputStream.close();

    }
}
