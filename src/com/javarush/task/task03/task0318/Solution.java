package com.javarush.task.task03.task0318;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
План по захвату мира
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Your name");
        String name = reader.readLine();
        System.out.println("Your age");
        String sAge = reader.readLine();

        int nAge = Integer.parseInt(sAge);//напишите тут ваш код
        System.out.println(name + " захватит мир через " + nAge + " лет. Му-ха-ха!");
    }
}
