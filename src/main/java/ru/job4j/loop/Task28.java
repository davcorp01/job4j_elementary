package ru.job4j.loop;
/*
Job4j Упражнения 1.1.5. Циклы 28. Вывести целые положительные двузначные числа с условием
https://job4j.ru/profile/topics/14/task_code/374/183540
 */
import java.util.StringJoiner;

public class Task28 {
    public static void loop(int num) {
        StringJoiner stringJoiner = new StringJoiner(" ");
        for (int i = 0; i < 30; i++) {
            if (i / 10 >= 1 && i / 10 + i % 10 == num) {
                stringJoiner.add("" + i);
            }
         }
        System.out.println(stringJoiner);
    }
}
