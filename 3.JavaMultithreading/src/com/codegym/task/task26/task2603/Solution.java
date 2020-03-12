package com.codegym.task.task26.task2603;

import java.util.Comparator;

/*
A convert can easily convert others

*/
public class Solution {

    public static class CustomizedComparator<T> implements Comparator<T>{


        private final Comparator<T>[] comparators;

        public CustomizedComparator(Comparator<T>... comparators) {
            this.comparators = comparators;
        }

        @Override
        public int compare(T o1, T o2) {
            int result = 0;
            for(Comparator comparator : comparators){
                result = comparator.compare(o1,o2);
                if(result!=0){
                    break;
                }
            }


            return result;
        }
    }


    public static void main(String[] args) {



    }
}
