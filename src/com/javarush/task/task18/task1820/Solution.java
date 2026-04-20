package com.javarush.task.task18.task1820;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/* 
Округление чисел
*/

public class Solution {
    public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    String fileName1 = reader.readLine();
    String fileName2 = reader.readLine();

    try (FileInputStream fileInputStream = new FileInputStream(fileName1);
    BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);

    FileOutputStream fileOutputStream = new FileOutputStream(fileName2);
    BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream)) {

        StringBuilder stringBuilder = new StringBuilder();
        int symbol;
        while ((symbol = bufferedInputStream.read()) != -1) {
            char value = (char) symbol;
            stringBuilder.append(value);
        }

        String[] line = stringBuilder.toString().split(" ");

        for (int i = 0; i < line.length; i++) {
            double j = Double.parseDouble(line[i]);
            long num = Math.round(j);
            bufferedOutputStream.write(Long.toString(num).getBytes());
            bufferedOutputStream.write(' ');
        }
    }
    }
}
