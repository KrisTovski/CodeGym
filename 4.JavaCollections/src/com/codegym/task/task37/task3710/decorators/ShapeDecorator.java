package com.codegym.task.task37.task3710.decorators;

import com.codegym.task.task37.task3710.shapes.Shape;

public abstract class ShapeDecorator implements Shape {
    private Shape decoratedShape;

    public ShapeDecorator(Shape decoratedShape) {
        this.decoratedShape = decoratedShape;
    }

    @Override
    public void draw() {
        decoratedShape.draw();
    }
}
