package com.codegym.task.task18.task1809;

/* 
Reversing a file

*/

import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName1 = reader.readLine();
        String filename2 = reader.readLine();

        FileInputStream fileInputStream = new FileInputStream(fileName1);
        FileOutputStream fileOutputStream = new FileOutputStream(filename2);

        ArrayList<Integer> list = new ArrayList<>();

        while(fileInputStream.available() > 0){
            int count = fileInputStream.read();
            list.add(count);
        }

        for (int i = list.size() - 1; i >= 0; i--){
            fileOutputStream.write(list.get(i));
        }



        fileInputStream.close();
        fileOutputStream.close();



    }
}
