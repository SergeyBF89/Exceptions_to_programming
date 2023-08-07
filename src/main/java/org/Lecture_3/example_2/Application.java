package org.Lecture_3.example_2;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Application {
    public static void main(String[] args) {
        // Копирование содержимого файла в другой файл, в блоке try-with-resources
        try (FileReader reader = new FileReader("/Users/User/.ssh/known_hosts");
            FileWriter writer = new FileWriter("test")) {
            while (reader.ready()) {
                writer.write(reader.read());
            }
        }catch (RuntimeException | IOException e) {
            System.out.println("catch exception: " + e.getClass().getSimpleName());
        }
        System.out.println("Copy successfully");
    }
}
