package com.javarush.task.task17.task1721;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Транзакционность
*/

public class Solution {
    public static List<String> allLines = new ArrayList<String>();
    public static List<String> forRemoveLines = new ArrayList<String>();

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String fileNameFirst = reader.readLine();
        String fileNameSecond = reader.readLine();

        reader = new BufferedReader(new FileReader(fileNameFirst));
        while (reader.ready()) {
            allLines.add(reader.readLine());
        }

        reader = new BufferedReader(new FileReader(fileNameSecond));
        while (reader.ready()) {
            forRemoveLines.add(reader.readLine());
        }

        try {
            Solution solution = new Solution();
            solution.joinData();
        } catch (CorruptedDataException e) {
            e.printStackTrace();
        }
    }


    public void joinData() throws CorruptedDataException {
        int removeLineSize = forRemoveLines.size();
        int result = 0;
        for (String s : forRemoveLines) {
            if (allLines.contains(s)) {
                result++;
            }
        }

        if (removeLineSize == result) {
            for (String line : forRemoveLines) {
                allLines.remove(line);
            }
        } else {
            allLines.clear();
            throw new CorruptedDataException();
        }
    }
}
