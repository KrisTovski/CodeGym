package com.codegym.task.task40.task4008;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;
import java.time.temporal.WeekFields;
import java.util.Locale;

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
        String[] splt = date.split(" ");
        String sdate = null;
        String stime = null;

        if (splt.length == 1) {
            sdate = splt[0].contains(".") ? splt[0] : null;
            stime = splt[0].contains(":") ? splt[0] : null;
        }
        if (splt.length == 2) {
            sdate = splt[0].contains(".") ? splt[0] : null;
            stime = splt[1].contains(":") ? splt[1] : null;
        }

        DateTimeFormatter formatter;
        if (sdate != null) {
            formatter = DateTimeFormatter.ofPattern("d.M.yyyy");
            LocalDate dateTime = LocalDate.parse(sdate, formatter);
            System.out.println("Day: " + dateTime.getDayOfMonth());
            System.out.println("Day of the week: " + dateTime.getDayOfWeek().getValue());
            System.out.println("Day of the month: " + dateTime.getDayOfMonth());
            System.out.println("Day of the year: " + dateTime.getDayOfYear());
            System.out.println("Week of the month: " + dateTime.get(WeekFields.of(Locale.getDefault()).weekOfMonth()));
            System.out.println("Week of the year: " + dateTime.get(WeekFields.of(Locale.getDefault()).weekOfYear()));
            System.out.println("Month: " + dateTime.getMonthValue());
            System.out.println("Year: " + dateTime.getYear());
        }
        if (stime != null) {
            formatter = DateTimeFormatter.ofPattern("H:m:s");
            LocalTime dateTime = LocalTime.parse(stime, formatter);
            System.out.println("AM or PM: " + (dateTime.get(ChronoField.AMPM_OF_DAY) == 0 ? "AM" : "PM"));
            System.out.println("Hour: " + dateTime.get(ChronoField.HOUR_OF_AMPM));
            System.out.println("Hour of the day: " + dateTime.getHour());
            System.out.println("Minutes: " + dateTime.getMinute());
            System.out.println("Seconds: " + dateTime.getSecond());
        }
    }

//    Day: 9
//    Day of the week:
//    Day of the month: 9
//    Day of the year: 282
//    Week of the month: 3
//    Week of the year: 42
//    Month: 10
//    Year: 2017
//    AM or PM: PM
//    Hour: 5
//    Hour of the day: 5
//    Minutes: 56
//    Seconds: 45
}
