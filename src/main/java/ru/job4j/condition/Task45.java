package ru.job4j.condition;

public class Task45 {
    public static void changeToRoundNum(int number) {
        int num = number % 10;
        if (number % 2 == 0) {
            System.out.println("Увеличено до " + (number - num + 10));
        } else {
            System.out.println("Уменьшено до " + (number - num));
        }
    }
}
