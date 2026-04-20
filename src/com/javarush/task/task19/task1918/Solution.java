package com.javarush.task.task19.task1918;

import java.awt.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* 
Знакомство с тегами
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = "d:\\3.html";//reader.readLine();
        reader.close();

        try (BufferedReader fileReader = new BufferedReader(new FileReader(fileName))) {
            String line;
            int i = 0;
            List<String> parts = new ArrayList<>();
            while ((line = fileReader.readLine()) != null) {
                line = line.replaceAll("[\\r\\n]+", "");
                if (i == args.length || line.length() < 2) {
                    break;
                }

                int start = line.indexOf("<" + args[i]);
                int end = line.indexOf("</" + args[i] + ">");
                int nextEnd = line.indexOf("</" + args[i] + ">", end+1);
                int endOfClosingTag = 0;

                if (nextEnd != -1) {
                    int closingTagLength = ("</" + args[i] + ">").length();
                    endOfClosingTag = nextEnd + closingTagLength;
                    String part = line.substring(start, endOfClosingTag);
                    parts.add(part);
                } else if (start != -1) {
                    String part1 = line.substring(start, end);
                    parts.add(part1);
                }

                String part2 = line.substring(endOfClosingTag, line.length());

                Pattern pattern = Pattern.compile("<"+ args[i]+".*?"+ args[i]+ ">");
                Matcher matcher = pattern.matcher(part2);

                while (matcher.find()) {
                    parts.add(matcher.group());
                }
            }
            for (String s : parts) {
                System.out.println(s);
            }
        }
    }
}