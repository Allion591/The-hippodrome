package com.javarush.task.task07.task0705;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Один большой массив и два маленьких
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String nums;
        int[] listOne = new int[20];
        int[] listTwo = new int[10];
        int[] listThree = new int[10];

        for (int i = 0; i < listOne.length; i++) {
            nums = reader.readLine();
            listOne[i] = Integer.parseInt(nums);
        }

        for (int j = 0; j <= 9; j++) {
            listTwo[j] = listOne[j];
        }

        for (int k = 10; k <= 19; k++) {
            listThree[k-10] = listOne[k];
        }
        for (int i : listThree) {
            System.out.println(i);
        }//напишите тут ваш код
    }
}
