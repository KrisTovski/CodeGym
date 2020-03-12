package com.codegym.task.task27.task2711;

import java.util.concurrent.CountDownLatch;

/* 
CountDownLatch

*/
public class Solution {

    CountDownLatch latch = new CountDownLatch(1);
    private volatile boolean isWaitingForValue = true;

    public static void main(String[] args) {

    }

    public void someMethod() throws InterruptedException {

        while (isWaitingForValue) {

            latch.await();
            retrieveValue();
            isWaitingForValue = false;
            latch.countDown();

        }
    }

    void retrieveValue() {
        System.out.println("Value retrieved.");
    }
}
