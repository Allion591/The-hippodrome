package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самые-самые
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] list = new String[2];
        String s;
        ArrayList<String> arrayList = new ArrayList<>();

        int max = 0;
        int min = 0;

        for (int i = 0; i < 10; i++) {
            s = reader.readLine();
            arrayList.add(s);
        }

        for (String a : arrayList) {
            if (a.length() > max) {
                max = a.length();
            }
        }
        min = max;
        for (String b : arrayList) {
            if (b.length() < min) {
                min = b.length();
            }
        }
        for (String values : arrayList) {
            if (values.length() == min) {
                System.out.println(values);
                return;
            } else if (values.length() == max) {
                System.out.println(values);
                return;
            }
        }
        //напишите тут ваш код
    }
}
