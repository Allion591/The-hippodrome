package com.javarush.task.task01.task0136;

/* 
Да хоть на Луну!
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(getWeight(888));
    }

    public static double getWeight(int earthWeight) {
        double a = 0.0;
        a = earthWeight*1.66;
        return a;//напишите тут ваш код
    }
}