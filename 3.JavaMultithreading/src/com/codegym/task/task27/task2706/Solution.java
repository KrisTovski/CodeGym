package com.codegym.task.task27.task2706;


/*
Eliminating deadlock

*/
public class Solution {
    public static void main(String[] args) {
        final Object o1 = new Object();
        final Object o2 = new Object();
        final Solution solution = new Solution();

        new Thread() {
            @Override
            public void run() {
                solution.safeMethod(o1, o2);
            }
        }.start();

        new Thread() {
            @Override
            public void run() {
                solution.safeMethod(o2, o1);
            }
        }.start();
    }

    public void safeMethod(Object obj1, Object obj2) {
        Object objectA = obj1.hashCode() < obj2.hashCode() ? obj1 : obj2;
        Object objectB = obj1.hashCode() < obj2.hashCode() ? obj2 : obj1;

        synchronized (objectA) {
            longTimeMethod();
            synchronized (objectB) {
                unsafeMethod(obj1, obj2);
            }
        }
    }

    public void longTimeMethod() {
        try {
            Thread.sleep(100);
        } catch (InterruptedException ignored) {
        }
    }

    protected void unsafeMethod(Object obj1, Object obj2) {
        System.out.println(obj1 + " " + obj2);
    }
}
