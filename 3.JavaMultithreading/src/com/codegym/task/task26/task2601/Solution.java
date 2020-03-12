package com.codegym.task.task26.task2601;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

/*
Read online about the median of a sample

*/
public class Solution {

    public static void main(String[] args) {

    }

    public static Integer[] sort(Integer[] array) {
        // Implement the logic here
        Arrays.sort(array);
        double median;
        if (array.length % 2 == 0)
            median = ((double)array[array.length/2] + (double)array[array.length/2 - 1])/2;
        else
            median = (double) array[array.length/2];

        Arrays.sort(array,new Comparator<Integer>(){

            @Override
            public int compare(Integer o1, Integer o2) {
                double result = Math.abs(o1 - median) - Math.abs(o2 - median);

                return result == 0 ? o1 - o2 : (int) Math.round(result);
            }
        });


        return array;
    }
}
