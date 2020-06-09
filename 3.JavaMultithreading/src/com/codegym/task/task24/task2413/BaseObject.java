package com.codegym.task.task24.task2413;


public abstract class BaseObject {

    private double x;
    private double y;
    private double radius;

    public BaseObject(double x, double y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    abstract void draw(Canvas canvas);

    abstract void move();

    boolean intersects(BaseObject o){

        // A=(x1, y1),B=(x2, y2)
        //|AB|=√(x2−x1)2+(y2−y1)2

        double dx = x - o.x;
        double dy = y - o.y;
        double distance = Math.sqrt(Math.pow(dx,2) + Math.pow(dy,2));
        //distance_between_objects <= max(radius_of_the_first_object, radius_of_the_second_object)
        return distance <= Math.max(radius,o.radius);

    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
