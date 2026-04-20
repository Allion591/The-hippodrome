package com.javarush.task.task08.task0818;

import java.util.HashMap;
import java.util.Map;

/* 
Только для богачей
*/

public class Solution {
    public static Map<String, Integer> createMap() {
        Map<String, Integer> map = new HashMap<>();
        map.put("Петров", 100);
        map.put("Иванов", 200);
        map.put("Сергеев", 300);
        map.put("Коляев", 400);
        map.put("Чутков", 500);
        map.put("Денисов", 600);
        map.put("Ефимов", 700);
        map.put("Юриев", 800);
        map.put("Соколов", 900);
        map.put("Евгениев", 1000);

        return map;
    }

    public static void removeItemFromMap(Map<String, Integer> map) {
        Map<String, Integer> copy = new HashMap<>(map);
        for (Map.Entry<String, Integer> salary : copy.entrySet()) {
            if (salary.getValue() < 500) {
                map.remove(salary.getKey());
            }
        }
    }

    public static void main(String[] args) {
    }
}