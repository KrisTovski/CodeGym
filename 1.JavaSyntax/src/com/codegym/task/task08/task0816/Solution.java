package com.codegym.task.task08.task0816;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/* 
Kind Emma and the summer holidays

*/

public class Solution {
    public static HashMap<String, Date> createMap() throws ParseException {
        DateFormat df = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("Stallone", df.parse("JUNE 1 1980"));
        map.put("Tom", df.parse("JUNE 6 1990"));
        map.put("Betty", df.parse("MAY 8 1987"));
        map.put("John", df.parse("DECEMBER 2 1969"));
        map.put("Loli", df.parse("JULY 10 1995"));
        map.put("Natali", df.parse("AUGUST 18 1956"));
        map.put("Paul", df.parse("SEPTEMBER 20 1989"));
        map.put("Elizabeth", df.parse("APRIL 3 1992"));
        map.put("Leigh", df.parse("OCTOBER 9 1990"));
        map.put("Les", df.parse("NOVEMBER 6 1999"));

        return map;
    }

    public static void removeAllSummerPeople(HashMap<String, Date> map) {

        Calendar cal = Calendar.getInstance();
        Iterator<Map.Entry<String, Date>> iterator = map.entrySet().iterator();

        while (iterator.hasNext()) {

            while (iterator.hasNext()) {
                Map.Entry<String, Date> entry = iterator.next();
                cal.setTime(entry.getValue());

                if (cal.get(Calendar.MONTH) == 5 || cal.get(Calendar.MONTH) == 6 || cal.get(Calendar.MONTH) == 7) {
                    iterator.remove();
                }
            }
        }
    }


    public static void main(String[] args) {

    }
}
