package com.javarush.task.task19.task1925;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/* 
Длинные слова
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        try (BufferedReader fileReader = new BufferedReader(new FileReader(args[0]));
             BufferedWriter writer = new BufferedWriter(new FileWriter(args[1]))) {

            List<String> words = new ArrayList<>();
            String line;
            while ((line = fileReader.readLine()) != null) {
                String[] parts = line.split(" ");
                for (String s : parts) {
                    if (s.length() > 6) {
                         words.add(s);
                    }
                }
            }
            if (!words.isEmpty()) {
                int count = 0;
                for (String l : words) {
                    if (count == words.size()-1) {
                        writer.write(l);
                    } else {
                        writer.write(l + ",");
                        count++;
                    }
                }
            }
        }
    }
}