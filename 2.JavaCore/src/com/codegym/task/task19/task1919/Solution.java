package com.codegym.task.task19.task1919;

/* 
Calculating salaries

*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Solution {


    public static void main(String[] args) throws IOException {
        TreeMap<String, Double> map = new TreeMap<>();
        String fileName = args[0];
        FileReader fileReader = new FileReader(fileName);
        BufferedReader reader = new BufferedReader(fileReader);

        while (reader.ready()) {
            String s = reader.readLine();
            String[] str = s.split(" ");
            String name = str[0];
            double value = Double.parseDouble(str[1]);
            if (!map.containsKey(name)) {
                map.put(name, value);
            } else {
                map.replace(name, map.get(name) + value);
            }



        }

        for (Map.Entry<String, Double> pair : map.entrySet()) {
            System.out.println(pair.getKey() + " " + pair.getValue());

        }

        fileReader.close();
        reader.close();
    }


}
