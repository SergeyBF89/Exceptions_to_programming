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
     * ����� ��� �������� ������ �� ���������� � ��� �� ����� 8 ��������
     * @param password - ������ ������������ ���� String
     * @return - ���������� true ��� false
     */
    public boolean PasswordSymbol(String password) {
        return PATTERN1.matcher(password).matches();
    }

    /**
     * ����� ��� �������� ������ �� ���������� � ��� ����� ����� �� 0-9
     * @param password - ������ ������������ ���� String
     * @return - ���������� true ��� false
     */
    public boolean PasswordDigit(String password) {
        return PATTERN2.matcher(password).matches();
    }

    /**
     * ����� ��� �������� ������ �� ���������� � ��� ����� ��������� �����
     * @param password - ������ ������������ ���� String
     * @return - ���������� true ��� false
     */
    public boolean PasswordUpperLetter(String password) {
        return PATTERN3.matcher(password).matches();
    }
}
