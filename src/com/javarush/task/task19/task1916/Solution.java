package com.javarush.task.task19.task1916;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/* 
Отслеживаем изменения
*/

public class Solution {
    public static List<LineItem> lines = new ArrayList<LineItem>();

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();//"d:\\1.txt";//
        String fileNameTwo = reader.readLine();//"d:\\2.txt";//

        reader.close();

        try (FileReader fileReader = new FileReader(fileName);
             FileReader fileTwoReader = new FileReader(fileNameTwo);
             BufferedReader bf1 = new BufferedReader(fileReader);
             BufferedReader bf2 = new BufferedReader(fileTwoReader)) {
            List<String> file1 = new ArrayList<>();
            List<String> file2 = new ArrayList<>();

            String line1;
            while ((line1 = bf1.readLine()) != null) {
              file1.add(line1);
            }
            String line2;
            while ((line2 = bf2.readLine()) != null) {
               file2.add(line2);
            }

            int i = 0;
            int j = 0;
            while (true) {
                if (i == file1.size() || j == file2.size()) {
                    break;
                }
                if (file1.get(i).equals(file2.get(j))) {
                    LineItem lineItem = new LineItem(Type.SAME, file1.get(i));
                    lines.add(lineItem);
                    i++;
                    j++;
                } else if (file1.get(i).equals(file2.get(j+1))) {
                    LineItem lineItem = new LineItem(Type.ADDED, file2.get(j));
                    lines.add(lineItem);
                    j++;
                } else if (file1.get(i+1).equals(file2.get(j))) {
                    LineItem lineItem = new LineItem(Type.REMOVED, file1.get(i));
                    lines.add(lineItem);
                    i++;
                }
            }

            if (i < file1.size()) {
                for (int k = i; k < file1.size(); k++) {
                    LineItem lineItem = new LineItem(Type.REMOVED, file1.get(k));
                    lines.add(lineItem);
                }
            } else if (j < file2.size()) {
                for (int l = j; l < file2.size(); l++) {
                    LineItem lineItem = new LineItem(Type.ADDED, file2.get(l));
                    lines.add(lineItem);
                }
            }

            for (LineItem item : lines) {
                System.out.println(item.toString());
            }
        }
    }


    public static enum Type {
        ADDED,        //добавлена новая строка
        REMOVED,      //удалена строка
        SAME          //без изменений
    }

    public static class LineItem {
        public Type type;
        public String line;

        public LineItem(Type type, String line) {
            this.type = type;
            this.line = line;
        }
    }
}
