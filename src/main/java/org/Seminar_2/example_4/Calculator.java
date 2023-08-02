package org.Seminar_2.example_4;

public class Calculator {
    public static int divide(int a, int b) throws DivisionByZeroException {
        if (b == 0) {
            throw new DivisionByZeroException("Деление на ноль недопустимо!");
        }
        return a / b;
    }

    public static void main(String[] args) {
        int number1 = 10;
        int number2 = 0;
        try {
            int result = divide(number1, number2);
            System.out.println("Результат деления: = " + result);
        } catch (DivisionByZeroException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}
