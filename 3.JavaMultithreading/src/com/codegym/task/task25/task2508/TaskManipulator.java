package com.codegym.task.task25.task2508;

public class TaskManipulator implements Runnable, CustomThreadManipulator {

    private Thread thread;

    @Override
    public void run() {

        try {
            while (!thread.isInterrupted()) {
               // thread.sleep(0);
                System.out.println(thread.currentThread().getName());
                thread.sleep(100);
            }
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void start(String threadName) {
        this.thread = new Thread(this);
        this.thread.setName(threadName);
        this.thread.start();


    }

    @Override
    public void stop() {
        this.thread.interrupt();

    }
}
