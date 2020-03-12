package com.codegym.task.task29.task2909.human;

import java.util.ArrayList;
import java.util.List;

public class University {

    private String name;
    private int age;
    private List<Student> students = new ArrayList<>();
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }




    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }



    public University(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Student getStudentWithAverageGrade(double averageGrade) {
        // TODO:
        Student studentWithAverageGrade = null;
        for(Student student : students){
            if(student.getAverageGrade() == averageGrade){
                studentWithAverageGrade = student;
                break;
            }
        }

        return studentWithAverageGrade;
    }

    public Student getStudentWithHighestAverageGrade() {
        // TODO:
        double maxGrade = 0;
        for(Student student : students){
            if(student.getAverageGrade()>maxGrade){
                maxGrade = student.getAverageGrade();
            }
        }

        return getStudentWithAverageGrade(maxGrade);
    }

    public Student getStudentWithLowestAverageGrade() {
        double min = Double.MAX_VALUE;
        Student studentWithLowestAverageGrade = null;
        for (Student student : students) {
            if (student.getAverageGrade() < min) {
                min = student.getAverageGrade();
                studentWithLowestAverageGrade = student;
            }
        }
        return studentWithLowestAverageGrade;
    }



    public void expel(Student student){
        students.remove(student);
    }
}