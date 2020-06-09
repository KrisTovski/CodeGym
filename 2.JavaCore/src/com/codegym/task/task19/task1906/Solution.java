package com.codegym.task.task19.task1906;

/* 
Even characters

*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String firstFileName = reader.readLine();
        String secondFileName = reader.readLine();

        FileReader fileReader = new FileReader(firstFileName);
        FileWriter fileWriter = new FileWriter(secondFileName);


        int count = 1;
        while (fileReader.ready()){
            int data = fileReader.read();
            if(count % 2 == 0){
                fileWriter.write(data);
            }
            count++;

        }
        reader.close();
        fileReader.close();
        fileWriter.close();
    }
}
//    ArrayList<Integer> list = new ArrayList<>();
//
//        while (reared.ready()){
//                int x = reared.read();
//                list.add(x);
//                }
//
//                for (int i = 1; i < list.size(); i = i + 2){
//        writer.write(list.get(i));
//        }
