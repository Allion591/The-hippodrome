package com.javarush.task.task18.task1803;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* 
Самые частые байты
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String fileName = reader.readLine();

        FileInputStream inputStream = new FileInputStream(fileName);

        int totalCount = 0;

        List<Integer> values = new ArrayList<>();

        while (inputStream.available() != 0) {
            int current = inputStream.read();
            values.add(current);
        }

        reader.close();
        inputStream.close();

        Set<Integer> repeats = new HashSet<>(values);

        for (int i = 0; i < values.size(); i++) {
            int num = values.get(i);
           for (Integer v : values) {
               if (v.equals(num)) {
                   totalCount++;
               }
           }
           if (totalCount == 2) {
               repeats.remove(num);
           }
           totalCount = 0;
        }

        for (Integer n : repeats) {
            System.out.print(n + " ");
        }
    }
}
