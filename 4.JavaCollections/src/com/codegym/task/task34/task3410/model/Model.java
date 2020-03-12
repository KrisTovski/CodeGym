package com.codegym.task.task34.task3410.model;

import com.codegym.task.task34.task3410.controller.EventListener;

import java.io.File;
import java.nio.file.Paths;

public class Model {
    public static final int BOARD_CELL_SIZE = 20;
    private EventListener eventListener;
    private GameObjects gameObjects;
    private int currentLevel = 1;
    private LevelLoader levelLoader = new LevelLoader(Paths.get("C:\\Projects\\CodeGym\\CodeGymTasks\\4.JavaCollections\\src\\com\\codegym\\task\\task34\\task3410\\res\\levels.txt"));


    public void setEventListener(EventListener eventListener) {
        this.eventListener = eventListener;
    }

    public GameObjects getGameObjects() {
        return gameObjects;
    }

    public void restartLevel(int level) {
        this.gameObjects = levelLoader.getLevel(level);
    }

    public void restart() {
        restartLevel(currentLevel);
    }

    public void startNextLevel() {
        currentLevel++;
        restartLevel(currentLevel);
    }

    public void move(Direction direction) {
        Player player = gameObjects.getPlayer();

        if (checkWallCollision(player, direction)) return;

        if (checkBoxCollisionAndMoveIfAvaliable(direction)) return;

        switch (direction) {
            case LEFT:
                player.move(-BOARD_CELL_SIZE, 0);
                break;
            case RIGHT:
                player.move(BOARD_CELL_SIZE, 0);
                break;
            case UP:
                player.move(0, -BOARD_CELL_SIZE);
                break;
            case DOWN:
                player.move(0, BOARD_CELL_SIZE);
                break;
        }
        checkCompletion();
    }

    public boolean checkWallCollision(CollisionObject gameObject, Direction direction) {
        for (Wall wall : gameObjects.getWalls()) {
            if (gameObject.isCollision(wall, direction))
                return true;
        }
        return false;

    }

    public boolean checkBoxCollisionAndMoveIfAvaliable(Direction direction) {
        Player player = gameObjects.getPlayer();
        GameObject stoped = null;
        for (GameObject gameObject : gameObjects.getAll()) {
            if (!(gameObject instanceof Player) && !(gameObject instanceof StorageLocation) && player.isCollision(gameObject, direction)) {
                stoped = gameObject;
            }
        }

        if ((stoped == null)) {
            return false;
        }

        if (stoped instanceof Box) {
            Box stopedBox = (Box) stoped;
            if (checkWallCollision(stopedBox, direction)) {
                return true;
            }
            for (Box box : gameObjects.getBoxes()) {
                if (stopedBox.isCollision(box, direction)) {
                    return true;
                }
            }

            switch (direction) {
                case LEFT:
                    stopedBox.move(-BOARD_CELL_SIZE, 0);
                    break;
                case RIGHT:
                    stopedBox.move(BOARD_CELL_SIZE, 0);
                    break;
                case UP:
                    stopedBox.move(0, -BOARD_CELL_SIZE);
                    break;
                case DOWN:
                    stopedBox.move(0, BOARD_CELL_SIZE);
            }
        }
        return false;

    }

    public void checkCompletion() {
        boolean isLevelCompleted = true;
        for (StorageLocation home : gameObjects.getStorageLocations()) {
            boolean chk = false;

            for (Box box : gameObjects.getBoxes()) {
                if ((box.getX() == home.getX()) && (box.getY() == home.getY()))
                    chk = true;
            }
            if (!chk) isLevelCompleted = false;
        }

        if (isLevelCompleted)
            eventListener.levelCompleted(currentLevel);

    }

}
