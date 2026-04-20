package com.javarush.task.task09.task0930;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* 
Задача по алгоритмам Ӏ Java Syntax: 9 уровень, 11 лекция
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();
        String line = reader.readLine();
        while (!line.isEmpty()) {
            list.add(line);
            line = reader.readLine();
        }

        String[] array = list.toArray(new String[0]);
        sort(array);

        for (String x : array) {
            System.out.println(x);
        }
    }

    public static void sort(String[] array) {
        List<Integer> nums = new ArrayList<>();
        List<String> words = new ArrayList<>();

        for (String s : array) {
            if (isNumber(s)) {
                nums.add(Integer.parseInt(s));
            } else {
                words.add(s);
            }
        }

         //сортируем цифры
        nums.sort(Collections.reverseOrder());

         //сортируем слова
        for (int a = 0; a < words.size() - 1; a++) {
            for (int i = 0; i < words.size() - a -1; i++) {
                if (isGreaterThan(words.get(i), words.get(i + 1))) {
                    String temp = words.get(i);
                    words.set(i, words.get(i+1));
                    words.set(i+1, temp);
                }
            }
        }

        for (int i = 0; i < words.size(); i++) {
                array[i] = words.get(i);
        }

        int k = 0;
        for (int j = words.size(); j < words.size() + nums.size(); j++) {
            array[j] = nums.get(k).toString();
            k++;
        }

    }

    // Метод для сравнения строк: 'а' больше чем 'b'
    public static boolean isGreaterThan(String a, String b) {
        return a.compareTo(b) > 0;
    }


    // Переданная строка - это число?
    public static boolean isNumber(String text) {
        if (text.length() == 0) {
            return false;
        }

        char[] chars = text.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char character = chars[i];

            // есть '-' внутри строки
            if (i != 0 && character == '-') {
                return false;
            }

            // не цифра и не начинается с '-'
            if (!Character.isDigit(character) && character != '-') {
                return false;
            }

            // одиночный '-'
            if (chars.length == 1 && character == '-') {
                return false;
            }
        }

        return true;
    }
}
