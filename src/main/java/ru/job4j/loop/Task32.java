package ru.job4j.loop;
/*
Job4j Упражнения 1.1.5. Циклы 32. Вывести положительные двузначные числа, заканчивающиеся на цифру 7 (по убыванию)
https://job4j.ru/profile/topics/14/task_code/378/184074
 */
import java.util.StringJoiner;

public class Task32 {
    public static void loop() {
        StringJoiner sj = new StringJoiner(" ");
        for (int i = 50; i > 0; i--) {
            if (i / 10 >= 1 && i % 10 == 7) {
                sj.add("" + i);
            }
        }
        System.out.println(sj);
    }
}
