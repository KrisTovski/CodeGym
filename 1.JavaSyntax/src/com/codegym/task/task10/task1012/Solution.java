package com.codegym.task.task10.task1012;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.security.Key;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Handler;

/* 
Number of letters

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // Alphabet
        String abc = "abcdefghijklmnopqrstuvwxyz";
        char[] abcArray = abc.toCharArray();

        ArrayList<Character> alphabet = new ArrayList<>();
        for (char letter : abcArray) {
            alphabet.add(letter);
        }

        // Read in strings
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            String s = reader.readLine();
            list.add(s.toLowerCase());
        }

//        HashMap<String,Integer> map = new HashMap();
//        for (char ch = 'A'; ch <= 'Z'; ++ch)
//            map.put(String.valueOf(ch).toLowerCase(), 0);
//        System.out.println(map);


        /////////////////////////////
        //Start of the logic to get character count
        int[] count = new int[alphabet.size()];

        for (String i : list){
            char[] words = i.toCharArray();
            for (char k : words){
                for (int j = 0; j < alphabet.size(); j++){
                    if (alphabet.get(j).equals(k)){
                        count[j]++;
                    }
                }
            }
        }
        // Print array content
       // System.out.println(Arrays.toString(count));

        //end of the logic to get character count

        ArrayList<String> list1 = new ArrayList<>();

        for (int i = 0; i < alphabet.size(); i++){
            list1.add(alphabet.get(i) + " " + count[i]);
        }
        // Print list1
        // System.out.println(list1);

        //Print list1 content each element in new line

        for (String i : list1){
            System.out.println(i);
        }





    }

}
