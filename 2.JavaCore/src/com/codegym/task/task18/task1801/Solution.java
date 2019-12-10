package com.codegym.task.task18.task1801;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/* 
Maximum byte

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        FileInputStream inputStream = new FileInputStream(fileName);
        int max = 0;
        int value;

        while (inputStream.available()>0){
             value= inputStream.read();
            if( max < value){
                max = value;
            }
        }
        inputStream.close();
        System.out.println(max);

    }
}
