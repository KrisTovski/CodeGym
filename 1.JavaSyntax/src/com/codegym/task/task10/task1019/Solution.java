package com.codegym.task.task10.task1019;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

/* 
Functionality is not enough!

*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String, Integer> map = new HashMap<>();
        String id = "";
        String name = "";
        try {
            while (true) {
                id = reader.readLine();
                if (id.isEmpty()) {
                    break;
                }
                name = reader.readLine();
                if (name.isEmpty()) {
                    //map.put(name, Integer.parseInt(id));
                    System.out.println(id);
                    //System.out.println("Id=" + id + " Name=" + name);
                    break;

                }
                map.put(name, Integer.parseInt(id));

            }
        } catch (Exception e) {

        } finally {
            for (Map.Entry<String, Integer> entry : map.entrySet()) {
                System.out.println(entry.getValue()+ " " + entry.getKey());
        }






        }


    }
}
