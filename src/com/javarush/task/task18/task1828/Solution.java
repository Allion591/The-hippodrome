package com.javarush.task.task18.task1828;

import java.io.*;
import java.util.*;

/* 
Прайсы 2
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String file = bufferedReader.readLine();

        try (FileReader fileReader = new FileReader(file);
             BufferedReader reader = new BufferedReader(fileReader)) {

            if (args.length != 0) {

                Map<Integer, String> things = new LinkedHashMap<>();
                String line;
                while ((line = reader.readLine()) != null) {
                    String lines = (line.substring(0, line.length() - 42));
                    String part = lines.trim();
                    things.put(Integer.parseInt(part), line);
                }

                if (args[0].equals("-u")) {
                    Thing thing = new Thing();
                    thing.setId(args[1]);
                    thing.setProductName(args[2]);
                    thing.setPrice(args[3]);
                    thing.setQuantity(args[4]);

                    if (things.containsKey(Integer.parseInt(args[1]))) {
                        things.put(Integer.parseInt(args[1]), thing.toString());
                    }
                } else if (args[0].equals("-d")) {
                    Thing thing1 = new Thing();
                    thing1.setId(args[1]);
                    things.remove(Integer.parseInt(args[1]));
                }

                System.out.println(things);

                try (FileWriter writer = new FileWriter(file);
                     BufferedWriter bufferedWriter = new BufferedWriter(writer)) {

                    for (String s : things.values()) {
                        bufferedWriter.write(s + "\n");
                    }
                }
            }
        }
    }
}