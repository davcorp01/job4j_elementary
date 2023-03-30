package ru.job4j.condition;
/*
Job4j Упражнения 1.1.4. Оператор ветвления 63. Расположены ли цифры трехзначного числа в порядке убывания
https://job4j.ru/profile/topics/13/task_code/339/157837
 */
public class Task63 {
    public static void isDecreasing(int number) {
        int n3 = number % 10;
        int n2 = number / 10 % 10;
        int n1 = number / 100;
        if (n1 > n2 && n2 > n3) {
            System.out.println("Да");
        } else {
            System.out.println("Нет");
        }
    }
}