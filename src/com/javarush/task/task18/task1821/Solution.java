package com.javarush.task.task18.task1821;

import java.io.*;
import java.util.*;

/* 
Встречаемость символов
*/

public class Solution {
    public static void main(String[] args) throws IOException {

        try (FileInputStream fileInputStream = new FileInputStream("d:\\FILE_NAME.txt");
             BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream)) {
            TreeMap<Character, Integer> printMap = new TreeMap<>();

            int symbol;
            while ((symbol = bufferedInputStream.read()) != -1) {
                char i = (char) symbol;
                if (printMap.containsKey(i)) {
                    printMap.put(i, printMap.get(i)+1);
                } else {
                    printMap.put(i, 1);
                }
            }

            for (Map.Entry<Character, Integer> print : printMap.entrySet()) {
                System.out.println(print.getKey() + " " + print.getValue());
            }
        }
    }
}
