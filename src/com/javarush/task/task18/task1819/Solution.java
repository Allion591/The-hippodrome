package com.javarush.task.task18.task1819;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/* 
Объединение файлов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file = reader.readLine();
        String file2 = reader.readLine();

        try (FileInputStream inputStream = new FileInputStream(file);
             FileInputStream inputStream2 = new FileInputStream(file2);

             BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream, 200);
             BufferedInputStream bufferedInputStream2 = new BufferedInputStream(inputStream2, 200);
        ) {
            List<Integer> fromFileOne = new ArrayList<>();

            int symbol;

            while ((symbol = bufferedInputStream2.read()) != -1) {
                fromFileOne.add(symbol);
            }

            int i;
            while ((i = bufferedInputStream.read()) != -1) {
                fromFileOne.add(i);
            }

            FileOutputStream fileOutputStream = new FileOutputStream(file);
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream, 200);

            for (Integer value : fromFileOne) {
                bufferedOutputStream.write(value);
            }

            bufferedOutputStream.close();
            fileOutputStream.close();
        }
    }
}