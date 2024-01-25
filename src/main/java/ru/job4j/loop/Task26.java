package ru.job4j.loop;
/*
Job4j Упражнения 1.1.5. Циклы 26. Вывести числа в арифметической прогрессии по убыванию
https://job4j.ru/profile/topics/14/task_code/372/183361
 */

import java.util.StringJoiner;

public class Task26 {
    public static void loop(int num) {
        int progressiv = 0;
        StringJoiner stringJoiner = new StringJoiner(" ");
        for (int i = 0; i < (num * 2); i++) {
            stringJoiner.add("" + progressiv);
            progressiv = progressiv - 8;
        }
        System.out.println(stringJoiner);
    }
}
