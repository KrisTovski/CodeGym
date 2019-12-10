package com.codegym.task.task04.task0426;

/* 
Labels and numbers

*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(br.readLine());

        if(number <0 && number%2 == 0){
            System.out.println("Negative even number");
        }
        else if (number <0 && number%2 != 0){
            System.out.println("Negative odd number");
        }
        else if (number >0 && number%2 == 0){
            System.out.println("Positive even number");
        }
        else if (number >0 && number%2 != 0){
            System.out.println("Positive odd number");
        }
        else if (number == 0){
            System.out.println("Zero");
        }
    }
}
