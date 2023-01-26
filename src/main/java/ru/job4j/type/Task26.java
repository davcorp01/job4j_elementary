package ru.job4j.type;

public class Task26 {
    public static void transform(int number) {
        int num1 = number % 10;
        int num2 = number / 10;
        System.out.println(num1 * 10 + num2 + 8);
        }
}