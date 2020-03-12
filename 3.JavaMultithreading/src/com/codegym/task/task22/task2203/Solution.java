package com.codegym.task.task22.task2203;

/* 
Between tabs

*/
public class Solution {
    public static String getPartOfString(String string) throws StringTooShortException {
        if (string == null || string.isEmpty()) {
            throw new StringTooShortException();
        }
        String s[] = string.split("\t");
        if (s.length < 3) {
            throw new StringTooShortException();
        }

        return s[1];
    }

    public static class StringTooShortException extends Exception {
    }

    public static void main(String[] args) throws StringTooShortException {
        System.out.println(getPartOfString("\tCodeGym is the best place \tto learn Java\t."));
    }
}