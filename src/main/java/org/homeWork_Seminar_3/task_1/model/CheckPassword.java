package org.homeWork_Seminar_3.task_1.model;

import org.homeWork_Seminar_3.task_1.model.createException.InvalidPasswordDigitException;
import org.homeWork_Seminar_3.task_1.model.createException.InvalidPasswordSymbolException;
import org.homeWork_Seminar_3.task_1.model.createException.InvalidPasswordUpperLetterException;

public class CheckPassword {
    PasswordVerifier passwordVerifier = new PasswordVerifier();

    /**
     * Метод проверяет пароль на требование условий составления пароля, если условия не соблюдены,
     * выбрасывается ошибка с текстовым сообщением.
     * @param password - Пароль пользователя типа String
     * @throws InvalidPasswordSymbolException - Ошибка ввода менее 8 символов
     * @throws InvalidPasswordDigitException - Ошибка ввода пароля без хотя бы одной цифры
     * @throws InvalidPasswordUpperLetterException - Ошибка ввода пароля без любой заглавной буквы
     */
    public void checkPassword(String password) throws InvalidPasswordSymbolException, InvalidPasswordDigitException,
            InvalidPasswordUpperLetterException {
        if (!passwordVerifier.PasswordSymbol(password)) {
            throw new InvalidPasswordSymbolException("Пароль должен быть не менее 8 символов");
        }
        if (!passwordVerifier.PasswordDigit(password)) {
            throw new InvalidPasswordDigitException("Пароль должен содержать хотя бы одну цифру");
        }
        if (!passwordVerifier.PasswordUpperLetter(password)) {
            throw new InvalidPasswordUpperLetterException("Пароль должен содержать хотя бы одну заглавную букву");
        }
    }
}
