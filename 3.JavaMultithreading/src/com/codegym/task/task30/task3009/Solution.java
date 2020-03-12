package com.codegym.task.task30.task3009;

import java.util.HashSet;
import java.util.Set;

/* 
Palindrome?

*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(getRadix("112"));        // Expected output: [3, 27, 13, 15]
        System.out.println(getRadix("123"));        // Expected output: [6]
        System.out.println(getRadix("5321"));       // Expected output: []
        System.out.println(getRadix("1A"));         // Expected output: []
    }

    private static Set<Integer> getRadix(String number){
        Set<Integer> result = new HashSet<>();
        StringBuilder temp;
        try {
            int numberInDex = Integer.parseInt(number);
            for(int i=2; i<37; i++){
                temp = new StringBuilder(Integer.toString(numberInDex, i));
                if(temp.toString().equals(temp.reverse().toString())) {
                    result.add(i);
                }
            }
        } catch (NumberFormatException e) {

        }
        return result;
    }
}