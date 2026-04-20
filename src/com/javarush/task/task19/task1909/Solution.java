package com.javarush.task.task19.task1909;

import java.io.*;
import java.util.ArrayList;

/* 
Замена знаков
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String fileOne = reader.readLine();//"d:\\1.txt";
        String fileTwo = reader.readLine();//"d:\\2.txt";

        reader.close();

        try (BufferedReader fileReader = new BufferedReader(new FileReader(fileOne));
             BufferedWriter writer = new BufferedWriter(new FileWriter(fileTwo))) {

            String line;
            while ((line = fileReader.readLine()) != null) {
                line = line.replace(".", "!");
                writer.write(line);
            }

        }
    }
}