package com.javarush.task.task09.task0926;

import java.util.ArrayList;

/* 
Список из массивов чисел
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<int[]> list = createList();
        printList(list);
    }

    public static ArrayList<int[]> createList() {
        ArrayList<int[]> newList = new ArrayList<>();
        int[] one = new int[5];
        int[] two = new int[2];
        int[] three = new int[4];
        int[] four = new int[7];
        int[] five = new int[0];

        newList.add(one);
        newList.add(two);
        newList.add(three);
        newList.add(four);
        newList.add(five);

        for (int[] x : newList) {
            for (int i = 0; i < x.length; i++) {
                x[i] = i;
            }
        }
        return newList;
    }

    public static void printList(ArrayList<int[]> list) {
        for (int[] array : list) {
            for (int x : array) {
                System.out.println(x);
            }
        }
    }
}