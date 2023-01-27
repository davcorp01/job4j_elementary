package ru.job4j.type;

public class Task42 {
    public static void rightCircleShift(int number) {
        int num1 = number % 10;
        int num2 = number / 10 % 10;
        int num3 = number / 100 % 10;
        int num4 = number / 1000 % 10;
        System.out.println(num1 * 1000 + num4 * 100 + num3 * 10 + num2);
        }
}
