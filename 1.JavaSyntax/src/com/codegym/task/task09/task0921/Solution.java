package com.codegym.task.task09.task0921;

import javax.imageio.IIOException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;

/* 
Method in a try-catch

*/

public class Solution {
    public static void main(String[] args) {
        readData();
    }

    public static void readData() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<>();

        try { while (true){
            list.add(Integer.parseInt(reader.readLine()));}

        } catch (IOException e) {
            e.printStackTrace();
        } catch (NumberFormatException e) {

        } finally {

            list.forEach(System.out::println);

        }


    }
}
