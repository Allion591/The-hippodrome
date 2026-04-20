package com.javarush.task.task19.task1906;

import java.io.*;
import java.util.ArrayList;

/* 
Четные символы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String firstFileName = reader.readLine();
        String secondFileName = reader.readLine();

        reader.close();

        try (FileReader fr = new FileReader(firstFileName);
        FileWriter fw = new FileWriter(secondFileName)) {
            int count = 1;
            int num;
            while ((num = fr.read()) != -1) {
                char symbol = (char) num;
                if (count % 2 == 0) {
                    fw.write(symbol);
                }
                count++;
            }
        }
    }
}
