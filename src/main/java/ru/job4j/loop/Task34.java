package ru.job4j.loop;
/*
Job4j Упражнения 1.1.5. Циклы 34. Вывести нечетные числа
https://job4j.ru/profile/topics/14/task_code/380/184245
 */
import java.util.StringJoiner;

public class Task34 {
    public static void loop(int num) {
        StringJoiner sj = new StringJoiner(" ");
        int nextNum;
        if (num % 2 == 0) {
            nextNum = num + 1;
        } else {
            nextNum = num + 2;
        }
        for (int i = nextNum; i < nextNum + 9; i = i + 2) {
            sj.add("" + i);
        }
        System.out.println(sj);
    }
}
