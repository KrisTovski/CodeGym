package com.codegym.task.task18.task1821;

/* 
Symbol frequency

*/

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class Solution {
    public static void main(String[] args) throws IOException {

        FileInputStream fileInputStream = new FileInputStream(args[0]);
        TreeMap<Byte,Integer> map = new TreeMap<>();

        while(fileInputStream.available()>0){
            byte[] buffer = new byte[fileInputStream.available()];
            fileInputStream.read(buffer);

            for(int i = 0; i<buffer.length;i++){
                if(map.containsKey(buffer[i]))
                    map.put(buffer[i],map.get(buffer[i])+1);
                else
                    map.put(buffer[i], 1);
            }
        }
        fileInputStream.close();

        for(Map.Entry pair : map.entrySet()){
            System.out.println((char)((byte)pair.getKey()) + " " + pair.getValue());
        }



    }
}
