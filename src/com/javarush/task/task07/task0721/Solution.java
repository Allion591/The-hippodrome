package com.javarush.task.task07.task0721;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Минимаксы в массивах
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        int[] numbs = getInts();
        int maximum = numbs[0];
        int minimum = numbs[0];

        for (int i = 0; i < numbs.length; i++) {
            if (numbs[i]<minimum) {
                minimum = numbs[i];
            }
            if (numbs[i]>maximum) {
                maximum = numbs[i];
            }
        }
        System.out.print(maximum + " " + minimum);
    }

    public static int[] getInts() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] val = new int[20];
        for (int i = 0; i < val.length; i++) {
            val[i] = Integer.parseInt(reader.readLine());
        }
        return val;
    }
}
