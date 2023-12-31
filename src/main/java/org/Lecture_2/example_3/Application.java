package org.Lecture_2.example_3;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Application {
    public static void main(String[] args) {
        FileReader test = null;
        try {
            test = new FileReader("/Users/User/.ssh/known_hosts");
            //test.read();
        } catch (RuntimeException | IOException e) {
            System.out.println("catch exception: " + e.getClass().getSimpleName());
        } finally {
            System.out.println("finally start");
            if (test != null) {
                try {
                    test.close();
                } catch (IOException e) {
                    System.out.println("exception while close");
                }
            }
            System.out.println("finally finish");
        }

    }
}
