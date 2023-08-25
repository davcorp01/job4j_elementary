package ru.job4j.loop;
/*
Job4j Упражнения 1.1.5. Циклы 13. Сумма цифр
https://job4j.ru/profile/topics/14/task_code/214/171918
 */

public class DigitSum {
    public static int sum(int num) {
        int sum = 0;
        while (num >= 1) {
            sum = sum + (num % 10);
            num = num / 10;
        }
        return (sum);
    }
}
