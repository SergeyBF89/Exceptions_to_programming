package org.Lecture_1;

import java.io.File;

public class Application {
    public static void main(String[] args) {
        //System.out.println(getFileSize(new File("/Users/User/Downloads/2023-07-04_23-51-45.png")));
        System.out.println(divide2(10, 0));
    }

    // Функция, которая возвращает размер файла на нашем компьютере
    public static long getFileSize(File file) {
        if (!file.exists()) {
            return -1; // проверка, если файла не существует
        }
        return file.length();
    }

    // Функция деления
    public static int divide(int a1, int a2) {
        if (a2 == 0) {
            return -1; // проверка деления на 0
        }
        return a1 / a2;
    }

    // Функция деления с выбросом исключения
    public static int divide2(int a1, int a2) {
        if (a2 == 0) {
            throw new RuntimeException("Divide by zero not permitted");
        }
        return a1 / a2;
    }
}
