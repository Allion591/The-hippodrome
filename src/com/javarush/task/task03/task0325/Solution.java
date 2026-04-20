package com.javarush.task.task03.task0325;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Финансовые ожидания
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введи сумму");
        String sS = reader.readLine();
        int nS = Integer.parseInt(sS);
        System.out.println("Я буду зарабатывать $" + nS + " в час");//напишите тут ваш код

    }
}
