package com.codegym.task.task34.task3410.model;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.util.HashSet;
import java.util.Set;

public class LevelLoader {

    private Path levels;

    public LevelLoader(Path levels) {
        this.levels = levels;
    }

    public GameObjects getLevel(int level) {
//        Player player = new Player(3*Model.BOARD_CELL_SIZE/2, 3*Model.BOARD_CELL_SIZE/2);
//        Set<StorageLocation> storageLocations = new HashSet<>();
//        Set<Box> boxes = new HashSet<>();
//        Set<Wall> walls = new HashSet<>();
//        storageLocations.add(new StorageLocation(7*Model.BOARD_CELL_SIZE/2, 5*Model.BOARD_CELL_SIZE/2));
//        boxes.add(new Box(7*Model.BOARD_CELL_SIZE/2, 11*Model.BOARD_CELL_SIZE/2));
//        walls.add(new Wall(9*Model.BOARD_CELL_SIZE/2, 13*Model.BOARD_CELL_SIZE/2));
//        walls.add(new Wall(11*Model.BOARD_CELL_SIZE/2, 15*Model.BOARD_CELL_SIZE/2));
//        GameObjects result = new GameObjects(walls, boxes, storageLocations, player);
//        return result;

        Player player = null;
        Set<StorageLocation> storageLocations = new HashSet<>();
        Set<Box> boxes = new HashSet<>();
        Set<Wall> walls = new HashSet<>();

        int loopLevel;
        if (level > 60) {
            loopLevel = level % 60;
        } else {
            loopLevel = level;
        }
        try (BufferedReader reader = new BufferedReader(new FileReader(levels.toFile()))) {
            int readLevel = 0;
            int x;
            int y = Model.BOARD_CELL_SIZE / 2;
            boolean isLevelMap = false;
            String line;
            while ((line = reader.readLine()) != null) {
                if (line.contains("Maze:")) {
                    readLevel = Integer.valueOf(line.split(" ")[1]);
                    continue;
                }
                if (readLevel == loopLevel) {
                    if (line.length() == 0) {
                        boolean isEnd = isLevelMap;

                        isLevelMap = !isLevelMap;

                        if (isEnd && !isLevelMap) {
                            break;
                        } else {
                            continue;
                        }
                    }
                    if (isLevelMap) {
                        x = Model.BOARD_CELL_SIZE / 2;

                        char[] chars = line.toCharArray();
                        for (char c : chars) {
                            switch (c) {
                                case 'X':
                                    walls.add(new Wall(x, y));
                                    break;
                                case '*':
                                    boxes.add(new Box(x, y));
                                    break;
                                case '.':
                                    storageLocations.add(new StorageLocation(x, y));
                                    break;
                                case '&':
                                    boxes.add(new Box(x, y));
                                    storageLocations.add(new StorageLocation(x, y));
                                    break;
                                case '@':
                                    player = new Player(x, y);
                            }
                            x += Model.BOARD_CELL_SIZE;
                        }
                        y += Model.BOARD_CELL_SIZE;
                    }
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return new GameObjects(walls, boxes, storageLocations, player);
    }
}
