package ru.job4j.loop;
/*
Job4j Упражнения 1.1.5. Циклы 38. Вывести трехзначные числа, составленные из четных цифр
https://job4j.ru/profile/topics/14/task_code/384/184601
 */
import java.util.StringJoiner;

public class Task38 {
    public static void loop() {
        StringJoiner sj = new StringJoiner(" ");
        int a, b, c;
        for (int i = 200; i <= 223; i++) {
            a = i  / 100;
            b = i / 10 % 10;
            c = i % 10;
            if (a % 2 == 0 && b % 2 == 0 && c % 2 == 0) {
                sj.add("" + i);
            }
        }
        System.out.println(sj);
    }
}
