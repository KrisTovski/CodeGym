package com.codegym.task.task21.task2113;

import java.util.ArrayList;
import java.util.List;

public class Hippodrome {
    public static void main(String[] args) throws InterruptedException {
        game = new Hippodrome(new ArrayList<>());

        Horse horse1 = new Horse("Plotka", 3, 0);
        Horse horse2 = new Horse("Siwek", 3, 0);
        Horse horse3 = new Horse("Kobylka", 3, 0);

        game.getHorses().add(horse1);
        game.getHorses().add(horse2);
        game.getHorses().add(horse3);

        game.run();
        game.printWinner();


    }

    private List<Horse> horses;

    public List<Horse> getHorses() {
        return horses;
    }

    Hippodrome(List<Horse> horses) {
        this.horses = horses;
    }

    public static Hippodrome game;

    void run() throws InterruptedException {
        for (int i = 0; i < 100; i++) {
            move();
            print();
            Thread.sleep(200);
        }

    }

    public void move() {
        for (Horse horse : getHorses()) {
            horse.move();
        }

    }

    public void print() {
        for (Horse horse : getHorses()) {
            horse.print();
        }

        for (int i = 0; i < 10; i++) {
            System.out.println();
        }


    }
    public Horse getWinner(){
        double maxDistance = 0;
        Horse winner = null;
        for(Horse h : getHorses()){
            if(h.getDistance() > maxDistance){
                maxDistance = h.getDistance();
                winner = h;
            }
        }
    return winner;
    }

    public void printWinner(){
        System.out.println("The winner is " + getWinner().getName() +"!");

    }



}
