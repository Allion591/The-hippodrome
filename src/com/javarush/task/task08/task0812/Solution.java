package com.javarush.task.task08.task0812;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/* 
Cамая длинная последовательность
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        List<Integer> values = new ArrayList<>();

        for (int i = 1; i <= 10; i++) {
            values.add(Integer.parseInt(reader.readLine()));
        }
        reader.close();

        int line = 1;
        int firstLine = 1;
        for (int i = 1; i < values.size(); i++) {
            if (values.get(i).equals(values.get(i-1))) {
                line++;
                if (line > firstLine) {
                    firstLine = line;
            }
            } else {
                line = 1;
            }
        }

        writer.write(firstLine + "\n");
        writer.close();
    }

    }

