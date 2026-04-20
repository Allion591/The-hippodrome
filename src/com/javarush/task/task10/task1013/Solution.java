package com.javarush.task.task10.task1013;

/* 
Конструкторы класса Human
*/

public class Solution {
    public static void main(String[] args) {
    }

    public static class Human {
        private int age;
        private int weight;
        private int length;
        private String name;
        private String secondName;
        private boolean sex;

        public Human() {}
        public Human(int age, int weight, int length, String name, String secondName, boolean sex) {
            this.age = age;
            this.weight = weight;
            this.length = length;
            this.name = name;
            this.secondName = secondName;
            this.sex = sex;
        }
        public Human(int age) {
            this.age = age;
        }
        public Human(int age, int weight) {
            this.age = age;
            this.weight = weight;
        }

        public Human(int age, int weight, int length) {
            this.age = age;
            this.weight = weight;
            this.length = length;
        }
        public Human(int age, int weight, int length, String name) {
            this.age = age;
            this.weight = weight;
            this.length = length;
            this.name = name;
        }

        public Human(int age, int weight, int length, String name, String secondName) {
            this.age = age;
            this.weight = weight;
            this.length = length;
            this.name = name;
            this.secondName = secondName;
        }
        public Human(boolean sex) {
            this.sex = sex;
        }
        public Human(String name) {
            this.name = name;
        }

        public Human(String name, int age, boolean sex) {
            this.name = name;
            this.age = age;
            this.sex = sex;
        }
    }
}
