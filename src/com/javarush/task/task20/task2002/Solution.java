package com.javarush.task.task20.task2002;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/* 
Читаем и пишем в файл: JavaRush
*/

public class Solution {
    public static void main(String[] args) {
        //you can find your_file_name.tmp in your TMP directory or adjust outputStream/inputStream according to your file's actual location
        //вы можете найти your_file_name.tmp в папке TMP или исправьте outputStream/inputStream в соответствии с путем к вашему реальному файлу
        try {
            //File yourFile = new File("d:\\1.txt");
            File yourFile = File.createTempFile("your_file_name", null);
            OutputStream outputStream = new FileOutputStream(yourFile);
            InputStream inputStream = new FileInputStream(yourFile);

            JavaRush javaRush = new JavaRush();
            /*User user = new User();
            user.setFirstName("Ivan");
            user.setLastName("Ivanov");
            Calendar calendar = Calendar.getInstance();;
            calendar.set(1991, 10-1, 11);
            Date date = calendar.getTime();
            user.setBirthDate(date);
            user.setMale(true);
            user.setCountry(User.Country.RUSSIA);

            javaRush.users.add(user);*/
            //initialize users field for the javaRush object here - инициализируйте поле users для объекта javaRush тут
            javaRush.save(outputStream);
            outputStream.flush();

            JavaRush loadedObject = new JavaRush();
            loadedObject.load(inputStream);

            /*if (javaRush.users.get(0).equals(loadedObject.users.get(0))) {
                System.out.println("similar");
            }*/
            //here check that the javaRush object is equal to the loadedObject object - проверьте тут, что javaRush и loadedObject равны

            outputStream.close();
            inputStream.close();

        } catch (IOException e) {
            //e.printStackTrace();
            System.out.println("Oops, something is wrong with my file");
        } catch (Exception e) {
            //e.printStackTrace();
            System.out.println("Oops, something is wrong with the save/load method");
        }
    }

    public static class JavaRush {
        public List<User> users = new ArrayList<>();

        public void save(OutputStream outputStream) throws Exception {
            try (OutputStreamWriter writer = new OutputStreamWriter(outputStream, StandardCharsets.UTF_8)) {
                if (!users.isEmpty()) {
                    for (User a : users) {
                        writer.write(a.getFirstName());
                        writer.write(' ');
                        writer.write(a.getLastName());
                        writer.write(' ');
                        long millis = a.getBirthDate().getTime();
                        writer.write(String.valueOf(millis));
                        writer.write(' ');
                        writer.write(a.getCountry().getDisplayName());
                        writer.write(' ');
                        if (a.isMale()) {
                            writer.write('1');
                        } else {
                            writer.write('0');
                        }
                        writer.write('\n');
                    }
                }
                writer.flush();
            }
        }

        public void load(InputStream inputStream) throws Exception {
            try (BufferedReader reader = new BufferedReader(
                    new InputStreamReader(inputStream, StandardCharsets.UTF_8))) {
                String line;
                while ((line = reader.readLine()) != null) {
                        String[] parts = line.split(" ");
                        User user = new User();
                        user.setFirstName(parts[0]);
                        user.setLastName(parts[1]);

                    long millis = Long.parseLong(parts[2]);
                    Date date = new Date(millis);
                    user.setBirthDate(date);

                    if (parts[3].equals("Russia")) {
                        user.setCountry(User.Country.RUSSIA);
                    } else if (parts[3].equals("Ukraine")) {
                        user.setCountry(User.Country.UKRAINE);
                    } else {
                        user.setCountry(User.Country.OTHER);
                    }

                    if (Integer.parseInt(parts[4]) == 1) {
                        user.setMale(true);
                    } else {
                        user.setMale(false);
                    }
                    users.add(user);
                }
            }
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            JavaRush javaRush = (JavaRush) o;

            return users != null ? users.equals(javaRush.users) : javaRush.users == null;

        }

        @Override
        public int hashCode() {
            return users != null ? users.hashCode() : 0;
        }
    }
}
