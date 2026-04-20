package com.javarush.task.task18.task1801;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStreamReader;

/* 
Максимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String fileName = reader.readLine();

        FileInputStream inputStream = new FileInputStream(fileName);

        int result = 0;
        while (inputStream.available() != 0) {
            int current = inputStream.read();
            if (current > result) {
                result = current;
            }
        }
        System.out.println(result);
        reader.close();
        inputStream.close();
    }
}
