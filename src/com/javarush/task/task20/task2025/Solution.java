package com.javarush.task.task20.task2025;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* 
Алгоритмы-числа
*/

public class Solution {

    public static long[] getNumbers(long N) {
        long current = 1;
        List<Long> list = new ArrayList<>();
        while (current < N) {
            int currentLength = String.valueOf(current).length();

            if (N < 1) {
                return new long[0];
            } else if (currentLength == 1) {
                list.add(current);
                current++;
            } else if (currentLength > 2) {
                long sum = 0;
                String s = String.valueOf(current);
                String[] m = s.split("");

                long a;
                for (int i = 0; i < m.length; i++) {
                    long v = Integer.parseInt(m[i]);
                    a = v;
                    for (int j = 0; j < m.length - 1; j++) {
                        a = a * v;
                    }

                    sum = sum + a;
                }
                if (sum == current) {
                    list.add(sum);
                    current++;
                } else {
                    current++;
                }
            } else {
                current++;
            }
        }
        for (int i = 0; i < list.size(); i++) {

        }

        return list.stream()
                .mapToLong(Long::longValue)
                .toArray();
    }

    public static void main(String[] args) {
        long a = System.currentTimeMillis();
        System.out.println(Arrays.toString(getNumbers(1000)));
        long b = System.currentTimeMillis();
        System.out.println("memory " + (Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory()) / (8 * 1024));
        System.out.println("time = " + (b - a) / 1000);

        a = System.currentTimeMillis();
        System.out.println(Arrays.toString(getNumbers(1000000)));
        b = System.currentTimeMillis();
        System.out.println("memory " + (Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory()) / (8 * 1024));
        System.out.println("time = " + (b - a) / 1000);
    }
}