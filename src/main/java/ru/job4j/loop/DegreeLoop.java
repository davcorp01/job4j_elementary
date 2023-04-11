package ru.job4j.loop;
/*
Job4j Упражнения 1.1.5. Циклы 7. Найти степень числа
https://job4j.ru/profile/topics/14/task_code/108/158975
 */
import java.sql.SQLOutput;

public class DegreeLoop {
    public static int calculate(int a, int n) {
        int result = a;
        for (int i = 1; i < n; i++) {
            result = result * a;
        }
        return result;
    }
}
