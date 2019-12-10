package com.codegym.task.task07.task0709;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Expressing ourselves more concisely

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();
        int min = 0;
        for (int i = 0; i < 5; i++) {
            list.add(reader.readLine());
        }
        min = list.get(0).length();
        for (int i = 1; i < 5; i++) {
            if (list.get(i).length() < min) {
                min = list.get(i).length();
            }
        }
        for(int i = 0; i<5; i++){
            if(list.get(i).length()== min){
                System.out.println(list.get(i));
            }
        }
    }
}
