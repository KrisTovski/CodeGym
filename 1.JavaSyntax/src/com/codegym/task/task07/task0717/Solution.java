package com.codegym.task.task07.task0717;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Duplicating words

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<String>();
        for(int i = 0; i<10;i++){
            list.add(reader.readLine());
        }
        ArrayList<String> result = doubleValues(list);
        for (String x: result) {
            System.out.println(x);

            }


        // Display result
    }

    public static ArrayList<String> doubleValues(ArrayList<String> list) {
        for(int i = 0 ; i<list.size();){
            list.add(i, list.get(i));
            i+=2;
        }
        return list;
    }
}
