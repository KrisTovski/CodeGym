package com.codegym.task.task17.task1721;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/* 
Transactionality

*/

public class Solution {
    public static List<String> allLines = new ArrayList<>();
    public static List<String> linesForRemoval = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String file1 = reader.readLine();
        String file2 = reader.readLine();
        reader.close();

        BufferedReader reader1 = new BufferedReader(new FileReader(file1));
        while (reader1.ready()) {
            allLines.add(reader1.readLine());
        }
        reader1.close();
        BufferedReader reader2 = new BufferedReader(new FileReader(file2));
        while (reader2.ready()) {
            linesForRemoval.add(reader2.readLine());
        }
        reader2.close();

        new Solution().joinData();

    }

    public void joinData() throws CorruptedDataException {
        if (allLines.containsAll(linesForRemoval)) {
            allLines.removeAll(linesForRemoval);

        } else {
            allLines.clear();
            throw new CorruptedDataException();
        }
    }
}
