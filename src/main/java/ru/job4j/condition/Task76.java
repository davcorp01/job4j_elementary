package ru.job4j.condition;
/*
Job4j Упражнения 1.1.4. Оператор ветвления 75. Количество одинаковых цифр в трехзначном числе
https://job4j.ru/profile/topics/13/task_code/352/158461
 */
public class Task76 {
    public static void sameNumAmount(int num) {
        int first = num / 100;
        int middle = num / 10 % 10;
        int last = num % 10;
        int count = 0;
        count = first == middle ? count + 1 : count;
        count = first == last ? count + 1 : count;
        count = middle == last ? count + 1 : count;
        count = count != 0 && count != 3 ? count + 1 : count;
        System.out.println(count);
    }
}

