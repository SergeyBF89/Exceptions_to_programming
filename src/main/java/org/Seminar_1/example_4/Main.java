package org.Seminar_1.example_4;

public class Main {
    public static void main(String[] args) {
        // Генерировать исключения в ручную
        try {
            System.out.println("Test1");
            throw new ArithmeticException();
        }
        catch (ArithmeticException e) {
            System.out.println("Test2");
        }
        System.out.println("Test3");
    }
}
