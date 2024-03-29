package com.codegym.task.task21.task2101;

/* 
Determine the network address

*/
public class Solution {
    public static void main(String[] args) {
        byte[] ip = new byte[]{(byte) 192, (byte) 168, 1, 2};
        byte[] mask = new byte[]{(byte) 255, (byte) 255, (byte) 254, 0};
        byte[] netAddress = getNetAddress(ip, mask);
        print(ip);          //11000000 10101000 00000001 00000010
        print(mask);        //11111111 11111111 11111110 00000000
        print(netAddress);  //11000000 10101000 00000000 00000000
    }

    public static byte[] getNetAddress(byte[] ip, byte[] mask) {
        byte[] network = new byte[4];
        for (int i = 0; i < 4; i++) {
            network[i] = (byte) (ip[i] & mask[i]);
        }
        return network;
    }

    public static void print(byte[] bytes) {
        for (byte b : bytes) {
//            String str = Integer.toBinaryString((b & 0xFF)+ 0x100).substring(1)+" ";
//            System.out.print(str);
            String str = Integer.toBinaryString(b);
            String str1;
            if (str.length() > 8) {
                str1 = str.substring(str.length() - 8); //last 8 char
            } else {
                str1 = str;
            }
            System.out.print(String.format("%8s", str1).replace(' ', '0') + " ");


        }
    }
}
