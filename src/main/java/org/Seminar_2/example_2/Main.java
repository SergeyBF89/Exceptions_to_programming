package org.Seminar_2.example_2;

public class Main {
    public static void main(String[] args) {
        int[] array1 = {4, 8, 16, 32, 64, 128, 256, 512};
        int[] array2 = {2, 0, 4, 4, 0, 8};
        for (int i = 0; i < array1.length; i++) {
            try {
                System.out.println(array1[i] + " / " + array2[i] + " = " + array1[i] / array2[i]);
            } catch (ArithmeticException e) {
                System.out.println("Деление на ноль: " + e.getClass().getSimpleName());
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Выход за границы массива: " + e.getClass().getSimpleName());
            }
        }
    }
}
