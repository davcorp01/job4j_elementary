package ru.job4j.loop;
/*
Job4j Упражнения 1.1.5. Циклы 35. Вывести предшествующие числа
https://job4j.ru/profile/topics/14/task_code/381/184406
 */
import java.util.StringJoiner;

public class Task35 {
    public static void loop(int num) {
        StringJoiner sj = new StringJoiner(" ");
        for (int i = 5; i > 0; i--) {
            num = num - 6;
            sj.add("" + num);
        }
        System.out.println(sj);
    }
}
