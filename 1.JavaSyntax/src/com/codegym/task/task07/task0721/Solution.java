package com.codegym.task.task07.task0721;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/* 
Min and max in arrays

*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int maximum;
        int minimum;
        int[] numbers = new int[20];
        for (int i=0;i<20;i++){
            numbers[i] = Integer.parseInt(reader.readLine());
        }
        Arrays.sort(numbers);
        minimum = numbers[0];
        maximum = numbers[numbers.length-1];


        System.out.print(maximum + " " + minimum);
    }
}
