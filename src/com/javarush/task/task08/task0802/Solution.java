package com.javarush.task.task08.task0802;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* 
Map из 10 пар
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, String> plants = new HashMap<>();

        plants.put("арбуз", "ягода");
        plants.put("банан", "трава");
        plants.put("вишня", "ягода");
        plants.put("груша", "фрукт");
        plants.put("дыня", "овощ");
        plants.put("ежевика", "куст");
        plants.put("жень-шень", "корень");
        plants.put("земляника", "ягода");
        plants.put("ирис", "цветок");
        plants.put("картофель", "клубень");

        for (Map.Entry<String, String> plant : plants.entrySet()) {
            String key = plant.getKey();
            String value = plant.getValue();

            System.out.println(key + " - " + value);
        }
    }
}