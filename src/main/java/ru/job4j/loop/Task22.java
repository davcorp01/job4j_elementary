package ru.job4j.loop;
/*
Job4j Упражнения 1.1.5. Циклы 22. Вывести положительные трехзначные числа, делящиеся на 80 с остатком 45
https://job4j.ru/profile/topics/14/task_code/368/183073
 */

import java.util.StringJoiner;

public class Task22 {
    public static void loop() {
        StringJoiner stringJoiner = new StringJoiner(" ");
        for (int i = 80; i < 300; i++) {
            if (i - 80 * (i / 80) == 45) {
                stringJoiner.add("" + i);
            }
        }
        System.out.println(stringJoiner);
    }
}
