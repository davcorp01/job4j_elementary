package ru.job4j.condition;

public class Task22 {
    public static void haveRoots(int a, int b, int c) {
        int discrim = b * b - 4 * a * c;
        if (discrim < 0) {
            System.out.println("Нет");
        } else {
            System.out.println("Да");
        }
    }
}
