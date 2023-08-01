package org.Seminar_1.example_5;

public class Trow {
    // Пример работы блока finally
    public static void genExc(int value) {
        int t;
        int[] array = new int[2];
        System.out.println("Set " + value);
        try {
            switch (value) {
                case 0:
                    t = 10 / value; // деление на 0
                    break;
                case 1:
                    array[4] = 4; // ArrayIndexOutOfBoundsException
                    break;
                case 2:
                    return; // блок try
            }
        }
        catch (ArithmeticException e) {
            System.out.println("Division 0");
            return;
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException");
        }
        finally {
            System.out.println("finally");
        }
    }
}
