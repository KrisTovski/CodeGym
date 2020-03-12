package com.codegym.task.task30.task3003;

import java.util.concurrent.TransferQueue;

public class Producer implements Runnable {
    private TransferQueue<SharedItem> queue;

    public Producer(TransferQueue<SharedItem> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        for (int i = 1; i < 10; i++) {
            if(Thread.currentThread().isInterrupted()){
                break;
            }
            System.out.format("'SharedItem-%s' added%n", i);
            this.queue.offer(new SharedItem("SharedItem-" + i,i));
            try {
                Thread.sleep(100);
                if(this.queue.hasWaitingConsumer()){
                    System.out.format("Consumer is waiting!%n");
                }
            } catch (InterruptedException e) {

            }

        }

    }
}
