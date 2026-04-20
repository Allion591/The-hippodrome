package com.javarush.task.task18.task1818;

import java.io.*;

/* 
Два в одном
*/

public class Solution {
    public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    String fileOne = reader.readLine();
    String fileTwo = reader.readLine();
    String fileThree = reader.readLine();

    try (FileInputStream fileInputStream1 = new FileInputStream(fileTwo);
    FileInputStream fileInputStream2 = new FileInputStream(fileThree);
    BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream1, 200);
    FileOutputStream outputStream = new FileOutputStream(fileOne);
    BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(outputStream, 200)) {

        int symbol;
        while ((symbol = bufferedInputStream.read()) != -1) {
            bufferedOutputStream.write(symbol);
        }

            BufferedInputStream bufferedInputStream2 = new BufferedInputStream(fileInputStream2);

        while ((symbol = bufferedInputStream2.read()) != -1) {
            bufferedOutputStream.write(symbol);
        }
    }
    }
}