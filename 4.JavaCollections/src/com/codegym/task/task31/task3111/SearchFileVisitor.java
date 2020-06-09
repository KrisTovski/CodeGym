package com.codegym.task.task31.task3111;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;
import java.util.List;

public class SearchFileVisitor extends SimpleFileVisitor<Path> {

    private List<Path> foundFiles = new ArrayList<>();

    private String partOfName;
    private String partOfContent;
    private int minSize;
    private int maxSize;

    private boolean maxSizeSet =false;
    private boolean minSizeSet = false;

    public List<Path> getFoundFiles() {
        return foundFiles;
    }

    public String getPartOfName() {
        return partOfName;
    }

    public void setPartOfName(String partOfName) {
        this.partOfName = partOfName;
    }

    public String getPartOfContent() {
        return partOfContent;
    }

    public void setPartOfContent(String partOfContent) {
        this.partOfContent = partOfContent;
    }

    public int getMinSize() {
        return minSize;
    }

    public void setMinSize(int minSize) {
        this.minSize = minSize;
    }

    public int getMaxSize() {
        return maxSize;
    }

    public void setMaxSize(int maxSize) {
        this.maxSize = maxSize;
    }

    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
        byte[] content = Files.readAllBytes(file); // File size: content.length
        String strContent = new String(content);

        boolean addFile = true;
        if (partOfName != null && !file.toString().contains(partOfName)) {
            addFile = false;
        }
        if (partOfContent != null && !strContent.toLowerCase().contains(partOfContent.toLowerCase())) {
            addFile = false;
        }
        if (maxSizeSet && content.length > maxSize) {
            addFile = false;
        }
        if (minSizeSet && content.length < minSize) {
            addFile = false;
        }
        if (addFile) {
            foundFiles.add(file);
        }


        return super.visitFile(file, attrs);
    }
}
