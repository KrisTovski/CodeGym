package com.codegym.task.task08.task0817;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
We don't need repeats

*/

public class Solution {
    public static HashMap<String, String> createMap() {
         HashMap<String,String> map = new HashMap<>();
        map.put("Borysewicz","Jan");
        map.put("Zkrainykredek","Edek");
        map.put("Nagorze","Pawel");
        map.put("Nadole","Gawel");
        map.put("Janusz","Jan");
        map.put("Brzeczyszczykiewicz","Grzegorz");
        map.put("Grzegorzewski","Grzegorz");
        map.put("Polski","Jan");
        map.put("Boniek","Zbigniew");
        map.put("Drozd","Tadeusz");
        //System.out.println(map);
        return map;

    }

    public static void removeFirstNameDuplicates(Map<String, String> map) {
        ArrayList<String> names = new ArrayList<>();
        ArrayList<String> copyNames = new ArrayList<>();

        Iterator<Map.Entry<String,String>> iterator = map.entrySet().iterator();

        while(iterator.hasNext()){
            Map.Entry<String,String> entry = iterator.next();
            if(!names.contains(entry.getValue())) names.add(entry.getValue());
            else {
                if (!copyNames.contains(entry.getValue())) copyNames.add(entry.getValue());
            }
        }
        for(int i=0;i<copyNames.size();i++){
            removeItemFromMapByValue(map,copyNames.get(i));
        }

    }

    public static void removeItemFromMapByValue(Map<String, String> map, String value) {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }

    public static void main(String[] args) {
        HashMap<String,String> m = createMap();
    }
}
