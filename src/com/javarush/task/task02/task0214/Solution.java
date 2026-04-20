package com.javarush.task.task02.task0214;

/* 
Минимум двух чисел Ӏ Java Syntax: 2 уровень, 8 лекция 7
*/

public class Solution {
    public static int min(int a, int b) {
        int c;
        if (a < b) {
            c = a;
        } else {
            c = b;
        }//напишите тут ваш код
        return c;
    }

    public static void main(String[] args) {
        System.out.println(min(12, 33));
        System.out.println(min(-20, 0));
        System.out.println(min(-10, -20));
    }
}
