package com.javarush.task.task03.task0319;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Предсказание на будущее
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));//напишите тут ваш код

        System.out.println("Insert your name");
        String name = reader.readLine();
        System.out.println("Insert cash");
        String sCash = reader.readLine();
        int nCash = Integer.parseInt(sCash);
        System.out.println("insert year");
        String sYear = reader.readLine();
        int nYear = Integer.parseInt(sYear);
        System.out.println(name + " получает " + nCash + " через " + nYear + " лет.");
    }
}
