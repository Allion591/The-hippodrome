package com.javarush.task.task09.task0922;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/* 
Какое сегодня число?
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        SimpleDateFormat format = new SimpleDateFormat("MMM dd, yyyy", Locale.ENGLISH);

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] dateInput = reader.readLine().split("-");

        int year = Integer.parseInt(dateInput[0]);
        int month = Integer.parseInt(dateInput[1]);
        int day = Integer.parseInt(dateInput[2]);

        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month - 1, day);

        Date finishDate = calendar.getTime();

        System.out.println(format.format(finishDate).toUpperCase(Locale.ROOT));
    }
}
