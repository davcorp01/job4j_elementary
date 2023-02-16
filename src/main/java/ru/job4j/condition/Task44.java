package ru.job4j.condition;

public class Task44 {
    public static void containsZero(int number) {
        int num1 = number % 10;
        if (num1 <= 5) {
            System.out.println(number - num1);
        } else {
            System.out.println(number + (10 - num1));
        }
    }
}
