package com.codegym.task.task19.task1908;

/* 
Picking out numbers

*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String firstFileName = reader.readLine();
        String secondFileName = reader.readLine();
        reader.close();

        BufferedReader reader1 = new BufferedReader(new FileReader(firstFileName));
        BufferedWriter writer = new BufferedWriter(new FileWriter(secondFileName));

        while (reader1.ready()){
            String s = reader1.readLine();
            String[] splitted = s.split("\\s"); // spaces
            for(String str : splitted){
                if(str.matches("[0-9]+"))

                writer.write(str + " ");

            }
        }

        reader1.close();
        writer.close();


    }
}
