package com.codegym.task.task18.task1822;

/* 
Finding data inside a file

*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream fileName = new FileInputStream(reader.readLine());

        BufferedReader reader1 = new BufferedReader(new InputStreamReader(fileName));
        String inputString;

        while ((inputString = reader1.readLine()) != null) {
            if (inputString.startsWith(args[0])) {
                String[] arr = inputString.split(" ");
                if (arr[0].equals(args[0])) {
                    System.out.print(inputString);
                    break;
                }
            }
        }
        reader.close();
        reader1.close();
        fileName.close();

    }
}
