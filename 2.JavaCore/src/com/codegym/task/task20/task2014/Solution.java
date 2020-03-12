package com.codegym.task.task20.task2014;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;

/* 
Serializable Solution

*/
public class Solution implements Serializable {
    private static final long serialVersionUID = 1L;

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        System.out.println(new Solution(4));
        FileOutputStream fileOutputStream = new FileOutputStream("C:\\Users\\MASH ROOMS\\Desktop\\save.ser");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        Solution solution = new Solution(12);
        objectOutputStream.writeObject(solution);
        objectOutputStream.close();

        FileInputStream fileInputStream = new FileInputStream("C:\\Users\\MASH ROOMS\\Desktop\\save.ser");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        Solution solution1 = (Solution) objectInputStream.readObject();
        System.out.println(solution1);
        objectInputStream.close();


    }

    private transient final String pattern = "dd MMMM yyyy, EEEE";
    private transient Date currentDate;
    private transient int temperature;
    String string;

    public Solution(int temperature) {
        this.currentDate = new Date();
        this.temperature = temperature;

        string = "Today is %s, and the current temperature is %s C";
        SimpleDateFormat format = new SimpleDateFormat(pattern);
        this.string = String.format(string, format.format(currentDate), temperature);
    }

    @Override
    public String toString() {
        return this.string;
    }
}
