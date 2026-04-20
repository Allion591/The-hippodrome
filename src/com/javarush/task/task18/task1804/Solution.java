package com.javarush.task.task18.task1804;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.*;

/* 
Самые редкие байты
*/

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String fileName = reader.readLine();

        FileInputStream inputStream = new FileInputStream(fileName);

        List<Integer> values = new ArrayList<>();

        while (inputStream.available() != 0) {
            int current = inputStream.read();
            values.add(current);
        }

        reader.close();
        inputStream.close();

        Map<Integer, Integer> repeats = new HashMap<>();

        for (int i = 0; i < values.size(); i++) {
            int count = 0;
            int current = values.get(i);
            for (int v : values) {
                if (current == v) {
                    count++;
                }
            }
            repeats.put(current, count-1);
        }

        int min = Integer.MAX_VALUE;

        for (Integer v : repeats.values()) {
            if (v < min) {
                min = v;
            }
        }

        for (Map.Entry<Integer, Integer> set : repeats.entrySet()) {
            if (set.getValue() == min) {
                System.out.print(set.getKey() + " ");
            }
        }
    }
}