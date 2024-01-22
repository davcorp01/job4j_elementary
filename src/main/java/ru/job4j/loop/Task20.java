package ru.job4j.loop;
/*
Job4j Упражнения 1.1.5. Циклы 20. Вывести четырехзначные положительные числа в убывающем порядке
https://job4j.ru/profile/topics/14/task_code/366/182974
 */
import java.util.StringJoiner;

public class Task20 {
    public static void loop() {
        StringJoiner stringJoiner = new StringJoiner(" ");
        for (int i = 1550; i > 1050; i--) {
            if (i % 100 == 0) {
                stringJoiner.add("" + i);
            }
        }
        System.out.println("Начало");
        System.out.println(stringJoiner);
        System.out.println("Конец");
    }
}
