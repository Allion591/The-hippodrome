package com.javarush.task.task07.task0711;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Удалить и вставить
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String s;
        ArrayList<String> arrayList = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            s = reader.readLine();
            arrayList.add(s);
        }

        for (int i = 1; i <= 13; i++) {
            s = arrayList.get(4);
            arrayList.remove(4);
            arrayList.add(0, s);
        }

        for (String v : arrayList) {
            System.out.println(v);
        }//напишите тут ваш код
    }
}
