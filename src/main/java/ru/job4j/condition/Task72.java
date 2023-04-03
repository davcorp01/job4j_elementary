package ru.job4j.condition;
/*
Job4j Упражнения 1.1.4. Оператор ветвления 72. Является ли средняя цифра трехзначного числа больше остальных
https://job4j.ru/profile/topics/13/task_code/348/158292
 */
public class Task72 {
    public static void midDigitMore(int num) {
        int first = num / 100;
        int middle = num / 10 % 10;
        int last = num % 10;
        if (middle > first && middle > last) {
            System.out.println("Да");
        } else {
            System.out.println("Нет");
        }
    }
}
