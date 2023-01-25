package ru.job4j.loop;

import java.sql.SQLOutput;

public class Task174 {

    public static void isPalindrome(int number) {
        int remainder = number;
        int reverted = number % 10;
        if (reverted == 0) {
            System.out.println("Нет");
            return;
        }
        for (int i = 0; reverted < remainder; i++) {
            remainder = remainder / 10;
            if (reverted == remainder) {
                break;
            }
            reverted = 10 * reverted + remainder % 10;
        }
        if (remainder == reverted) {
            System.out.println("Да");

        } else {
                System.out.println("Нет");
        }
    }
}