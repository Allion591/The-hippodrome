package com.javarush.task.task18.task1827;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* 
Прайсы
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String file = bufferedReader.readLine();

        try (FileReader fileReader = new FileReader(file);
             BufferedReader reader = new BufferedReader(fileReader);

        FileWriter writer = new FileWriter(file, true);
        BufferedWriter bufferedWriter = new BufferedWriter(writer)) {
            if (args.length != 0) {
                    StringBuilder productName = new StringBuilder(args[1]);

                    if (productName.length() < 30) {
                        for (int i = productName.length(); i < 30; i++) {
                            productName.append(" ");
                        }
                    }

                    StringBuilder price = new StringBuilder(args[2]);
                    if (price.length() < 8) {
                        for (int i = price.length(); i < 8; i++) {
                            price.append(" ");
                        }
                    }

                    StringBuilder quantity = new StringBuilder(args[3]);
                    if (quantity.length() < 4) {
                        for (int i = quantity.length(); i < 4; i++) {
                            quantity.append(" ");
                        }
                    }

                    List<Integer> ids = new ArrayList<>();
                    String line;
                    while ((line = reader.readLine()) != null) {
                        String lines = (line.substring(0, line.length() - 42));
                        String part = lines.trim();
                        ids.add(Integer.parseInt(part));
                    }

                    Collections.sort(ids);

                    int id = ids.get(ids.size() - 1) + 1;

                    StringBuilder newId = new StringBuilder(String.valueOf(id));
                    if (newId.length() < 8) {
                        for (int i = newId.length(); i < 8; i++) {
                            newId.append(" ");
                        }
                    }

                    String newLine = "\n" + newId +
                            productName +
                            price +
                            quantity;

                    bufferedWriter.write(newLine);
            }
        }
    }
}
