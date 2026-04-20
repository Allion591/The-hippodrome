package com.javarush.task.task04.task0413;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
День недели
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите номер");
        int numWeekDay = Integer.parseInt(reader.readLine());//напишите тут ваш код
        String dayName = "";
        
        if (numWeekDay == 1){
            dayName = "Понедельник";
        } else if (numWeekDay == 2) {
            dayName = "Вторник";
        } else if (numWeekDay == 3) {
            dayName = "Среда";
        } else if (numWeekDay == 4) {
            dayName = "Четверг";
        } else if (numWeekDay == 5) {
            dayName = "Пятница";
        } else if (numWeekDay == 6) {
            dayName = "Суббота";
        } else if (numWeekDay == 7) {
            dayName = "Воскресенье";
        } else {
            System.out.println("Нет такого дня недели");
        }
        System.out.println(dayName);
    }
}