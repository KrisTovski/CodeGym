package com.codegym.task.task08.task0803;

import java.util.HashMap;
import java.util.Map;

/* 
HashMap of cats

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        String[] cats = new String[]{"Tiger", "Missy", "Smokey", "Marmalade", "Oscar", "Snowball", "Boss", "Smudge", "Max", "Simba"};

        HashMap<String, Cat> map = addCatsToMap(cats);

        for (Map.Entry<String, Cat> pair : map.entrySet()) {
            System.out.println(pair.getKey() + " - " + pair.getValue());
        }
    }


    public static HashMap<String, Cat> addCatsToMap(String[] cats) {
        HashMap<String, Cat> myMap = new HashMap<String,Cat>();
        for(String x: cats)
        {
            myMap.put(x, new Cat(x));

        }
        return myMap;

//        or
//        HashMap<String, Cat> map = new HashMap<>();
//        for (int i = 0; i < cats.length; i++){
//            map.put(cats[i], new Cat(cats[i]));
//        }
//        return map;

    }


    public static class Cat {
        String name;

        public Cat(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return name != null ? name.toUpperCase() : null;
        }
    }
}
