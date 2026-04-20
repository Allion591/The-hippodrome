package com.javarush.task.task18.task1823;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/* 
Нити и байты
*/

public class Solution {
    public static Map<String, Integer> resultMap = new HashMap<String, Integer>();

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String fileName = reader.readLine();
            if (fileName.equals("exit")) {
                break;
            } else {
                ReadThread readThread = new ReadThread(fileName);
                readThread.start();
            }
        }
        reader.close();
    }

    public static class ReadThread extends Thread {
        public ReadThread(String fileName) throws IOException {
            run(fileName);
        }

        Map<Integer, Integer> bytes = new TreeMap<>();

        public void run(String file) throws IOException {
            try (FileInputStream fileInputStream = new FileInputStream(file);
                 InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream, StandardCharsets.UTF_8);
                 BufferedReader reader = new BufferedReader(inputStreamReader)) {

                int value;
                while ((value = reader.read()) != -1) {
                    if (bytes.containsKey(value)) {
                        bytes.put(value, bytes.get(value) + 1);
                    } else {
                        bytes.put(value, 1);
                    }
                }

                int maxCount = -1;
                int bestByte = -1;
                for (Map.Entry<Integer, Integer> entry : bytes.entrySet()) {
                    int currentByte = entry.getKey();
                    int currentCount = entry.getValue();

                    if (currentCount > maxCount) {
                        maxCount = currentCount;
                        bestByte = currentByte;
                    }
                }
                resultMap.put(file, bestByte);
            }
        }
    }
}