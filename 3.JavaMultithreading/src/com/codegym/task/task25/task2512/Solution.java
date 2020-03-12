package com.codegym.task.task25.task2512;

/* 
Charting our own course

*/
public class Solution implements Thread.UncaughtExceptionHandler {



    @Override
    public void uncaughtException(Thread t, Throwable e) {
        t.interrupt();
        Throwable throwable = e.getCause();
        if(throwable != null){
            uncaughtException(t, throwable);
        }
        System.out.println(e.getClass().getName() + ": " + e.getMessage());

    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.uncaughtException(new Thread(), new Exception("ABC", new RuntimeException("DEF", new IllegalAccessException("GHI"))));
    }
}
