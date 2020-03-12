package com.codegym.task.task16.task1632;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static List<Thread> threads = new ArrayList<>(5);

    static {
        threads.add(new ThreadIndefinitely());
        threads.add(new ThreadInterrupted());
        threads.add(new ThreadHurray());
        threads.add(new ThreadMessage());
        threads.add(new ThreadNumberInput());

    }

    // Thread ONE
    public static class ThreadIndefinitely extends Thread {
        @Override
        public void run() {
            while (true) {
            }
        }
    }

    // Thread TWO
    public static class ThreadInterrupted extends Thread {
        @Override
        public void run() {
            while (true) {
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    System.out.println("InterruptedException");
                }
            }
        }
    }

    // Thread THREE
    public static class ThreadHurray extends Thread {
        @Override
        public void run() {
            while (true) {

                try {
                    System.out.println("Hurray");
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    // Thread FOUR
    public static class ThreadMessage extends Thread implements Message {
        @Override
        public void run() {
            while (!interrupted()) ;
        }

        @Override
        public void showWarning() {
            interrupt();

        }
    }

    // Thread Five
    public static class ThreadNumberInput extends Thread {
        @Override
        public void run() {
            String s;
            int result = 0;
            try {
                BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

                while (!(s = reader.readLine()).equals("N")) {
                    result += Integer.parseInt(s);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.println(result);
        }
    }


    public static void main(String[] args) {


    }
}