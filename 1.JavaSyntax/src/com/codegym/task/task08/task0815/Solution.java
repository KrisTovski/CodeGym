package com.codegym.task.task08.task0815;

import java.util.HashMap;
import java.util.HashSet;

/* 
Census

*/

public class Solution {
    public static HashMap<String, String> createMap() {

        HashMap<String, String> Map = new HashMap<String, String>();
        Map.put("kekSurname3", "kekName1");
        Map.put("kekSurname2", "kekName3");
        Map.put("kekSurnamfe3", "kekName3");
        Map.put("kekSurdname", "kekName");
        Map.put("kekSusrname5", "kekName5");
        Map.put("kekSuvrname", "kekName");
        Map.put("kekSucrname", "kekName");
        Map.put("kekSudrname8", "kekName8");
        Map.put("keksSurname", "kekName");
        Map.put("kehkSurname", "kekName");
        return Map;
    }

    public static int getSameFirstNameCount(HashMap<String, String> map, String name) {

        int counter = 0;

        for (HashMap.Entry<String, String> pair : map.entrySet())
        {
            if (pair.getValue().equals(name)) counter++;
        }

        return counter;

    }

    public static int getSameLastNameCount(HashMap<String, String> map, String lastName) {
        int counter = 0;

        for (HashMap.Entry<String, String> pair : map.entrySet())
        {
            if (pair.getKey().equals(lastName)) counter++;
        }

        return counter;
    }



    public static void main(String[] args) {

    }
}
