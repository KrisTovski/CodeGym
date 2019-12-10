package com.codegym.task.task04.task0420;

/* 
Sorting three numbers

*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(bf.readLine());
        int b = Integer.parseInt(bf.readLine());
        int c = Integer.parseInt(bf.readLine());

        if (a >= b && a >= c && b >= c)
            System.out.println( a + " " + b + " " + c);
        else if ( b >= a && b >= c && a >= c)
            System.out.println( b + " " + a + " " + c);
        else if ( c >= b && c >= a && b >= a)
            System.out.println( c + " " + b + " " + a);
        else if ( a >= c && a >= b && c >= b)
            System.out.println( a + " " + c + " " + b);
        else if ( b >= c && b >= a && c >= a)
            System.out.println( b + " " + c + " " + a);
        else if ( c >= a && c >= b && a >= b)
            System.out.println( c + " " + a + " " + b);

    }
}
