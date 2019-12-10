package com.codegym.task.task05.task0529;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Console-based piggy bank

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int sum = 0;
        while(true){

            String s = br.readLine();

            if (s.equals("sum")){
                break;
            }
            else
                {int number = Integer.parseInt(s);
                sum += number;
                }

            } System.out.println(sum);
        }

    }

