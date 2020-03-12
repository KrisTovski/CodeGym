package com.codegym.task.task22.task2211;

import java.io.*;

/* 
Changing the encoding

*/
public class Solution {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(args[0]);
        FileOutputStream fileOutputStream = new FileOutputStream(args[1]);

        byte[] buffer = new byte[fileInputStream.available()];
        fileInputStream.read(buffer);
        String s = new String(buffer, "Windows-1251");
        buffer = s.getBytes("UTF8");
        fileOutputStream.write(buffer);

        fileInputStream.close();
        fileOutputStream.close();
    }
}
