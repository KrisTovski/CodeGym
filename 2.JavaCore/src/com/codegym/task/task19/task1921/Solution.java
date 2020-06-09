package com.codegym.task.task19.task1921;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/* 
John Johnson

*/

public class Solution {
    public static final List<Person> PEOPLE = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        String fileName = args[0];
        FileReader fileReader = new FileReader(fileName);
        BufferedReader br = new BufferedReader(fileReader);
        fileReader.close();
        while (br.ready()) {
            String s = br.readLine();
            String name = s.replaceAll("\\d", "").trim();
            String[] numbers = s.substring(name.length()).trim().split(" ");
            int month = Integer.parseInt(numbers[0]);
            int day = Integer.parseInt(numbers[1]);
            int year = Integer.parseInt(numbers[2]);


            Date date = new GregorianCalendar(month, day, year).getTime();


            PEOPLE.add(new Person(name, date));

            for(Person person : PEOPLE) {
                System.out.println(person.getName() + " " + person.getBirthDate());
            }

            br.close();

        }


    }
}
