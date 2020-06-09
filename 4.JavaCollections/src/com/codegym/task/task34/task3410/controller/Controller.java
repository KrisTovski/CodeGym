package com.codegym.task.task34.task3410.controller;

import com.codegym.task.task34.task3410.model.Model;
import com.codegym.task.task34.task3410.view.View;

public class Controller {
    private View view;
    private Model model;

    public static void main(String[] args) {
        Controller controller = new Controller();
        
    }

    public Controller() {
        view = new View(this);
        view.init();
        model = new Model();
    }
}
