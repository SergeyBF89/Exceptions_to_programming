package org.homeWork_Seminar_3.task_1.model;

import java.util.regex.Pattern;

public class PasswordVerifier {
    private static final String Regex1 = ".{8,}";
    private static final String Regex2 = "^(?=.*\\d).{8,}$";
    private static final String Regex3 = "^(?=.*[A-Z]).{8,}$";


    private static final Pattern PATTERN1 = Pattern.compile(Regex1);
    private static final Pattern PATTERN2 = Pattern.compile(Regex2);
    private static final Pattern PATTERN3 =Pattern.compile(Regex3);

    /**
     * Метод для проверки пароля на нахождение в нем не менее 8 символов
     * @param password - Пароль пользователя типа String
     * @return - Возвращает true или false
     */
    public boolean PasswordSymbol(String password) {
        return PATTERN1.matcher(password).matches();
    }

    /**
     * Метод для проверки пароля на нахождение в нем любой цифры от 0-9
     * @param password - Пароль пользователя типа String
     * @return - Возвращает true или false
     */
    public boolean PasswordDigit(String password) {
        return PATTERN2.matcher(password).matches();
    }

    /**
     * Метод для проверки пароля на нахождение в нем любой заглавной буквы
     * @param password - Пароль пользователя типа String
     * @return - Возвращает true или false
     */
    public boolean PasswordUpperLetter(String password) {
        return PATTERN3.matcher(password).matches();
    }
}
