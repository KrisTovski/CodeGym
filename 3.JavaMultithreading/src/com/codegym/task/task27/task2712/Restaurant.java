package com.codegym.task.task27.task2712;

import com.codegym.task.task27.task2712.kitchen.Cook;

public class Restaurant {
    public static void main(String[] args) {
        Tablet tablet = new Tablet(5);
        for(int i=0; i<4;i++) {
            tablet.createOrder();
        }
        Cook cook = new Cook("Amigo");



    }
}
