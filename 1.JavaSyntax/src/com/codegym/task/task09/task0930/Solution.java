package com.codegym.task.task09.task0930;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.ArrayList;

/* 
Task about algorithms

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<String>();
        while (true) {
            String s = reader.readLine();
            if (s.isEmpty()) break;
            list.add(s);
        }

        String[] array = list.toArray(new String[list.size()]);
        sort(array);

        for (String x : array) {
            System.out.println(x);
        }
    }

    public static void sort(String[] array) {

        for (int i = 0; i < array.length - 1; i++) {
            for (int k = i + 1; k < array.length; k++) {
                if (isNumber(array[i]) && isNumber(array[k])) {
                    if (Integer.parseInt(array[k]) > Integer.parseInt(array[i])) {
                        String temp = array[k];
                        array[k] = array[i];
                        array[i] = temp;
                    }
                }

                if (!isNumber(array[i]) && !isNumber(array[k])) {
                    if (isGreaterThan(array[i], array[k])) {
                        String temp = array[k];
                        array[k] = array[i];
                        array[i] = temp;
                    }
                }
            }
        }
    }



    // String comparison method: 'a' is greater than 'b'
    public static boolean isGreaterThan(String a, String b) {
        return a.compareTo(b) > 0;
    }


    // Is the passed string a number?
    public static boolean isNumber(String s) {
        if (s.length() == 0) return false;

        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if ((i != 0 && c == '-') // The string contains a hyphen
                    || (!Character.isDigit(c) && c != '-') // or is not a number and doesn't start with a hyphen
                    || (i == 0 && c == '-' && chars.length == 1)) // or is a single hyphen
            {
                return false;
            }
        }
        return true;
    }
}
