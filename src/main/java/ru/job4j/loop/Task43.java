package ru.job4j.loop;
/*
https://job4j.ru/profile/topics/14/task_code/389/186423
Job4j Упражнения 1.1.5. Циклы 43. Вывести трехзначные числа при определенном условии
 */
import java.util.StringJoiner;

public class Task43 {
    public static void loop() {
        StringJoiner sj = new StringJoiner(" ");
        int a;
        int bc;
        for (int i = 300; i < 325; i++) {
            a = i / 100;
            bc = i % 100;
           if (bc >= 10 && bc % a == 0) {
               sj.add("" + i);
           }
        }
        System.out.println(sj);
    }
}
