package com.codegym.task.task18.task1805;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.TreeSet;

/* 
Sorting bytes

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        FileInputStream fileInputStream = new FileInputStream(fileName);

        TreeSet<Integer> setSortBytes = new TreeSet<>();

        //read from file
        while (fileInputStream.available() > 0) {
            setSortBytes.add(fileInputStream.read());
        }

        fileInputStream.close();

        for (int value : setSortBytes)
            System.out.print(value + " ");


    }
}
