package com.codegym.task.task20.task2003;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/* 
Introducing properties

*/
public class Solution {
    public static Map<String, String> properties = new HashMap<>();

    public void fillInPropertiesMap() throws Exception {
        // Implement this method
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        FileInputStream fileInputStream = new FileInputStream(s);
        reader.close();
        load(fileInputStream);

    }

    public void save(OutputStream outputStream) throws Exception {
        // Implement this method
        Properties myProperties = new Properties();
        for (Map.Entry<String, String> entry: properties.entrySet()){
            myProperties.setProperty(entry.getKey(), entry.getValue());
        }
        myProperties.store(outputStream, null);
    }

    public void load(InputStream inputStream) throws Exception {
        // Implement this method
        Properties myProperties = new Properties();
        myProperties.load(inputStream);

        for (Map.Entry<Object, Object> entry : myProperties.entrySet()) {
            properties.put((String)entry.getKey(), (String)entry.getValue());
        }
    }

    public static void main(String[] args) {

    }
}
