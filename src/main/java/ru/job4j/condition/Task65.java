package ru.job4j.condition;
/*
Job4j Упражнения 1.1.4. Оператор ветвления 65. Вывести время года по номеру месяца
https://job4j.ru/profile/topics/13/task_code/341/157850
 */
public class Task65 {
    public static void season(int number) {
        if (number > 12 || number < 1) {
            System.out.println("Не является месяцем");
        } else if (number < 3 || number == 12) {
            System.out.println("Зима");
        } else if (number < 6) {
            System.out.println("Весна");
        } else if (number < 9) {
            System.out.println("Лето");
        } else {
            System.out.println("Осень");
        }
    }
}