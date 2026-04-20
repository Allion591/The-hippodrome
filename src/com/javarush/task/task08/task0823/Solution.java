package com.javarush.task.task08.task0823;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Омовение Рамы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String string = reader.readLine();

        String[] words = string.split(" ");
        List<StringBuilder> result = new ArrayList<>();

        for (String word : words) {
            String[] symdol = word.split("");
            String first = symdol[0];
            symdol[0] = first.toUpperCase();

            StringBuilder newWord = new StringBuilder();
            for (String a : symdol) {
                newWord.append(a);
            }
            result.add(newWord);
        }

        for (StringBuilder b : result) {
            System.out.print(b + " ");
        }
    }
}
