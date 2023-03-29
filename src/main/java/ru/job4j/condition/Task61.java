package ru.job4j.condition;
/*
Job4j Упражнения 1.1.4. Оператор ветвления 61. Состоит ли трехзначное число из одинаковых цифр
https://job4j.ru/profile/topics/13/task_code/337/157784
 */

public class Task61 {
    public static void hasEqualDigits(int number) {
        int n1 = number % 10;
        int n2 = number / 10 % 10;
        int n3 = number / 100;
        if (n1 == n2 && n1 == n3) {
            System.out.println("Да");
        } else {
            System.out.println("Нет");
        }
    }
}