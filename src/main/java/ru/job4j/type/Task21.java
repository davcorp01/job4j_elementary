package ru.job4j.type;

public class Task21 {
    public static void separate(int number) {
        int num1, num2, num3;
        num3 = number % 10;
        num2 = (number - num3) % 100;
        num1 = (number - num3 - num2) / 100;
        num2 = num2 / 10;
        System.out.println(num1 + " " + num2 + " " + num3);
    }
}