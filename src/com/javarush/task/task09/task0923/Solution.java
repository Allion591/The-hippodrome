package com.javarush.task.task09.task0923;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Гласные и согласные
*/

public class Solution {
    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] words = reader.readLine().split("");

        List<String> glas = new ArrayList<>();
        List<String> soglas = new ArrayList<>();

        for (String w : words) {
            char y = w.charAt(0);
            if (isVowel(y)) {
                glas.add(w);
            } else {
                soglas.add(w);
            }
        }

        List<String> noWhite = new ArrayList<>(soglas);

        for (String b : noWhite) {
        if (b.equals(" ")) {
            soglas.remove(b);
        }
        }

        for (String s : glas) {
            System.out.print(s + " ");
        }

        System.out.println();

        for (String a : soglas) {
            System.out.print(a + " ");
        }

        reader.close();
    }

    // метод проверяет, гласная ли буква
    public static boolean isVowel(char character) {
        character = Character.toLowerCase(character);  // приводим символ в нижний регистр - от заглавных к строчным буквам
        for (char vowel : vowels) {  // ищем среди массива гласных
            if (character == vowel) {
                return true;
            }
        }
        return false;
    }
}