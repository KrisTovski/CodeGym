package com.codegym.task.task29.task2909.human;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Human implements Alive {
    private static int nextId = 0;
    private int id;
    protected int age;
    protected String name;
    // protected int course;

    public class Size {
        public int height;
        public int weight;


    }
    protected Size size = new Size();
//    protected int[] size;

    // protected boolean isSoldier;

//    public static final int FIRST = 1;
//    public static final int SECOND = 2;
//    public static final int THIRD = 3;
//    public static final int FOURTH = 4;
//    private int bloodType;

    private BloodType bloodType;

    public BloodType getBloodType() {
        return bloodType;
    }

    public void setBloodType(BloodType code) {
        bloodType = code;
    }

    private List<Human> children = new ArrayList<>();



//    public void setBloodType(int code) {
//        bloodType = code;
//    }
//
//    public int getBloodType() {
//        return bloodType;
//    }

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
        this.id = nextId;
        nextId++;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

//    public int getCourse() {
//        return course;
//    }

//    public void live() {
//        if (isSoldier)
//            fight();
//    }
//
//    public void fight() {
//    }

    public int getId() {
        return id;
    }

//    public void setId(int id) {
//        this.id = id;
//    }

    public void printSize() {
        System.out.println("Height: " + size.height + " Weight: " + size.weight);
    }

    public List<Human> getChildren() {
        return Collections.unmodifiableList(children);
    }

    public void addChild(Human human) {
        children.add(human);
    }

    public void removeChild(Human human) {
        children.remove(human);
    }


    @Override
    public void live() {

    }

    public String getPosition() {
        return "Person";
    }

    public void printData() {
        System.out.println(getPosition() + ": " + name);
    }
}