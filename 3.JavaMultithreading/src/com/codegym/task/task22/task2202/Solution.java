package com.codegym.task.task22.task2202;

/* 
Find a substring

*/
public class Solution {
    public static void main(String[] args) {
        System.out.println(getPartOfString("CodeGym is the best place to learn Java."));
    }

    public static String getPartOfString(String string) {
        if(string == null || string.isEmpty()) throw new StringTooShortException();
        String result;
        String s[] = string.split(" ");
        if (s.length < 5) throw  new StringTooShortException();

        return s[1] + " " + s[2] + " " + s[3] + " " + s[4];
    }

    public static class StringTooShortException extends RuntimeException {
    }
}