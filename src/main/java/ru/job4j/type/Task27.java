package ru.job4j.type;

public class Task27 {
    public static void transform(int number) {
        int num1 = number % 10;
        int num2 = (number / 10) % 10;
        int num3 = number / 100;
        System.out.println(num1 * 100 + num2 * 10 + num3 - 20);
    }
}
