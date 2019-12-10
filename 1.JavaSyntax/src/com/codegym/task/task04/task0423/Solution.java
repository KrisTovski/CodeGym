package com.codegym.task.task04.task0423;

/* 
Bouncer policy

*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String name = bf.readLine();
        int age = Integer.parseInt(bf.readLine());

        if (age > 20)
        System.out.println("18 is old enough");
    }
}
