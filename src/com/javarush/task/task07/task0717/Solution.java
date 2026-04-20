package com.javarush.task.task07.task0717;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Удваиваем слова
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> list = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int count = 0;

        while (true) {
            String line = reader.readLine();
            list.add(line);
            count++;
            if (count == 10) {
                break;
            }
        }

        ArrayList<String> result = doubleValues(list);

        for (String str : result) {
            System.out.println(str);
        }// Вывести на экран result
    }

    public static ArrayList<String> doubleValues(ArrayList<String> list) {
        ArrayList<String> listSave = new ArrayList<>();
        for (String str : list) {
            listSave.add(str);
            listSave.add(str);
        }//напишите тут ваш код
        return listSave;
    }
}
