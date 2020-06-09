package com.codegym.task.task19.task1925;

/* 
Long words

*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        String file1 = args[0];
        String file2 = args[1];
        BufferedReader reader = new BufferedReader(new FileReader(file1));

        BufferedWriter writer = new BufferedWriter(new FileWriter(file2));
        StringBuffer outText = new StringBuffer("");
        while (reader.ready()){
            String line = reader.readLine();
            String[] words = line.split(" ");
            for(String word : words)
                if(word.length() > 6)
                    outText.append(word).append(",");

        }
        outText.delete(outText.length()-1, outText.length());
        writer.write(outText.toString());
        writer.close();
        reader.close();
    }
}
