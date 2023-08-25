package ru.job4j.loop;
/*
Job4j Упражнения 1.1.5. Циклы 12. mod через while
https://job4j.ru/profile/topics/14/task_code/119/171894
 */
public class ModWithLoop {
    public static int mod(int n, int d) {
        while (n >= d) {
            n = n - d;
        }
        return (n);
    }
}
