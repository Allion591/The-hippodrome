package com.javarush.task.task18.task1822;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Map;
import java.util.TreeMap;

/* 
Поиск данных внутри файла
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file = reader.readLine();
        Map<Integer, String> lines = new TreeMap<>();

        try (FileInputStream fileInputStream = new FileInputStream(file);
             InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream, StandardCharsets.UTF_8);
             BufferedReader reader1 = new BufferedReader(inputStreamReader)) {

            String value;
            while ((value = reader1.readLine()) != null) {
                    String[] line = value.split(" ", 2);
                    lines.put(Integer.parseInt(line[0]), line[1]);
                }

            System.out.println(args[0] + " " + lines.get(Integer.parseInt(args[0])));
        }
    }
}