package com.javarush.task.task19.task1923;

import java.io.*;

/* 
Слова с цифрами
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        try (BufferedReader fileReader = new BufferedReader(new FileReader(args[0]));
             BufferedWriter fileWriter = new BufferedWriter(new FileWriter(args[1]))) {

            String line;
            while ((line = fileReader.readLine()) != null) {
                String[] parts = line.split(" ");
                for (String s : parts) {
                    if (s.matches(".*\\d.*")) {
                        fileWriter.write(s + " ");
                    }
                }
            }
        }
    }
}