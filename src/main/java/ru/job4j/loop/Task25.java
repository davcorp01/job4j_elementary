package ru.job4j.loop;
/*
Job4j Упражнения 1.1.5. Циклы 25. Вывести числа в арифметической прогрессии по возрастанию
https://job4j.ru/profile/topics/14/task_code/371/183360
 */

import java.util.StringJoiner;

public class Task25 {
    public static void loop(int num) {
        int progressiv = 7;
        StringJoiner stringJoiner = new StringJoiner(" ");
        for (int i = 0; i < num; i++) {
            stringJoiner.add("" + progressiv);
            progressiv = progressiv + 4;
        }
        System.out.println(stringJoiner);
    }
}