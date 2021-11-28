package com.codegym.task.task18.task1818;

/* 
Two in one

*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String n1 = reader.readLine();
        String n2 = reader.readLine();
        String n3 = reader.readLine();

        FileOutputStream fileOutputStream = new FileOutputStream(n1);
        FileInputStream fileInputStream1 = new FileInputStream(n2);
        FileInputStream fileInputStream2 = new FileInputStream(n3);


        // copying second file  to the first file

        while (fileInputStream1.available()>0){
            byte[] buffer = new byte[fileInputStream1.available()];
            fileInputStream1.read(buffer);
            fileOutputStream.write(buffer);
        }

        fileInputStream1.close();

        // append third file to first file
        while ( fileInputStream2.available()>0){
            byte[] buffer = new byte[fileInputStream2.available()];
            fileInputStream2.read(buffer);
            fileOutputStream.write(buffer);

        }
        fileInputStream2.close();
        fileOutputStream.close();

    }
}
