package com.codegym.task.task08.task0827;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/* 
Working with dates

*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(isDateOdd("MAY 1 2013"));
    }

    public static boolean isDateOdd(String date) {
        Date d = new Date(date);
        Calendar calendar = new GregorianCalendar();
        // or
        // Calendar calendar = Calendar.getInstance();

        calendar.setTime(d);
        int n = calendar.get(Calendar.DAY_OF_YEAR);
        if (n % 2 != 0) {
            return true;
        } else return false;



    }
}
