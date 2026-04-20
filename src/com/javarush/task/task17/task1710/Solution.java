package com.javarush.task.task17.task1710;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
CRUD
*/

public class Solution {
    public static List<Person> allPeople = new ArrayList<Person>();
    private static SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) {
        if (args[0].equals("-c")) {
        create(args[1], args[2], args[3]);
        } else if (args[0].equals("-r")) {
            print(args[1]);
        } else if (args[0].equals("-u")) {
            update(args[1], args[2], args[3], args[4]);
        } else if (args[0].equals("-d")) {
            delete(args[1]);
        }
    }

    public static void create(String name, String sex, String bd) {
        Date date = null;
        Person person = null;
        try {
            date =format.parse(bd);
        } catch (Exception e) {
            System.out.println("Неизвестный формат");
        }

        if (sex.equals("м")) {
            person = Person.createMale(name, date);
        } else if (sex.equals("ж")) {
            person = Person.createFemale(name, date);
        }

        if (person != null) {
            allPeople.add(person);
        }

        if (allPeople.contains(person)) {
            System.out.println(allPeople.indexOf(person));
        }
    }

    public static void print(String line) {
        int ids = Integer.parseInt(line);

        Person person = allPeople.get(ids);

        SimpleDateFormat formatter = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);
        String formattedDate = formatter.format(person.getBirthDate());

        String sex = null;

        if (person.getSex() == Sex.MALE) {
            sex = "м";
        } else if (person.getSex() == Sex.FEMALE) {
            sex = "ж";
        }

        System.out.println(person.getName() + " " + sex + " " + formattedDate);
    }

    public static void update(String lineId, String name, String sex, String bd) {
        int ids = Integer.parseInt(lineId);
        Person person = allPeople.get(ids);

        if (name != null) {
            person.setName(name);
        }

        if (sex != null) {
            if (sex.equals("м")) {
                person.setSex(Sex.MALE);
            } else if (sex.equals("ж")) {
                person.setSex(Sex.FEMALE);
            }
        }
        if (bd != null) {
            Date date = null;
            try {
                date = format.parse(bd);
            } catch (Exception e) {

            }

            person.setBirthDate(date);
        }
    }

    public static void delete(String lineId) {
        int ids = Integer.parseInt(lineId);
        Person person = allPeople.get(ids);
        person.setName(null);
        person.setSex(null);
        person.setBirthDate(null);

    }
}
