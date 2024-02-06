package ru.job4j.loop;
/*
Job4j Упражнения 1.1.5. Циклы 40. Вывести числа, в которых и цифра единиц, и цифра десятков делятся без остатка на три
https://job4j.ru/profile/topics/14/task_code/386/184972
 */
import java.util.StringJoiner;

public class Task40 {
    public static void loop() {
        StringJoiner sj = new StringJoiner(" ");
        int a;
        int b;
        for (int i = 20; i < 40; i++) {
            a = i / 10;
            b = i % 10;
            if (a % 3 == 0 && b % 3 == 0) {
                sj.add("" + i);
            }
        }
        System.out.println(sj);
    }
}
