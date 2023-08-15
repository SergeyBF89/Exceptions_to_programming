package org.homeWork_Seminar_3.task_1.model;

import org.homeWork_Seminar_3.task_1.model.createException.InvalidPasswordDigitException;
import org.homeWork_Seminar_3.task_1.model.createException.InvalidPasswordSymbolException;
import org.homeWork_Seminar_3.task_1.model.createException.InvalidPasswordUpperLetterException;

public class PasswordCheckController {
    CheckPassword checkPassword = new CheckPassword();

    /**
     * ����� �������� ������ ����������� �����������, ���� ���������� �� �����������,
     * ���������� �� ������
     * @param password - ������ ������������ ���� String
     * @return - ���������� true, ���� �������� �������� �������
     */
    public boolean getCheck(String password) {
        try {
            checkPassword.checkPassword(password);
        } catch (InvalidPasswordDigitException | InvalidPasswordSymbolException | InvalidPasswordUpperLetterException e) {
            System.out.println("Error: ������ �� ������");
            throw new RuntimeException(e.getMessage());
        }
        return true;
    }
}
