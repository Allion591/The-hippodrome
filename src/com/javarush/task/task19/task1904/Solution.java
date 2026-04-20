package com.javarush.task.task19.task1904;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

/* 
И еще один адаптер
*/

public class Solution {

    public static void main(String[] args) {

    }

    public static class PersonScannerAdapter implements PersonScanner {
        private Scanner fileScanner;

        public PersonScannerAdapter(Scanner fileScanner) {
            this.fileScanner = fileScanner;
        }

        @Override
        public Person read() throws IOException {
            String[] parts = fileScanner.nextLine().split(" ");
            StringBuilder builder = new StringBuilder(parts[3] + "." + parts[4] + "." + parts[5]);
            SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
            Date date = new Date();
            try {
                date = sdf.parse(builder.toString());
            } catch (Exception e) {
                System.out.println("Ошибка парсинга даты");
            }
            return new Person(parts[1], parts[2], parts[0], date);
        }

        @Override
        public void close() throws IOException {
            fileScanner.close();
        }

    }
}
