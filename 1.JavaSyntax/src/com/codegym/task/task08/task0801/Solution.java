package com.codegym.task.task08.task0801;

/* 
HashSet of plants

*/

import java.util.HashSet;


public class Solution {
    public static void main(String[] args) throws Exception {

        HashSet<String> set = new HashSet<String>();
        set.add("watermelon");
        set.add("banana");
        set.add("cherry");
        set.add("pear");
        set.add("cantaloupe");
        set.add("blackberry");
        set.add("ginseng");
        set.add("strawberry");
        set.add("iris");
        set.add("potato");

        for(String x:set){
            System.out.println(x);
        }


    }
}
