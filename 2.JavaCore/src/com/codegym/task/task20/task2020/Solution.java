package com.codegym.task.task20.task2020;

import java.io.*;
import java.util.logging.Logger;

/* 
Serializing people

*/
public class Solution {

    public static class Person implements Serializable {
        String firstName;
        String lastName;
        transient String fullName;
        transient final String greeting;
        String country;
        Sex sex;
        transient PrintStream outputStream;
        transient Logger logger;

        Person(String firstName, String lastName, String country, Sex sex) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.fullName = String.format("%s, %s", lastName, firstName);
            this.greeting = "Hello, ";
            this.country = country;
            this.sex = sex;
            this.outputStream = System.out;
            this.logger = Logger.getLogger(String.valueOf(Person.class));
        }
    }

    enum Sex {
        MALE,
        FEMALE
    }

    public static void main(String[] args) throws IOException {
        // Create our object

        Person John = new Person("John", "Bravo", "USA", Sex.MALE);

        // Create 2 streams to serialize the object and save it to a file
        FileOutputStream outputStream = new FileOutputStream("C:\\Users\\Username\\Desktop\\save.ser");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);

        // Save the game to a file
        objectOutputStream.writeObject(John);

        // Close the stream and release resources
        objectOutputStream.close();

    }
}
