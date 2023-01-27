package ru.job4j.type;

public class Task37 {
    public static void leftShift(int number) {
        int num1 = number % 10;
        int num2 = number / 10 % 10;
        System.out.println(num2 * 100 + num1 * 10);
    }
}
