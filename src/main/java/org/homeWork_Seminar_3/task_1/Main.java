package org.homeWork_Seminar_3.task_1;

import org.homeWork_Seminar_3.task_1.model.PasswordCheckController;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        PasswordCheckController passwordCheckController = new PasswordCheckController();

        /**
         * Выводит на экран основные пункты для создания пароля, пользователь вводит пароль и
         * если пароль соответствует всем трем пунктам ввода, пароль принимается программой
         */
        Scanner scanner = new Scanner(System.in);

        System.out.println("Пароль должен быть не менее 8 символов.");
        System.out.println("Пароль должен содержать хотя бы одну цифру.");
        System.out.println("Пароль должен содержать хотя бы одну заглавную букву");
        System.out.print("Введите пароль: ");
        String password = scanner.next();
        System.out.println(password);

        if (passwordCheckController.getCheck(password)) {
            System.out.println("Пароль верный");
        }
    }
}
