package ru.job4j.condition;

public class Task45 {
    public static void changeToRoundNum(int number) {
        int num = number % 10;
        if (num == 0) {
            System.out.println("Без изменений");
        }
        if (number % 2 == 0 && num != 0) {
            System.out.println("Увеличено до " + (number - num + 10));
        } else if (number % 2 != 0 && num != 0) {
            System.out.println("Уменьшено до " + (number - num));
        }
    }
}
