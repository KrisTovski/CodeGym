package com.codegym.task.task29.task2909.car;

import java.util.Date;

public abstract class Car {
    static public final int TRUCK = 0;
    static public final int SEDAN = 1;
    static public final int CABRIOLET = 2;
    public static final int MAX_TRUCK_SPEED = 80;
    public static final int MAX_SEDAN_SPEED = 120;
    public static final int MAX_CABRIOLET_SPEED = 90;
    public double summerFuelConsumption;
    public double winterFuelConsumption;
    public double winterWarmingUp;
    double fuel;
    private int type;

    private boolean driverAvailable;
    private int numberOfPassengers;

    protected Car(int type, int numberOfPassengers) {
        this.type = type;
        this.numberOfPassengers = numberOfPassengers;
    }

    public static Car create(int type, int numberOfPassengers) {
        Car carInstance;
        if (type == TRUCK) {
            carInstance = new Truck(numberOfPassengers);
        } else if (type == SEDAN) {
            carInstance = new Sedan(numberOfPassengers);
        } else
            carInstance = new Cabriolet(numberOfPassengers);

        return carInstance;
    }


    public void fill(double numberOfGallons) {
        if (numberOfGallons < 0)
            throw new RuntimeException();
        fuel += numberOfGallons;

    }

    private boolean canPassengersBeCarried() {

        return isDriverAvailable() && fuel > 0;

    }

    public boolean isSummer(Date date, Date summerStart, Date summerEnd) {
        return date.after(summerStart) && date.before(summerEnd);
    }

    public double getWinterConsumption(int length) {
        return length * winterFuelConsumption + winterWarmingUp;
    }

    public double getSummerConsumption(int length) {
        return length * summerFuelConsumption;
    }

    public double getTripConsumption(Date date, int length, Date summerStart, Date summerEnd) {
        double consumption;
        if (!isSummer(date, summerStart, summerEnd)) {
            consumption = getWinterConsumption(length);
        } else {
            consumption = getSummerConsumption(length);
        }
        return consumption;
    }

    public int getNumberOfPassengersThatCanBeCarried() {
//        if (!isDriverAvailable())
//            return 0;
//        if (fuel <= 0)
//            return 0;
        if (!canPassengersBeCarried()) {
            return 0;
        }
        return numberOfPassengers;
    }

    public boolean isDriverAvailable() {
        return driverAvailable;
    }

    public void setDriverAvailable(boolean driverAvailable) {
        this.driverAvailable = driverAvailable;
    }

    public void startMoving() {
        if (numberOfPassengers > 0) {
            fastenPassengerBelts();
        }
        fastenDriverBelt();

    }

    public void fastenPassengerBelts() {
    }

    public void fastenDriverBelt() {
    }

    abstract public int getMaxSpeed();
}