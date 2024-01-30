package ru.job4j.loop;
/*
Job4j Упражнения 1.1.5. Циклы 31. Вывести двузначные числа, произведение цифр которых меньше входящего числа
https://job4j.ru/profile/topics/14/task_code/377/184073
 */
import java.util.StringJoiner;

public class Task31 {
    public static void loop(int num) {
        StringJoiner sj = new StringJoiner(" ");
        for (int i = 1; i < 21; i++) {
            if (i / 10 * i % 10 < num && i / 10 >= 1) {
                sj.add("" + i);
            }
        }
        System.out.println(sj);
    }
}
