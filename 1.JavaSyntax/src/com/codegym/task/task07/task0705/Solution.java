package com.codegym.task.task07.task0705;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
One large array and two small ones

*/

public class Solution {
    public static void main(String[] args) throws Exception {
       BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
       int[] numbers20 = new int[20];
       int[] first10 = new int[10];
       int[] second10 = new int[10];

       for(int i = 0; i < numbers20.length; i++){
           numbers20[i] = Integer.parseInt(reader.readLine());
       }
       for(int i = 0; i < 10; i++){
           first10[i] = numbers20[i];
       }
       for(int i = 10; i<20; i++){
           second10[i-10] = numbers20[i];
           System.out.println(second10[i-10]);
       }

    }
}
