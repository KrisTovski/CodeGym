package com.codegym.task.task06.task0606;

import java.io.*;

/* 
Even and odd digits

*/

public class Solution {

    public static int even;
    public static int odd;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(br.readLine());

        if (number < 0){ number *= -1;}

        while(number != 0){
            if (number%2==0){
                even++;
                number /= 10;
            }
            else {
                odd++;
                number /= 10;
            }}
        System.out.println("Even: " + even + " Odd: " + odd);
    }
}

