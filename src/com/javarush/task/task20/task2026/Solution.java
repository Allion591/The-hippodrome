package com.javarush.task.task20.task2026;

/* 
Алгоритмы-прямоугольники
*/

public class Solution {
    public static void main(String[] args) {
        byte[][] a1 = new byte[][]{
                {1, 1, 0, 0},
                {1, 1, 0, 0},
                {1, 1, 0, 0},
                {1, 1, 0, 1}
        };
        byte[][] a2 = new byte[][]{
                {1, 0, 0, 1},
                {0, 0, 0, 0},
                {0, 0, 0, 0},
                {1, 0, 0, 1}
        };
        byte[][] a3 = {
                {1, 1, 0},
                {1, 1, 0},
                {0, 0, 0},
                {1, 1, 0},
                {1, 1, 0}
        };

        int count1 = getRectangleCount(a1);
        System.out.println("count = " + count1 + ". Должно быть 2");
        int count2 = getRectangleCount(a2);
        System.out.println("count = " + count2 + ". Должно быть 4");
        int count3 = getRectangleCount(a3);
        System.out.println("count = " + count3 + ". Должно быть 2");
    }

    public static int getRectangleCount(byte[][] a) {
        int countRectangle = 0;
        int width = 0;
        int height = 0;

        while (true) {
            int countWidth = 0;
            for (int i = 0; i < a.length; i++) { //столбцы

                for (int j = 0; j < a[i].length; j++) { //строки
                    if (a[i][j] == 1) {//считаем ширину
                        countWidth++;
                        a[i][j] = 0;
                    } else if (countWidth != 0) {
                        if (countWidth == 1) {
                            countRectangle++;
                            countWidth = 0;
                        }
                            width = countWidth;
                            countWidth = 0;
                    }
                }
                if (countWidth == a[i].length) {
                    width = countWidth;
                    countWidth = 0;
                }

                if (countWidth == 1) {
                    countRectangle++;
                    countWidth = 0;
                }
                if (width > 0) {  //считаем высоту
                    height++;
                }
            }
            if (width == 0) {
                break;
            }
            if (height != 0 && width != 0) {
                countRectangle++;
                width = 0;
                height = 0;
            }
        }
        return countRectangle;
    }
}
