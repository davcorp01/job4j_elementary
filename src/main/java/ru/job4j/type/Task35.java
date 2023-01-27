package ru.job4j.type;

public class Task35 {
    public static void firstLastChange(int number) {
        int num1 = number % 10;
        int num2 = (number / 10) % 10;
        int num3 = (number / 100) % 10;
        System.out.println(num1 * 100 + num2 * 10 + num3);
    }
}
