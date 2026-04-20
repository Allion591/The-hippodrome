package com.javarush.task.task19.task1908;

import java.io.*;
import java.util.ArrayList;

/* 
Выделяем числа
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String fileOne =  reader.readLine(); //"d:\\1.txt";
        String fileTwo =  reader.readLine(); //"d:\\2.txt";

        reader.close();

        try (BufferedReader fileReader = new BufferedReader(new FileReader(fileOne));
        BufferedWriter writer = new BufferedWriter(new FileWriter(fileTwo))) {

            String line;
            while ((line = fileReader.readLine()) != null) {
                String[] parts = line.split(" ");
                for (String s : parts) {
                    if (isNumber(s)) {
                        writer.write(s + " ");
                    }
                }
            }
        }
    }

    public static boolean isNumber(String part) {
        try {
            int num = Integer.parseInt(part);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
