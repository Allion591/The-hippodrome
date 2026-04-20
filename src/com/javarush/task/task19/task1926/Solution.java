package com.javarush.task.task19.task1926;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Перевертыши
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        String fileName;
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            fileName = reader.readLine();
        }

        try (BufferedReader fileReader = new BufferedReader(new FileReader(fileName))) {
            String line;
            int count = 0;
            while ((line = fileReader.readLine()) != null) {
                String[] parts = line.split("");
                if (count > 0) {
                    System.out.println();
                }
                for (int i = parts.length; i != 0; i--) {
                        System.out.print(parts[i - 1]);
                }
                count++;
            }
        }
    }
}
