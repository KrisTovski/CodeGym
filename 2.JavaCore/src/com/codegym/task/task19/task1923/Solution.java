package com.codegym.task.task19.task1923;

/* 
Words with numbers

*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader fileReader = new BufferedReader(new FileReader(args[0]));
        BufferedWriter fileWriter = new BufferedWriter(new FileWriter(args[1]));



        while (fileReader.ready()){
            String line = fileReader.readLine();
            String[] words = line.split(" ");
            for(String word : words)
                if(!word.matches("\\D*")) // or \\^D*$
                     fileWriter.write(word + " ");


        }
        fileReader.close();
        fileWriter.close();

    }

}
