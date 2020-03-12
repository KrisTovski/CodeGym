package com.codegym.task.task18.task1817;

/* 
Spaces

*/

import java.io.FileInputStream;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(args[0]);
        int n1 = fileInputStream.available(); //all characters
        int n2 = 0; //spaces
        while (fileInputStream.available()>0){
            if(fileInputStream.read() == 32) n2++;
        }
        fileInputStream.close();

        double result = (double)n2/n1 *100;
        System.out.println(String.format("%.2f", result));
    }
}
