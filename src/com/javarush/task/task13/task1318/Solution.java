package com.javarush.task.task13.task1318;

import java.io.*;
import java.util.Scanner;

/* 
Чтение файла
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        try (
                BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
                FileInputStream fileInputStream = new FileInputStream(reader.readLine());
                BufferedReader buffer = new BufferedReader(new InputStreamReader(fileInputStream));
                ) {
            while (buffer.ready()) {
                String value = buffer.readLine();
                System.out.println(value);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}