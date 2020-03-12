package com.codegym.task.task15.task1529;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Mastering the static block

*/

public class Solution {
    public static void main(String[] args) {


    }

    static {

        reset();
    }


    public static CanFly result;

    public static void reset() {
        //write your code here

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            String value = reader.readLine();
            if (value.equals("helicopter")) {
                result = new Helicopter();
            }
            if (value.equals("plane")) {
                int n = Integer.parseInt(reader.readLine());
                result = new Plane(n);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
