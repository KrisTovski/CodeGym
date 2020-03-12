package com.codegym.task.task18.task1808;

/* 
Splitting a file

*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName1 = reader.readLine();
        String fileName2 = reader.readLine();
        String fileName3 = reader.readLine();

        FileInputStream fileInputStream1 = new FileInputStream(fileName1);
        FileOutputStream fileOutputStream2 = new FileOutputStream(fileName2);
        FileOutputStream fileOutputStream3 = new FileOutputStream(fileName3);

        int fullSizeFile = fileInputStream1.available();
        int half1 = fullSizeFile % 2 == 0 ? fullSizeFile / 2 : fullSizeFile/ 2 + 1;

        while(fileInputStream1.available()>0){
            byte[] buffer1 = new byte[half1];
            byte[] buffer2 = new byte[fullSizeFile - half1];

            fileInputStream1.read(buffer1);
            fileInputStream1.read(buffer2);
            fileOutputStream2.write(buffer1);
            fileOutputStream3.write(buffer2);
        }
        fileInputStream1.close();
        fileOutputStream2.close();
        fileOutputStream3.close();



    }
}
