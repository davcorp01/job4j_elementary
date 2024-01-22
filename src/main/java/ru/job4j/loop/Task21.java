package ru.job4j.loop;
/*
Job4j Упражнения 1.1.5. Циклы 21. Вывести в порядке убывания положительные двузначные числа, делящиеся на 5 без остатка
https://job4j.ru/profile/topics/14/task_code/367/182989
 */
import java.util.StringJoiner;

public class Task21 {
    public static void loop() {
        StringJoiner stringJoiner = new StringJoiner(" ");
        for (int i = 38; i > 5; i--) {
            if (i % 5 == 0) {
                stringJoiner.add("" + i);
            }
        }
        System.out.println("Старт");
        System.out.println(stringJoiner);
        System.out.println("Финиш");
    }
}
