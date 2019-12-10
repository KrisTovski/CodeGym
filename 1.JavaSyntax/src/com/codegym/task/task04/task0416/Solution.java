package com.codegym.task.task04.task0416;

/* 
Crossing the road blindly

*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
       BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
       String x = bf.readLine();
       double minutes = Double.parseDouble(x);
       double m = minutes%5;

       if (m < 3){
           System.out.println("green");
       }
       else if (m >= 3 && m < 4 ){
           System.out.println("yellow");
       }
       else
           System.out.println("red");


    }
}