package com.codegym.task.task04.task0417;

/* 
Do we have a pair?

*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String x = br.readLine();
        int number1 = Integer.parseInt(x);
        String y = br.readLine();
        int number2 = Integer.parseInt(y);
        String z = br.readLine();
        int number3 = Integer.parseInt(z);

        if (number1 == number2 && number1 == number3){
            System.out.print(number1 + number2 + number3);
        }
        else if (number1 == number2) {
            System.out.print(number1 + number2);
        }
        else if (number1 == number3){
            System.out.print(number1 + number3);
        }
        else if (number2 == number3){
            System.out.print(number2 + number3);
        }

    }
}