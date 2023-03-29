package ru.job4j.condition;

import java.sql.SQLOutput;

public class Task58 {
    public static void isWinning(int number) {
        int first = number / 1000;
        int second = number % 1000;
        int sumFirst = first % 10 + (first / 10) % 10 + first / 100;
        int sumSecond = second % 10 + (second / 10) % 10 + second / 100;
        if (sumSecond % 2 == 0 && sumFirst == sumSecond) {
            System.out.println("Да");
        } else {
            System.out.println("Нет");
        }
    }
}
