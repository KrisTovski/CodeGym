package com.codegym.task.task07.task0703;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Lonely arrays interact

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] numbers = new int[10];
        String[] list = new String[10];
        for(int i=0; i<10; i++){
            list[i] = reader.readLine();
        }
        for (int i = 0; i < 10; i++) {
            numbers [i] = list[i].length();
            System.out.println(numbers [i]);

        }
    }
}
