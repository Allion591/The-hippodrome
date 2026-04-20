package com.javarush.task.task18.task1812;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Расширяем AmigoOutputStream
*/

public class QuestionFileOutputStream implements AmigoOutputStream {
    AmigoOutputStream current;

    public QuestionFileOutputStream(AmigoOutputStream amigoOutputStream) {
        this.current = amigoOutputStream;
    }

    @Override
    public void flush() throws IOException {
        current.flush();
    }

    @Override
    public void write(int b) throws IOException {
        current.write(b);
    }

    @Override
    public void write(byte[] b) throws IOException {
        current.write(b);
    }

    @Override
    public void write(byte[] b, int off, int len) throws IOException {
        current.write(b, off, len);
    }

    @Override
    public void close() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Вы действительно хотите закрыть поток? Д/Н");
        String answer = reader.readLine();

        if (answer.equals("Д")) {
                current.close();
        }
        reader.close();
    }
}

