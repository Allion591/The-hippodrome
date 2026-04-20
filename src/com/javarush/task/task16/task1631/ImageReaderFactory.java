package com.javarush.task.task16.task1631;

import com.javarush.task.task16.task1631.common.*;

public class ImageReaderFactory {

    public static ImageReader getImageReader(ImageTypes types) {
        if (types != null) {
            if (types.equals(ImageTypes.JPG)) {
                return new JpgReader();
            } else if (types.equals(ImageTypes.BMP)) {
                return new BmpReader();
            } else if (types.equals(ImageTypes.PNG)) {
                return new PngReader();
            } else {
                throw new IllegalArgumentException();
            }
        } else {
            throw new IllegalArgumentException();
        }
    }
}
