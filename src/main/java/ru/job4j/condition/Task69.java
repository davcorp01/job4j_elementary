package ru.job4j.condition;
/*
Job4j Упражнения 1.1.4. Оператор ветвления 69. Определить фигуру по длинам сторон
https://job4j.ru/profile/topics/13/task_code/345/158287
 */
public class Task69 {
    public static void squareOrRectangle(int a, int b) {
        if (a == b) {
            System.out.println("Квадрат");
        } else {
            System.out.println("Прямоугольник");
        }
    }
}