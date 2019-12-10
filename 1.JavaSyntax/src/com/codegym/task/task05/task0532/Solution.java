package com.codegym.task.task05.task0532;

import java.io.*;


/* 
Task about algorithms

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int maximum = Integer.MIN_VALUE;
        int nNumber = Integer.parseInt(reader.readLine());

        for (int i = 0; i < nNumber; i++) {
            int N = Integer.parseInt(reader.readLine());
            maximum = N > maximum ? N : maximum;


        }
        System.out.println(maximum);


    }

}