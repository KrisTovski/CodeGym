package com.codegym.task.task04.task0419;

/* 
Maximum of four numbers

*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String a = bf.readLine();
        int num1 = Integer.parseInt(a);
        String b = bf.readLine();
        int num2 = Integer.parseInt(b);
        String c = bf.readLine();
        int num3 = Integer.parseInt(c);
        String d = bf.readLine();
        int num4 = Integer.parseInt(d);

        int min1;
        int min3;

        if (num1 > num2){
            min1 = num1;
        }
        else {
            min1 = num2;
        }
        if (num3 > num4){

            min3 = num3;
        }
        else {
            min3 = num4;
        }
        if (min1 > min3){
            System.out.println(min1);
        }
        else
            System.out.println(min3);


    }
}
