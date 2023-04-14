package ru.job4j.loop;
/*
Job4j Упражнения 1.1.5. Циклы 11. Найти количество отрезков, используя цикл
https://job4j.ru/profile/topics/14/task_code/118/159479
 */

public class SectionCount {
    public static int count(int length, int section) {
        int count = 0;
        while (length >= section) {
            count++;
            length = length - section;
        }
        return count;
    }
}