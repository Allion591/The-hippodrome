package com.javarush.task.task07.task0724;

/* 
Семейная перепись
*/

public class Solution {
    public static void main(String[] args) {
        Human grandpaWife = new Human("Igor", true, 50);
        Human grandMaWife = new Human("Sasha", false, 51);
        Human grandpaHusband = new Human("Oleg", true, 51);
        Human grandMaHusband = new Human("Nadya", false, 50);

        Human wife = new Human("Anna", false, 32, grandMaWife, grandpaWife);
        Human husband = new Human("Boris", true, 33, grandMaHusband, grandpaHusband);

        Human kid1 = new Human("Iris", false, 8, wife, husband);
        Human kid2 = new Human("Rinat", true, 10, wife, husband);
        Human kid3 = new Human("Andrew", true, 12, wife, husband);

        System.out.println(grandMaWife);
        System.out.println(grandpaWife);
        System.out.println(grandMaHusband);
        System.out.println(grandpaHusband);

        System.out.println(wife);
        System.out.println(husband);

        System.out.println(kid1);
        System.out.println(kid2);
        System.out.println(kid3);
    }

    public static class Human {
        String name;
        boolean sex;
        int age;
        Human father;
        Human mother;

        public Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public Human(String name, boolean sex, int age, Human mother, Human father) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null) {
                text += ", отец: " + this.father.name;
            }

            if (this.mother != null) {
                text += ", мать: " + this.mother.name;
            }

            return text;
        }
    }
}