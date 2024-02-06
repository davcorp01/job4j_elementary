package ru.job4j.loop;
/*
Job4j Упражнения 1.1.5. Циклы 42. Вывести числа, в которых цифры единиц и десятков делятся на 3 с разным остатком
https://job4j.ru/profile/topics/14/task_code/388/184974
 */
import java.util.StringJoiner;

public class Task42 {
    public static void loop() {
        StringJoiner sj = new StringJoiner(" ");
        int a;
        int b;
        for (int i = 20; i <= 30; i++) {
            a = i / 10 % 3;
            b = i % 10 % 3;
            if (a != b) {
                sj.add("" + i);
            }
        }
        System.out.println(sj);
    }
}
