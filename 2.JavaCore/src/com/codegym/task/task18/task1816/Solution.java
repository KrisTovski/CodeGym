package com.codegym.task.task18.task1816;

/* 
ABCs

*/

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws IOException {


        File file = new File("fileName");
        FileInputStream fileInputStream = new FileInputStream(file);
        int countLetter = 0;
        char[] ch = new char[(int) file.length()];
        while (fileInputStream.available()>0){

        }

    }
}
