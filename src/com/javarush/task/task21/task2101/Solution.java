package com.javarush.task.task21.task2101;

/* 
Определяем адрес сети
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
        byte[] network = new byte[ip.length];
        for (int i = 0; i < ip.length; i++) {
            network[i] = (byte) ((ip[i] & 0xFF) & (mask[i] & 0xFF));
        }
        return network;
    }

    public static void print(byte[] bytes) {
        StringBuilder sb = new StringBuilder();
        for (byte b : bytes) {
            int val = b & 0xFF;
            String binary = String.format("%8s", Integer.toBinaryString(val)).replace(' ', '0');
            sb.append(binary).append(' ');
        }
        System.out.println(sb);
    }
}
