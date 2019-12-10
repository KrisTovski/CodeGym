package com.codegym.task.task07.task0718;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Checking the order

*/
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> words = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            words.add(reader.readLine());
        }
        for (int i = 0; i < words.size();) {
            if (words.get(i).length() < words.get(i + 1).length()) {
                i++;
            } else{
                System.out.println(i+1);
            break;}
        }
    }
}

