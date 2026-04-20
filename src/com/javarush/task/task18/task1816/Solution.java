package com.javarush.task.task18.task1816;

import java.io.*;
import java.util.*;

/* 
Английские буквы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(args[0]);
        BufferedInputStream bufferedReader = new BufferedInputStream(fileInputStream);

        List<String> alphabet = List.of("A", "B", "C", "D", "E", "F", "G", "H", "I", "J",
                "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "a", "b", "c",
                "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v",
                "w", "x", "y", "z");

        int num;
        int count = 0;

        while ((num = bufferedReader.read()) != -1) {
            String symbol = String.valueOf((char) num);
            if (alphabet.contains(symbol)) {
                count++;
            }
        }
        System.out.println(count);
        fileInputStream.close();
        bufferedReader.close();
    }
}
