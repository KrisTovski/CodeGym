package com.codegym.task.task13.task1318;

import java.io.*;
import java.util.Scanner;

/* 
Reading a file

*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        FileInputStream inputStream = new FileInputStream(fileName);
        while (inputStream.available()>0){
            int data = inputStream.read();
            System.out.print((char)data);
        }

        inputStream.close();
        reader.close();


    }
}