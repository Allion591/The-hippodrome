package com.javarush.task.task04.task0406;

/* 
Программа учета имен
*/

public class Cat {
    private String fullName;

    public void setName(String firstName, String lastName) {
        String fullName = firstName + " " + lastName;

        this.fullName = fullName;//напишите тут ваш код
    }

    public static void main(String[] args) {
        Cat cat1 = new Cat();
        cat1.setName("Barsik", "JojoУ");
        System.out.println(cat1.fullName);
        Cat cat2 = new Cat();
        cat2.setName("Jerry", "Tomas");
        System.out.println(cat2.fullName + ", " + cat1.fullName);
    }
}
