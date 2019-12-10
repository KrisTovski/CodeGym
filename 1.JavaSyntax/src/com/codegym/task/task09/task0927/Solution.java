package com.codegym.task.task09.task0927;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* 
Ten cats

*/

public class Solution {
    public static void main(String[] args) {
        Map<String, Cat> map = createMap();
        Set<Cat> set = convertMapToSet(map);
        printCatSet(set);
    }

    public static Map<String, Cat> createMap() {
        Map<String,Cat> CatMap = new HashMap<>();
        CatMap.put("cat1",new Cat("abc"));
        CatMap.put("cat2",new Cat("def"));
        CatMap.put("cat3",new Cat("ghi"));
        CatMap.put("cat4",new Cat("jkl"));
        CatMap.put("cat5",new Cat("mno"));
        CatMap.put("cat6",new Cat("prs"));
        CatMap.put("cat7",new Cat("tuw"));
        CatMap.put("cat8",new Cat("xyz"));
        CatMap.put("cat9",new Cat("qqq"));
        CatMap.put("cat10",new Cat("lul"));
        return CatMap;
    }

    public static Set<Cat> convertMapToSet(Map<String, Cat> map) {
        Set<Cat> CatSet = new HashSet<>(map.values());
        return  CatSet;

    }

    public static void printCatSet(Set<Cat> set) {
        for (Cat cat : set) {
            System.out.println(cat);
        }
    }

    public static class Cat {
        private String name;

        public Cat(String name) {
            this.name = name;
        }

        public String toString() {
            return "Cat " + this.name;
        }
    }


}
