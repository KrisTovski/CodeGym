package com.codegym.task.task13.task1319;

import java.io.*;

/* 
Writing to a file from the console

*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new FileWriter(reader.readLine()));

        while (true){
            String s = reader.readLine();
            if (s.equals("exit")){
                writer.write(s);
                break;
            }

            else {
                writer.write(s);
                writer.newLine();
            }



        }
        reader.close();
        writer.close();





    }
}
