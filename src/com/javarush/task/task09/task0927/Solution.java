package com.javarush.task.task09.task0927;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* 
Десять котов
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, Cat> map = createMap();
        Set<Cat> set = convertMapToSet(map);
        printCatSet(set);
    }

    public static Map<String, Cat> createMap() {
        Map<String, Cat> cats = new HashMap<>();
        Cat cat1 = new Cat("Bob");
        Cat cat2 = new Cat("Boq");
        Cat cat3 = new Cat("Bow");
        Cat cat4 = new Cat("Boe");
        Cat cat5 = new Cat("Bor");
        Cat cat6 = new Cat("Boa");
        Cat cat7 = new Cat("Bot");
        Cat cat8 = new Cat("Boy");
        Cat cat9 = new Cat("Bou");
        Cat cat10 = new Cat("Bog");

        cats.put(cat1.name, cat1);
        cats.put(cat2.name, cat2);
        cats.put(cat3.name, cat3);
        cats.put(cat4.name, cat4);
        cats.put(cat5.name, cat5);
        cats.put(cat6.name, cat6);
        cats.put(cat7.name, cat7);
        cats.put(cat8.name, cat8);
        cats.put(cat9.name, cat9);
        cats.put(cat10.name, cat10);

        return cats;
    }

    public static Set<Cat> convertMapToSet(Map<String, Cat> map) {

        Set<Cat> newCats = new HashSet<>(map.values());

        return newCats;
    }

    public static void printCatSet(Set<Cat> set) {
        for (Cat cat : set) {
            System.out.println(cat);
        }
    }

    public static class Cat {
        private String name;

        public Cat(String name) {
            this.name = name;
        }

        public String toString() {
            return "Cat " + this.name;
        }
    }


}
