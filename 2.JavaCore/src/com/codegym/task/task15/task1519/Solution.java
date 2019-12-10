package com.codegym.task.task15.task1519;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/* 
Different methods for different types

*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String s;
        while (true) {
            s = reader.readLine();
            if ("exit".equals(s))
                break;

            try {
                if (s.contains(".") ) {
                    Double value = Double.parseDouble(s);
                    print(value);
                    continue;
                }

                int value = Integer.parseInt(s);
                if (value > 0 && value <128) {
                    print((short)value);
                    continue;
                }

                if (value >= 128 || value <= 0) {
                    print(value);
                    continue;
                }
            } catch (NumberFormatException e) {
            }

            print(s);
        }
//not working:
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        String s;
//        while (true) {
//            s = reader.readLine();
//            if (s.equals("exit")) {
//                break;
//            }
//
//            if (s.contains(".")) {
//                Double v = Double.parseDouble(s);
//                print(v);
//                continue;
//            }
//            int i = Integer.parseInt(s);
//            if (i > 0 && i < 128) {
//                print((short) i);
//                continue;
//
//            }
//            if (i >= 128 || i <= 0) {
//                print(i);
//                continue;
//            } else print(s);
//        }
    }

    public static void print(Double value) {
        System.out.println("This is a Double. Value: " + value);
    }

    public static void print(String value) {
        System.out.println("This is a String. Value: " + value);
    }

    public static void print(short value) {
        System.out.println("This is a short. Value: " + value);
    }

    public static void print(Integer value) {
        System.out.println("This is an Integer. Value: " + value);
    }
}
