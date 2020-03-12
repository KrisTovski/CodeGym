package com.codegym.task.task18.task1816;

/* 
ABCs

*/

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws IOException {

        FileInputStream fileInputStream = new FileInputStream(args[0]);

        int count = 0;

        while(fileInputStream.available()>0) {
            int data = fileInputStream.read();
            if ((data >= 'A' && data <= 'Z')
                    || (data >= 'a' && data <= 'z')) {
                count++;
            }

        }
        System.out.println(count);
        fileInputStream.close();

    }
}
