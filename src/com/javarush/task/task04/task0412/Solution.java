package com.javarush.task.task04.task0412;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Положительное и отрицательное число
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));//напишите тут ваш код
        System.out.println("Введите число");
        int number = Integer.parseInt(reader.readLine());

        if (number > 0) {
            number = number*2;
        } else if (number < 0) {
            number = number+1;
        }
            System.out.println(number);

    }

}