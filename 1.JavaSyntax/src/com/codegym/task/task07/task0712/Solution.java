package com.codegym.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Shortest or longest

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> strings = new ArrayList<>();
        int shortestIndex = 0;
        int longestIndex =0;

        for (int i = 0; i<10;i++){
            strings.add(reader.readLine());
        }
        int shortest = strings.get(0).length();
        String shortestString = strings.get(0);
        String longestString =strings.get(0);
        for (int i = 1; i<10; i ++){
            if (strings.get(i).length()<shortest){
              shortest = strings.get(i).length();
                shortestIndex = i;
                shortestString = strings.get(i);

            }

        }
        int longest = strings.get(0).length();
        for(int i=1; i<10;i++){
            if(strings.get(i).length()> longest){
               longest = strings.get(i).length();
                longestIndex = i;
                longestString = strings.get(i);


            }
        }
        if (shortestIndex < longestIndex) {
            System.out.println(shortestString);
        }

        else {
            System.out.println(longestString);
        }

    }
}
