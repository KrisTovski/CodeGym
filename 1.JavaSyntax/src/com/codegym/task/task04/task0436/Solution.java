package com.codegym.task.task04.task0436;


/* 
Drawing a rectangle

*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int m = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());

        for (int i=0; i<m ;i++ ){
            for(int j=0;j<n;j++){

                System.out.print("8");
            }
            System.out.println();
        }

    }
}
