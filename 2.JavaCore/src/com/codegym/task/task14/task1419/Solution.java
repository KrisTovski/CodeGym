package com.codegym.task.task14.task1419;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* 
Exception invasion

*/

public class Solution {
    public static List<Exception> exceptions = new ArrayList<Exception>();

    public static void main(String[] args) {
        initExceptions();

        for (Exception exception : exceptions) {
            System.out.println(exception);
        }
    }

    private static void initExceptions() {   // The first exception
        try {
            float i = 1 / 0;

        } catch (Exception e) {
            exceptions.add(e);
        }

        try {
            String s = null;
            s.trim();
        } catch (NullPointerException e) {
            exceptions.add(e);
        }
        try {
            int[] a = new int[10];
            a[20] = 1;
        } catch (IndexOutOfBoundsException e) {
            exceptions.add(e);
        }
        try {
            Object x = new Integer(0);
            System.out.println((String)x);
        }
        catch (ClassCastException e) {
            exceptions.add(e);
        }
        try {
            Class t = Class.forName("java.lang.My");
        }
        catch (ClassNotFoundException e) {
            exceptions.add(e);
        }
        try {
            String s = "3f";
            int n = Integer.parseInt(s);
        }
        catch (NumberFormatException e) {
            exceptions.add(e);
        }
        try {
            String str = "Java Code Geeks!";
            System.out.println("Length: " + str.length());
            char ch = str.charAt(50);

        }
        catch (StringIndexOutOfBoundsException e) {
            exceptions.add(e);
        }
        try {
            FileInputStream file = new FileInputStream("test.txt");

            Scanner in = new Scanner(file, "UTF-8");

            while (in.hasNext())
                System.out.println(in.nextLine());

            file.close();
        }
        catch (FileNotFoundException e) {
            exceptions.add(e);
        } catch (IOException e) {
            e.printStackTrace();
            exceptions.add(e);
        }
        try {
            int[] v = new int[-10];
        } catch (NegativeArraySizeException e) {
            exceptions.add(e);
        }

//        10. IllegalArgumentException
        try
        {
            SimpleDateFormat sdf =  new SimpleDateFormat("test");
        }
        catch (Exception e)
        {
            exceptions.add(e);
        }

    }
}
