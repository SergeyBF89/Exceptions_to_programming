package org.Seminar_3.example_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Введите первое число: ");
            double number1 = scanner.nextDouble();
            System.out.println("Введите операцию (+, -, *, /, ^): ");
            char operator = scanner.next().charAt(0);
            System.out.println("Введите второе число: ");
            double number2 = scanner.nextDouble();

            double result = calculate(number1, operator, number2);
            System.out.println("Результат = " + result);
        } catch (InvalidInputException e) {
            System.out.println(e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }

    public static double calculate(double number1, char operator, double number2)
           throws InvalidInputException, ArithmeticException {
        switch (operator) {
            case '+':
                return number1 + number2;
            case '-':
                return number1 - number2;
            case '*':
                return number1 * number2;
            case '/':
                if (number2 == 0) {
                    throw new ArithmeticException("Деление на ноль недопустимо!");
                }
                return number1 / number2;
            case '^':
                if (number1 == 0 && number2 < 0) {
                    throw new InvalidInputException("Ноль не может быть возведен в отрицательную степень!");
                }
                return Math.pow(number1, number2);
            default:
                throw new InvalidInputException("Недопустимая операция: " + operator);
        }
    }
}
