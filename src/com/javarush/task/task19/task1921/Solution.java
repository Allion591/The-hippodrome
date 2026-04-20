package com.javarush.task.task19.task1921;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

/* 
Хуан Хуанович
*/

public class Solution {
    public static final List<Person> PEOPLE = new ArrayList<Person>();

    public static void main(String[] args) throws IOException {
    try (BufferedReader fileReader = new BufferedReader(new FileReader(args[0]))) {
        String line;
        while ((line = fileReader.readLine()) != null) {
            String[] parts = line.split(" ");
            if (parts.length == 6) {
                Calendar calendar = Calendar.getInstance();
                calendar.set(Calendar.YEAR, Integer.parseInt(parts[5]));
                calendar.set(Calendar.MONTH, Integer.parseInt(parts[4])-1);
                calendar.set(Calendar.DAY_OF_MONTH, Integer.parseInt(parts[3]));
                Date date = calendar.getTime();

                Person person = new Person(parts[0] +" "+ parts[1] +" "+ parts[2], date);
                PEOPLE.add(person);
            } else if (parts.length == 5) {
                Calendar calendar = Calendar.getInstance();
                calendar.set(Calendar.YEAR, Integer.parseInt(parts[4]));
                calendar.set(Calendar.MONTH, Integer.parseInt(parts[3])-1);
                calendar.set(Calendar.DAY_OF_MONTH, Integer.parseInt(parts[2]));
                Date date = calendar.getTime();

                Person person = new Person(parts[0] +" "+ parts[1], date);
                PEOPLE.add(person);
            } else if (parts.length == 4) {
                Calendar calendar = Calendar.getInstance();
                calendar.set(Calendar.YEAR, Integer.parseInt(parts[3]));
                calendar.set(Calendar.MONTH, Integer.parseInt(parts[2])-1);
                calendar.set(Calendar.DAY_OF_MONTH, Integer.parseInt(parts[1]));
                Date date = calendar.getTime();

                Person person = new Person(parts[0], date);
                PEOPLE.add(person);
            }
        }
        System.out.println(PEOPLE);
    }
    }
}
