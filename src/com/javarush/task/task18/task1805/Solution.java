package com.javarush.task.task18.task1805;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.*;

/* 
Сортировка байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String fileName = reader.readLine();

        FileInputStream inputStream = new FileInputStream(fileName);

        List<Integer> set = new ArrayList<>();

        while (inputStream.available() != 0) {
            int current = inputStream.read();
            set.add(current);
        }

        reader.close();
        inputStream.close();

        Collections.sort(set);

        Set<Integer> newSet = new HashSet<>(set);

        for (int c : newSet) {
            System.out.print(c + " ");
        }
    }
}