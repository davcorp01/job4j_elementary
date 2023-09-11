package ru.job4j.loop;
/*
Job4j Упражнения 1.1.5. Циклы 16. Вывести все однозначные числа
https://job4j.ru/profile/topics/14/task_code/362/173669
 */
import java.util.StringJoiner;

public class Task16 {
    public static void loop() {
        StringJoiner stringJoiner = new StringJoiner(" ");
        for (int i = 1; i < 10; i++) {
                stringJoiner.add("" + i + "");
        }
        System.out.println("Старт");
        System.out.println(stringJoiner);
        System.out.println("Финиш");

    }
}