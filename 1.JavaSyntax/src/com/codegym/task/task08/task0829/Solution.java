package com.codegym.task.task08.task0829;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* 
Software update

*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        HashMap<String, String> citiesAndFamilies = new HashMap<>();
        while (true) {
            String city = reader.readLine();
            if (city.isEmpty()) { break; }
            String family = reader.readLine();
            citiesAndFamilies.put(city, family);
        }
        //Read the city
        String city = reader.readLine();

        String familyName = citiesAndFamilies.get(city);
        System.out.println(familyName);

        // Read the house number
//        int houseNumber = Integer.parseInt(reader.readLine());
//
//        if (0 <= houseNumber && houseNumber < addresses.size()) {
//            String familyName = addresses.get(houseNumber);
//            System.out.println(familyName);
//        }



    }
}
