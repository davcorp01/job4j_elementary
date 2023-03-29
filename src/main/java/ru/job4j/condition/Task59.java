package ru.job4j.condition;
/*
 Job4j / Упражнения / 1.1.4. Оператор ветвления 59. Решить линейное уравнение первой степени
 https://job4j.ru/profile/topics/13/task_code/335/157729
 */
public class Task59 {
    public static void getLinearEquation(int a, int b) {

        if (a == 0 && b == 0) {
            System.out.println("Бесконечное множество");
        } else if (a == 0) {
            System.out.println("Нет решения");
        } else {
            double x = (double) -b / (double) a;
            System.out.println(x);
        }

    }
}
