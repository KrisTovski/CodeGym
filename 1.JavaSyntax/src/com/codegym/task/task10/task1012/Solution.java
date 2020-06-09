package com.codegym.task.task10.task1012;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Number of letters

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // Alphabet
        String abc = "abcdefghijklmnopqrstuvwxyz";
        char[] abcArray = abc.toCharArray();
        // Show letter and check length of abcArray
        System.out.println(abcArray);
        System.out.println(abcArray.length);

        ArrayList<Character> alphabet = new ArrayList<>();
        for (char letter : abcArray) {
            alphabet.add(letter);

        }
        //Show letters in ArrayList alphabet
       System.out.println(alphabet);

        // Read in strings
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            String s = reader.readLine();
            list.add(s.toLowerCase());
        }


        // write your code here
    }

}
