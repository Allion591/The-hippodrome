package com.javarush.task.task08.task0819;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* 
Set из котов
*/

public class Solution {

    public static void main(String[] args) {
        Set<Cat> cats = createCats();
        List<Cat> catsForRemove = new ArrayList<>(cats);
        Cat cat = catsForRemove.get(0);
        cats.remove(cat);
        printCats(cats);
    }

    public static Set<Cat> createCats() {
        Cat cat1 = new Cat();
        cat1.name = "Murka";
        Cat cat2 = new Cat();
        cat2.name = "Barsik";
        Cat cat3 = new Cat();
        cat3.name = "Mouse";
        Set<Cat> cats = new HashSet<>();
        cats.add(cat1);
        cats.add(cat2);
        cats.add(cat3);
        return cats;
    }

    public static void printCats(Set<Cat> cats) {
        for (Cat cat : cats) {
            System.out.println(cat);
        }
    }

    public static class Cat {
    String name;
    }
}
