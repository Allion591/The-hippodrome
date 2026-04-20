package com.javarush.task.task18.task1825;

import java.io.*;
import java.util.*;

/* 
Собираем файл
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Map<Integer, String> names = new TreeMap<>();
        String outputFile = null;

        while (true) {
            String fileName = reader.readLine();
            if (fileName.equals("end")) {
                break;
            }
            String[] line = fileName.split(".part");
            outputFile = line[0];
            names.put(Integer.parseInt(line[1]), fileName);
        }
        reader.close();

        for (String file : names.values()) {
            try (FileInputStream fileInputStream = new FileInputStream(file);
            BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
            FileOutputStream fileOutputStream = new FileOutputStream(outputFile, true);
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream)) {

                int value;
                while ((value = bufferedInputStream.read()) != -1) {
                    bufferedOutputStream.write(value);
                }
            }
        }

    }
}
