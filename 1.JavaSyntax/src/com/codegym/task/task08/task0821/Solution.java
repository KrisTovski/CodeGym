package com.codegym.task.task08.task0821;

import java.util.HashMap;
import java.util.Map;

/* 
Shared last names and first names

*/

public class Solution {
    public static void main(String[] args) {
        Map<String, String> map = createPeopleList();
        printPeopleList(map);
    }

    public static Map<String, String> createPeopleList() {
        Map<String, String> map = new HashMap<>();
        map.put("Jan","Kowalski");
        map.put("Jan","Borysewicz");
        map.put("Kuba","Wojewódzki");
        map.put("Paweł","Wojewódzki");
        map.put("Lech","Janerka");
        map.put("Bartek","Wojewódzki");
        map.put("Jan","Janusz");
        map.put("Kleofas","Kowal");
        map.put("Patryk","Polski");
        map.put("Kuba","Kowalski");

        return map;
    }

    public static void printPeopleList(Map<String, String> map) {
        for (Map.Entry<String, String> s : map.entrySet()) {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }
}
