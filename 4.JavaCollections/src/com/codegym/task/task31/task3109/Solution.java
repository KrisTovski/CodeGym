package com.codegym.task.task31.task3109;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Properties;

/* 
Reading config files

*/
public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        Properties properties = solution.getProperties("4.JavaCollections/src/com/codegym/task/task31/task3109/properties.xml");
        properties.list(System.out);

        properties = solution.getProperties("4.JavaCollections/src/com/codegym/task/task31/task3109/properties.txt");
        properties.list(System.out);

        properties = solution.getProperties("4.JavaCollections/src/com/codegym/task/task31/task3109/notExists");
        properties.list(System.out);
    }

    public Properties getProperties(String fileName) {
        Properties properties = new Properties();
        try {
            FileInputStream fileInputStream = new FileInputStream(fileName);
            if (Paths.get(fileName).getFileName().toString().endsWith(".xml")) {
                properties.loadFromXML(fileInputStream);
            } else {
                properties.load(fileInputStream);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return properties;



//        Properties properties = new Properties();
//        int pos = fileName.lastIndexOf(".");
//        String ext = pos >= 0 ? fileName.substring(pos) : "";
//
//        try {
//            switch (ext) {
//                case ".xml": {
//                    FileInputStream fileInputStream = new FileInputStream(fileName);
//                    properties.loadFromXML(fileInputStream);
//                    fileInputStream.close();
//                    break;
//                }
//                case ".txt": {
//                    FileReader fileReader = new FileReader(fileName);
//                    properties.load(fileReader);
//                    fileReader.close();
//                    break;
//                }
//                default: {
//                    FileInputStream fileInputStream = new FileInputStream(fileName);
//                    properties.load(fileInputStream);
//                    fileInputStream.close();
//                    break;
//                }
//            }
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//            return properties;
//        }
//
//        return properties;
    }
}
