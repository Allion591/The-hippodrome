package com.javarush.task.task19.task1914;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

/* 
Решаем пример
*/

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        PrintStream consoleStream = System.out;

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();

        PrintStream stream = new PrintStream(outputStream);

        System.setOut(stream);

        testString.printSomething();

        String result = toAnswer(outputStream.toString());

        System.setOut(consoleStream);

        System.out.print(result);
    }

    public static String toAnswer(String s) {
        String[] parts = s.split(" ");
        int one = 0;
        char some = '-';
        int two = 0;

        try {
            one = Integer.parseInt(parts[0]);
            some = parts[1].charAt(0);
            two = Integer.parseInt(parts[2]);
        } catch (NumberFormatException e) {
            System.out.println("Неверный формат");;
        }

        int result = 0;

        if (some == '+') {
            result = one + two;
        } else if (some == '-') {
            result = one - two;
        } else if (some == '*') {
            result = one * two;
        }
        return s + result;
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("3 + 6 = ");
        }
    }
}

