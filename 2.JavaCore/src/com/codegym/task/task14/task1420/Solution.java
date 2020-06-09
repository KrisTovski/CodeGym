package com.codegym.task.task14.task1420;

/* 
GCD

*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Integer num1 = Integer.parseInt(reader.readLine());
        Integer num2 = Integer.parseInt(reader.readLine());
        if (num1<=0 || num2<=0) throw  new NumberFormatException();

        BigInteger b1 = BigInteger.valueOf(num1);
        BigInteger b2 = BigInteger.valueOf(num2);
        BigInteger gcd = b1.gcd(b2);

        System.out.println(gcd.intValue());

    }

}
