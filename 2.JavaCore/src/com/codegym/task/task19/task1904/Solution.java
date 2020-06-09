package com.codegym.task.task19.task1904;

import java.io.IOException;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

/* 
Yet another adapter

*/

public class Solution {

    public static void main(String[] args) {

    }

    public static class PersonScannerAdapter implements PersonScanner {

        private final Scanner fileScanner;

        PersonScannerAdapter(Scanner fileScanner) {
            this.fileScanner = fileScanner;
        }

        @Override
        public Person read() throws IOException {
            String parts[] = fileScanner.nextLine().split(" ");
            String firstName = parts[1];
            String middleName = parts[0];
            String lastName = parts[2];

            Calendar calendar = new GregorianCalendar(Integer.parseInt(parts[3]),Integer.parseInt(parts[4]) - 1,Integer.parseInt(parts[5]));



            return new Person(lastName, firstName, middleName, calendar.getTime());
        }


        @Override
        public void close() throws IOException {
            fileScanner.close();

        }
    }
}
