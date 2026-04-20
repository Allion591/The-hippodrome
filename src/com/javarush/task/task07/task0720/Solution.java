package com.javarush.task.task07.task0720;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Перестановочка подоспела
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> strings = new ArrayList<>();

        String line = reader.readLine();
        int n = Integer.parseInt(line);

        String line1 = reader.readLine();
        int m = Integer.parseInt(line1);

        for (int i = 0; i < n; i++) {
            String line2 = reader.readLine();
            strings.add(line2);
        }

        for (int j = 0; j < m ; j++) {
            strings.add(strings.remove(0));
        }

        for (int i = 0; i < strings.size(); i++) {
            System.out.println(strings.get(i));
        }

    }
}
