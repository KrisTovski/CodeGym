package com.codegym.task.task18.task1803;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/* 
Most frequent bytes

*/

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        FileInputStream fileInputStream = new FileInputStream(fileName);

        Map<Integer, Integer> map = new HashMap<>();

        while(fileInputStream.available() > 0){
            int x = fileInputStream.read();
            Integer frequency = map.get(x);
            map.put(x, frequency == null ? 1 : frequency + 1);
        }

        int max = 0;

        for (int v : map.values()) {
            if (v > max) max = v;
        }

        for (Map.Entry entry : map.entrySet()) {
            if (entry.getValue().equals(max)){
                System.out.print(entry.getKey() + " ");
            }
        }

        reader.close();
        fileInputStream.close();

    }
}
