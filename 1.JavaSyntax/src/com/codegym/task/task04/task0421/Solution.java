package com.codegym.task.task04.task0421;

/* 
Jen or Jen?

*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String name1 = bf.readLine();
        String name2 = bf.readLine();
        int a = name1.length();
        int b = name2.length();

        if (name1.equals(name2)){
            System.out.println("The names are identical");
        }
        else if (a == b){
            System.out.println("The names are the same length");
        }

    }
}
