package org.Lecture_2.example_2;

import java.util.Collections;

public class Application {
    public static void main(String[] args) {
        int number = 1;
        try {
            number = 10 / 2;
            String test = null;
            //System.out.println(test.length());
            Collections.emptyList().add(new Object());
        } catch (ArithmeticException e) {
            System.out.println("на ноль делить нельзя");
        } catch (NullPointerException e) {
            System.out.println("ошибка null");
        } catch (Exception e) {
            System.out.println("exception");
        }
        System.out.println(number);
    }
}
