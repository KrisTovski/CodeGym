package com.codegym.task.task25.task2506;

public class LoggingStateThread extends Thread {

   private Thread thread;

    public LoggingStateThread(Thread thread){
        this.thread = thread;

   }

   @Override
    public void run() {
        State lastState = null;
        State newState;
        do{
            newState = thread.getState();
            if(newState != lastState){
                System.out.println(newState);
                lastState = newState;
            }
        }while (newState != State.TERMINATED);

    }
}
