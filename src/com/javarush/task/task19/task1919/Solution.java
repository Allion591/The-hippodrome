package com.javarush.task.task19.task1919;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/* 
Считаем зарплаты
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(args[0]))) {
            Map<String, Double> map = new TreeMap<>();
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(" ");
                Double v = Double.parseDouble(parts[1]);
                if (map.containsKey(parts[0])) {
                    map.compute(parts[0], (k, value) -> v + value);
                } else {
                    map.put(parts[0], v);
                }
            }
            for (Map.Entry<String, Double> entry : map.entrySet()) {
                System.out.println(entry.getKey() + " " + entry.getValue());
            }


        }
    }
}
