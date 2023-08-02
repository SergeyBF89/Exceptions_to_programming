package org.homeWork_Seminar_2;

import java.util.Scanner;

public class Calculator {
    public static int divide(int a, int b) throws DivisionByZeroException {
        if (b == 0) {
            throw new DivisionByZeroException("Деление на ноль недопустимо!");
        }
        return a / b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        try {
//            System.out.println("Введите число: ");
//            int number1 = scanner.nextInt();
//            checkNumber(number1);
//        } catch (InvalidNumberException e) {
//            System.out.println(e.getMessage());
//        }
        try {
            System.out.println("Введите первое число: ");
            int number1 = scanner.nextInt();
            System.out.println("Введите второе число: ");
            int number2 = scanner.nextInt();
            System.out.println("Введите третье число: ");
            int number3 = scanner.nextInt();
            checkNumbers(number1, number2, number3);
        } catch (DivisionByZeroException | NumberSumException | NumberOutOfRangeException e) {
            System.out.println(e.getMessage());
        }

    }
    public static void checkNumber(int value) throws InvalidNumberException {
        if (value <= 0) {
            throw new InvalidNumberException("Некорректное число");
        } else {
            System.out.println("Число корректно");
        }
    }

    public static void checkNumbers(int number1, int number2, int number3) throws NumberOutOfRangeException, NumberSumException,
            DivisionByZeroException {
        if (number1 > 100) {
            throw new NumberOutOfRangeException("Первое число вне диапазона");
        } else if (number2 < 0) {
            throw new NumberOutOfRangeException("Второе число вне диапазона");
        } else if (number1 + number2 < 10) {
            throw new NumberSumException("Сумма чисел слишком маленькая");
        } else if (number3 == 0) {
            throw new DivisionByZeroException("Деление на ноль не допустимо");
        } else {
            System.out.println("Проверка пройдена успешно");
        }
    }

}
