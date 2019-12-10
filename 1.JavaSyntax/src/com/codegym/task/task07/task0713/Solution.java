package com.codegym.task.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Playing Javarella

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            String s = reader.readLine();
            numbers.add(Integer.parseInt(s));
        }
        ArrayList<Integer> divisibleBy3 = new ArrayList<>();
        ArrayList<Integer> divisibleBy2 = new ArrayList<>();
        ArrayList<Integer> otherNumbers = new ArrayList<>();

        for (int i = 0; i < numbers.size(); i++) {
            Integer x = numbers.get(i);
            if (x % 3 == 0 && x % 2 == 0) {
                divisibleBy3.add(x);
                divisibleBy2.add(x);
            } else if (x % 3 == 0) divisibleBy3.add(x);
            else if (x % 2 == 0) divisibleBy2.add(x);
            else otherNumbers.add(x);
        }
        printList(divisibleBy3);
        printList(divisibleBy2);
        printList(otherNumbers);

    }

    public static void printList(List<Integer> list) {
        for (Integer x : list)
        {
            System.out.println(x);
        }
    }
}
