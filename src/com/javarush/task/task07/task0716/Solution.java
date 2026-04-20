package com.javarush.task.task07.task0716;

import java.util.ArrayList;
import java.util.Arrays;

/* 
Р или Л
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<String>();
        strings.add("роза");
        strings.add("лоза");
        strings.add("лира");
        strings = fix(strings);

        for (String string : strings) {
            System.out.println(string);
        }
    }

    public static ArrayList<String> fix(ArrayList<String> strings) {
        ArrayList<String> fixList = new ArrayList<>(strings);
        for (String str : strings) {
            String[] values = str.split("");
            ArrayList<String> value = new ArrayList<>(Arrays.asList(values));
            if (value.containsAll(Arrays.asList("р", "л"))) {
                    continue;
            } else if (value.contains("р")) {
                fixList.remove(str);
            } else if (value.contains("л")) {
                fixList.add(str);
            } else {
                continue;
            }
        }
        return fixList;
    }
}