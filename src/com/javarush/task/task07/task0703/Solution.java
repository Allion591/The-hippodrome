package com.javarush.task.task07.task0703;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Общение одиноких массивов
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        String[] listString = new String[10];
        int[] listInt = new int[10];

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s;

        for (int i = 0; i < listString.length; i++) {
            s = reader.readLine();
            listString[i] = s;
                listInt[i] = s.length();
        }
        for (int j = 0; j < listInt.length; j++) {
            System.out.println(listInt[j]);
        }

        //напишите тут ваш код
    }
}
