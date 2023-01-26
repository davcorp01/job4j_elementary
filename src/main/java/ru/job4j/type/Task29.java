package ru.job4j.type;

public class Task29 {
    public static void numSum(int number) {
        int num1 = number % 10;
        int num2 = (number / 10) % 10;
        int num3 = number / 100;
        System.out.println(num1 + num2 + num3);
    }
}
