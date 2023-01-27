package ru.job4j.type;

public class Task41 {
    public static void rightCircleShift(int number) {
        int num1 = number % 10;
        int num2 = number / 10 % 10;
        int num3 = number / 100 % 10;
        System.out.println(num1 * 100 + num3 * 10 + num2);
    }
}
