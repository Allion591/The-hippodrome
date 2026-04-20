package com.javarush.task.task19.task1924;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* 
Замена чисел
*/

public class Solution {
    public static Map<Integer, String> map = new HashMap<Integer, String>();

    static {
        map.put(0, "ноль");
        map.put(1, "один");
        map.put(2, "два");
        map.put(3, "три");
        map.put(4, "четыре");
        map.put(5, "пять");
        map.put(6, "шесть");
        map.put(7, "семь");
        map.put(8, "восемь");
        map.put(9, "девять");
        map.put(10, "десять");
        map.put(11, "одиннадцать");
        map.put(12, "двенадцать");
    }

    public static void main(String[] args) throws IOException {
        String fileName;
    try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
        fileName = reader.readLine();
    }

    try (BufferedReader fileReader = new BufferedReader(new FileReader(fileName))) {
        String line;
        while ((line = fileReader.readLine()) != null) {
            String[] parts = line.split(" ");
            StringBuilder stringBuilder = new StringBuilder();

            for (String s : parts) {
                if (s.matches(".*\\d.*")) {
                    String punct = "";
                    if (s.matches(".*\\p{Punct}.*")) {
                        punct = correctNum(s);
                        s = s.replaceAll("[^\\p{L}\\p{N}\\s]", "");
                    }

                    try {
                        int val = Integer.parseInt(s);
                        if (map.containsKey(val)) {
                            s = map.get(val) + punct;
                        }
                    } catch (NumberFormatException e) {
                        s = s + punct;
                    }
                }
                stringBuilder.append(s + " ");
            }
            System.out.println(stringBuilder);
        }
    }
    }

    public static String correctNum(String word) {
        String[] parts = word.split("");
        String punct = parts[parts.length - 1];
        return punct;
    }
}
