package com.codegym.task.task29.task2909.human;

import java.util.ArrayList;
import java.util.List;

public class StudentDatabase {
    public static List<Student> students = new ArrayList<>();

    public static void addStudentInfo(Student student) {
        // Student student = new Student(name, age, averageGrade);
        students.add(student);
        printStudentInfo(student);

    }

    public static void printStudentInfo(Student student) {
        System.out.println("Name: " + student.getName() + " Age: " + student.getAge());
    }

    public static void removeStudent(int index) {
        if (index >= 0 && index < students.size())
            students.remove(index);
    }

    public static void findJohnOrAlex() {
        // boolean found = false;
        for (int i = 0; i < students.size(); i++) {
            //   if (!found) {
            if (students.get(i).getName().equals("John")) {
                System.out.println("John is in the student database.");
                //         found = true;
                break;
            }

            if (students.get(i).getName().equals("Alex")) {
                System.out.println("Alex is in the student database.");
                //       found = true;
                break;

            }
        }
    }
}