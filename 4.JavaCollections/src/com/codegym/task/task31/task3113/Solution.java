package com.codegym.task.task31.task3113;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/* 
What's in the folder?

*/
public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        reader.close();
        Path dir = Paths.get(fileName);
        if(!Files.isDirectory(dir)){
            System.out.println(dir.toString() + " is not a folder");
            return;
        }
    }
}
