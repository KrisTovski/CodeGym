package com.codegym.task.task15.task1514;

import java.util.HashMap;
import java.util.Map;

/* 
Static modifiers: part 1

*/

public class Solution {
    public static Map<Double, String> labels = new HashMap<>();

    static {
        labels.put((double) 20,"twenty");
        labels.put(3.5, "three and half");
        labels.put(1.1, "one point one");
        labels.put(2.2,"two point two");
        labels.put(3.3,"three point three");
    }

    public static void main(String[] args) {
        System.out.println(labels);
    }
}
