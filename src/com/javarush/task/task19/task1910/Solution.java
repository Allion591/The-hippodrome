package com.javarush.task.task19.task1910;

import java.io.*;
import java.util.ArrayList;

/* 
Пунктуация
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String fileOne = reader.readLine();
        String fileTwo = reader.readLine();
        //String fileOne = "d:\\1.txt";
        //String fileTwo = "d:\\2.txt";

        reader.close();

        try (BufferedReader fileReader = new BufferedReader(new FileReader(fileOne));
             BufferedWriter writer = new BufferedWriter(new FileWriter(fileTwo))) {

            String line;
            while ((line = fileReader.readLine()) != null) {
                line = line.replaceAll("[\\p{Punct}\r\n]", "");
                writer.write(line);
            }
        }
    }
}