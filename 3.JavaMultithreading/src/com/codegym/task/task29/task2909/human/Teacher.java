package com.codegym.task.task29.task2909.human;

import java.util.ArrayList;
import java.util.List;

public class Teacher extends UniversityPerson {
    // private List<Human> children = new ArrayList<>();
    private int numberOfStudents;
//    private String university;

    public Teacher(String name, int age, int numberOfStudents) {
        super(name, age);
        this.numberOfStudents = numberOfStudents;
    }

//    public List<Human> getChildren() {
//        return children;
//    }

//    public void setChildren(List<Human> children) {
//        this.children = children;
//    }

    public void live() {
        teach();
    }

    public void teach() {
    }

//    public String getUniversity() {
//        return university;
//    }
//
//    public void setUniversity(String university) {
//        this.university = university;
//    }

//    public void printData() {
//        System.out.println(getPosition() +": " + name);
//    }

    @Override
    public String getPosition() {
        return "Teacher";
    }
}