package com.codegym.task.task10.task1016;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Identical words in a list

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> words = new ArrayList<String>();
        for (int i = 0; i < 20; i++) {
            words.add(reader.readLine());
        }

        Map<String, Integer> map = countWords(words);

        for (Map.Entry<String, Integer> pair : map.entrySet()) {
            System.out.println(pair.getKey() + " " + pair.getValue());
        }
    }

    public static Map<String, Integer> countWords(ArrayList<String> list) {
        HashMap<String, Integer> result = new HashMap<String, Integer>();
        int[] count = new int[list.size()];

        for (int i = 0; i < list.size(); i++){
            result.put(list.get(i), count[i]);
        }
        System.out.println(result);

        Iterator<Map.Entry<String, Integer>> iterator = result.entrySet().iterator();

        while (iterator.hasNext())
        {
            Map.Entry<String, Integer> pair = iterator.next();
            String key = pair.getKey();
            Integer value = pair.getValue();
            for (String i : list){
                if (i.equals(key)){
                    value++;
                    result.replace(key,value);
                }
            }
        }

//        while (iterator.hasNext())
//        {
//            Map.Entry<String, Integer> pair = iterator.next();
//            String key = pair.getKey();
//            Integer value = pair.getValue();
//            if (key.equals(iterator.next().getKey())){
//                value++;
//                result.replace(key,value);
//            }
//        }

        return result;
    }

}

