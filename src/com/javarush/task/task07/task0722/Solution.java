package com.javarush.task.task07.task0722;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Это конец
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> line = new ArrayList<>();

        for (int i = 0; i < i+1; i++) {
            String value = reader.readLine();
            if (value.equals("end")) {
                break;
            } else {
                line.add(value);
            }
        }
        for (String s: line) {
            System.out.println(s);
        }
    }
}