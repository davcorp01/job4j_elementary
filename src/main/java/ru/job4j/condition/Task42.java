package ru.job4j.condition;

public class Task42 {
    public static void isPairSymmetric(int number) {
        int firstPair = number / 100;
        int secondPair = number % 100;
        if(firstPair == secondPair) {
            System.out.println("Да");
        } else {
            System.out.println("Нет");
        }
    }
}
