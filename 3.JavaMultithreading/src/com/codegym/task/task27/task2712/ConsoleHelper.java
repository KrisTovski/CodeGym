package com.codegym.task.task27.task2712;

import com.codegym.task.task27.task2712.kitchen.Dish;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class ConsoleHelper {
    private static BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    public static void writeMessage(String message){
        System.out.println(message);

    }

    public static String readString(){
        while (true){
            try {
                return bufferedReader.readLine();
            } catch (IOException e) {
                writeMessage("An error occurred while trying to enter text. Try again.");
            }
        }

    }

    public static List<Dish> getAllDishesForOrder(){
        writeMessage(Dish.allDishesToString());
        writeMessage("Choose dishes. Type 'exit' to finish.");
        List<Dish> tempDishes = new ArrayList<>();
        while (true) {
            String dish = readString();
            if(dish.equalsIgnoreCase("exit")){
                break;
            }
            try{
                tempDishes.add(Dish.valueOf(dish));
            }catch (Exception e){
                writeMessage("This dish is not on the menu");
            }

        } return tempDishes;
    }
}
