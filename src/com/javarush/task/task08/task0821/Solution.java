package com.javarush.task.task08.task0821;

import java.util.HashMap;
import java.util.Map;

/* 
Однофамильцы и тёзки
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, String> map = createPeopleMap();
        printPeopleMap(map);
    }

    public static Map<String, String> createPeopleMap() {
        Map<String, String> names = new HashMap<>();

        names.put("Chuk", "a");
        names.put("Xiao", "y");
        names.put("S", "a");
        names.put("f", "d");
        names.put("q", "v");
        names.put("S", "e");
        names.put("h", "r");
        names.put("j", "t");
        names.put("k", "y");
        names.put("l", "u");

        return names;
    }

    public static void printPeopleMap(Map<String, String> map) {
        for (Map.Entry<String, String> s : map.entrySet()) {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }
}
