package com.codegym.task.task07.task0715;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
More Sam-I-Am

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> list = new ArrayList<>();
        list.add("Sam");
        list.add("I");
        list.add("Am");

        for(int i = 0; i<list.size();i+=2) {
            list.add((i + 1), "Ham");
        }
        for(String x : list){
            System.out.println(x);
        }
    }
}
