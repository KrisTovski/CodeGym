package com.codegym.task.task17.task1710;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
CRUD

*/

public class Solution {
    public static List<Person> allPeople = new ArrayList<>();
    public static SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM dd yyyy", Locale.ENGLISH);

    static {
        allPeople.add(Person.createMale("Donald Chump", new Date()));  // id=0
        allPeople.add(Person.createMale("Larry Gates", new Date()));  // id=1
    }

    public static void main(String[] args) throws ParseException {


        switch (args[0]) {
            case "-c":
                create(args[1], args[2], args[3]);
                break;

            case "-u":
                update(getID(args[1]), args[2], args[3], args[4]);
                break;

            case "-d":
                delete(getID(args[1]));
                break;

            case "-i":
                information(getID(args[1]));
                break;


        }



    }

    // Changing String id to int id
    public static int getID(String stringId) {
        int id = 0;
        try {
            id = Integer.parseInt(stringId);
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
        return id;
    }


    public static void create(String name, String sex, String date) throws ParseException {
        if (sex.equals("m")) {
            allPeople.add(Person.createMale(name, simpleDateFormat.parse(date)));
        } else if (sex.equals("f")) {
            allPeople.add(Person.createFemale(name, simpleDateFormat.parse(date)));
        }
        System.out.println(allPeople.size() - 1);
    }

    public static void update(int id, String name, String sex, String date) throws ParseException {
        Person person = allPeople.get(id);
        person.setName(name);
        if (sex.equals("m")) {
            person.setSex(Sex.MALE);
        } else if (sex.equals("f")) {
            person.setSex(Sex.FEMALE);
        }
        person.setBirthDate(simpleDateFormat.parse(date));

    }

    public static void delete(int id) {
        Person person = allPeople.get(id);
        person.setName(null);
        person.setSex(null);
        person.setBirthDate(null);
    }

    public static void information(int id) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MMM dd yyyy", Locale.ENGLISH);
        Person person = allPeople.get(id);
        if (person.getSex() == Sex.MALE) {
            System.out.println(person.getName() + " m " + simpleDateFormat.format(person.getBirthDate()));
        } else {
            System.out.println(person.getName() + " f " + simpleDateFormat.format(person.getBirthDate()));
        }
    }


}
