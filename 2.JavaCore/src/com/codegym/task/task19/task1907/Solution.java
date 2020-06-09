package com.codegym.task.task19.task1907;

/* 
Counting words

*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        FileReader fileReader = new FileReader(fileName);

        String line = "";
        int count = 0;

        while (fileReader.ready()){
           line += (char)fileReader.read();
        }
           String[] words = line.split("\\W"); // divide by non-abc chars
            for (String s : words){
                if(s.equals("world"))
                    count++;

        }
        reader.close();
        fileReader.close();
        System.out.println(count);
    }
}
