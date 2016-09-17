package com.javarush.test.level16.lesson13.bonus01;

import com.javarush.test.level16.lesson13.bonus01.common.*;

/**
 * Created by Денис on 12.05.2016.
 */
public class ImageReaderFactory
{
    static ImageReader getReader(ImageTypes i) {
        if (i == ImageTypes.BMP) return new BmpReader();
        else if (i == ImageTypes.JPG) return new JpgReader();
        else if (i == ImageTypes.PNG) return new PngReader();
        else {
            throw new IllegalArgumentException("Неизвестный тип картинки");
        }
    }
}
