package ru.job4j.loop;
/*
Job4j Упражнения 1.1.5. Циклы 37. Вывести трехзначные числа по определенному условию
https://job4j.ru/profile/topics/14/task_code/383/184598
 */
import java.util.StringJoiner;

public class Task37 {
    public static void loop() {
        StringJoiner sj = new StringJoiner(" ");
        int a, b, c;
        for (int i = 99; i < 130; i++) {
            a = i / 100;
            b = i % 10;
            c = i / 10 % 10;
            if (i >= 100 && a * b == Math.pow(c, 2)) {
                sj.add("" + i);
            }
        }
        System.out.println(sj);
    }
}
