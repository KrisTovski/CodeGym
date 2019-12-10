package com.codegym.task.task04.task0415;

/* 
Rule of the triangle

*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String a = bf.readLine();
        int sideA = Integer.parseInt(a);
        String b = bf.readLine();
        int sideB = Integer.parseInt(b);
        String c = bf.readLine();
        int sideC = Integer.parseInt(c);

        if (sideA + sideB > sideC && sideA + sideC > sideB && sideB + sideC > sideA) {
            System.out.println("The triangle is possible.");

        }
                else
                System.out.println("The triangle is not possible.");

    }
}