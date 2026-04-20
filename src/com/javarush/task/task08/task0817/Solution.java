package com.javarush.task.task08.task0817;

import java.util.HashMap;
import java.util.Map;

/* 
Нам повторы не нужны
*/

public class Solution {
    public static Map<String, String> createMap() {
        Map<String, String> map = new HashMap<>();
        map.put("Петров", "Иван");
        map.put("Иванов", "Петр");
        map.put("Сергеев", "Коля");
        map.put("Коляев", "Сергей");
        map.put("Чутков", "Денис");
        map.put("Денисов", "Чут");
        map.put("Ефимов", "Юрий");
        map.put("Юриев", "Петр");
        map.put("Соколов", "Евгении");
        map.put("Евгениев", "Сокол");

        return map;
    }

    public static void removeTheFirstNameDuplicates(Map<String, String> map) {
        Map<String, String> copy = new HashMap<>(map);
        Map<String, String> copySecond = new HashMap<>(map);
        for (String name : copy.values()) {
            int count = 0;
           for (String secondName : copySecond.values()) {
               if (secondName.equals(name)) {
                   count++;
               } if (count == 2) {
                   removeItemFromMapByValue(map, name);
                   count = 0;
               }
           }
        }
    }

    public static void removeItemFromMapByValue(Map<String, String> map, String value) {
        Map<String, String> copy = new HashMap<>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value)) {
                map.remove(pair.getKey());
            }
        }
    }

    public static void main(String[] args) {
    }
}
