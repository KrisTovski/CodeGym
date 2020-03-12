package com.codegym.task.task30.task3010;

/* 
Smallest possible radix

*/

import java.math.BigDecimal;
import java.math.BigInteger;

public class Solution {
    public static void main(String[] args) {
        //write your code here
        try {
            for (int i = 2; i < 37; i++) {
                if (isNumber(args[0], i)) {
                    System.out.println(i);
                    break;
                } else {
                    if (i == 36) System.out.println("Invalid");
                }
            }
        } catch (Exception e) {
        }
    }

    public static boolean isNumber(String arg, int radix) {
        boolean result = false;
        try {
            new BigDecimal(new BigInteger(arg, radix));
            result = true;
        } catch (Exception e) {
        }
        return result;

    }

//     try {
//        if (args.length != 0 && args.length < 256) {
//            System.out.println(getRadix(args[0]));
//        }
//    } catch (Exception e) {
//
//    }
//}
//
//    private static String getRadix(String number) {
//        TreeSet<Integer> result = new TreeSet<>();
//        for (int i = 2; i <= 36; i++) {
//            try {
//                BigInteger bigInteger = new BigInteger(number, i);
//                result.add(i);
//            } catch (NumberFormatException e) {
//            }
//        }
//        return result.isEmpty() ? "incorrect" : String.valueOf(result.first());
//    }






}