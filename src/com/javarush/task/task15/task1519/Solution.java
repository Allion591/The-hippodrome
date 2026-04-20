package com.javarush.task.task15.task1519;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Разные методы для разных типов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Double value1;
        short value2;
        Integer value3;

        while (true) {
            String word = reader.readLine();
            if (word.equals("exit")) {
                break;
            } else if (hasPoint(word)) {
                value1 = Double.parseDouble(word);
                print(value1);
            } else if (isShort(word)) {
                value2 = Short.parseShort(word);
                print(value2);
            } else if (isInteger(word)) {
                value3 = Integer.parseInt(word);
                print(value3);
            } else {
                print(word);
            }
        }
    }

    private static boolean hasPoint(String value) {
        String[] line = value.split("");
        for (String str : line) {
            try {
                if (str.equals(".")) {
                    Double check = Double.parseDouble(value);
                    return true;
                }
            } catch (NumberFormatException e) {
                return false;
            }
        }
        return false;
    }

    private static boolean isShort(String value) {
        try {
            Integer lineInInteger = Integer.parseInt(value);
            if (lineInInteger > 0 && lineInInteger < 128) {
                return true;
            }
        } catch (NumberFormatException e) {
            return false;
        }
        return false;
    }

    private static boolean isInteger(String value) {
        try {
            Integer number = Integer.parseInt(value);
            if (number <= 0 || number >= 128) {
                return true;
            }
        } catch (NumberFormatException e) {
            return false;
        }
        return false;
    }

    public static void print(Double value) {
        System.out.println("Это тип Double, значение " + value);
    }

    public static void print(String value) {
        System.out.println("Это тип String, значение " + value);
    }

    public static void print(short value) {
        System.out.println("Это тип short, значение " + value);
    }

    public static void print(Integer value) {
        System.out.println("Это тип Integer, значение " + value);
    }
}
