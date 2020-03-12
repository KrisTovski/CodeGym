package com.codegym.task.task34.task3410.view;

import com.codegym.task.task34.task3410.controller.EventListener;
import com.codegym.task.task34.task3410.model.Direction;
import com.codegym.task.task34.task3410.model.GameObject;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.Set;

public class Board extends JPanel {
    private View view;
    private EventListener eventListener;

    public class KeyHandler extends KeyAdapter{

        @Override
        public void keyPressed(KeyEvent e) {
            switch(e.getKeyCode()){
                case (KeyEvent.VK_LEFT):
                    eventListener.move(Direction.LEFT);
                    break;
                case (KeyEvent.VK_RIGHT):
                    eventListener.move(Direction.RIGHT);
                    break;
                case (KeyEvent.VK_UP):
                    eventListener.move(Direction.UP);
                    break;
                case (KeyEvent.VK_DOWN):
                    eventListener.move(Direction.DOWN);
                    break;
                case (KeyEvent.VK_R):
                    eventListener.restart();
                    break;
            }
        }
    }


    public Board(View view) {
        this.view = view;
        KeyHandler keyHandler = new KeyHandler();
        this.addKeyListener(keyHandler);
        this.setFocusable(true);
    }

    @Override
    public void paint(Graphics g) {
        g.setColor(Color.BLACK);
        g.fillRect(0, 0, 500, 500);
        Set<GameObject> gameObjects = view.getGameObjects().getAll();
        for(GameObject gameObject : gameObjects){
            gameObject.draw(g);
        }
    }

    public void setEventListener(EventListener eventListener){
        this.eventListener = eventListener;
    }
}
