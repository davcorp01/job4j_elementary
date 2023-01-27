package ru.job4j.type;

public class Task38 {
    public static void leftShift(int number) {
        int num1 = number % 10;
        int num2 = number / 10 % 10;
        int num3 = number / 100 % 10;
        System.out.println(num3 * 1000 + num2 * 100 + num1 * 10);
    }
}
