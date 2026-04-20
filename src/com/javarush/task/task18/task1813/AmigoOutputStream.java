package com.javarush.task.task18.task1813;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/* 
AmigoOutputStream
*/

public class AmigoOutputStream extends FileOutputStream {
    public static String fileName = "C:/tmp/result.txt";
    private FileOutputStream current;

    public AmigoOutputStream(FileOutputStream current) throws FileNotFoundException {
        super(fileName);
        this.current = current;
    }

    public static void main(String[] args) throws FileNotFoundException {
        new AmigoOutputStream(new FileOutputStream(fileName));
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
    public void write(byte[] b, int off, int length) throws IOException {
        current.write(b, off, length);
    }

    @Override
    public void close() throws IOException {
        flush();
        String line = "JavaRush © All rights reserved.";
        write(line.getBytes());
        current.close();
    }
}
