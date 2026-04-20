package com.javarush.task.task19.task1920;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

/* 
Самый богатый
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        try (BufferedReader fileReader = new BufferedReader(new FileReader(args[0]))) {
            Map<String, Double> map = new TreeMap<>();
            String line;
            while ((line = fileReader.readLine()) != null) {
                String[] parts = line.split(" ");
                Double value = Double.parseDouble(parts[1]);
                if (map.containsKey(parts[0])) {
                    map.put(parts[0], map.get(parts[0])+value);
                } else {
                    map.put(parts[0], value);
                }
            }

            Double maxValue = (double) Integer.MIN_VALUE;

            for(Map.Entry<String, Double> maxEntry : map.entrySet()) {
              if (maxEntry.getValue() > maxValue) {
                  maxValue = maxEntry.getValue();
              }
            }

            for(Map.Entry<String, Double> maxEntry : map.entrySet()) {
                if (maxValue.equals(maxEntry.getValue())) {
                    System.out.println(maxEntry.getKey());
                }
            }
        }
    }
}
