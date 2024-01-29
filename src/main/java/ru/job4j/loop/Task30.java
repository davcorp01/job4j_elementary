package ru.job4j.loop;
/*
Job4j Упражнения 1.1.5. Циклы 30. Вывести трехзначные числа по определенному условию
https://job4j.ru/profile/topics/14/task_code/376/183864
 */
import java.util.StringJoiner;

public class Task30 {
    public static void loop(int num) {
        StringJoiner stringJoiner = new StringJoiner(" ");
        for (int i = 99; i < 130; i++) {
            if (i > 99 && i % 10 == num % 10) {
                stringJoiner.add("" + i);
            }
        }
        System.out.println(stringJoiner);
    }
}
