package com.javarush.task.task18.task1809;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* 
Реверс файла
*/

public class Solution {
    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        String fileName = reader.readLine();
        String fileName2 = reader.readLine();

        FileInputStream inputStream = new FileInputStream(fileName);
        FileOutputStream outputStream = new FileOutputStream(fileName2);

        List<Integer> symbols = new ArrayList<>();

        while (inputStream.available() > 0) {
             int bytes = inputStream.read();
             symbols.add(bytes);
        }

        for (int i = symbols.size() - 1; i >= 0 ; i--) {
            outputStream.write(symbols.get(i));
        }

        reader.close();
        inputStream.close();
        outputStream.close();

    }
}
