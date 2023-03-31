package ru.job4j.condition;
/*
Job4j Упражнения 1.1.4. Оператор ветвления 67. Являются ли три числа углами одного и того же треугольника
https://job4j.ru/profile/topics/13/task_code/343/157983
 */
public class Task67 {
    public static void isTriangle(int a, int b, int c) {
        int  sumCorner = a + b + c;
        if (sumCorner == 180) {
            System.out.println("Да");
        } else {
            System.out.println("Нет");
        }
    }
}

