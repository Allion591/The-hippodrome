package com.javarush.task.task18.task1826;

import java.io.*;

/* 
Шифровка
*/

public class Solution {
    public static void main(String[] args) throws IOException {
    try (FileInputStream fileInputStream = new FileInputStream(args[1]);
            BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
            FileOutputStream fileOutputStream = new FileOutputStream(args[2]);
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream)) {
        if (args[0].equals("-e")) {
            int value;
            while ((value = bufferedInputStream.read()) != -1) {
                bufferedOutputStream.write(value-1);
            }
        } else if (args[0].equals("-d")) {
            int value;
            while ((value = bufferedInputStream.read()) != -1) {
                bufferedOutputStream.write(value+1);
            }
        }
    }
    }
}