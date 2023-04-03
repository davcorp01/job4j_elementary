package ru.job4j.condition;
/*
Job4j Упражнения 1.1.4. Оператор ветвления 74. Определить "внутреннее" число
https://job4j.ru/profile/topics/13/task_code/350/158365
 */
public class Task74 {
    public static void innerNum(int num2, int num4) {
        int first = num4 / 100;
        int middle = Math.abs(num4 / 1000 * 100 - num4 / 10);
        int last = num4 % 100;
        if (num2 == first || num2 == middle || num2 == last) {
            System.out.println("Да");
        } else {
            System.out.println("Нет");
        }
    }
}
