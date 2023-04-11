package ru.job4j.loop;
/*
Job4j Упражнения 1.1.5. Циклы 8. Вывести делители числа
https://job4j.ru/profile/topics/14/task_code/109/159092
 */
public class Multipliers {
    public static void out(int n) {
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.println(i);
            }
        }
    }
}
