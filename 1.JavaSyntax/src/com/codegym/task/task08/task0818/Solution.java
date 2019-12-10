package com.codegym.task.task08.task0818;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Only for the rich

*/

public class Solution {
    public static HashMap<String, Integer> createMap() {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Kowalski", 3000);
        map.put("Polski", 400);
        map.put("Nowak", 200);
        map.put("Dzownica", 2000);
        map.put("Piekny", 1000);
        map.put("Lutek", 500);
        map.put("Pilsudski", 1500);
        map.put("Walesa", 30000);
        map.put("Dudek", 2500);
        map.put("Jablonski", 350);

        return map;


    }

    public static void removeItemFromMap(HashMap<String, Integer> map) {
        for (Iterator<Map.Entry<String, Integer>> iterator = map.entrySet().iterator();
             iterator.hasNext(); ) {
            Map.Entry<String, Integer> e = iterator.next();
            if (e.getValue() < 500) {
                iterator.remove();
            }
        }
    }

    public static void main(String[] args) {
        createMap();
    }
}