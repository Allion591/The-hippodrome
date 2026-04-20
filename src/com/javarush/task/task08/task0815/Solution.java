package com.javarush.task.task08.task0815;

import java.sql.DataTruncation;
import java.util.HashMap;
import java.util.Map;

/* 
Перепись населения
*/

public class Solution {
    public static Map<String, String> createMap() {
        Map<String, String> names = new HashMap<>();
        names.put("Воронов","Александр");
        names.put("Сидоров","Руслан");
        names.put("Волков","Андрей");
        names.put("Иванов","Иван");
        names.put("Петров","Алексей");
        names.put("Левшов","Андрей");
        names.put("Правшов","Николай");
        names.put("Номерин","Юрий");
        names.put("Бурцев","Евгении");
        names.put("Парков","Михаил");

        return names;
    }

    public static int getCountTheSameFirstName(Map<String, String> map, String name) {
        int count = 0;
        for (String nameFrom : map.values()) {
            if (nameFrom.equals(name)) {
                count++;
            }
        }
        return count;
    }

    public static int getCountTheSameLastName(Map<String, String> map, String lastName) {
        int count = 0;
        for (String lastNameFrom : map.keySet()) {
            if (lastNameFrom.equals(lastName)) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
    }
}
