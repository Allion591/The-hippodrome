package com.javarush.task.task07.task0718;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Проверка на упорядоченность
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        ArrayList<String> list = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int count = 0;
        int length = 0;
        int index = 0;
        boolean isOrdered = false;

        do {
            String str = reader.readLine();
            list.add(str);
            count++;
        } while (count != 10);

        for (int i = 0; i <= 9; i++) {
            String firstString = list.get(i);
            if (firstString.length() >= length) {
                length = firstString.length();
            } else {
                index = i;
                isOrdered = true;
                break;
            }
    }
        if (isOrdered) {
            System.out.println(index);
        }
    }
}