package com.codegym.task.task14.task1415;



/* 
Janitorial services

*/

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        List<Apartment> apartments = new ArrayList<>();
        apartments.add(new OneRoomApt());
        apartments.add(new TwoRoomApt());
        apartments.add(new ThreeRoomApt());

        cleanAllApartments(apartments);
    }

    public static void cleanAllApartments(List<Apartment> apartments) {
        for (Apartment room : apartments) {
            if (room instanceof OneRoomApt) ((OneRoomApt) room).clean1Room();
            if (room instanceof TwoRoomApt) ((TwoRoomApt) room).clean2Rooms();
            if (room instanceof ThreeRoomApt) {
                ((ThreeRoomApt) room).clean3Rooms();

            }
        }

    }

    static interface Apartment {
    }

    static class OneRoomApt implements Apartment {
        void clean1Room() {
            System.out.println("1 room has been cleaned");
        }
    }

    static class TwoRoomApt implements Apartment {
        void clean2Rooms() {
            System.out.println("2 rooms have been cleaned");
        }
    }

    static class ThreeRoomApt implements Apartment {
        void clean3Rooms() {
            System.out.println("3 rooms have been cleaned");
        }
    }
}
