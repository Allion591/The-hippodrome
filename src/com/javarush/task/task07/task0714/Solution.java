package com.javarush.task.task07.task0714;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Слова в обратном порядке
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();

        int count = 0;

        do {
            String line = reader.readLine();
            list.add(line);
            count++;
        } while (count != 5);
        list.remove(2);

        for (int i = 3; i >= 0; i--) {
            System.out.println(list.get(i));
        }
    }
}