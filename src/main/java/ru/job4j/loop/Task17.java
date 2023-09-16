package ru.job4j.loop;
/*
Job4j Упражнения 1.1.5. Циклы 17. Вывести положительные четные двузначные числа
https://job4j.ru/profile/topics/14/task_code/363/174030
 */

import java.util.StringJoiner;

public class Task17 {
    public static void loop() {
        StringJoiner stringJoiner = new StringJoiner(" ");
        for (int i = 1; i < 19; i++) {
            if ((i / 10) >= 1 && i % 2 == 0) {
                stringJoiner.add("" + i + "");
            }
        }
        System.out.println("Начало");
        System.out.println(stringJoiner);
        System.out.println("Конец");
    }
}