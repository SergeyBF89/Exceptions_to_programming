package org.Seminar_2.example_1;

public class Main {
    public static void main(String[] args) {
        int [] array = new int[4];
        try {
            System.out.println("До генерации исключения");
            array[5] = 10;
            System.out.println("После исключения");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Выход за границы массива: " + e.getClass().getSimpleName());
        }
        System.out.println("После оператора catch");
    }
}
