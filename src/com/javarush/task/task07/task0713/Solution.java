package com.javarush.task.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Играем в Jолушку
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<Integer> listAll = new ArrayList<>();
        ArrayList<Integer> listDiv_3 = new ArrayList<>();
        ArrayList<Integer> listDiv_2 = new ArrayList<>();
        ArrayList<Integer> list_NotDiv = new ArrayList<>();
        int value;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        do {
            String str = reader.readLine();
            value = Integer.parseInt(str);
            listAll.add(value);
        } while (value != 20);

        for (Integer i : listAll) {
            if (i % 3 == 0 && i % 2 == 0) {
                listDiv_3.add(i);
                listDiv_2.add(i);
            } else if (i % 3 == 0) {
                listDiv_3.add(i);
            } else if (i % 2 == 0) {
                listDiv_2.add(i);
            } else {
                list_NotDiv.add(i);
            }
        }

        printList(listDiv_3);
        printList(listDiv_2);
        printList(list_NotDiv);


    }

    public static void printList(ArrayList<Integer> list) {
        for (Integer i : list) {
            System.out.println(i);
        }//напишите тут ваш код
    }
}
