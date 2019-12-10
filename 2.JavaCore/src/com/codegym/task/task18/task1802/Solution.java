package com.codegym.task.task18.task1802;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/* 
Minimum byte

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream inputStream = new FileInputStream(new File(reader.readLine()));

        int min = 0;

        if(inputStream.available()>0){
            min = inputStream.read();
        }
        while (inputStream.available() > 0) {
            int temp = inputStream.read();
            if (temp < min) {
                min = temp;
            }
        }
        inputStream.close();
        System.out.println(min);


    }
}
