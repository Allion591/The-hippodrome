package com.javarush.task.task18.task1807;

import java.io.*;

/* 
Подсчет запятых
*/

public class Solution {

    public static void main(String[] args) throws IOException {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             FileInputStream fileReader = new FileInputStream(reader.readLine())) {
            char byteRead;
            int count = 0;

            while (fileReader.available() > 0) {
                byteRead = (char) fileReader.read();
                if (byteRead == ',') {
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}