package com.javarush.task.task13.task1319;

import java.io.*;

/* 
Писатель в файл с консоли
*/

public class Solution {
    public static void main(String[] args) {
        try (
                BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
                FileOutputStream fileOutputStream = new FileOutputStream(reader.readLine());
                BufferedWriter buffer = new BufferedWriter(new OutputStreamWriter(fileOutputStream))
        ) {
            while (true) {
                String line = reader.readLine();
                if (line.equals("exit")) {
                    buffer.write(line);
                    break;
                } else {
                    buffer.write(line + "\n");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
