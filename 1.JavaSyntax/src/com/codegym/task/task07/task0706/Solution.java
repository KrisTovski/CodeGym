package com.codegym.task.task07.task0706;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Streets and houses

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] numbers = new int[15];
        int sumOfEvenNumbers = 0;
        int sumOfOddNumbers = 0;
        for(int i = 0; i<numbers.length; i++) {
            numbers[i] = Integer.parseInt(reader.readLine());
        }
        for(int i=0;i<15;i++){
        if (i==0 || i%2==0) {
            sumOfEvenNumbers += numbers[i];
        }
        else
            sumOfOddNumbers +=  numbers[i];

        }

        if (sumOfEvenNumbers > sumOfOddNumbers) System.out.println("Even-numbered houses have more residents.");
        else if (sumOfEvenNumbers < sumOfOddNumbers)  System.out.println("Odd-numbered houses have more residents.");
    }
}
