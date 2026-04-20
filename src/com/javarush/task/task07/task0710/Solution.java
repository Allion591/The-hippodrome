package com.javarush.task.task07.task0710;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
В начало списка
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> arrayList = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s;

        for (int i = 0; i < 10; i++) {
            s = reader.readLine();
            arrayList.add(0, s);
        }//напишите тут ваш код
    for (String values : arrayList) {
        System.out.println(values);
    }
    }
}
