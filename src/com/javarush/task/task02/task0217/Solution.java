package com.javarush.task.task02.task0217;

/* 
Минимум четырех чисел
*/

public class Solution {
    public static int min(int a, int b, int c, int d) {
        int m = 0;//напишите тут ваш код
        if (a <= b && a <= c && a <= d) {
            m = a;
        } else if (b <= a && b <= c && b <= d ) {
            m = b;
        } else if (c <= a && c <= b && c <= d) {
            m = c;
        } else if (d <= a && d <= b && d <= c) {
            m = d;
        }
        return m;
    }

    public static int min(int a, int b) {
        int n = 0;
        if (a < b) {
            n = a;
        } else if (b < a) {
            n = b;
        }//напишите тут ваш код
        return n;
    }

    public static void main(String[] args) throws Exception {
        System.out.println(min(-20, -10));
        System.out.println(min(-40, -10, -30, 40));
        System.out.println(min(-20, -40, -30, 40));
        System.out.println(min(-20, -10, -40, 40));
        System.out.println(min(-20, -10, -30, -40));
    }
}
