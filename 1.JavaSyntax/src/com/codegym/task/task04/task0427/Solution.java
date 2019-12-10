package com.codegym.task.task04.task0427;

/* 
Describing numbers

*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(br.readLine());


        if (number >=1 && number <= 999){
            if (number%2==0 && number<10){
                System.out.println("even single-digit number");
            }
            else if (number%2==0 && number<100){
                System.out.println("even two-digit number");
            }
            else if (number%2==0 && number<=999){
                System.out.println("even three-digit number");
            }
            else if (number%2!=0 && number<10){
                System.out.println("odd single-digit number");
            }
            else if (number%2!=0 && number<100){
                System.out.println("odd two-digit number");
            }
            else if (number%2!=0 && number<=999){
                System.out.println("odd three-digit number");
            }
        }
        else;

    }
}
