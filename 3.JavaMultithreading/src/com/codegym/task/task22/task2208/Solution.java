package com.codegym.task.task22.task2208;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/* 
Build a WHERE query

*/
public class Solution {
    public static void main(String[] args) {
        Map<String, String> map = new LinkedHashMap<>();
        map.put("name","John");
        map.put("country","UK");
        map.put("city","London");
        map.put("age",null);
        map.put("name1","Bob");
        map.put("name2","Max");

        System.out.println(getQuery(map));

    }

    public static String getQuery(Map<String, String> params) {
        StringBuilder result = new StringBuilder();
        if (params == null || params.isEmpty())
            return result.toString();

        for(Map.Entry<String,String> pair : params.entrySet()){
            if (pair.getKey() == null|| pair.getValue() == null)
                continue;
            result.append(pair.getKey()).append(" = '").append(pair.getValue()).append("' and ");
        }
        if (result.length() > 5)
            result.delete(result.length() - 5, result.length()); // deleting last "' and "

        return result.toString();
    }
}
