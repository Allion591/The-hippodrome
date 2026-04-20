package com.javarush.task.task20.task2013;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* 
Externalizable Person
*/

public class Solution {
    public static class Person implements Externalizable {
        private String firstName;
        private String lastName;
        private int age;
        private Person mother;
        private Person father;
        private List<Person> children;

        public Person() {
        }
        public Person(String firstName, String lastName, int age) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
        }

        public void setMother(Person mother) {
            this.mother = mother;
        }

        public void setFather(Person father) {
            this.father = father;
        }

        public void setChildren(List<Person> children) {
            this.children = children;
        }

        @Override
        public void writeExternal(ObjectOutput out) throws IOException {
            out.writeObject(firstName);
            out.writeObject(lastName);
            out.writeObject(father);
            out.writeObject(mother);
            out.writeInt(age);
            out.writeObject(children);
        }

        @Override
        public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
            firstName = (String) in.readObject();
            lastName = (String) in.readObject();
            father = (Person) in.readObject();
            mother = (Person) in.readObject();
            age = in.readInt();
            children = (List<Person>) in.readObject();
        }
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Person writePerson = new Person("John", "Rambo", 35);
        writePerson.setMother(new Person("Mother", "M", 55));
        writePerson.setFather(new Person("Father", "F", 65));
        writePerson.setChildren(new ArrayList<>(Arrays.asList(
                new Person("Child1", "Ch1", 15),
                new Person("Child2", "Ch2", 10))));


        File tempFile = new File("d:\\1.txt");
        writePerson.writeExternal(new ObjectOutputStream(new FileOutputStream(tempFile)));

        Person readPerson = new Person();
        readPerson.readExternal(new ObjectInputStream(new FileInputStream(tempFile)));

        System.out.println(writePerson);
        System.out.println("============================");
        System.out.println(readPerson);

        System.out.printf("\nwritePerson equals readPerson: %b\n",
                writePerson.equals(readPerson));
    }
}
