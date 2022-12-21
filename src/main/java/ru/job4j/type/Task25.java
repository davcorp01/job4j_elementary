package ru.job4j.type;

public class Task25 {
    public static void separate(int number) {
        int num3 = number % 10;
        int num2 = (number - num3) % 100;
        int num1 = (number - num3 - num2);
        System.out.println(num1 + "+" + num2 + "+" + num3);
    }
}