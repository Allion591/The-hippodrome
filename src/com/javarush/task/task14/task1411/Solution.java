package com.javarush.task.task14.task1411;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
User, Loser, Coder and Proger
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Person person = null;
        String key = null;
        List<Person> values = new ArrayList<>();

        while (true)
        {
            key = reader.readLine();

            if (key.equals("user")) {
                person = new Person.User();
                values.add(person);
            } else if (key.equals("loser")) {
                person = new Person.Loser();
                values.add(person);
            } else if (key.equals("coder")) {
                person = new Person.Coder();
                values.add(person);
            } else if (key.equals("proger")) {
                person = new Person.Proger();
                values.add(person);
            } else {
                break;
            }
        }

        for (Person person1 : values) {
            doWork(person1);
        }
    }

    public static void doWork(Person person) {
        if (person instanceof Person.User) {
            ((Person.User) person).live();
        } else if (person instanceof Person.Loser) {
            ((Person.Loser) person).doNothing();
        } else if (person instanceof Person.Coder) {
            ((Person.Coder) person).writeCode();
        } else if (person instanceof Person.Proger) {
            ((Person.Proger) person).enjoy();
        }
    }
}
