package ru.job4j.condition;

public class Task24 {
    public static void isPositive(int num1, int num2) {
        float division = (float) num1 / (float) num2;
        if (division > 0) {
            System.out.println("Да");
        } else {
            System.out.println("Нет");
        }

    }
}
