package com.javarush.task.task20.task2003;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/* 
Знакомство с properties
*/

public class Solution {

    public static Map<String, String> runtimeStorage = new HashMap<>();
    /*static File file = new File("d:\\2.properies");
    static OutputStream outputStream;

    static {
        try {
            outputStream = new FileOutputStream(file);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        runtimeStorage.put("Privet", "Idi v zal");
        runtimeStorage.put("Skolko mojno", "typit");
        try {
            save(outputStream);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }*/

    public static void save(OutputStream outputStream) throws Exception {
        Properties properties = new Properties();
        try (OutputStreamWriter writer = new OutputStreamWriter(outputStream)) {
            for (Map.Entry<String, String> entry : runtimeStorage.entrySet()) {
                properties.setProperty(entry.getKey(), entry.getValue());
            }

            properties.store(writer, "d:\\2.properties");
        }
    }

    public static void load(InputStream inputStream) throws IOException {
        Properties properties = new Properties();
        try (InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
                BufferedReader reader = new BufferedReader(inputStreamReader)) {
           properties.load(reader);
           for (Map.Entry<Object, Object> entry : properties.entrySet()) {
               runtimeStorage.put(entry.getKey().toString(), entry.getValue().toString());
           }
        }
    }

    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             FileInputStream fos = new FileInputStream(reader.readLine())) {
            load(fos);
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(runtimeStorage);
    }
}
