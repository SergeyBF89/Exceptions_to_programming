package org.homeWork_Seminar_3.task_1.model;

import org.homeWork_Seminar_3.task_1.model.createException.InvalidPasswordDigitException;
import org.homeWork_Seminar_3.task_1.model.createException.InvalidPasswordSymbolException;
import org.homeWork_Seminar_3.task_1.model.createException.InvalidPasswordUpperLetterException;

public class PasswordCheckController {
    CheckPassword checkPassword = new CheckPassword();

    /**
     * Метод проверки пароля специальным требованиям, если требования не выполняются,
     * сообщается об ошибке
     * @param password - Пароль пользователя типа String
     * @return - Возвращает true, если проверка пройдена успешно
     */
    public boolean getCheck(String password) {
        try {
            checkPassword.checkPassword(password);
        } catch (InvalidPasswordDigitException | InvalidPasswordSymbolException | InvalidPasswordUpperLetterException e) {
            System.out.println("Error: Пароль не верный");
            throw new RuntimeException(e.getMessage());
        }
        return true;
    }
}
