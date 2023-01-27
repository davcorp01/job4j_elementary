package ru.job4j.type;

public class Task36 {
    public static void firstLastChange(int number) {
        int first = number % 10;
        int middle = (((number / 100) % 10) * 10) + (number / 10) % 10;
        int last = number / 1000;
        System.out.println(first * 1000 + middle * 10 + last);
    }
}
