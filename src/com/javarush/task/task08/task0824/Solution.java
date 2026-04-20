package com.javarush.task.task08.task0824;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* 
Собираем семейство
*/

public class Solution {
    public static void main(String[] args) {
        Human child1 = new Human();
        child1.name = "Patrick";
        child1.sex = true;
        child1.age = 12;

        Human child2 = new Human();
        child2.name = "Robbi";
        child2.sex = true;
        child2.age = 10;

        Human child3 = new Human();
        child3.name = "Patrisha";
        child3.sex = false;
        child3.age = 8;

        Human husband = new Human();
        husband.name = "Nick";
        husband.sex = true;
        husband.age = 40;

        Human wife = new Human();
        wife.name = "Mia";
        wife.sex = false;
        wife.age = 38;

        husband.children.add(child1);
        husband.children.add(child2);
        husband.children.add(child3);

        wife.children.add(child1);
        wife.children.add(child2);
        wife.children.add(child3);

        Human grandpa1 = new Human();
        Human grandpa2 = new Human();
        Human grandma1 = new Human();
        Human grandma2 = new Human();

        grandpa1.name = "OldMan";
        grandpa1.sex = true;
        grandpa1.age = 65;
        grandpa1.children.add(husband);

        grandma1.name = "OldWomen";
        grandma1.sex = false;
        grandma1.age = 60;
        grandma1.children.add(husband);

        grandpa2.name = "Buck";
        grandpa2.sex = true;
        grandpa2.age = 65;
        grandpa2.children.add(wife);

        grandma2.name = "Micky";
        grandma2.sex = false;
        grandma2.age = 60;
        grandma2.children.add(wife);

        System.out.println(grandpa1);
        System.out.println(grandma1);
        System.out.println(grandpa2);
        System.out.println(grandma2);
        System.out.println(husband);
        System.out.println(wife);
        System.out.println(child1);
        System.out.println(child2);
        System.out.println(child3);
    }

    public static class Human {
        String name;
        boolean sex;
        int age;
        List<Human> children = new ArrayList<>();

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }
}
