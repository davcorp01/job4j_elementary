package ru.job4j.condition;

public class Task52 {
    public static void isEquals(int a1, int a2, int b1, int b2) {
        double first = (double) a1 / (double) a2;
        double srcond = (double) b1 / (double) b2;
        if (first == srcond) {
            System.out.println("Да");
        } else {
            System.out.println("Нет");
        }
    }
}
