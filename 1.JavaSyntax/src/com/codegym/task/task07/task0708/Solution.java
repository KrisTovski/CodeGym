package com.codegym.task.task07.task0708;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Longest string

*/

public class Solution {
    private static List<String> strings;

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        strings = new ArrayList<>();
        int max = 0;

        for (int i = 0; i < 5; i++) {
            strings.add(reader.readLine());
        }
        max = strings.get(0).length();
        for (int i = 1; i < 5; i++) {

            if (strings.get(i).length() > max) {
                max = strings.get(i).length();
            }
        }
        for (int i = 0; i < 5; i++)
            if (max == strings.get(i).length()) {
                System.out.println(strings.get(i));
            }
    }
}



