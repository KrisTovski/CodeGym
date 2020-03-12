package com.codegym.task.task40.task4007;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;


/* 
Working with Java 8's DateTime API

*/

public class Solution {
    public static void main(String[] args) {
        printDate("21.4.2014 15:56:45");
        System.out.println();
        printDate("21.4.2014");
        System.out.println();
        printDate("17:33:40");
    }

    public static void printDate(String date) {
        //write your code here
        boolean printDate = false;
        boolean printTime = false;

        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat dateFormat = null;

        if (date.contains(":")) {
            dateFormat = new SimpleDateFormat("HH:mm:ss");
            printTime = true;
        }
        if (date.contains(".")) {
            dateFormat = new SimpleDateFormat("dd.MM.yy");
            printDate = true;
        }
        if (date.contains(" ")) {
            dateFormat = new SimpleDateFormat("dd.MM.yy HH:mm:ss");
            printTime = true;
            printDate = true;
        }
        if (dateFormat == null) {
            return;
        }
        try {
            calendar.setTime(dateFormat.parse(date));
        } catch (ParseException e) {
            return;
        }
        if (printDate) {
            System.out.println("Day: " + calendar.get(Calendar.DATE));
            System.out.println("Day of the week: " + (calendar.get(Calendar.DAY_OF_WEEK) - 1 == 0 ? 7 : calendar.get(Calendar.DAY_OF_WEEK) - 1));
            System.out.println("Day of the month: " + calendar.get(Calendar.DAY_OF_MONTH));
            System.out.println("Day of the year: " + calendar.get(Calendar.DAY_OF_YEAR));
            System.out.println("Week of the month: " + calendar.get(Calendar.WEEK_OF_MONTH));
            System.out.println("Week of the year: " + calendar.get(Calendar.WEEK_OF_YEAR));
            System.out.println("Month: " + (calendar.get(Calendar.MONTH) + 1));
            System.out.println("Year: " + calendar.get(Calendar.YEAR));

        }
        if (printTime) {
            System.out.println("AM or PM: " + (calendar.get(Calendar.AM_PM) == 0 ? "AM" : "PM"));
            System.out.println("Hour: " + calendar.get(Calendar.HOUR));
            System.out.println("Hour of the day: " + calendar.get(Calendar.HOUR_OF_DAY));
            System.out.println("Minutes: " + calendar.get(Calendar.MINUTE));
            System.out.println("Seconds: " + calendar.get(Calendar.SECOND));

        }

//        Day: 21
//        Day of the week: 1
//        Day of the month: 21
//        Day of the year: 111
//        Week of the month: 4
//        Week of the year: 17
//        Month: 4
//        Year: 2014
//        AM or PM: PM
//        Hour: 3
//        Hour of the day: 15
//        Minutes: 56
//        Seconds: 45
    }
}
