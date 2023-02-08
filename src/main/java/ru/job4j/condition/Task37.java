package ru.job4j.condition;

public class Task37 {
    public static void numsCompare(int number) {
        int first = number / 10;
        int last = number % 10;
        if (first > last) {
            System.out.println("Да");
        } else {
            System.out.println("Нет");
        }
    }
}