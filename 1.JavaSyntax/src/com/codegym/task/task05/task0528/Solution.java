package com.codegym.task.task05.task0528;

/* 
Display today's date

*/

import java.text.SimpleDateFormat;
import java.util.Date;

public class Solution {
    public static void main(String[] args) {
        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("MM dd yyyy");
        System.out.println(formatter.format(date));
    }
}
