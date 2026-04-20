package com.javarush.task.task07.task0715;

import java.util.ArrayList;

/* 
Продолжаем мыть раму
*/

public class Solution {
    public static void main(String[] args) {
       ArrayList<String> list = new ArrayList<>();
       list.add("мама");
       list.add("мыла");
       list.add("раму");

        for (int i = 1; i < 6; i++) {
            String str = "именно";
            list.add(i, str);
            i++;
        }
        for (String str : list) {
            System.out.println(str);
        }
    }
}
