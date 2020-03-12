package com.codegym.task.task18.task1820;

/* 
Rounding numbers

*/

import java.io.*;
import java.util.StringJoiner;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = reader.readLine();
        String file2 = reader.readLine();

        FileInputStream fileInputStream = new FileInputStream(file1);
        FileOutputStream fileOutputStream = new FileOutputStream(file2);

        byte[] buffer = new byte[fileInputStream.available()];
        fileInputStream.read(buffer);

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < buffer.length; i++) {
            sb.append((char) buffer[i]);
        }

        String[] doubles = sb.toString().split(" ");
        StringJoiner sj = new StringJoiner(" ");
        for (int i = 0; i < doubles.length; i++) {
            sj.add(String.valueOf(Math.round(Double.parseDouble(doubles[i]))));
        }

        fileOutputStream.write(sj.toString().getBytes());

        fileInputStream.close();
        fileOutputStream.close();


    }
}
