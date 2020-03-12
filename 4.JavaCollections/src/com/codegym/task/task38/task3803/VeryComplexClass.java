package com.codegym.task.task38.task3803;

/* 
Runtime exceptions (unchecked exceptions)

*/

public class VeryComplexClass {
    public void methodThrowsClassCastException() {
        Number[] numbers = {1, 2.5, 4, 7.6};
        double sum = 0;
        for (Number number : numbers) {
            sum += (Integer)number;
        }
        System.out.println(sum);

//        Object i = (Integer)1;
//        System.out.println((String) i);


    }

    public void methodThrowsNullPointerException() {
        int[] array = null;
        System.out.println(array.length);

//        ArrayList<Integer> list = null;
//        list.add(1);

    }

    public static void main(String[] args) {

    }
}