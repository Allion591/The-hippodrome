package com.javarush.task.task18.task1808;

import java.io.*;

/* 
Разделение файла
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            String fileName1 = reader.readLine();
            String fileName2 = reader.readLine();
            String fileName3 = reader.readLine();

            FileInputStream inputStream = new FileInputStream(fileName1);
            FileOutputStream outputStreamFile2 = new FileOutputStream(fileName2);
            FileOutputStream outputStreamFile3 = new FileOutputStream(fileName3);
            int length = inputStream.available();

            while (inputStream.available() > 0) {
                if (inputStream.available() > length / 2) {
                    outputStreamFile2.write(inputStream.read());
                } else {
                    outputStreamFile3.write(inputStream.read());
                }
            }

            inputStream.close();
            outputStreamFile2.close();
            outputStreamFile3.close();
        }
    }
}