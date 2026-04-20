package com.javarush.task.task07.task0702;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Массив из строчек в обратном порядке
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] list = new String[10];
        list[0] = "1";
        list[1] = "2";
        for (int i = 2; i < list.length; i++) {
            String s = reader.readLine();
            list[i] = s;
        }
        for (int i = 9; i >= 0; i--) {
            System.out.println(list[i]);
        }//напишите тут ваш код
    }
}