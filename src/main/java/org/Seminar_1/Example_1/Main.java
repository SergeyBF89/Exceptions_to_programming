package org.Seminar_1.Example_1;

public class Main {
    public static void main(String[] args) {

        // Простая обработка исключений
        int[] array = new int[4];
        try {
            System.out.println("Test1");
            array[2] = 10; // прерывается блок try из-за выхода за границы массива
            System.out.println("Test2"); // эта строка не выполняется
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Test3"); // если выбрасывается исключение, выполняется блок catch, но программа не прерывается
        }
        System.out.println("Test4");
    }
}
