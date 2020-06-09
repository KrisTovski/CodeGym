package com.codegym.task.task18.task1826;

/* 
Encryption

*/

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Solution {
    public static void main(String[] args) throws FileNotFoundException {

        String fileName = args[1];
        String fileOutputName = args[2];

        FileInputStream fis = new FileInputStream(fileName);
        FileOutputStream fos = new FileOutputStream(fileOutputName);

    }

}
