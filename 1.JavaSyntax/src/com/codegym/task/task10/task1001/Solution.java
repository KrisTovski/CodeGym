package com.codegym.task.task10.task1001;

/* 
Task No. 1 about integer type conversions

*/

public class Solution {
    public static void main(String[] args) {
        int a = 0;
        int b = (byte) a + 46;
     //  System.out.println("b: "+b);
        byte c = (byte) (a * b);
      // System.out.println("c: "+c);
        double f = (char) 1234.15;
     //   System.out.println("f: " +f);
        long d = (long) (a + f / c + b);
        System.out.println(d);
    }
}
