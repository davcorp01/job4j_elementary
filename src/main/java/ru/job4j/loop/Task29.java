package ru.job4j.loop;
/*
Job4j Упражнения 1.1.5. Циклы 29. Вывести целые положительные трехзначные числа с условием
https://job4j.ru/profile/topics/14/task_code/375/183863
 */
import java.util.StringJoiner;

public class Task29 {
    public static void loop(int num) {
        StringJoiner stringJoiner = new StringJoiner(" ");
        for (int i = 0; i < 150; i++) {
            int a = (i % 10);
            int b = ((i / 10) % 10);
            int c = (i / 100);
            if (i > 99 && a + b + c == num) {
                stringJoiner.add("" + i);
            }
        }
        System.out.println(stringJoiner);
    }
}
