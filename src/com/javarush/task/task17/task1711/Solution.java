package com.javarush.task.task17.task1711;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
CRUD 2
*/

public class Solution {
    public static volatile List<Person> allPeople = new ArrayList<Person>();
    private static SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyy", Locale.ENGLISH);

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) {
        switch (args[0]) {
            case "-c": {
                synchronized (allPeople) {
                    create(args);
                }
                break;
            }
            case "-u": {
                synchronized (allPeople) {
                    update(args);
                }
                break;
            }
            case "-d": {
                synchronized (allPeople) {
                    delete(args);
                }
                break;
            }
            case "-i": {
                synchronized (allPeople) {
                    print(args);
                }
                break;
            }
        }
    }

    public static void create(String[] values) {
        for (int i = 1; i < values.length;) {
            Person person = null;
            String name = values[i];
            String sex = values[i+1];
            Date date = null;
            try {
                date = format.parse(values[i+2]);
            } catch (Exception e) {}

            if (sex.equals("м")) {
                person = Person.createMale(name, date);
            } else if (sex.equals("ж")) {
                person = Person.createFemale(name, date);
            }
            allPeople.add(person);

            System.out.println(allPeople.indexOf(person));

            i = i+3;
        }
    }

    public static void update(String[] values) {
        for (int i = 1; i < values.length;) {
            Person person = allPeople.get(Integer.parseInt(values[i]));
            person.setName(values[i+1]);

            if (values[i+2].equals("м")) {
                person.setSex(Sex.MALE);
            } else if (values[i+2].equals("ж")) {
                person.setSex(Sex.FEMALE);
            }

            Date date = null;
            try {
                date = format.parse(values[i+3]);
            } catch (Exception e) {}

            person.setBirthDate(date);

            i = i + 4;
        }
    }

    public static void delete(String[] values) {
        for (int i = 1; i < values.length; i++) {
            int id = Integer.parseInt(values[i]);
            Person person = allPeople.get(id);
            person.setName(null);
            person.setSex(null);
            person.setBirthDate(null);
        }
    }

    public static void print(String[] values) {
        SimpleDateFormat format = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);
        for (int i = 1; i < values.length; i++) {
            int id = Integer.parseInt(values[i]);

            Person person = allPeople.get(id);
            String formattedDate = format.format(person.getBirthDate());

            String sex = null;
            if (person.getSex().equals(Sex.MALE)) {
                sex = "м";
            } else if (person.getSex().equals(Sex.FEMALE)) {
                sex = "ж";
            }
            System.out.println(person.getName() + " " + sex + " " + formattedDate);
        }
    }
}
