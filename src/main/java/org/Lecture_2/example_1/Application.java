package org.Lecture_2.example_1;

import java.io.File;
import java.util.Collections;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        // NullPointerException - обращение к не существующему объекту
        String name = null;
        //System.out.println(name.length());

        // ClassCastException - неверное приведение типов
        Object object = new String("123");
        //File file = (File) object;
        //System.out.println(file);

        // NumberFormatException - неверное преобразование символьной строки в числовой формат
        String number = "123fq";
        //int result = Integer.parseInt(number);
        //System.out.println(result);

        // UnsupportedOperationException - попытка выполнения не реализованного метода
        List<Object> emptyList = Collections.emptyList();
        emptyList.add(new Object());
    }
}
