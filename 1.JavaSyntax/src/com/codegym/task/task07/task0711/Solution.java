package com.codegym.task.task07.task0711;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Remove and insert

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> strings = new ArrayList<>();
        for (int i = 0; i < 5; i++) strings.add(reader.readLine());


        for (int i = 0; i < 13; i++) {
            String temp = strings.get(4);
            strings.remove(4);
            strings.add(0, temp);
        }
        for (String s : strings)
            System.out.println(s);

    }
}
