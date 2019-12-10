package com.codegym.task.task08.task0830;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/* 
Task about algorithms

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] array = new String[20];
        for (int i = 0; i < array.length; i++) {
            array[i] = reader.readLine();
        }

        sort(array);

        for (String x : array) {
            System.out.println(x);
        }
    }

    public static void sort(String[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                String temp = array[i];
                String s1 = array[i];
                String s2 = array[j];

                if (isGreaterThan(s1, s2)) {
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }



    }
//    or
//        ArrayList<String> list = new ArrayList<>(Arrays.asList(array));
//        Collections.sort(list);
//        for(int i = 0; i < array.length;i++){
//            array[i] = list.get(i);
//        }
//        isGreaterThan(array[1], array[0]);
//    }


    // String comparison method: 'a' is greater than 'b'
    public static boolean isGreaterThan(String a, String b) {
        return a.compareTo(b) > 0;
    }
}
