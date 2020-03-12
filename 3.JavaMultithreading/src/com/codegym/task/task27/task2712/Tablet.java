package com.codegym.task.task27.task2712;

import com.codegym.task.task27.task2712.kitchen.Order;

import java.io.IOException;
import java.util.Observable;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Tablet extends Observable {
    private static Logger logger = Logger.getLogger(Tablet.class.getName());

    final int number;

    public Tablet(int number) {
        this.number = number;
    }

    public void createOrder(){
        try{
            Order order = new Order(this);
            ConsoleHelper.writeMessage(order.toString());
        }catch (Exception e) {
            logger.log(Level.SEVERE, "The console is unavailable.");
            return;
        }
        setChanged();
        notifyObservers(this);
    }

    @Override
    public String toString() {
                return "Tablet{" +
                "number=" + number +
                '}';


    }
}
