package com.codegym.task.task25.task2505;

/* 
No idiots

*/
public class Solution {

    public static void main(String[] args) {
        MyThread myThread = new Solution().new MyThread("super secret key");
        myThread.start();
    }

    public class MyThread extends Thread {
        private String secretKey;

        public MyThread(String secretKey) {
            this.secretKey = secretKey;
            setUncaughtExceptionHandler(new MyUncaughtExceptionHandler());
            //setDaemon(true);
        }

        @Override
        public void run() {
            throw new NullPointerException("This is an example");
        }


        private class MyUncaughtExceptionHandler implements UncaughtExceptionHandler {


            @Override
            public void uncaughtException(Thread t, Throwable e) {

                try {
                    Thread.sleep(500);
                    System.out.println(String.format("%s, %s, %s", secretKey, t.getName(), e.getMessage()));
                } catch (InterruptedException e1) {
                    e1.printStackTrace();
                }


            }
        }

    }

}

