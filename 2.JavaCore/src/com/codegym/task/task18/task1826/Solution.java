package com.codegym.task.task18.task1826;

/* 
Encryption

*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        switch (args[0]){
            case "-e":{
                encode(args[1],args[2]);
            }break;
            case "-d":{
                decode(args[1],args[2]);
            }break;
        }

    }

    public static void encode(String fileName, String fileOutputName) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(fileName);
        FileOutputStream fileOutputStream = new FileOutputStream(fileOutputName);

        while (fileInputStream.available() > 0) {
            fileOutputStream.write(fileInputStream.read() +1); // to encrypt, add 1 to every byte
        }

        fileInputStream.close();
        fileOutputStream.close();

    }
    public static void decode(String fileName, String fileOutputName) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(fileName);
        FileOutputStream fileOutputStream = new FileOutputStream(fileOutputName);

        while (fileInputStream.available() > 0) {
            fileOutputStream.write(fileInputStream.read()-1); // to decrypt, remove 1 from every byte
        }

        fileInputStream.close();
        fileOutputStream.close();
    }
}
