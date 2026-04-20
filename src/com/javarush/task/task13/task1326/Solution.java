package com.javarush.task.task13.task1326;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/* 
Сортировка четных чисел из файла
*/

public class Solution {
    public static void main(String[] args) {
        try(
                BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
                InputStream inputStream = new FileInputStream(reader.readLine());
                BufferedInputStream buffer = new BufferedInputStream(inputStream);
                BufferedReader read = new BufferedReader(new InputStreamReader(buffer, StandardCharsets.UTF_8))
                ) {
            List<Integer> values = new ArrayList<>();
            while (read.ready()) {
                String line = read.readLine();
                int num = Integer.parseInt(line);
                values.add(num);
            }

            Collections.sort(values);

            for (Integer value : values) {
                if (value % 2 == 0) {
                    System.out.println(value);
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
