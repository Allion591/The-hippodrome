package com.javarush.task.task18.task1817;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;

/* 
Пробелы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        try (FileInputStream fileInputStream = new FileInputStream(args[0]);
             BufferedInputStream bufferedReader = new BufferedInputStream(fileInputStream)) {

            int allSymbolsCount = bufferedReader.available();

            int whitespace;
            int whitespaceCount = 0;
            while ((whitespace = bufferedReader.read()) != -1) {
                if ((char) whitespace == 32) {
                    whitespaceCount++;
                }
            }

            double answer = (double) whitespaceCount / allSymbolsCount * 100;

            BigDecimal bd = new BigDecimal(answer);
            bd = bd.setScale(2, RoundingMode.HALF_UP);

            System.out.println(bd.doubleValue());
        }
    }
}