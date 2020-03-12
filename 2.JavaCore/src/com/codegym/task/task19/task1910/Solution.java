package com.codegym.task.task19.task1910;

/* 
Punctuation

*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = bufferedReader.readLine();
        String file2 = bufferedReader.readLine();
        bufferedReader.close();

        BufferedReader reader = new BufferedReader(new FileReader(file1));
        BufferedWriter writer = new BufferedWriter(new FileWriter(file2));

        while (reader.ready()){
            String s = reader.readLine();
            writer.write(s.replaceAll("[\\p{Punct}\\n]",""));
            // or writer.write(s.replaceAll("[^a-zA-Z ]", ""));
        }
        reader.close();
        writer.close();
    }
}
