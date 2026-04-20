package com.javarush.task.task08.task0816;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.stream.Collectors;

/* 
Добрая Зинаида и летние каникулы
*/

public class Solution {
    public static Map<String, Date> createMap() throws ParseException {
        DateFormat dateFormat = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);
        Map<String, Date> map = new HashMap<>();
        map.put("Смирнов", dateFormat.parse("MAY 1 2012"));
        map.put("Петров", dateFormat.parse("DEC 12 2002"));
        map.put("Сидоров", dateFormat.parse("JUL 16 2010"));
        map.put("Булгаков", dateFormat.parse("JAN 3 2011"));
        map.put("Чайковкий", dateFormat.parse("DEC 8 2008"));
        map.put("Быков", dateFormat.parse("JUN 16 2011"));
        map.put("Сергеев", dateFormat.parse("SEP 29 2001"));
        map.put("Бурцев", dateFormat.parse("FEB 23 2002"));
        map.put("Никулин", dateFormat.parse("MAR 8 2003"));
        map.put("Вицен", dateFormat.parse("APR 14 2004"));

        return map;
    }

    public static void removeAllSummerPeople(Map<String, Date> map) {
      map.entrySet().removeIf(entry -> {
          Calendar cal = Calendar.getInstance();
          cal.setTime(entry.getValue());
          int month = cal.get(Calendar.MONTH);

          return month == Calendar.JUNE ||
                  month == Calendar.JULY ||
                  month == Calendar.AUGUST;
      });

    }

    public static void main(String[] args) {

    }
}
