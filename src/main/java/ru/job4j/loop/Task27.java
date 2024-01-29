package ru.job4j.loop;
/*
Job4j Упражнения 1.1.5. Циклы 27. Вывести числа от -Х до Х
https://job4j.ru/profile/topics/14/task_code/373/183534
 */
import java.util.StringJoiner;

public class Task27 {
    public static void loop(int num) {
        StringJoiner stringJoiner = new StringJoiner(" ");
        for (int i = num * (-1) + 1; i < num; i++) {
            stringJoiner.add("" + i);
        }
        System.out.println(stringJoiner);
    }
}
