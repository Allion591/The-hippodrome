package com.javarush.task.task16.task1632;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Клубок
*/

public class Solution {
    public static List<Thread> threads = new ArrayList<>(5);

    static {
        threads.add(new Infinity());
        threads.add(new MakeException());
        threads.add(new PrintUra());
        threads.add(new Show());
        threads.add(new ReadNumbers());
    }

    public static void main(String[] args) {
    }

    public static class Infinity extends Thread {
        @Override
        public void run() {
            while (true) {

            }
        }
    }

    public static class MakeException extends Thread {

        @Override
        public void run() {
            try {
                currentThread().join();
            } catch (InterruptedException e) {
                System.out.println("InterruptedException");
            }
        }
    }

    public static class PrintUra extends Thread {
        @Override
        public void run() {
            try {
                while (true) {
                System.out.println("Ура");
                    Thread.sleep(500);
            }
            } catch (InterruptedException e) {
            }
        }
    }

    public static class Show extends Thread implements Message {

        @Override
        public void run() {
            while (!isInterrupted()) { // Проверяем флаг
                // Работа потока
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    // При получении InterruptedException флаг сбрасывается
                    interrupt(); // Восстанавливаем флаг
                    break; // Выходим из цикла
                }
            }
        }

        @Override
        public void showWarning() {
            interrupt();
        }
    }

    public static class ReadNumbers extends Thread {
        int num;
        String line;
        @Override
        public void run() {
            try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
                while (line != "N") {
                    try {
                        line = reader.readLine();
                        num += Integer.parseInt(line);
                    } catch (Exception e) {
                        break;
                    }
                }
                System.out.println(num);
            } catch (IOException e) {
                System.out.println("Error input");
            }
        }
    }

}