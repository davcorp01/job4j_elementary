package ru.job4j.loop;
/*
Job4j Упражнения 1.1.5. Циклы 23. Вывести ряд чисел с последующим увеличением
https://job4j.ru/profile/topics/14/task_code/369/183164
 */
import java.util.StringJoiner;

public class Task23 {
    public static void loop(int num) {
        StringJoiner stringJoiner = new StringJoiner(" ");
        for (int i = 0; i < 5; i++) {
            num++;
            stringJoiner.add("" + num);
        }
        System.out.println(stringJoiner);
    }
}
