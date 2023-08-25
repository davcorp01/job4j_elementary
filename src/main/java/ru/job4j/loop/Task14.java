package ru.job4j.loop;
/*
Job4j Упражнения 1.1.5. Циклы 14. Вывод положительных двузначных чисел в диапазоне
https://job4j.ru/profile/topics/14/task_code/360/171978
 */
import java.util.StringJoiner;
public class Task14 {
    public static void loop(int a, int b) {
        StringJoiner stringJoiner = new StringJoiner(" ");
        for (int i = a; i < b; i++) {
            if (i > 0 && i / 10 >= 1) {
                stringJoiner.add("" + i + "");
            }
        }
        System.out.println("Старт");
        System.out.println(stringJoiner);
        System.out.println("Финиш");
    }
}
