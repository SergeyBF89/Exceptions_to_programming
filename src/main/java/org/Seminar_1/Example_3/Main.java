package org.Seminar_1.Example_3;

public class Main {
    public static void main(String[] args) {
        // Обработка исключений
        int[] array = {4, 8, 16, 32, 64, 128, 256, 512};
        int[] num = {2, 0, 4, 4, 0, 8};

        try {
            for (int i = 0; i < array.length; i++) {
                try {
                    System.out.println(array[i] + " / " + num[i] + " = " + array[i] / num[i]);
                }
                catch (ArithmeticException exception) {
                    System.out.println("Division - 0");
                }
            }
        }
        catch (ArrayIndexOutOfBoundsException exception) {
            System.out.println("ArrayIndexOutOfBoundsException");
            System.out.println("Fatality Error");
        }
    }
}