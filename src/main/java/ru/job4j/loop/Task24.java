package ru.job4j.loop;
/*
Job4j Упражнения 1.1.5. Циклы 24. Вывести ряд чисел с последующим уменьшением
https://job4j.ru/profile/topics/14/task_code/370/183165
 */
import java.util.StringJoiner;

public class Task24 {
    public static void loop(int num) {
        StringJoiner stringJoiner = new StringJoiner(" ");
        num = num - 10;
        for (int i = 0; i < 5; i++) {
            stringJoiner.add("" + num);
            num = num - 6;
        }
        System.out.println(stringJoiner);
    }
}