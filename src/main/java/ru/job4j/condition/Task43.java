package ru.job4j.condition;

public class Task43 {
    public static void containsZero(int number) {
        int last = number % 10;
        int middle = number / 10 % 10;
        int first = number / 100;
        int count = 0;
        if (last == 0) {
            count++;
        } else if (middle == 0) {
            count++;
        } else if (first == 0) {
            count++;
        }
        if (count > 0) {
            System.out.println("Да");
        } else {
            System.out.println("Нет");
        }
    }
}