package org.Lecture_3.example_1;

import java.io.FileReader;
import java.io.IOException;

public class Application {
    public static void main(String[] args) {
        // Блок try-with-resources
        try(FileReader test = new FileReader("/Users/User/.ssh/known_hosts")) {
            test.read();
        } catch (RuntimeException | IOException e) {
            System.out.println("catch exception: " + e.getClass().getSimpleName());
        }

    }
}
