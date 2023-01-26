package ru.job4j.type;

public class Task33 {
    public static void evenAmount(int number) {
        int num1 = number % 10;
        int counter = num1 % 2 == 0 ? 1 : 0;
        int num2 = number / 10;
        counter = num2 % 2 == 0 ? counter + 1 : counter;
        int num3 = number / 100;
        counter = num3 % 2 == 0 ? counter + 1 : counter;
        System.out.println(counter);
    }
}