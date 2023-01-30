package ru.job4j.condition;

public class Task20 {
    public static void numCheck(int number) {
        int num1 = number % 10;
        int num2 = (number / 10) % 10;
        int num3 = (number / 100);
        int sum = num1 + num2 + num3;
        if (sum % 2 == 0) {
            System.out.println("Да");
        } else {
            System.out.println("Нет");
        }
    }
}
