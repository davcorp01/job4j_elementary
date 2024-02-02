package ru.job4j.loop;
/*
Job4j Упражнения 1.1.5. Циклы 39. Вывести числа, делящиеся без остатка на сумму своих цифр
https://job4j.ru/profile/topics/14/task_code/385/184603
 */
import java.util.StringJoiner;

public class Task39 {
    public static void loop() {
        StringJoiner sj = new StringJoiner(" ");
        int a, b, c, sum;
        for (int i = 200; i <= 210; i++) {
            a = i / 100;
            b = i / 10 % 10;
            c = i % 10;
            sum = a + b + c;
            if (i % sum == 0) {
                sj.add("" + i);
            }
        }
        System.out.println(sj);
    }
}
