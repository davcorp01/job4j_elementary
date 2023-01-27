package ru.job4j.type;

public class Task39 {
    public static void leftCircleShift(int number) {
        int num1 = number % 10;
        int num2 = number / 10 % 10;
        int num3 = number / 100 % 10;
        System.out.println(num2 * 100 + num1 * 10 + num3);
    }
}
