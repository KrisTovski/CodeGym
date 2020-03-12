package com.codegym.task.task38.task3802;

/* 
Checked exceptions

*/

import java.io.FileReader;

public class VeryComplexClass {
    public void veryComplexMethod() throws Exception {
        FileReader fileReader = new FileReader("unknown.file.txt");
        fileReader.close();
        //write your code here
    }

    public static void main(String[] args) {

    }
}
