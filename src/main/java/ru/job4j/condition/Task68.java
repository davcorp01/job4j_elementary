package ru.job4j.condition;
/*
Job4j Упражнения 1.1.4. Оператор ветвления 68. Являются ли 3 числа длинами сторон одного и того же треугольника
https://job4j.ru/profile/topics/13/task_code/344/158286
 */
public class Task68 {
    public static void isTriangle(int a, int b, int c) {
        if (a < b + c && b < a + c && c < b + a) {
            System.out.println("Да");
        } else {
            System.out.println("Нет");
        }
    }
}
