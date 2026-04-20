package com.javarush.task.task07.task0706;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Улицы и дома
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] list = new int[15];
        String s;
        int sum1 = 0;
        int sum2 = 0;

        for (int i = 0; i < list.length; i++) {
            s = reader.readLine();
            list[i] = Integer.parseInt(s);
        }

        for (int j = 0; j <= list.length;) {
            sum1 = sum1 + list[j];
            j = j+2;
        }

        for (int k = 1; k <= 13;) {
            sum2 = sum2 + list[k];
            k = k+2;
        }
        if (sum1 > sum2) {
            System.out.println("В домах с четными номерами проживает больше жителей.");
        } else if (sum1 == sum2){
            return;
        } else {
            System.out.println("В домах с нечетными номерами проживает больше жителей.");
        }
        //напишите тут ваш код
    }
}
