package com.codegym.task.task17.task1711;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
CRUD 2

*/

public class Solution {
    public static volatile List<Person> allPeople = new ArrayList<>();
    public static SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM dd yyyy", Locale.ENGLISH);

    static {
        allPeople.add(Person.createMale("Donald Chump", new Date()));  // id=0
        allPeople.add(Person.createMale("Larry Gates", new Date()));  // id=1
    }

    public static void main(String[] args) throws ParseException {
         // Start here
        switch (args[0]) {
            case "-c":
                synchronized (allPeople) {

                    for (int i = 1; i < args.length; i += 3) {
                        create(args[i], args[i + 1], args[i + 2]);

                    }
                    break;
                }

            case "-u":
                synchronized (allPeople) {

                    for (int i = 1; i < args.length; i += 4) {
                        update(args[i], args[i + 1], args[i + 2], args[i + 3]);

                    }
                    break;
                }

            case "-d":
                synchronized (allPeople) {

                    for (int i = 1; i < args.length; i++) {
                        delete(args[i]);

                    }
                    break;
                }

            case "-i":
                synchronized (allPeople) {

                    for (int i = 1; i < args.length; i++) {
                        displayInformation(args[i]);

                    }
                    break;
                }
        }


    }


    public static void create(String name, String sex, String date) throws ParseException {
        if (sex.equals("m")) {
            allPeople.add(Person.createMale(name, simpleDateFormat.parse(date)));
        } else if (sex.equals("f")) {
            allPeople.add(Person.createFemale(name, simpleDateFormat.parse(date)));
        }
        System.out.println(allPeople.size() - 1);
    }

    public static void update(String id, String name, String sex, String date) throws ParseException {
        int index = Integer.parseInt(id);
        allPeople.get(index).setName(name);
        if (sex.equals("m")) {
            allPeople.get(index).setSex(Sex.MALE);
        } else if (sex.equals("f")) {
            allPeople.get(index).setSex(Sex.FEMALE);
        }
        allPeople.get(index).setBirthDate(simpleDateFormat.parse(date));
    }

    public static void delete(String id) {
        int index = Integer.parseInt(id);
        allPeople.get(index).setName(null);
        allPeople.get(index).setSex(null);
        allPeople.get(index).setBirthDate(null);
    }

    public static void displayInformation(String id) {
        SimpleDateFormat sdf = new SimpleDateFormat("MMM dd yyyy", Locale.ENGLISH);
        int index = Integer.parseInt(id);
        Person person = allPeople.get(index);
        if (person.getSex() == Sex.MALE) {
            System.out.println(person.getName() + " m " + sdf.format(person.getBirthDate()));
        } else
            System.out.println(person.getName() + " f " + sdf.format(person.getBirthDate()));
    }
//    switch (args[0]) {
//
//        case "-c":
//            synchronized (allPeople) {
//                for (int i = 1; i < args.length; i = i + 3) {
//                    {
//                        cParam(args[i], args[i + 1], args[i + 2]);
//                    }
//                }
//            }
//            break;
//        case "-u":
//            synchronized (allPeople) {
//                for (int i = 1; i < args.length; i = i + 4) {
//                    uParam(args[i], args[i + 1], args[i + 2], args[i + 3]);
//                }
//            }
//            break;
//        case "-d":
//            synchronized (allPeople) {
//                for (int i = 1; i < args.length; i++) {
//                    dParam(args[i]);
//                }
//            }
//            break;
//        case "-i":
//            synchronized (allPeople) {
//                for (int i = 1; i < args.length; i++) {
//                    iParam(args[i]);
//                }
//            }
//            break;
//    }
//}
//
//    static Date simpleDataFormat(String date) {
//        SimpleDateFormat format = new SimpleDateFormat("MM dd yyyy", Locale.ENGLISH);
//        Date tempDate = new Date();
//        try {
//            tempDate = format.parse(date);
//        } catch (ParseException e) {
//        }
//        return tempDate;
//    }
//
//    static void cParam(String name, String sex, String bd) {
//
//        if (sex.equals("m")) {
//            allPeople.add(Person.createMale(name, simpleDataFormat(bd)));
//        } else if (sex.equals("f")) {
//            allPeople.add(Person.createFemale(name, simpleDataFormat(bd)));
//        }
//        System.out.println(allPeople.size() - 1);
//    }
//
//    static void uParam(String id, String name, String sex, String bd) {
//
//        int index = Integer.parseInt(id);
//        allPeople.get(index).setName(name);
//        if (sex.equals("m")) {
//            allPeople.get(index).setSex(Sex.MALE);
//        } else if (sex.equals("f")) {
//            allPeople.get(index).setSex(Sex.FEMALE);
//        }
//        allPeople.get(index).setBirthDate(simpleDataFormat(bd));
//    }
//
//    static void dParam(String id) {
//        int index = Integer.parseInt(id);
//        allPeople.get(index).setName(null);
//        allPeople.get(index).setSex(null);
//        allPeople.get(index).setBirthDate(null);
//    }
//
//    static void iParam(String id) {
//        int index = Integer.parseInt(id);
//        String name = allPeople.get(index).getName();
//        String sex;
//        if (allPeople.get(index).getSex().equals("MALE")) {
//            sex = "m";
//        } else {
//            sex = "f";
//        }
//        SimpleDateFormat outputDate = new SimpleDateFormat("MMM dd yyyy", Locale.ENGLISH);
//        String newDate = outputDate.format(allPeople.get(index).getBirthDate());
//        System.out.println(name + " " + sex + " " + newDate);
//    }
}
