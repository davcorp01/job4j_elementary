package ru.job4j.condition;
/*
Job4j Упражнения 1.1.4. Оператор ветвления 79. Определить век по году
https://job4j.ru/profile/topics/13/task_code/355/158573
 */
public class Task79 {
    public static void getCentury(int num) {
        int first = num / 100;
        int last = num % 100;
        int result;
        if (last == 0) {
            result = first;
        } else {
            result = first + 1;
        }
        if (result < 16 || result > 20) {
            System.out.println("Не попадает в диапазон");
        } else {
            System.out.println(result);
        }
    }
}
