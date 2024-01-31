package ru.job4j.loop;
/*
Job4j Упражнения 1.1.5. Циклы 33. Вывести положительные трехзначные числа, делящиеся без остатка на 11 (по возрастанию)
https://job4j.ru/profile/topics/14/task_code/379/184244
 */
import java.util.StringJoiner;

public class Task33 {
    public static void loop() {
        StringJoiner sj = new StringJoiner(" ");
        for (int i = 0; i < 160; i++) {

            if (i > 0 && i % 11 == 0 && (i / 100) >= 1) {
                sj.add("" + i);
            }
        }
        System.out.println(sj);
    }
}
