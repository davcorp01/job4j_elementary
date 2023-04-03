package ru.job4j.condition;
/*
Job4j Упражнения 1.1.4. Оператор ветвления 73. Является ли средняя цифра трехзначного числа меньше остальных
https://job4j.ru/profile/topics/13/task_code/349/158364
 */
public class Task73 {
    public static void midDigitLess(int num) {
        int first = num / 100;
        int middle = num / 10 % 10;
        int last = num % 10;
        if (middle < first && middle < last) {
            System.out.println("Да");
        } else {
            System.out.println("Нет");
        }
    }
}
