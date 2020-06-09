package com.codegym.task.task18.task1825;

import java.io.*;
import java.util.*;

/* 
Building a file

*/

public class Solution {
    public static void main(String[] args) throws IOException {
        ArrayList<String> list = new ArrayList<>();
        String currentFileName = null;
        String directory = null;
        String fileName = null;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while(!(currentFileName=reader.readLine()).equals("end")){
            list.add(currentFileName);
        }
        reader.close();
        Collections.sort(list);

        int lastIndexDirectory = list.get(0).lastIndexOf('/');

        int lastIndexFileName = list.get(0).lastIndexOf('.');

        directory = list.get(0).subSequence(0, lastIndexDirectory+1).toString();

        fileName = list.get(0).subSequence(lastIndexDirectory+1, lastIndexFileName).toString();

        FileOutputStream fos = new FileOutputStream(directory + fileName);
        if (!new File(directory+fileName).exists())
            new File(directory+fileName).createNewFile();

        for (String s: list ){
            FileInputStream fis = new FileInputStream(s);
            byte[] buffer = new byte[fis.available()];
            fis.read(buffer);
            fis.close();
            fos.write(buffer);
        }
        fos.close();






    }
}
