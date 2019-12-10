package com.codegym.task.task08.task0823;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Going national

*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        char[] ch = s.toLowerCase().trim().toCharArray();
        for(int i = 0; i < ch.length; i++) {
            ch[0] = Character.toUpperCase(ch[0]);
            if(Character.isWhitespace(ch[i])) {
                if(Character.isLetter(ch[i+1]))
                    ch[i+1] = Character.toUpperCase(ch[i+1]);
            }

        }
        s = String.valueOf(ch);
        System.out.println(s);

    }
}
