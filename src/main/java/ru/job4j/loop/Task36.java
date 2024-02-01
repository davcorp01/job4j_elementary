package ru.job4j.loop;
/*
Job4j Упражнения 1.1.5. Циклы 36. Вывести двузначные числа, произведение которых является двузначным числом
https://job4j.ru/profile/topics/14/task_code/382/184407
 */
import java.util.StringJoiner;

public class Task36 {
    public static void loop() {
        StringJoiner sj = new StringJoiner(" ");
        int first;
        int last;
        for (int i = 10; i < 30; i++) {
            first = i / 10;
            last = i % 10;
            if ((first * last) / 10 >= 1) {
                sj.add("" + i);
            }
        }
        System.out.println(sj);
    }
}
