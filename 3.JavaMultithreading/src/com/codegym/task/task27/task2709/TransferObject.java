package com.codegym.task.task27.task2709;

public class TransferObject {
    protected volatile boolean isValuePresent = false; //use this variable
    private int value;

    public synchronized int get() {
        while (!isValuePresent) {

            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
        System.out.println("Got: " + value);
        isValuePresent = false;
        try {return value;}
        finally{
            notifyAll();
        }
    }

    public synchronized void put(int value) {
        while (isValuePresent) {
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.value = value;
        System.out.println("Put: " + value);
        isValuePresent =true;
        notifyAll();
    }
}
