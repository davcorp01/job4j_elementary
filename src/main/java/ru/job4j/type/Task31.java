package ru.job4j.type;

public class Task31 {
    public static void difference(int number) {
        int num1 = number % 10;
        int num2 = (number / 10) % 10;
        int num3 = number / 100;
        System.out.println(Math.abs(num1 - num3) * num2);
    }
}