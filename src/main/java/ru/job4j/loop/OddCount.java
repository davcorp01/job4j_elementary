package ru.job4j.loop;
/*
Job4j Упражнения 1.1.5. Циклы 9. Найти количество нечетных в диапазоне
https://job4j.ru/profile/topics/14/task_code/110/159093
 */
public class OddCount {
    public static int count(int a, int b) {
        int count = 0;
        for (int i = a; i <= b; i++) {
            if (i % 2 == 1) {
                count = count + 1;
            }
        }
        return count;
    }
}