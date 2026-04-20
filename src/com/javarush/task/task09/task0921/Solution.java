package com.javarush.task.task09.task0921;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Метод в try..catch
*/

public class Solution {
    public static void main(String[] args) {
        readData();
    }

    public static void readData() {
        List<Integer> nums = new ArrayList<>();
        try {

            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            while (true) {
                int a = Integer.parseInt(reader.readLine());
                nums.add(a);
            }
        } catch (NumberFormatException | IOException e) {
            for (Integer i : nums) {
                System.out.println(i);
            }
        }
    }
}
