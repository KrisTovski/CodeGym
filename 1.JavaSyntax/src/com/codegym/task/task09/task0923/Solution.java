package com.codegym.task.task09.task0923;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Vowels and consonants

*/

public class Solution {
    public static char[] vowels = new char[]{'a', 'e', 'i', 'o', 'u'};

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String word = reader.readLine();
        ArrayList<Character> vowels = new ArrayList<>();
        ArrayList<Character> consonants = new ArrayList<>();
        for (int i = 0; i<word.length();i++){
            char c = word.charAt(i);
            if(isVowel(c)){
                vowels.add(c);
            }
            else if(c != ' '){
                consonants.add(c);

            }

        }
//        vowels.forEach(System.out::print);
//        System.out.println();
//        consonants.forEach(System.out::print);
        for(Character v:vowels){
            System.out.print(v);
            System.out.print(' ');
        }
        System.out.println();
        for(Character c:consonants){
            System.out.print(c);
            System.out.print(' ');
        }



    }

    // The method checks whether a letter is a vowel
    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);  // Convert to lowercase

        for (char d : vowels)   // Look for vowels in the array
        {
            if (c == d)
                return true;
        }
        return false;
    }
}