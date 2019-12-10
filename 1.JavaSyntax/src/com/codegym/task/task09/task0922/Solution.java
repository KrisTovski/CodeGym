package com.codegym.task.task09.task0922;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* 
What's today's date?

*/

public class Solution {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String myDate = reader.readLine();
        SimpleDateFormat DateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date convertDate = DateFormat.parse(myDate);
        DateFormat = new SimpleDateFormat("MMM dd, yyyy");
        System.out.println(DateFormat.format(convertDate).toUpperCase());

    }
}
