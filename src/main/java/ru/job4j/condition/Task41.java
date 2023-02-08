package ru.job4j.condition;

public class Task41 {
    public static void evenDigitsAmount(int number) {
        int num1 = (number % 10) % 2 == 0 ? 1 : 0;
        int num2 = ((number / 10) % 10) % 2 == 0 ? 1 : 0;
        int num3 = (number / 100) % 2 == 0 ? 1 : 0;
        System.out.println(num1 + num2 + num3);
    }
}
