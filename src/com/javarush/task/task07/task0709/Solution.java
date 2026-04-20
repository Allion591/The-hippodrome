package com.javarush.task.task07.task0709;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Выражаемся покороче
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> arrayList = new ArrayList<>();
        String s;
        int min = 0;
        int max = 0;

        for (int i = 0; i < 5; i++) {
            s = reader.readLine();
            arrayList.add(s);
        }

        ArrayList<String> shorted = new ArrayList<>();

        for (String value : arrayList) {
            if (value.length() > max) {
                max = value.length();
            }
        }
        min = max;
        for (String value : arrayList) {
            if (value.length() < min) {
                min = value.length();
            }
        }

        for (String value : arrayList) {
            if (value.length() == min) {
                shorted.add(value);
            }
        }

        for (String values : shorted) {
            System.out.println(values);
        }
        //напишите тут ваш код
    }
}
