package com.javarush.task.task07.task0708;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самая длинная строка
*/

public class Solution {
    private static ArrayList<String> strings;

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        strings = new ArrayList<>();
        String s;

        for (int i = 0; i < 5; i++) {
            s = reader.readLine();
            strings.add(s);
        }

        int maxLength = 0;
        for (String value : strings) {
            if (value.length() > maxLength) {
                maxLength = value.length();
            }
        }
        ArrayList<String> biggest = new ArrayList<>();
       for (String values : strings) {
           if (values.length() >= maxLength) {
               biggest.add(values);
           }
       }
       for (String v : biggest) {
           System.out.println(v);
       }
        //напишите тут ваш код
    }
}
