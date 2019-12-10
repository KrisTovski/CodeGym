package com.codegym.task.task05.task0507;

/* 
Arithmetic mean

*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            int number = 0;
            int count = 0;
            double result;
            while (true) {
                int inputNumber = Integer.parseInt(br.readLine());
                if (inputNumber == -1)
                    break;
                if(inputNumber!= -1)

                    number += inputNumber;
                count++;



            }
            result = (double) number/count;
            System.out.println(result);


    }
}

