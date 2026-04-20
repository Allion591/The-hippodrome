package com.javarush.task.task15.task1527;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Парсер реквестов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String url = reader.readLine();
        String part = url.substring(url.lastIndexOf("?") + 1);

        String[] parts = part.split("&");

        String obj = null;

        for (String s : parts) {
            int index = s.indexOf("=");
            String result = index != -1 ? s.substring(0, index) : s;

            if (result.equals("obj")) {
                obj = s;
            }

            System.out.print(result + " ");
        }

        System.out.println();

        if (obj != null) {
            String[] par = obj.split("=");
            try {
                double value = Double.parseDouble(par[1]);
                alert(value);
            } catch (NumberFormatException e) {
                alert(par[1]);
            }
        }
    }

    public static void alert(double value) {
        System.out.println("double: " + value);
    }

    public static void alert(String value) {
        System.out.println("String: " + value);
    }
}
