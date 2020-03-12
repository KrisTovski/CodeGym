package com.codegym.task.task18.task1823;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/* 
Threads and bytes

*/

public class Solution {
    public static Map<String, Integer> resultMap = new HashMap<String, Integer>();

    public static void main(String[] args) throws IOException, InterruptedException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (true){
            String fileName = reader.readLine();
            if ("exit".equals(fileName)) break;
            ReadThread readThread = new ReadThread(fileName);
            readThread.start();
            readThread.join();
        }

        reader.close();
    }

    public static class ReadThread extends Thread {
        private String fileName;
        public ReadThread(String fileName) {
            this.fileName = fileName;
        }
        // Implement file reading here


        @Override
        public void run() {
            try {
                FileInputStream inputStream = new FileInputStream(this.fileName);

                Map<Integer, Integer> map = new HashMap<>();
                while (inputStream.available() > 0){
                    int data = inputStream.read();

                    if (map.containsKey(data))
                        map.put(data, map.get(data)+1);
                    else
                        map.put(data, 1);
                }
                inputStream.close();

                int n = 0;
                for (Map.Entry<Integer, Integer> entry: map.entrySet())
                    if (entry.getValue() > n) n = entry.getValue();

                for (Map.Entry<Integer, Integer> entry: map.entrySet())
                    if (entry.getValue().equals(n))
                        resultMap.put(this.fileName, entry.getKey());

            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
